import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class39 {
   @OriginalMember(
      owner = "client!rea",
      name = "f",
      descriptor = "Lvia;"
   )
   public class627 field543 = new class627();
   @OriginalMember(
      owner = "client!rea",
      name = "c",
      descriptor = "Z"
   )
   public boolean field544 = false;
   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field545 = new String[]{method300(method299("\u0002-{|sX")), method300(method299("\u0002-{|\f\u0019&s&\u000eX")), method300(method299("\u0002-{|qX")), method300(method299("\u0002-{|rX")), method300(method299("\u001e=v>")), method300(method299("\u000bf4|M"))};
   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field538 = new class6(17, 3);
   @OriginalMember(
      owner = "client!rea",
      name = "g",
      descriptor = "[Z"
   )
   public static boolean[] field542 = new boolean[200];
   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "Lse;"
   )
   public static class6 field541 = new class6(56, -1);
   @OriginalMember(
      owner = "client!rea",
      name = "e",
      descriptor = "I"
   )
   public static int field539;
   @OriginalMember(
      owner = "client!rea",
      name = "d",
      descriptor = "I"
   )
   public static int field540;

   @OriginalMember(
      owner = "client!rea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method296(int arg0) {
      try {
         field541 = null;
         field538 = null;
         if (arg0 < 74) {
            field541 = null;
         }

         field542 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field545[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method297(int arg0) {
      boolean var2 = client.field1481;

      try {
         while(true) {
            class328 var3 = (class328)this.field543.method4633(-102);
            if (var3 != null) {
               var3.method797((byte)79);
               class697.method5077((byte)1, var3);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            ++field539;
            break;
         }

         if (arg0 != 0) {
            field541 = null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field545[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "a",
      descriptor = "(BLwo;)V"
   )
   public final void method298(byte param1, class328 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rea",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class39(boolean arg0) {
      try {
         this.field544 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field545[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method299(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method300(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
