import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class606 {
   @OriginalMember(
      owner = "client!v",
      name = "n",
      descriptor = "Loi;"
   )
   private class80 field8891 = new class80(64);
   @OriginalMember(
      owner = "client!v",
      name = "l",
      descriptor = "Loi;"
   )
   private class80 field8901 = new class80(100);
   @OriginalMember(
      owner = "client!v",
      name = "e",
      descriptor = "Lkf;"
   )
   private class266 field8897;
   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8902 = new String[]{method4420(method4419("9u\u0002\u0011")), method4420(method4419("9u\u0004\u0011")), method4420(method4419("9u\f\u0011")), method4420(method4419("9u\u0007\u0011")), method4420(method4419("9u\n\u0011")), method4420(method4419("9u\t\u0011")), method4420(method4419("9u\u0001\u0011")), method4420(method4419("!.,U")), method4420(method4419("9u|Pi&/~\u0011")), method4420(method4419("4un\u0017z")), method4420(method4419("9u\u0003\u0011")), method4420(method4419("',s]")), method4420(method4419("%:#Un-")), method4420(method4419("9u\u000b\u0011")), method4420(method4419("9u\b\u0011")), method4420(method4419("9u\u0005\u0011")), method4420(method4419("9u\u0006\u0011"))};
   @OriginalMember(
      owner = "client!v",
      name = "h",
      descriptor = "Lek;"
   )
   public static class536 field8900 = new class536(74, 7);
   @OriginalMember(
      owner = "client!v",
      name = "g",
      descriptor = "I"
   )
   public static int field8887;
   @OriginalMember(
      owner = "client!v",
      name = "o",
      descriptor = "I"
   )
   public static int field8888;
   @OriginalMember(
      owner = "client!v",
      name = "m",
      descriptor = "I"
   )
   public static int field8889;
   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "I"
   )
   public static int field8890;
   @OriginalMember(
      owner = "client!v",
      name = "j",
      descriptor = "I"
   )
   public static int field8892;
   @OriginalMember(
      owner = "client!v",
      name = "c",
      descriptor = "I"
   )
   public static int field8893;
   @OriginalMember(
      owner = "client!v",
      name = "i",
      descriptor = "I"
   )
   public static int field8894;
   @OriginalMember(
      owner = "client!v",
      name = "d",
      descriptor = "I"
   )
   public static int field8895;
   @OriginalMember(
      owner = "client!v",
      name = "k",
      descriptor = "I"
   )
   public static int field8896;
   @OriginalMember(
      owner = "client!v",
      name = "f",
      descriptor = "I"
   )
   public static int field8898;
   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "I"
   )
   public static int field8899;

   @OriginalMember(
      owner = "client!v",
      name = "e",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method4407(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!v",
      name = "d",
      descriptor = "(II)Z",
      line = 226
   )
   public static final boolean method4408(int arg0, int arg1) {
      try {
         ++field8890;
         if (arg1 != 256) {
            return true;
         } else if (~arg0 != -21 && arg0 != 22 && ~arg0 != -14 && arg0 != 21 && ~arg0 != -18) {
            return arg0 == 9 || arg0 == 1004;
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8902[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(III)I",
      line = 248
   )
   public static final int method4409(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         byte var4;
         label41: {
            ++field8887;
            if (arg2 > 20000) {
               class540.method3889((byte)-63);
               var4 = 4;
               if (!var3) {
                  break label41;
               }
            }

            if (arg2 <= 10000) {
               if (~arg2 < -5001) {
                  var4 = 2;
                  class692.method5049((byte)107);
                  if (!var3) {
                     break label41;
                  }
               }

               var4 = 1;
               class794.method5723((byte)-44, true);
               if (!var3) {
                  break label41;
               }
            }

            var4 = 3;
            class417.method3116((byte)-123);
         }

         if (arg1 >= -117) {
            method4415(-8);
         }

         if (~class300.field4107.field6419.method391(-75) != ~arg0) {
            class300.field4107.method3301(25349, class300.field4107.field6406, arg0);
            class42.method358(arg0, -3, false);
         }

         class441.method3246(0);
         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8902[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "(I)V",
      line = 294
   )
   public static void method4410(int arg0) {
      try {
         field8900 = null;
         if (arg0 != 1367) {
            field8900 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8902[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "(II)Ldha;",
      line = 307
   )
   public final class85 method4411(int arg0, int arg1) {
      try {
         ++field8889;
         class80 var3 = this.field8891;
         class85 var4;
         synchronized(this.field8891) {
            var4 = (class85)this.field8891.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field8897;
            byte[] var6;
            synchronized(this.field8897) {
               var6 = this.field8897.method2037(false, class281.method2138((byte)32, arg0), class463.method3361(88, arg0));
            }

            class85 var7 = new class85();
            var7.field1119 = arg0;
            var7.field1103 = this;
            if (var6 != null) {
               var7.method762((byte)54, new class147(var6));
            }

            var7.method756(7780);
            class80 var8 = this.field8891;
            synchronized(this.field8891) {
               this.field8891.method723(0, (long)arg0, var7);
               if (arg1 <= 86) {
                  this.field8891 = null;
               }

               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field8902[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "d",
      descriptor = "(I)V",
      line = 340
   )
   public static final void method4412(int arg0) {
      boolean var1 = client.field4360;

      try {
         if (arg0 == -9114) {
            label38: {
               if (~class622.field9156 != -4) {
                  if (class622.field9156 == 7) {
                     class731.method5321(8, (byte)-87);
                     if (!var1) {
                        break label38;
                     }
                  }

                  if (class622.field9156 == 9) {
                     class731.method5321(10, (byte)-84);
                     if (!var1) {
                        break label38;
                     }
                  }

                  if (class622.field9156 != 11) {
                     break label38;
                  }

                  class731.method5321(12, (byte)-100);
                  if (!var1) {
                     break label38;
                  }
               }

               class731.method5321(4, (byte)-124);
            }

            ++field8899;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8902[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "c",
      descriptor = "(I)V",
      line = 367
   )
   public final void method4413(int arg0) {
      try {
         ++field8894;
         if (arg0 != -704912190) {
            this.method4414(74, -83);
         }

         class80 var2 = this.field8891;
         synchronized(this.field8891) {
            this.field8891.method715(true);
         }

         class80 var3 = this.field8901;
         synchronized(this.field8901) {
            this.field8901.method715(true);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8902[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "c",
      descriptor = "(II)Lqu;",
      line = 386
   )
   public final class106 method4414(int arg0, int arg1) {
      try {
         ++field8888;
         class80 var3 = this.field8901;
         class106 var4;
         synchronized(this.field8901) {
            var4 = (class106)this.field8901.method725(0, (long)arg1);
            if (var4 == null) {
               var4 = new class106(arg1);
               this.field8901.method723(0, (long)arg1, var4);
            }

            if (!var4.method874(false)) {
               return null;
            }
         }

         return arg0 < 33 ? null : var4;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8902[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(I)V",
      line = 413
   )
   public static final void method4415(int arg0) {
      try {
         class640.method4626(22050, 2, ~class300.field4107.field6409.method843(86) == -2, arg0 + 48000);
         ++field8892;
         class218.field3125 = class621.method4515(class316.field4304, arg0 ^ -28746, arg0, 22050, class557.field7990);
         class377.method2860(119, class521.method3783(9, (class582)null), true);
         class393.field5688 = class621.method4515(class316.field4304, arg0 + -28746, 1, 2048, class557.field7990);
         class280.field3897 = new class658();
         class393.field5688.method1548(class280.field3897, arg0 + -20253);
         class472.field6810 = new class393(22050, class83.field1082);
         class488.method3544(-2);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8902[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(II)V",
      line = 429
   )
   public final void method4416(int arg0, int arg1) {
      try {
         ++field8898;
         class80 var3 = this.field8891;
         synchronized(this.field8891) {
            this.field8891.method726(arg1, 25324);
         }

         if (arg0 >= 106) {
            class80 var4 = this.field8901;
            synchronized(this.field8901) {
               this.field8901.method726(arg1, 25324);
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8902[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "a",
      descriptor = "(B)V",
      line = 445
   )
   public final void method4417(byte arg0) {
      try {
         ++field8893;
         if (arg0 != 40) {
            this.field8897 = null;
         }

         class80 var2 = this.field8891;
         synchronized(this.field8891) {
            this.field8891.method731(0);
         }

         class80 var3 = this.field8901;
         synchronized(this.field8901) {
            this.field8901.method731(0);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8902[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "b",
      descriptor = "(B)Z",
      line = 461
   )
   public static final boolean method4418(byte arg0) {
      try {
         ++field8895;
         if (arg0 != -107) {
            return false;
         } else {
            return !class715.method5188(-19503, field8902[12]) ? false : class715.method5188(arg0 + -19396, field8902[11]);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8902[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "<init>",
      descriptor = "(Lno;ILkf;Lkf;Lkf;)V",
      line = 488
   )
   public class606(class732 arg0, int arg1, class266 arg2, class266 arg3, class266 arg4) {
      try {
         this.field8897 = arg2;
         if (this.field8897 != null) {
            int var6 = -1 + this.field8897.method2027((byte)-106);
            this.field8897.method2060(2, var6);
         }

         class686.method5009((byte)7, 2, arg3, arg4);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8902[8] + (arg0 != null ? field8902[9] : field8902[7]) + ',' + arg1 + ',' + (arg2 != null ? field8902[9] : field8902[7]) + ',' + (arg3 != null ? field8902[9] : field8902[7]) + ',' + (arg4 != null ? field8902[9] : field8902[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4419(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!v",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4420(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
