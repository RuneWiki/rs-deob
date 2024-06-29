import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class48 {
   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field630 = new String[]{method343(method342("L\u0011uN{")), method343(method342("\u0001\u0016f")), method343(method342("@\u00027c")), method343(method342("UYu!.")), method343(method342("\u0002\u0018")), method343(method342("\u0002\u0016i")), method343(method342("L\u0011uL{")), method343(method342("q\u0004>c5")), method343(method342("\u0001\u001d")), method343(method342("\u0001\u0007f")), method343(method342("\u0001\u001bf")), method343(method342("F\u0003/\u007fi\u0001X")), method343(method342("L\u0011uM{"))};
   @OriginalMember(
      owner = "client!bf",
      name = "b",
      descriptor = "Ljw;"
   )
   public static class779 field624 = new class779(0, 2, 2, 1);
   @OriginalMember(
      owner = "client!bf",
      name = "e",
      descriptor = "I"
   )
   public static int field628 = 0;
   @OriginalMember(
      owner = "client!bf",
      name = "d",
      descriptor = "I"
   )
   public static int field623;
   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "I"
   )
   public static int field627;
   @OriginalMember(
      owner = "client!bf",
      name = "c",
      descriptor = "[B"
   )
   public byte[] field622;
   @OriginalMember(
      owner = "client!bf",
      name = "h",
      descriptor = "[S"
   )
   public short[] field625;
   @OriginalMember(
      owner = "client!bf",
      name = "f",
      descriptor = "[S"
   )
   public short[] field626;
   @OriginalMember(
      owner = "client!bf",
      name = "g",
      descriptor = "[S"
   )
   public short[] field629;

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "()V",
      line = 6
   )
   public static final void method338() {
      for(int var0 = 0; var0 < class108.field1485; ++var0) {
         class78 var1 = class395.field6195[var0];
         class118.method1084(var1, true);
         class395.field6195[var0] = null;
      }

      class108.field1485 = 0;
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(II)V",
      line = 19
   )
   public static final void method339(int arg0, int arg1) {
      try {
         class546.field8195 = arg1;
         class230.field3525 = -1;
         ++field627;
         class230.field3525 = arg0;
         class240.method2043(-1);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field630[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(Ljava/lang/String;II)Z",
      line = 33
   )
   public static final boolean method340(String arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         ++field623;
         if (class498.field7578.field4556) {
            class154.field2296 = new class541();
            class154.field2296.field8152 = arg0;
            class154.field2296.field8150 = arg1;
            if (class657.field9823 != class129.field1852) {
               class154.field2296.field8154 = class154.field2296.field8150 + 50000;
               class154.field2296.field8155 = class154.field2296.field8150 + 40000;
            }

            int var4 = 0;
            int var10000;
            if (var3) {
               var10000 = ~arg1;
            } else if (class529.field8026.length <= var4) {
               var10000 = 1;
               if (!var3) {
                  return true;
               }
            } else {
               var10000 = ~arg1;
            }

            while(true) {
               if (var10000 == ~class529.field8026[var4].field6662) {
                  class353.field5363 = class529.field8026[var4].field9105;
               }

               ++var4;
               if (class529.field8026.length <= var4) {
                  var10000 = 1;
                  if (!var3) {
                     return true;
                  }
               } else {
                  var10000 = ~arg1;
               }
            }
         } else {
            String var5 = "";
            if (class657.field9823 != class129.field1852) {
               var5 = ":" + (arg1 + 7000);
            }

            if (arg2 != 0) {
               method341(false);
            }

            String var6 = "";
            if (class518.field7891 != null) {
               var6 = field630[9] + class518.field7891;
            }

            String var7 = field630[11] + arg0 + var5 + field630[10] + class493.field7455 + field630[1] + class320.field4912 + var6 + field630[8] + (class774.field11383 ? "1" : "0") + field630[4] + (class777.field11408 ? "1" : "0") + field630[5];

            try {
               class798.field11616.getAppletContext().showDocument(new URL(var7), field630[7]);
               return true;
            } catch (Exception var9) {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field630[6] + (arg0 != null ? field630[3] : field630[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(Z)V",
      line = 101
   )
   public static void method341(boolean arg0) {
      try {
         field624 = null;
         if (!arg0) {
            field624 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field630[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method342(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method343(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
