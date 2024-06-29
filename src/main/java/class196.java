import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class196 extends class76 {
   @OriginalMember(
      owner = "client!r",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2775 = new String[]{method1539(method1538("Vbd\u000e")), method1539(method1538("C9&L1")), method1539(method1538("J9XJ")), method1539(method1538("J9GJ"))};
   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field2773 = new int[50];
   @OriginalMember(
      owner = "client!r",
      name = "C",
      descriptor = "I"
   )
   public static int field2772;
   @OriginalMember(
      owner = "client!r",
      name = "A",
      descriptor = "Ldda;"
   )
   public static class405 field2771;
   @OriginalMember(
      owner = "client!r",
      name = "B",
      descriptor = "[Ljava/lang/Object;"
   )
   public static Object[] field2774;

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(I[BBI)Ljava/lang/String;",
      line = 7
   )
   public static final String method1535(int arg0, byte[] arg1, byte arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         ++field2772;
         char[] var5 = new char[arg0];
         if (arg2 != -52) {
            return null;
         } else {
            int var6 = 0;
            int var7 = arg3;
            int var8 = arg0 + arg3;
            if (!var4 && arg3 >= var8) {
               return new String(var5, 0, var6);
            } else {
               do {
                  int var10;
                  label123: {
                     int var9 = 255 & arg1[var7++];
                     if (~var9 <= -129) {
                        if (var9 >= 192) {
                           if (var9 < 224) {
                              if (var8 > var7 && (192 & arg1[var7]) == 128) {
                                 var10 = arg1[var7++] & 63 | (var9 & 31) << 6;
                                 if (var10 >= 128) {
                                    break label123;
                                 }

                                 var10 = 65533;
                                 if (!var4) {
                                    break label123;
                                 }
                              }

                              var10 = 65533;
                              if (!var4) {
                                 break label123;
                              }
                           }

                           if (var9 < 240) {
                              if (var7 + 1 < var8 && ~(arg1[var7] & 192) == -129 && ~(192 & arg1[var7 + 1]) == -129) {
                                 var10 = 4032 & arg1[var7++] << 6 | var9 << 12 & 61440 | 63 & arg1[var7++];
                                 if (var10 >= 2048) {
                                    break label123;
                                 }

                                 var10 = 65533;
                                 if (!var4) {
                                    break label123;
                                 }
                              }

                              var10 = 65533;
                              if (!var4) {
                                 break label123;
                              }
                           }

                           if (var9 < 248) {
                              if (~var8 >= ~(var7 - -2) || ~(192 & arg1[var7]) != -129 || (arg1[var7 + 1] & 192) != 128 || (arg1[var7 - -2] & 192) != 128) {
                                 var10 = 65533;
                                 if (!var4) {
                                    break label123;
                                 }
                              }

                              int var11 = 258048 & arg1[var7++] << 12 | (var9 & 7) << 18 | (63 & arg1[var7++]) << 6 | arg1[var7++] & 63;
                              if (~var11 <= -65537 && ~var11 >= -1114112) {
                                 var10 = 65533;
                                 if (!var4) {
                                    break label123;
                                 }
                              }

                              var10 = 65533;
                              if (!var4) {
                                 break label123;
                              }
                           }

                           var10 = 65533;
                           if (!var4) {
                              break label123;
                           }
                        }

                        var10 = 65533;
                        if (!var4) {
                           break label123;
                        }
                     }

                     if (var9 != 0) {
                        var10 = var9;
                        if (var4) {
                           var10 = 65533;
                        }
                     } else {
                        var10 = 65533;
                     }
                  }

                  var5[var6++] = (char)var10;
               } while(var7 < var8);

               return new String(var5, 0, var6);
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field2775[2] + arg0 + ',' + (arg1 != null ? field2775[1] : field2775[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(Lr;III[Z)V",
      line = 101
   )
   public static final void method1536(class196 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      if (class757.field11220 != class731.field10698) {
         int var5 = class265.field3658[arg1].method2220(arg3, arg2, 103);

         for(int var6 = 0; var6 <= arg1; ++var6) {
            if (arg4 == null || arg4[var6]) {
               class295 var7 = class265.field3658[var6];
               if (var7 != null) {
                  var7.method1615(arg0, arg2, var5 - var7.method2220(arg3, arg2, 96), arg3, 0, false);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!r",
      name = "c",
      descriptor = "(B)V",
      line = 128
   )
   public static void method1537(byte arg0) {
      try {
         if (arg0 <= -38) {
            field2771 = null;
            field2773 = null;
            field2774 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2775[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1538(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1539(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
