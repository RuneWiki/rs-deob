import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class466 {
   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "Ldw;"
   )
   private class748 field6986 = new class748(16);
   @OriginalMember(
      owner = "client!os",
      name = "j",
      descriptor = "Leaa;"
   )
   private class526 field6995;
   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6998 = new String[]{method3488(method3487("'\u0014\u0018\u0006\u0003")), method3488(method3487("'\u0014\u0018\u0001\u0003")), method3488(method3487("'\u0014\u0018\r\u0003")), method3488(method3487("&\u0012Z)")), method3488(method3487("3I\u0018kV")), method3488(method3487("'\u0014\u0018\u0004\u0003")), method3488(method3487("'\u0014\u0018\f\u0003")), method3488(method3487("'\u0014\u0018\u0003\u0003")), method3488(method3487("'\u0014\u0018\u0002\u0003")), method3488(method3487("'\u0014\u0018\u0007\u0003")), method3488(method3487("'\u0014\u0018yB&\u000eB{\u0003")), method3488(method3487("'\u0014\u0018\u0000\u0003"))};
   @OriginalMember(
      owner = "client!os",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field6991 = new int[8];
   @OriginalMember(
      owner = "client!os",
      name = "d",
      descriptor = "Ldw;"
   )
   public static class748 field6990 = new class748(50);
   @OriginalMember(
      owner = "client!os",
      name = "i",
      descriptor = "I"
   )
   public static int field6987;
   @OriginalMember(
      owner = "client!os",
      name = "e",
      descriptor = "I"
   )
   public static int field6988;
   @OriginalMember(
      owner = "client!os",
      name = "g",
      descriptor = "I"
   )
   public static int field6989;
   @OriginalMember(
      owner = "client!os",
      name = "k",
      descriptor = "I"
   )
   public static int field6992;
   @OriginalMember(
      owner = "client!os",
      name = "c",
      descriptor = "I"
   )
   public static int field6993;
   @OriginalMember(
      owner = "client!os",
      name = "l",
      descriptor = "I"
   )
   public static int field6994;
   @OriginalMember(
      owner = "client!os",
      name = "f",
      descriptor = "I"
   )
   public static int field6996;
   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "I"
   )
   public static int field6997;

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(ILjava/lang/String;)J",
      line = 4
   )
   public static final long method3478(int arg0, String arg1) {
      int var2 = client.field4530;

      try {
         if (arg0 != -29020) {
            method3479(57, -24, (class66)null, 122, -28, (class557)null);
         }

         long var3;
         label106: {
            ++field6987;
            var3 = 0L;
            int var5 = arg1.length();
            int var6 = 0;
            if (var2 != 0) {
               var3 *= 37L;
            } else if (~var6 <= ~var5) {
               if (var2 == 0) {
                  if (var2 != 0) {
                     var3 /= 37L;
                  }
                  break label106;
               }
            } else {
               var3 *= 37L;
            }

            while(true) {
               label123: {
                  char var7 = arg1.charAt(var6);
                  if (var7 >= 'A' && var7 <= 'Z') {
                     var3 += (long)(var7 + 1 + -65);
                     if (var2 == 0) {
                        break label123;
                     }
                  }

                  if (var7 < 'a' || ~var7 < -123) {
                     if (~var7 > -49 || var7 > '9') {
                        break label123;
                     }

                     var3 += (long)(var7 + 27 + -48);
                     if (var2 == 0) {
                        break label123;
                     }
                  }

                  var3 += (long)(var7 + 1 + -97);
               }

               if (var3 >= 177917621779460413L) {
                  if (var2 == 0) {
                     break;
                  }

                  ++var6;
               } else {
                  ++var6;
               }

               if (~var6 <= ~var5) {
                  if (var2 == 0) {
                     if (var2 != 0) {
                        var3 /= 37L;
                     }
                     break;
                  }
               } else {
                  var3 *= 37L;
               }
            }
         }

         long var10000;
         while(var3 % 37L == 0L) {
            var10000 = var3;
            if (var2 != 0) {
               return var10000;
            }

            if (var3 == 0L) {
               break;
            }

            var3 /= 37L;
         }

         var10000 = var3;
         return var10000;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field6998[2] + arg0 + ',' + (arg1 != null ? field6998[4] : field6998[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(IILha;IILde;)V",
      line = 49
   )
   public static final void method3479(int arg0, int arg1, class66 arg2, int arg3, int arg4, class557 arg5) {
      try {
         ++field6996;
         class574 var6 = class427.field6523.method4157(false, arg5.field8340);
         if (~var6.field8539 != 0) {
            label50: {
               if (!arg5.field8328) {
                  arg1 = 0;
                  if (client.field4530 == 0) {
                     break label50;
                  }
               }

               arg1 += arg5.field8312;
               arg1 &= 3;
            }

            class396 var7 = var6.method4253(arg2, arg1, arg5.field8265, (byte)16);
            if (var7 != null) {
               int var8 = arg5.field8357;
               if (arg4 != 25221) {
                  field6991 = null;
               }

               int var9 = arg5.field8350;
               if ((arg1 & 1) == 1) {
                  var8 = arg5.field8350;
                  var9 = arg5.field8357;
               }

               int var10 = var7.method1971();
               int var11 = var7.method1975();
               if (var6.field8543) {
                  var10 = var8 * 4;
                  var11 = var9 * 4;
               }

               if (var6.field8541 == 0) {
                  var7.method3037(arg0, -((var9 + -1) * 4) + arg3, var10, var11);
               } else {
                  var7.method3028(arg0, arg3 - var9 * 4 + 4, var10, var11, 0, var6.field8541 | -16777216, 1);
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6998[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6998[4] : field6998[3]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6998[4] : field6998[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(BI)V",
      line = 106
   )
   public final void method3480(byte arg0, int arg1) {
      try {
         if (arg0 != 16) {
            field6991 = null;
         }

         ++field6997;
         class748 var3 = this.field6986;
         synchronized(this.field6986) {
            this.field6986.method5453(arg1, false);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6998[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "(I)V",
      line = 119
   )
   public final void method3481(int arg0) {
      try {
         ++field6994;
         class748 var2 = this.field6986;
         synchronized(this.field6986) {
            if (arg0 <= 43) {
               this.field6986 = null;
            }

            this.field6986.method5445(697465426);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6998[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(B)V",
      line = 138
   )
   public final void method3482(byte arg0) {
      try {
         class748 var2 = this.field6986;
         synchronized(this.field6986) {
            this.field6986.method5451(52);
            if (arg0 <= 27) {
               method3484((class544)null, 83, (byte)94, -37);
            }
         }

         ++field6992;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6998[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(II)Ldda;",
      line = 155
   )
   public final class401 method3483(int arg0, int arg1) {
      try {
         ++field6989;
         class748 var3 = this.field6986;
         class401 var4;
         synchronized(this.field6986) {
            var4 = (class401)this.field6986.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field6995;
            byte[] var6;
            synchronized(this.field6995) {
               var6 = this.field6995.method3899(-65, arg0, 30);
            }

            class401 var7 = new class401();
            if (var6 != null) {
               var7.method3082(0, new class128(var6));
            }

            class748 var8 = this.field6986;
            synchronized(this.field6986) {
               if (arg1 <= 101) {
                  this.method3481(-21);
               }

               this.field6986.method5455(-2049, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6998[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(Lhv;IBI)V",
      line = 186
   )
   public static final void method3484(class544 arg0, int arg1, byte arg2, int arg3) {
      try {
         class388.field5934 = arg3;
         class380.field5847 = arg0;
         class590.field8726 = arg1;
         ++field6993;
         int var4 = 104 / ((arg2 - -10) / 38);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6998[11] + (arg0 != null ? field6998[4] : field6998[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(Ljava/lang/String;IIZIZLjava/lang/String;ZZIJJI)V",
      line = 201
   )
   public static final void method3485(String arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, String arg6, boolean arg7, boolean arg8, int arg9, long arg10, long arg11, int arg12) {
      try {
         if (!arg3) {
            field6991 = null;
         }

         ++field6988;
         if (!class750.field11111 && ~class354.field5375 > -501) {
            int var18 = ~arg4 == 0 ? class444.field6754 : arg4;
            class303 var15 = new class303(arg0, arg6, var18, arg1, arg9, arg11, arg12, arg2, arg8, arg7, arg10, arg5);
            class361.method2817(var15, -1885);
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field6998[6] + (arg0 != null ? field6998[4] : field6998[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6998[4] : field6998[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(I)V",
      line = 224
   )
   public static void method3486(int arg0) {
      try {
         field6990 = null;
         if (arg0 != 14977) {
            method3479(108, 101, (class66)null, 35, 40, (class557)null);
         }

         field6991 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6998[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V",
      line = 241
   )
   public class466(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field6995 = arg2;
         this.field6995.method3875(0, 30);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6998[10] + (arg0 != null ? field6998[4] : field6998[3]) + ',' + arg1 + ',' + (arg2 != null ? field6998[4] : field6998[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3487(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3488(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
