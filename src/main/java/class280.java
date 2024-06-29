import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class280 extends Exception {
   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3901 = new String[]{method2149(method2148("9\u0019\u000f1{")), method2149(method2148("9\u0019\u000f2{"))};
   @OriginalMember(
      owner = "client!rn",
      name = "e",
      descriptor = "F"
   )
   public static float field3895 = 0.0F;
   @OriginalMember(
      owner = "client!rn",
      name = "b",
      descriptor = "I"
   )
   public static int field3898 = 0;
   @OriginalMember(
      owner = "client!rn",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field3899 = new int[3];
   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "I"
   )
   public static int field3900;
   @OriginalMember(
      owner = "client!rn",
      name = "f",
      descriptor = "Lgq;"
   )
   public static class540 field3897;
   @OriginalMember(
      owner = "client!rn",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field3894;
   @OriginalMember(
      owner = "client!rn",
      name = "c",
      descriptor = "[Lat;"
   )
   public static class396[] field3896;

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static void method2146(byte arg0) {
      try {
         field3899 = null;
         field3897 = null;
         field3894 = null;
         if (arg0 != -71) {
            field3895 = 0.09296248F;
         }

         field3896 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3901[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(Z)V",
      line = 22
   )
   public static final void method2147(boolean arg0) {
      int var1 = client.field4530;

      try {
         ++field3900;
         client var2 = class158.field2008;
         synchronized(class158.field2008) {
            if (class628.field9136 == null) {
               Container var3;
               label95: {
                  if (class691.field10404 != null) {
                     var3 = class691.field10404;
                     if (var1 == 0) {
                        break label95;
                     }
                  }

                  if (class238.field3003 != null) {
                     var3 = class238.field3003;
                     if (var1 == 0) {
                        break label95;
                     }
                  }

                  var3 = class754.field11141;
               }

               class88.field1075 = var3.getSize().width;
               if (arg0) {
                  method2146((byte)46);
               }

               class332.field4758 = var3.getSize().height;
               if (class691.field10404 == var3) {
                  Insets var4 = class691.field10404.getInsets();
                  class88.field1075 -= var4.right + var4.left;
                  class332.field4758 -= var4.top + var4.bottom;
               }

               label75: {
                  if (class694.method5042(true) != 1) {
                     class200.method1536((byte)-121);
                     if (var1 == 0) {
                        break label75;
                     }
                  }

                  class562.field8401 = (-class189.field2365 + class88.field1075) / 2;
                  class787.field11447 = 0;
                  class207.field2647 = class189.field2365;
                  class411.field6305 = class663.field9630;
               }

               if (class487.field7208 != class281.field3917) {
                  boolean var10000;
                  if (~class207.field2647 > -1025 && ~class411.field6305 > -769) {
                     var10000 = true;
                  } else {
                     var10000 = false;
                  }
               }

               class769.field11271.setSize(class207.field2647, class411.field6305);
               if (class786.field11439 != null) {
                  label62: {
                     if (class446.field6785) {
                        class302.method2301(52, class769.field11271);
                        if (var1 == 0) {
                           break label62;
                        }
                     }

                     class786.field11439.method584(class769.field11271, class207.field2647, class411.field6305);
                  }
               }

               label57: {
                  if (class691.field10404 == var3) {
                     Insets var5 = class691.field10404.getInsets();
                     class769.field11271.setLocation(class562.field8401 + var5.left, class787.field11447 + var5.top);
                     if (var1 == 0) {
                        break label57;
                     }
                  }

                  class769.field11271.setLocation(class562.field8401, class787.field11447);
               }

               if (~class198.field2452 != 0) {
                  class520.method3833(true, (byte)-79);
               }

               class415.method3172(-1);
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field3901[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2148(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2149(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
