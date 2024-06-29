import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class129 {
   @OriginalMember(
      owner = "client!oda",
      name = "d",
      descriptor = "I"
   )
   public int field1644 = 1;
   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1651 = new String[]{method1027(method1026("Y\u0002\">")), method1027(method1026("LY`|?")), method1027(method1026("X\u0013/|\u0001\u001f")), method1027(method1026("X\u0013/|\u0000\u001f")), method1027(method1026("X\u0013/|\u0006\u001f")), method1027(method1026("r8\b")), method1027(method1026("X\u0013/|\u0003\u001f"))};
   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "[F"
   )
   public static float[] field1647 = new float[4];
   @OriginalMember(
      owner = "client!oda",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field1650 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!oda",
      name = "e",
      descriptor = "C"
   )
   public char field1646;
   @OriginalMember(
      owner = "client!oda",
      name = "b",
      descriptor = "I"
   )
   public static int field1645;
   @OriginalMember(
      owner = "client!oda",
      name = "g",
      descriptor = "I"
   )
   public static int field1648;
   @OriginalMember(
      owner = "client!oda",
      name = "c",
      descriptor = "I"
   )
   public static int field1649;

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(Lwf;IZ)V"
   )
   private final void method1022(class147 arg0, int arg1, boolean arg2) {
      try {
         label31: {
            if (arg1 != 1) {
               if (~arg1 != -3) {
                  break label31;
               }

               this.field1644 = 0;
               if (!client.field4360) {
                  break label31;
               }
            }

            this.field1646 = class312.method2306(arg2, arg0.method1162(4));
         }

         ++field1649;
         if (!arg2) {
            method1025((byte)-112);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1651[3] + (arg0 != null ? field1651[1] : field1651[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(BLwf;)V"
   )
   public final void method1023(byte arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 != 94) {
            this.method1022((class147)null, -17, false);
         }

         while(true) {
            int var4 = arg1.method1143(arg0 ^ -15415);
            if (var4 != 0) {
               this.method1022(arg1, var4, true);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field1645;
            break;
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1651[2] + arg0 + ',' + (arg1 != null ? field1651[1] : field1651[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(I)Lifa;"
   )
   public static final class453 method1024(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field1648;
         class679 var2 = null;
         class453 var3 = new class453(class134.field1715, 0);

         try {
            class296 var4 = class316.field4304.method4508((byte)94, "", true);
            if (arg0 != 32147) {
               return null;
            }

            while(true) {
               int var10000;
               if (~var4.field4078 != -1) {
                  var10000 = var4.field4078;
                  if (!var1) {
                     if (var10000 == 1) {
                        var2 = (class679)var4.field4077;
                        byte[] var5 = new byte[(int)var2.method4954(48)];
                        int var6 = 0;
                        if (var1 || var5.length > var6) {
                           do {
                              int var7 = var2.method4956(var5, var6, var5.length - var6, (byte)-68);
                              if (var7 == -1) {
                                 throw new IOException(field1651[5]);
                              }

                              var6 += var7;
                           } while(var5.length > var6);
                        }

                        var3 = new class453(new class147(var5), class134.field1715, 0);
                     }
                     break;
                  }
               } else {
                  var10000 = 0;
               }

               class661.method4825(var10000, 1L);
            }
         } catch (Exception var10) {
         }

         try {
            if (var2 != null) {
               var2.method4960(true);
            }
         } catch (Exception var9) {
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field1651[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1025(byte arg0) {
      try {
         if (arg0 < -24) {
            field1647 = null;
            field1650 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1651[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1026(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1027(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
