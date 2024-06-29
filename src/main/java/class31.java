import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class31 {
   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field373 = new String[]{method256(method255("G\u001b&]\u0011\\G;\\%\u0000")), method256(method255("S\u001b|\u001c?")), method256(method255("G\u001b\u0013\u001a")), method256(method255("F@>^")), method256(method255("G\u001b\u0010\u001a")), method256(method255("G\u001b\u0011\u001a"))};
   @OriginalMember(
      owner = "client!o",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field369 = new int[4];
   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "I"
   )
   public static int field370;
   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "I"
   )
   public static int field371;
   @OriginalMember(
      owner = "client!o",
      name = "d",
      descriptor = "I"
   )
   public static int field372;

   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method252(int arg0) {
      boolean var1 = client.field4273;

      try {
         if (arg0 != -13745) {
            method254(115, (class471)null);
         }

         ++field371;
         client var2 = class15.field197;
         synchronized(class15.field197) {
            if (class85.field1098 == null) {
               Container var3;
               label84: {
                  if (class533.field7289 == null) {
                     if (class126.field1586 == null) {
                        var3 = class186.field2284;
                        if (!var1) {
                           break label84;
                        }
                     }

                     var3 = class126.field1586;
                     if (!var1) {
                        break label84;
                     }
                  }

                  var3 = class533.field7289;
               }

               class682.field10003 = var3.getSize().width;
               class434.field6038 = var3.getSize().height;
               if (class533.field7289 == var3) {
                  Insets var4 = class533.field7289.getInsets();
                  class682.field10003 -= var4.right + var4.left;
                  class434.field6038 -= var4.top + var4.bottom;
               }

               label75: {
                  if (~class600.method4374(arg0 + 13847) != -2) {
                     class620.method4512(-117);
                     if (!var1) {
                        break label75;
                     }
                  }

                  class41.field479 = class420.field5892;
                  class322.field4298 = (-class698.field10190 + class682.field10003) / 2;
                  class682.field10009 = 0;
                  class252.field3194 = class698.field10190;
               }

               if (class304.field4027 != class269.field3480) {
                  boolean var10000;
                  if (class252.field3194 < 1024 && ~class41.field479 > -769) {
                     var10000 = true;
                  } else {
                     var10000 = false;
                  }
               }

               class204.field2515.setSize(class252.field3194, class41.field479);
               if (class338.field4832 != null) {
                  label62: {
                     if (!class775.field11283) {
                        class338.field4832.method521(class204.field2515, class252.field3194, class41.field479);
                        if (!var1) {
                           break label62;
                        }
                     }

                     class213.method1617((byte)109, class204.field2515);
                  }
               }

               label57: {
                  if (class533.field7289 == var3) {
                     Insets var5 = class533.field7289.getInsets();
                     class204.field2515.setLocation(var5.left - -class322.field4298, var5.top - -class682.field10009);
                     if (!var1) {
                        break label57;
                     }
                  }

                  class204.field2515.setLocation(class322.field4298, class682.field10009);
               }

               if (~class366.field5168 != 0) {
                  class698.method5074(arg0 ^ -11127, true);
               }

               class194.method1460((byte)5);
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field373[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method253(int arg0) {
      try {
         if (arg0 != 0) {
            method253(118);
         }

         field369 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field373[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(ILbn;)[I"
   )
   public static final int[] method254(int arg0, class471 arg1) {
      boolean var2 = client.field4273;

      try {
         ++field370;
         class594 var3 = new class594(518);
         int[] var4 = new int[arg0];
         int var5 = 0;
         if (var2) {
            var4[var5] = (int)(9.9999999E7D * Math.random());
            ++var5;
         }

         while(true) {
            while(~var5 > -5) {
               var4[var5] = (int)(9.9999999E7D * Math.random());
               ++var5;
            }

            var3.method4318(10, 0);
            var3.method4337(var4[0], 1184007664);
            var3.method4337(var4[1], 1184007664);
            var3.method4337(var4[2], arg0 ^ 1184007668);
            var3.method4337(var4[3], 1184007664);
            int var6 = 0;
            if (!var2) {
               if (var2) {
                  var3.method4337((int)(9.9999999E7D * Math.random()), 1184007664);
                  ++var6;
               }

               while(true) {
                  while(var6 < 10) {
                     var3.method4337((int)(9.9999999E7D * Math.random()), 1184007664);
                     ++var6;
                  }

                  var3.method4284((int)(Math.random() * 9.9999999E7D), -31429);
                  var3.method4316(class141.field1886, 75, class654.field9148);
                  arg1.field6527.method4321(var3.field8243, 0, 110909448, var3.field8227);
                  if (!var2) {
                     return var4;
                  }

                  ++var6;
               }
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field373[2] + arg0 + ',' + (arg1 != null ? field373[1] : field373[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field372;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field373[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class31(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method255(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method256(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
