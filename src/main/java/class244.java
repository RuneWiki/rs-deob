import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class244 {
   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "Lcia;"
   )
   public class643 field3047 = new class643();
   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3061 = new String[]{method1838(method1837("\u0003^_\u0001\u000e\u0018R\u0005\u0003O")), method1838(method1837("\u0003^_{O")), method1838(method1837("\u0018N\u001dQ")), method1838(method1837("\u0003^_\u007fO")), method1838(method1837("\r\u0015_\u0013\u001a")), method1838(method1837("\u0003^_uO")), method1838(method1837("\u0003^_tO")), method1838(method1837("\u0003^_~O")), method1838(method1837("\u0003^_wO")), method1838(method1837("\u0003^_yO")), method1838(method1837("\u0003^_xO")), method1838(method1837("\u0003^_|O")), method1838(method1837("\u0003^_zO"))};
   @OriginalMember(
      owner = "client!ue",
      name = "g",
      descriptor = "[Z"
   )
   public static boolean[] field3057 = new boolean[100];
   @OriginalMember(
      owner = "client!ue",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field3055 = new class378(128, 4);
   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "I"
   )
   public static int field3059 = -1;
   @OriginalMember(
      owner = "client!ue",
      name = "h",
      descriptor = "I"
   )
   public static int field3046;
   @OriginalMember(
      owner = "client!ue",
      name = "j",
      descriptor = "I"
   )
   public static int field3048;
   @OriginalMember(
      owner = "client!ue",
      name = "d",
      descriptor = "I"
   )
   public static int field3049;
   @OriginalMember(
      owner = "client!ue",
      name = "i",
      descriptor = "I"
   )
   public static int field3050;
   @OriginalMember(
      owner = "client!ue",
      name = "n",
      descriptor = "I"
   )
   public static int field3051;
   @OriginalMember(
      owner = "client!ue",
      name = "f",
      descriptor = "I"
   )
   public static int field3052;
   @OriginalMember(
      owner = "client!ue",
      name = "o",
      descriptor = "I"
   )
   public static int field3054;
   @OriginalMember(
      owner = "client!ue",
      name = "l",
      descriptor = "I"
   )
   public static int field3056;
   @OriginalMember(
      owner = "client!ue",
      name = "k",
      descriptor = "I"
   )
   public static int field3058;
   @OriginalMember(
      owner = "client!ue",
      name = "m",
      descriptor = "I"
   )
   public static int field3060;
   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "Lcia;"
   )
   private class643 field3053;

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(I)Lcia;"
   )
   public final class643 method1827(int arg0) {
      try {
         if (arg0 != 4) {
            field3059 = -103;
         }

         ++field3051;
         class643 var2 = this.field3047.field9034;
         if (this.field3047 == var2) {
            this.field3053 = null;
            return null;
         } else {
            this.field3053 = var2.field9034;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3061[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(IILqh;IZIJ)V"
   )
   public static final void method1828(int arg0, int arg1, class74 arg2, int arg3, boolean arg4, int arg5, long arg6) {
      try {
         if (arg5 != -1) {
            field3060 = -81;
         }

         ++field3054;
         class471.method3454(arg6, arg3, 0, 10186, arg4, arg0, arg2, arg1);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3061[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3061[4] : field3061[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(Ldn;Ldn;B)V"
   )
   public static final void method1829(class546 arg0, class546 arg1, byte arg2) {
      try {
         if (arg0.field7451 != null) {
            arg0.method3943(-4);
         }

         if (arg2 != -8) {
            field3060 = 94;
         }

         ++field3056;
         arg0.field7453 = arg1.field7453;
         arg0.field7451 = arg1;
         arg0.field7451.field7453 = arg0;
         arg0.field7453.field7451 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3061[3] + (arg0 != null ? field3061[4] : field3061[2]) + ',' + (arg1 != null ? field3061[4] : field3061[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "(B)Lcia;"
   )
   public final class643 method1830(byte arg0) {
      try {
         ++field3049;
         class643 var2 = this.field3053;
         if (this.field3047 == var2) {
            this.field3053 = null;
            return null;
         } else {
            this.field3053 = var2.field9034;
            int var3 = -72 / ((-29 - arg0) / 46);
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3061[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1831(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field3050;
         int var3 = 0;
         if (arg0 <= 97) {
            field3059 = 46;
         }

         class643 var4 = this.field3047.field9034;
         if (var2) {
            ++var3;
            var4 = var4.field9034;
         }

         while(true) {
            if (this.field3047 == var4) {
               if (!var2) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field9034;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3061[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(IZI)I"
   )
   public static final int method1832(int arg0, boolean arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         ++field3052;
         if (arg1) {
            return 0;
         } else if (arg2 != -21985) {
            return 119;
         } else {
            class784 var4 = class655.method4729(arg1, arg0, (byte)114);
            if (var4 == null) {
               return class650.field9122.method1778(arg0, -25673).field5009;
            } else {
               int var5 = 0;
               int var6 = 0;
               if (var3) {
                  if (~var4.field11463[var6] == 0) {
                     ++var5;
                  }

                  ++var6;
               }

               while(true) {
                  while(~var4.field11463.length < ~var6) {
                     if (~var4.field11463[var6] == 0) {
                        ++var5;
                     }

                     ++var6;
                  }

                  var5 += class650.field9122.method1778(arg0, arg2 ^ 12712).field5009 + -var4.field11463.length;
                  if (!var3) {
                     return var5;
                  }

                  if (var5 == 0) {
                     ++var5;
                  }

                  ++var6;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field3061[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(BLui;)I"
   )
   public static final int method1833(byte arg0, class241 arg1) {
      try {
         ++field3046;
         String var2 = class92.method870(-2545, arg1);
         int[] var3 = null;
         if (!class374.method2898(-25, arg1.field2993)) {
            if (arg1.field3004 == -1) {
               if (class550.method3974((byte)-86, arg1.field2993)) {
                  class243 var4 = (class243)class335.field4808.method1839(-112, (long)((int)arg1.field3010));
                  if (var4 != null) {
                     class680 var5 = var4.field3043;
                     class392 var6 = var5.field9989;
                     if (var6.field5516 != null) {
                        var6 = var6.method2986(-100, class259.field3320);
                     }

                     if (var6 != null) {
                        var3 = var6.field5527;
                     }
                  }
               } else if (class242.method1814(-78, arg1.field2993)) {
                  Object var7 = null;
                  class774 var8;
                  if (~arg1.field2993 == -1008) {
                     var8 = class472.field6533.method3586(64, (int)arg1.field3010);
                  } else {
                     var8 = class472.field6533.method3586(64, (int)(2147483647L & arg1.field3010 >>> 32));
                  }

                  if (var8.field11186 != null) {
                     var8 = var8.method5539(class259.field3320, 25);
                  }

                  if (var8 != null) {
                     var3 = var8.field11223;
                  }
               }
            } else {
               var3 = class645.field9054.method485(0, arg1.field3004).field3392;
            }
         } else {
            var3 = class645.field9054.method485(0, (int)arg1.field3010).field3392;
         }

         if (var3 != null) {
            var2 = var2 + class132.method1111(-21996, var3);
         }

         int var9 = class101.field1304.method4810(116, class768.field11077, var2);
         if (arg0 <= 49) {
            field3055 = null;
         }

         if (arg1.field2994) {
            var9 += 4 + class719.field10537.method2126();
         }

         return var9;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field3061[5] + arg0 + ',' + (arg1 != null ? field3061[4] : field3061[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(ILcia;)V"
   )
   public final void method1834(int arg0, class643 arg1) {
      try {
         ++field3048;
         if (arg1.field9032 != null) {
            arg1.method4642(117);
         }

         if (arg0 != -5531) {
            field3060 = 16;
         }

         arg1.field9032 = this.field3047.field9032;
         arg1.field9034 = this.field3047;
         arg1.field9032.field9034 = arg1;
         arg1.field9034.field9032 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3061[9] + arg0 + ',' + (arg1 != null ? field3061[4] : field3061[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1835(byte arg0) {
      boolean var2 = client.field4273;

      try {
         int var3 = 26 % ((62 - arg0) / 51);
         ++field3058;

         while(true) {
            class643 var4 = this.field3047.field9034;
            if (this.field3047 != var4) {
               var4.method4642(101);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field3053 = null;
            break;
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3061[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1836(byte arg0) {
      try {
         field3055 = null;
         if (arg0 <= 76) {
            method1829((class546)null, (class546)null, (byte)61);
         }

         field3057 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3061[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "<init>",
      descriptor = "()V"
   )
   public class244() {
      try {
         this.field3047.field9034 = this.field3047;
         this.field3047.field9032 = this.field3047;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3061[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1837(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ue",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1838(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
