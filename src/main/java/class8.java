import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class8 {
   @OriginalMember(
      owner = "client!lj",
      name = "f",
      descriptor = "J"
   )
   public long field100;
   @OriginalMember(
      owner = "client!lj",
      name = "g",
      descriptor = "Liu;"
   )
   private class530 field103;
   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field106 = new String[]{method64(method63("$5t|O")), method64(method63("$5t\u007fO")), method64(method63("$5t[\u000e&>6T\u001d-w")), method64(method63("3qt\u0013\u001a")), method64(method63("$5t\u0001\u000e&6.\u0003O")), method64(method63("&*6Q"))};
   @OriginalMember(
      owner = "client!lj",
      name = "e",
      descriptor = "Lrca;"
   )
   public static class37 field104 = new class37();
   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field105 = new class6(32, 4);
   @OriginalMember(
      owner = "client!lj",
      name = "c",
      descriptor = "I"
   )
   public static int field101;
   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "I"
   )
   public static int field102;
   @OriginalMember(
      owner = "client!lj",
      name = "d",
      descriptor = "I"
   )
   public static int field99;

   @OriginalMember(
      owner = "client!lj",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field101;
         this.field103.method4031(this.field100, (byte)-117);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field106[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(IIBII)V"
   )
   public static final void method61(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field99;
         int var5 = 16 % ((arg2 - 43) / 59);
         int var6 = class270.field3443;
         if (var6 != 0) {
            if (~var6 == -2) {
               class231.field2877 = arg0;
               class270.field3443 = 2;
               class692.field10163 = arg4;
               class476.field6637 = arg1;
               class584.field8623 = arg3;
               return;
            }

            if (var6 != 2) {
               return;
            }

            if (!client.field1481) {
               if (class584.field8623 < arg3) {
                  class584.field8623 = arg3;
               }

               if (~class692.field10163 > ~arg4) {
                  class692.field10163 = arg4;
               }

               if (~arg0 > ~class231.field2877) {
                  class231.field2877 = arg0;
               }

               if (arg1 < class476.field6637) {
                  class476.field6637 = arg1;
               }

               return;
            }
         }

      } catch (RuntimeException var8) {
         throw class93.method866(var8, field106[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "<init>",
      descriptor = "(Liu;JI)V"
   )
   public class8(class530 arg0, long arg1, int arg2) {
      try {
         this.field100 = arg1;
         this.field103 = arg0;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field106[4] + (arg0 != null ? field106[3] : field106[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method62(byte arg0) {
      try {
         field105 = null;
         if (arg0 != 127) {
            method61(-76, 18, (byte)72, 0, 108);
         }

         field104 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field106[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method63(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method64(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
