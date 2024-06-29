import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class601 {
   @OriginalMember(
      owner = "client!pu",
      name = "c",
      descriptor = "I"
   )
   public int field8865;
   @OriginalMember(
      owner = "client!pu",
      name = "b",
      descriptor = "[I"
   )
   public int[] field8863;
   @OriginalMember(
      owner = "client!pu",
      name = "d",
      descriptor = "[I"
   )
   public int[] field8861;
   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8866 = new String[]{method4470(method4469("} iCIc<3A\b")), method4470(method4469("} i>\b")), method4470(method4469("v{iQ]")), method4470(method4469("c +\u0013")), method4470(method4469("} i=\b"))};
   @OriginalMember(
      owner = "client!pu",
      name = "e",
      descriptor = "I"
   )
   public static int field8862;
   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "I"
   )
   public static int field8864;

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4467(int arg0) {
      try {
         ++class98.field1297;
         ++field8864;
         class594 var1 = class145.method1177((byte)-116);
         class702 var2 = class19.method142(var1.field8765, class647.field9683, (byte)-76);
         var2.field10264.method593(arg0, 867770704);
         var1.method4423(var2, (byte)124);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8866[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z"
   )
   public static final boolean method4468(int arg0, String arg1) {
      boolean var2 = client.field1481;

      try {
         ++field8862;
         if (arg0 != 6224) {
            return true;
         } else if (arg1 == null) {
            return false;
         } else {
            int var3 = 0;
            if (var2) {
               if (arg1.equalsIgnoreCase(class35.field495[var3])) {
                  return true;
               }

               ++var3;
            }

            while(true) {
               while(~var3 > ~class202.field2575) {
                  if (arg1.equalsIgnoreCase(class35.field495[var3])) {
                     return true;
                  }

                  ++var3;
               }

               boolean var10000 = arg1.equalsIgnoreCase(class204.field2593.field11422);
               if (!var2) {
                  if (var10000) {
                     return true;
                  }

                  return false;
               }

               if (var10000) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8866[4] + arg0 + ',' + (arg1 != null ? field8866[2] : field8866[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class601(int arg0) {
      try {
         this.field8865 = arg0;
         this.field8863 = new int[this.field8865];
         this.field8861 = new int[this.field8865];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8866[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4469(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4470(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
