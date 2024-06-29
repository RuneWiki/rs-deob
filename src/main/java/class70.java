import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class70 extends class347 {
   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field890 = new String[]{method703(method702("!r\u000f\u0019-")), method703(method702(">0\u000frx")), method703(method702("+kM0")), method703(method702("!r\u000f\u001f-")), method703(method702("!r\u000f\u001b-")), method703(method702("!r\u000f\u0018-")), method703(method702("!r\u000f\u001a-")), method703(method702("!r\u000f\u001e-")), method703(method702("!r\u000f\u001d-")), method703(method702("!r\u000f\u0014-"))};
   @OriginalMember(
      owner = "client!dl",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field885 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   @OriginalMember(
      owner = "client!dl",
      name = "m",
      descriptor = "Lii;"
   )
   public static class579 field883 = new class579(3);
   @OriginalMember(
      owner = "client!dl",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field887 = new int[4];
   @OriginalMember(
      owner = "client!dl",
      name = "n",
      descriptor = "Lsda;"
   )
   public static class269 field889 = new class269(42, 12);
   @OriginalMember(
      owner = "client!dl",
      name = "u",
      descriptor = "I"
   )
   public static int field875;
   @OriginalMember(
      owner = "client!dl",
      name = "l",
      descriptor = "I"
   )
   public static int field876;
   @OriginalMember(
      owner = "client!dl",
      name = "p",
      descriptor = "I"
   )
   public static int field877;
   @OriginalMember(
      owner = "client!dl",
      name = "i",
      descriptor = "I"
   )
   public static int field879;
   @OriginalMember(
      owner = "client!dl",
      name = "j",
      descriptor = "I"
   )
   public static int field880;
   @OriginalMember(
      owner = "client!dl",
      name = "q",
      descriptor = "I"
   )
   public static int field884;
   @OriginalMember(
      owner = "client!dl",
      name = "o",
      descriptor = "I"
   )
   public static int field886;
   @OriginalMember(
      owner = "client!dl",
      name = "w",
      descriptor = "I"
   )
   public static int field888;
   @OriginalMember(
      owner = "client!dl",
      name = "s",
      descriptor = "J"
   )
   public long field882;
   @OriginalMember(
      owner = "client!dl",
      name = "t",
      descriptor = "Ldl;"
   )
   public class70 field878;
   @OriginalMember(
      owner = "client!dl",
      name = "v",
      descriptor = "Ldl;"
   )
   public class70 field881;

   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static void method694(int arg0) {
      try {
         field885 = null;
         if (arg0 == -19114) {
            field883 = null;
            field889 = null;
            field887 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field890[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(ILjava/lang/String;B)I",
      line = 16
   )
   public static final int method695(int arg0, String arg1, byte arg2) {
      try {
         if (arg2 > -101) {
            method696((byte)113, (String)null);
         }

         ++field884;
         return class513.method3809(true, arg0, arg1, (byte)73);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field890[0] + arg0 + ',' + (arg1 != null ? field890[1] : field890[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(BLjava/lang/String;)Ljava/lang/String;",
      line = 27
   )
   public static final String method696(byte arg0, String arg1) {
      int var2 = client.field4530;

      try {
         ++field875;
         if (arg1 == null) {
            return null;
         } else {
            int var3;
            int var4;
            int var10000;
            label120: {
               var3 = 0;
               var4 = arg1.length();
               if (var2 != 0) {
                  ++var3;
               }

               label111:
               while(true) {
                  if (var3 < var4) {
                     var10000 = class548.method4055(arg1.charAt(var3), false);
                     if (var2 == 0) {
                        if (var10000 != 0) {
                           ++var3;
                           continue;
                        }

                        if (var2 != 0) {
                           --var4;
                        }

                        var10000 = ~var4;
                     }
                  } else {
                     var10000 = ~var4;
                  }

                  while(true) {
                     if (var10000 >= ~var3) {
                        break label111;
                     }

                     var10000 = class548.method4055(arg1.charAt(var4 + -1), false);
                     if (var2 != 0) {
                        break label120;
                     }

                     if (var10000 == 0) {
                        break label111;
                     }

                     --var4;
                     var10000 = ~var4;
                  }
               }

               var10000 = var4 - var3;
            }

            int var5 = var10000;
            if (var5 >= 1 && var5 <= 12) {
               if (arg0 >= -81) {
                  return null;
               } else {
                  StringBuffer var6 = new StringBuffer(var5);
                  int var7 = var3;
                  char var9;
                  if (var2 != 0) {
                     char var8 = arg1.charAt(var3);
                     if (class347.method2718(24, var8)) {
                        var9 = class387.method2970(var8, true);
                        if (~var9 != -1) {
                           var6.append(var9);
                        }
                     }

                     var7 = var3 + 1;
                  }

                  while(true) {
                     if (var7 >= var4) {
                        var10000 = ~var6.length();
                        if (var2 == 0) {
                           if (var10000 == -1) {
                              return null;
                           }

                           return var6.toString();
                        }
                     } else {
                        var10000 = arg1.charAt(var7);
                     }

                     int var12 = var10000;
                     if (class347.method2718(24, (char)var12)) {
                        var9 = class387.method2970((char)var12, true);
                        if (~var9 != -1) {
                           var6.append(var9);
                        }
                     }

                     ++var7;
                  }
               }
            } else {
               return null;
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field890[3] + arg0 + ',' + (arg1 != null ? field890[1] : field890[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(I)Z",
      line = 83
   )
   public final boolean method697(int arg0) {
      try {
         if (arg0 != 16885) {
            this.field878 = null;
         }

         ++field886;
         return this.field878 != null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field890[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "(III)I",
      line = 101
   )
   public static final int method698(int arg0, int arg1, int arg2) {
      try {
         ++field876;
         arg1 = (arg2 & 127) * arg1 >> 7;
         if (arg0 > -121) {
            method700(38, -54);
         }

         if (~arg1 > -3) {
            arg1 = 2;
            if (client.field4530 == 0) {
               return (65408 & arg2) + arg1;
            }
         }

         if (~arg1 < -127) {
            arg1 = 126;
         }

         return (65408 & arg2) + arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field890[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "e",
      descriptor = "(I)V",
      line = 122
   )
   public final void method699(int arg0) {
      try {
         ++field879;
         if (this.field878 != null) {
            this.field878.field881 = this.field881;
            this.field881.field878 = this.field878;
            if (arg0 != 12) {
               field877 = -122;
            }

            this.field878 = null;
            this.field881 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field890[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(II)Lbu;",
      line = 139
   )
   public static final class21 method700(int arg0, int arg1) {
      try {
         if (arg0 > -2) {
            return null;
         } else {
            ++field888;
            return class78.field973 && ~class498.field7379 >= ~arg1 && ~class554.field8212 <= ~arg1 ? class67.field841[arg1 - class498.field7379] : null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field890[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(IIZ)Z",
      line = 163
   )
   public static final boolean method701(int arg0, int arg1, boolean arg2) {
      try {
         if (arg2) {
            field883 = null;
         }

         ++field880;
         return false;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field890[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method702(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method703(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
