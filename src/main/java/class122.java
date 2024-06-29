import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class class122 {
   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1532 = new String[]{method1034(method1033("PE(b")), method1034(method1033("LYjJF")), method1034(method1033("E\u001ej \u0013"))};
   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "I"
   )
   public static int field1531;

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method1027(byte arg0);

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "([BIII)V"
   )
   public abstract void method1028(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public abstract boolean method1029(boolean arg0, int arg1) throws IOException;

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(I[BBI)I"
   )
   public abstract int method1030(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException;

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1031(int arg0);

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(ILpl;B[I)V"
   )
   public static final void method1032(int arg0, class680 arg1, byte arg2, int[] arg3) {
      boolean var4 = client.field4273;

      try {
         ++field1531;
         if (arg1.field7789 != null) {
            int var10000;
            label163: {
               byte var5 = 1;
               int var6 = 0;
               if (var4) {
                  var10000 = arg1.field7789[var6];
               } else if (var6 >= arg1.field7789.length) {
                  var10000 = var5;
                  if (!var4) {
                     break label163;
                  }
               } else {
                  var10000 = arg1.field7789[var6];
               }

               label162:
               do {
                  while(true) {
                     if (var10000 != arg3[var6]) {
                        var5 = 0;
                        if (!var4) {
                           var10000 = var5;
                           break;
                        }

                        ++var6;
                     } else {
                        ++var6;
                     }

                     if (var6 >= arg1.field7789.length) {
                        var10000 = var5;
                        if (!var4) {
                           break label162;
                        }
                     } else {
                        var10000 = arg1.field7789[var6];
                     }
                  }
               } while(var4);
            }

            if (var10000 != 0 && arg1.field7842 != -1) {
               class61 var7 = class392.field5479.method1477(arg2 ^ -105, arg1.field7842);
               int var8 = var7.field648;
               if (var8 == 1) {
                  arg1.field7837 = 0;
                  arg1.field7758 = arg0;
                  arg1.field7818 = 0;
                  arg1.field7769 = 0;
                  arg1.field7830 = 1;
                  if (!arg1.field7821) {
                     class779.method5586(arg1, var7, arg1.field7837, -20543);
                  }
               }

               if (~var8 == -3) {
                  arg1.field7818 = 0;
               }
            }
         }

         boolean var9 = true;
         if (arg2 == -106) {
            int var10 = 0;
            if (var4) {
               if (~arg3[var10] != 0) {
                  var9 = false;
               }
            } else if (var10 >= arg3.length) {
               if (!var4) {
                  if (var9) {
                     arg1.field7789 = arg3;
                     arg1.field7758 = arg0;
                     arg1.field7856 = arg1.field7848;
                     return;
                  }

                  return;
               }

               if (var9) {
                  var9 = false;
               }
            } else if (~arg3[var10] != 0) {
               var9 = false;
            }

            while(true) {
               if (arg1.field7789 != null) {
                  if (arg1.field7789[var10] != -1) {
                     if (class392.field5479.method1477(1, arg3[var10]).field654 >= class392.field5479.method1477(1, arg1.field7789[var10]).field654) {
                        arg1.field7856 = arg1.field7848;
                        arg1.field7789 = arg3;
                        arg1.field7758 = arg0;
                        ++var10;
                     } else {
                        ++var10;
                     }
                  } else {
                     arg1.field7856 = arg1.field7848;
                     arg1.field7789 = arg3;
                     arg1.field7758 = arg0;
                     ++var10;
                  }
               } else {
                  arg1.field7856 = arg1.field7848;
                  arg1.field7789 = arg3;
                  arg1.field7758 = arg0;
                  ++var10;
               }

               if (var10 >= arg3.length) {
                  if (!var4) {
                     if (var9) {
                        arg1.field7789 = arg3;
                        arg1.field7758 = arg0;
                        arg1.field7856 = arg1.field7848;
                        return;
                     }

                     return;
                  }

                  if (var9) {
                     var9 = false;
                  }
               } else if (~arg3[var10] != 0) {
                  var9 = false;
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field1532[1] + arg0 + ',' + (arg1 != null ? field1532[2] : field1532[0]) + ',' + arg2 + ',' + (arg3 != null ? field1532[2] : field1532[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1033(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1034(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
