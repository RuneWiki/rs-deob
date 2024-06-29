import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class675 {
   @OriginalMember(
      owner = "client!it",
      name = "t",
      descriptor = "I"
   )
   public int field9777 = 128;
   @OriginalMember(
      owner = "client!it",
      name = "e",
      descriptor = "I"
   )
   public int field9781 = 128;
   @OriginalMember(
      owner = "client!it",
      name = "s",
      descriptor = "I"
   )
   public int field9779;
   @OriginalMember(
      owner = "client!it",
      name = "m",
      descriptor = "I"
   )
   public int field9790;
   @OriginalMember(
      owner = "client!it",
      name = "l",
      descriptor = "I"
   )
   public int field9776;
   @OriginalMember(
      owner = "client!it",
      name = "d",
      descriptor = "I"
   )
   public int field9782;
   @OriginalMember(
      owner = "client!it",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9793 = new String[]{method4911(method4910("T\u0012?7\u0003S\u000fe5B")), method4911(method4910("T\u0012?NB")), method4911(method4910("T\u0012?HB")), method4911(method4910("FH?%\u0017")), method4911(method4910("S\u0013}g")), method4911(method4910("T\u0012?IB")), method4911(method4910("T\u0012?CB")), method4911(method4910("t\bgj\u0006T\u00021y\u000bY\u000fi1")), method4911(method4910("T\u0012?MB")), method4911(method4910("T\u0012?JB")), method4911(method4910("T\u0012?LB")), method4911(method4910("T\u0012?OB"))};
   @OriginalMember(
      owner = "client!it",
      name = "r",
      descriptor = "Leg;"
   )
   public static class118 field9774 = new class118(36, 6);
   @OriginalMember(
      owner = "client!it",
      name = "o",
      descriptor = "Leg;"
   )
   public static class118 field9783 = new class118(13, -2);
   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "I"
   )
   public int field9773;
   @OriginalMember(
      owner = "client!it",
      name = "p",
      descriptor = "I"
   )
   public int field9775;
   @OriginalMember(
      owner = "client!it",
      name = "f",
      descriptor = "I"
   )
   public static int field9778;
   @OriginalMember(
      owner = "client!it",
      name = "n",
      descriptor = "I"
   )
   public static int field9780;
   @OriginalMember(
      owner = "client!it",
      name = "b",
      descriptor = "I"
   )
   public int field9784;
   @OriginalMember(
      owner = "client!it",
      name = "j",
      descriptor = "I"
   )
   public static int field9785;
   @OriginalMember(
      owner = "client!it",
      name = "h",
      descriptor = "I"
   )
   public static int field9786;
   @OriginalMember(
      owner = "client!it",
      name = "q",
      descriptor = "I"
   )
   public static int field9787;
   @OriginalMember(
      owner = "client!it",
      name = "k",
      descriptor = "I"
   )
   public static int field9788;
   @OriginalMember(
      owner = "client!it",
      name = "i",
      descriptor = "I"
   )
   public int field9789;
   @OriginalMember(
      owner = "client!it",
      name = "c",
      descriptor = "I"
   )
   public static int field9791;
   @OriginalMember(
      owner = "client!it",
      name = "g",
      descriptor = "I"
   )
   public int field9792;

   @OriginalMember(
      owner = "client!it",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4902(byte arg0) {
      try {
         field9783 = null;
         field9774 = null;
         int var1 = 19 % ((41 - arg0) / 57);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9793[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(B)Lit;"
   )
   public final class675 method4903(byte arg0) {
      try {
         ++field9791;
         return arg0 <= 32 ? null : new class675(this.field9779, this.field9777, this.field9781, this.field9776, this.field9782, this.field9790);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9793[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(I)[Ltr;"
   )
   public static final class310[] method4904(int arg0) {
      try {
         ++field9785;
         if (arg0 != 0) {
            field9783 = null;
         }

         return new class310[]{class555.field7940, class555.field7954, class555.field7956, class555.field7958, class555.field7959, class555.field7960, class555.field7962, class555.field7964, class555.field7965, class555.field7966, class555.field7967, class555.field7968, class555.field7969};
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9793[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(Ljava/lang/String;ZII)Z"
   )
   public static final boolean method4905(String arg0, boolean arg1, int arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         ++field9788;
         if (~arg3 <= -3 && ~arg3 >= -37) {
            boolean var5 = false;
            byte var6 = 0;
            if (arg2 != 55) {
               field9774 = null;
            }

            int var7 = 0;
            int var8 = arg0.length();
            int var9 = 0;
            char var10000;
            if (var4) {
               var10000 = arg0.charAt(var9);
            } else if (~var9 <= ~var8) {
               var10000 = (char)var6;
               if (!var4) {
                  return (boolean)var6;
               }
            } else {
               var10000 = arg0.charAt(var9);
            }

            while(true) {
               label159: {
                  char var10 = var10000;
                  if (var9 == 0) {
                     if (~var10 == -46) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label159;
                        }
                     }

                     if (var10 == '+' && arg1 && !var4) {
                        ++var9;
                        break label159;
                     }
                  }

                  int var11;
                  int var14;
                  if (~var10 <= -49 && var10 <= '9') {
                     var14 = var10 - '0';
                     if (~arg3 >= ~var14) {
                        return false;
                     }

                     if (var5) {
                        var14 = -var14;
                     }

                     var11 = arg3 * var7 + var14;
                     if (var11 / arg3 != var7) {
                        return false;
                     }

                     var6 = 1;
                     var7 = var11;
                     ++var9;
                  } else {
                     if (~var10 <= -66) {
                        if (var10 > 'Z') {
                           if (~var10 > -98 || ~var10 < -123) {
                              break;
                           }

                           var14 = var10 - 'W';
                           if (var4) {
                              break;
                           }
                        } else {
                           var14 = var10 - '7';
                           if (var4) {
                              var14 -= 48;
                           }
                        }
                     } else {
                        if (~var10 > -98 || ~var10 < -123) {
                           break;
                        }

                        var14 = var10 - 'W';
                        if (var4) {
                           break;
                        }
                     }

                     if (~arg3 >= ~var14) {
                        return false;
                     }

                     if (var5) {
                        var14 = -var14;
                     }

                     var11 = arg3 * var7 + var14;
                     if (var11 / arg3 != var7) {
                        return false;
                     }

                     var6 = 1;
                     var7 = var11;
                     ++var9;
                  }
               }

               if (~var9 <= ~var8) {
                  var10000 = (char)var6;
                  if (!var4) {
                     return (boolean)var6;
                  }
               } else {
                  var10000 = arg0.charAt(var9);
               }
            }

            return false;
         } else {
            throw new IllegalArgumentException(field9793[7] + arg3);
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field9793[8] + (arg0 != null ? field9793[3] : field9793[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(Lit;I)V"
   )
   public final void method4906(class675 arg0, int arg1) {
      try {
         this.field9790 = arg0.field9790;
         this.field9782 = arg0.field9782;
         this.field9776 = arg0.field9776;
         if (arg1 != -10520) {
            this.field9789 = 107;
         }

         this.field9777 = arg0.field9777;
         ++field9786;
         this.field9779 = arg0.field9779;
         this.field9781 = arg0.field9781;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9793[10] + (arg0 != null ? field9793[3] : field9793[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(ILbl;IZ)V"
   )
   public static final void method4907(int arg0, class678 arg1, int arg2, boolean arg3) {
      try {
         ++field9787;
         if (arg1 != null) {
            if (arg1.field9846 != null) {
               class421 var4 = new class421();
               var4.field6010 = arg1.field9846;
               var4.field6014 = arg1;
               class200.method1583(var4);
            }

            class14.field160 = arg1.field9838;
            if (arg3) {
               method4905((String)null, false, 36, 118);
            }

            class375.field5425 = arg0;
            class613.field9015 = true;
            class732.field10714 = arg1.field9912;
            class260.field3611 = arg2;
            class573.field8327 = arg1.field9965;
            class146.field1843 = arg1.field9952;
            class535.field7636 = arg1.field9854;
            class743.method5384(arg1, (byte)-79);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9793[5] + arg0 + ',' + (arg1 != null ? field9793[3] : field9793[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public static final void method4908(int arg0, int arg1, boolean arg2) {
      try {
         ++field9780;
         class755 var3 = class317.method2325((long)arg1, 95, 13);
         if (!arg2) {
            field9783 = null;
         }

         var3.method5479(1288);
         var3.field11184 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9793[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4909(int arg0, int arg1, int arg2) {
      try {
         ++field9778;
         if (arg1 > -51) {
            method4904(-73);
         }

         return ~(arg2 & 1024) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9793[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class675(int arg0) {
      try {
         this.field9779 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9793[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field9777 = arg1;
         this.field9779 = arg0;
         this.field9781 = arg2;
         this.field9790 = arg5;
         this.field9776 = arg3;
         this.field9782 = arg4;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9793[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4910(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!it",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4911(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
