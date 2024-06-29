import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class513 {
   @OriginalMember(
      owner = "client!ef",
      name = "g",
      descriptor = "I"
   )
   public int field7515;
   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7525 = new String[]{method3812(method3811("PJR\u0017w")), method3812(method3811("PJR\"0fX\u000e?1R\u0004")), method3812(method3811("PJRj6[E\bhw")), method3812(method3811("N\u0002Rx\"")), method3812(method3811("[Y\u0010:")), method3812(method3811("PJR\u0014w")), method3812(method3811("|B\n73\\H\\$>QE\u0004l")), method3812(method3811("PJR\u0015w"))};
   @OriginalMember(
      owner = "client!ef",
      name = "h",
      descriptor = "Lef;"
   )
   public static class513 field7516 = new class513(1);
   @OriginalMember(
      owner = "client!ef",
      name = "l",
      descriptor = "Lef;"
   )
   public static class513 field7517 = new class513(2);
   @OriginalMember(
      owner = "client!ef",
      name = "b",
      descriptor = "Lef;"
   )
   public static class513 field7518 = new class513(4);
   @OriginalMember(
      owner = "client!ef",
      name = "k",
      descriptor = "Lef;"
   )
   public static class513 field7519 = new class513(1);
   @OriginalMember(
      owner = "client!ef",
      name = "j",
      descriptor = "Lef;"
   )
   public static class513 field7520 = new class513(2);
   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "Lef;"
   )
   public static class513 field7521 = new class513(4);
   @OriginalMember(
      owner = "client!ef",
      name = "e",
      descriptor = "Lef;"
   )
   public static class513 field7522 = new class513(2);
   @OriginalMember(
      owner = "client!ef",
      name = "c",
      descriptor = "Lef;"
   )
   public static class513 field7523 = new class513(4);
   @OriginalMember(
      owner = "client!ef",
      name = "i",
      descriptor = "I"
   )
   public static int field7512;
   @OriginalMember(
      owner = "client!ef",
      name = "d",
      descriptor = "I"
   )
   public static int field7513;
   @OriginalMember(
      owner = "client!ef",
      name = "f",
      descriptor = "I"
   )
   public static int field7514;
   @OriginalMember(
      owner = "client!ef",
      name = "m",
      descriptor = "I"
   )
   public static int field7524;

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static void method3808(int arg0) {
      try {
         if (arg0 > -70) {
            method3809(true, 79, (String)null, (byte)21);
         }

         field7518 = null;
         field7521 = null;
         field7519 = null;
         field7516 = null;
         field7523 = null;
         field7522 = null;
         field7517 = null;
         field7520 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7525[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(ZILjava/lang/String;B)I",
      line = 22
   )
   public static final int method3809(boolean arg0, int arg1, String arg2, byte arg3) {
      int var4 = client.field4530;

      try {
         ++field7514;
         if (~arg1 <= -3 && ~arg1 >= -37) {
            boolean var5 = false;
            byte var6 = 0;
            int var7 = 0;
            int var8 = arg2.length();
            int var9 = 0;
            int var10 = -3 % ((arg3 - 24) / 43);
            char var10000;
            if (var4 != 0) {
               var10000 = arg2.charAt(var9);
            } else if (var9 >= var8) {
               var10000 = (char)var6;
               if (var4 == 0) {
                  if (var6 == 0) {
                     throw new NumberFormatException();
                  }

                  return var7;
               }
            } else {
               var10000 = arg2.charAt(var9);
            }

            while(true) {
               label165: {
                  char var11 = var10000;
                  if (var9 == 0) {
                     if (~var11 == -46) {
                        var5 = true;
                        if (var4 == 0) {
                           ++var9;
                           break label165;
                        }
                     }

                     if (~var11 == -44 && arg0 && var4 == 0) {
                        ++var9;
                        break label165;
                     }
                  }

                  int var12;
                  int var15;
                  if (var11 >= '0' && ~var11 >= -58) {
                     var15 = var11 - '0';
                     if (~var15 <= ~arg1) {
                        throw new NumberFormatException();
                     }

                     if (var5) {
                        var15 = -var15;
                     }

                     var12 = arg1 * var7 + var15;
                     if (var12 / arg1 != var7) {
                        throw new NumberFormatException();
                     }

                     var7 = var12;
                     var6 = 1;
                     ++var9;
                  } else {
                     if (~var11 <= -66) {
                        if (~var11 < -91) {
                           if (var11 < 'a' || ~var11 < -123) {
                              break;
                           }

                           var15 = var11 - 'W';
                           if (var4 != 0) {
                              break;
                           }
                        } else {
                           var15 = var11 - '7';
                           if (var4 != 0) {
                              var15 -= 48;
                           }
                        }
                     } else {
                        if (var11 < 'a' || ~var11 < -123) {
                           break;
                        }

                        var15 = var11 - 'W';
                        if (var4 != 0) {
                           break;
                        }
                     }

                     if (~var15 <= ~arg1) {
                        throw new NumberFormatException();
                     }

                     if (var5) {
                        var15 = -var15;
                     }

                     var12 = arg1 * var7 + var15;
                     if (var12 / arg1 != var7) {
                        throw new NumberFormatException();
                     }

                     var7 = var12;
                     var6 = 1;
                     ++var9;
                  }
               }

               if (var9 >= var8) {
                  var10000 = (char)var6;
                  if (var4 == 0) {
                     if (var6 == 0) {
                        throw new NumberFormatException();
                     }

                     return var7;
                  }
               } else {
                  var10000 = arg2.charAt(var9);
               }
            }

            throw new NumberFormatException();
         } else {
            throw new IllegalArgumentException(field7525[6] + arg1);
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field7525[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7525[3] : field7525[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 97
   )
   public final String toString() {
      try {
         ++field7513;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7525[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "([SB)[S",
      line = 111
   )
   public static final short[] method3810(short[] arg0, byte arg1) {
      try {
         ++field7512;
         if (arg0 == null) {
            return null;
         } else {
            if (arg1 < 92) {
               field7520 = null;
            }

            short[] var2 = new short[arg0.length];
            class195.method1489(arg0, 0, var2, 0, arg0.length);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7525[5] + (arg0 != null ? field7525[3] : field7525[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "<init>",
      descriptor = "(I)V",
      line = 128
   )
   private class513(int arg0) {
      try {
         this.field7515 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7525[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3811(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3812(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
