import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class743 {
   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10833 = new String[]{method5387(method5386("j\u0001`\u0018\t")), method5387(method5386("j\u0001`\u001f\t")), method5387(method5386("j\u0001`\u001c\t")), method5387(method5386("h\u0001\"6")), method5387(method5386("j\u0001`\u0019\t")), method5387(method5386("}Z`t\\")), method5387(method5386("j\u0001`\u001b\t")), method5387(method5386("j\u0001`\u001e\t"))};
   @OriginalMember(
      owner = "client!lu",
      name = "k",
      descriptor = "I"
   )
   public static int field10826 = 0;
   @OriginalMember(
      owner = "client!lu",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field10822 = false;
   @OriginalMember(
      owner = "client!lu",
      name = "l",
      descriptor = "J"
   )
   public static long field10823 = 20000000L;
   @OriginalMember(
      owner = "client!lu",
      name = "i",
      descriptor = "Lek;"
   )
   public static class536 field10829 = new class536(61, 4);
   @OriginalMember(
      owner = "client!lu",
      name = "h",
      descriptor = "Loi;"
   )
   public static class80 field10830 = new class80(64);
   @OriginalMember(
      owner = "client!lu",
      name = "g",
      descriptor = "Lwv;"
   )
   public static class37 field10831 = new class37(32);
   @OriginalMember(
      owner = "client!lu",
      name = "d",
      descriptor = "Leg;"
   )
   public static class118 field10832 = new class118(107, 9);
   @OriginalMember(
      owner = "client!lu",
      name = "e",
      descriptor = "I"
   )
   public static int field10821;
   @OriginalMember(
      owner = "client!lu",
      name = "f",
      descriptor = "I"
   )
   public static int field10824;
   @OriginalMember(
      owner = "client!lu",
      name = "c",
      descriptor = "I"
   )
   public static int field10825;
   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "I"
   )
   public static int field10827;
   @OriginalMember(
      owner = "client!lu",
      name = "b",
      descriptor = "I"
   )
   public static int field10828;

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method5380(int arg0) {
      try {
         field10829 = null;
         field10830 = null;
         field10831 = null;
         field10832 = null;
         if (arg0 != -11333) {
            method5383(-31, -103);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10833[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(IB)I",
      line = 18
   )
   public static final int method5381(int arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         ++field10824;
         double var3 = (double)((16773791 & arg0) >> 16) / 256.0D;
         double var5 = (double)(255 & arg0 >> 8) / 256.0D;
         if (arg1 >= -108) {
            return -4;
         } else {
            double var7 = (double)(255 & arg0) / 256.0D;
            double var9 = var3;
            if (var3 > var5) {
               var9 = var5;
            }

            if (var9 > var7) {
               var9 = var7;
            }

            double var11 = var3;
            if (var3 < var5) {
               var11 = var5;
            }

            if (var11 < var7) {
               var11 = var7;
            }

            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = (var9 + var11) / 2.0D;
            if (var9 != var11) {
               label107: {
                  if (var17 < 0.5D) {
                     var15 = (-var9 + var11) / (var9 + var11);
                  }

                  if (var17 >= 0.5D) {
                     var15 = (var11 - var9) / (-var11 + 2.0D - var9);
                  }

                  if (var3 != var11) {
                     if (var5 == var11) {
                        var13 = (-var3 + var7) / (-var9 + var11) + 2.0D;
                        if (!var2) {
                           break label107;
                        }
                     }

                     if (var7 != var11) {
                        break label107;
                     }

                     var13 = (var3 - var5) / (var11 - var9) + 4.0D;
                     if (!var2) {
                        break label107;
                     }
                  }

                  var13 = (var5 - var7) / (var11 - var9);
               }
            }

            int var21;
            int var22;
            int var23;
            label81: {
               double var19 = var13 / 6.0D;
               var21 = (int)(var19 * 256.0D);
               var22 = (int)(var15 * 256.0D);
               var23 = (int)(var17 * 256.0D);
               if (var22 < 0) {
                  var22 = 0;
                  if (!var2) {
                     break label81;
                  }
               }

               if (~var22 < -256) {
                  var22 = 255;
               }
            }

            label76: {
               if (var23 < 0) {
                  var23 = 0;
                  if (!var2) {
                     break label76;
                  }
               }

               if (~var23 < -256) {
                  var23 = 255;
               }
            }

            if (var23 <= 243) {
               if (~var23 < -218) {
                  var22 >>= 3;
                  if (!var2) {
                     return ((255 & var21) >> 2 << 10) + (var22 >> 5 << 7) - -(var23 >> 1);
                  }
               }

               if (var23 <= 192) {
                  if (~var23 >= -180) {
                     return ((255 & var21) >> 2 << 10) + (var22 >> 5 << 7) - -(var23 >> 1);
                  }

                  var22 >>= 1;
                  if (!var2) {
                     return ((255 & var21) >> 2 << 10) + (var22 >> 5 << 7) - -(var23 >> 1);
                  }
               }

               var22 >>= 2;
               if (!var2) {
                  return ((255 & var21) >> 2 << 10) + (var22 >> 5 << 7) - -(var23 >> 1);
               }
            }

            var22 >>= 4;
            return ((255 & var21) >> 2 << 10) + (var22 >> 5 << 7) - -(var23 >> 1);
         }
      } catch (RuntimeException var25) {
         throw class237.method1823(var25, field10833[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "b",
      descriptor = "(I)I",
      line = 122
   )
   public static final int method5382(int arg0) {
      try {
         ++field10821;
         if (arg0 != 192) {
            method5381(14, (byte)-66);
         }

         return class239.field3344;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10833[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(II)Z",
      line = 140
   )
   public static final boolean method5383(int arg0, int arg1) {
      try {
         if (arg0 != 0) {
            field10830 = null;
         }

         ++field10825;
         if (arg1 != 53 && arg1 != 59 && arg1 != 3 && arg1 != 51 && ~arg1 != -48) {
            return arg1 == 45 || arg1 == 1002;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10833[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(Lbl;B)V",
      line = 163
   )
   public static final void method5384(class678 arg0, byte arg1) {
      try {
         ++field10827;
         if (~class355.field4783 == ~arg0.field9939) {
            class188.field2673[arg0.field9950] = true;
         }

         if (arg1 >= -15) {
            field10823 = 107L;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10833[4] + (arg0 != null ? field10833[5] : field10833[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "a",
      descriptor = "(Lbda;Z)I",
      line = 180
   )
   public static final int method5385(class534 arg0, boolean arg1) {
      boolean var2 = client.field4360;

      try {
         ++field10828;
         if (!arg1) {
            method5382(34);
         }

         int var3 = arg0.method3844(2, 0);
         int var4;
         if (var3 != 0) {
            if (~var3 == -2) {
               var4 = arg0.method3844(5, 0);
               if (!var2) {
                  return var4;
               }
            }

            if (~var3 != -3) {
               var4 = arg0.method3844(11, 0);
               if (!var2) {
                  return var4;
               }
            }

            var4 = arg0.method3844(8, 0);
            if (!var2) {
               return var4;
            }
         }

         var4 = 0;
         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10833[6] + (arg0 != null ? field10833[5] : field10833[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5386(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5387(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
