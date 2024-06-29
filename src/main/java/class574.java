import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class574 {
   @OriginalMember(
      owner = "client!il",
      name = "e",
      descriptor = "Liw;"
   )
   private class107 field8114 = new class107(64);
   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "Liw;"
   )
   private class107 field8124 = new class107(100);
   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "Lsa;"
   )
   private class39 field8118;
   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8125 = new String[]{method4255(method4254("Czk6X")), method4255(method4254("Dc)\u001b")), method4255(method4254("Czk3X")), method4255(method4254("Q8kY\r")), method4255(method4254("CzkK\u0019D\u007f1IX")), method4255(method4254("Czk0X")), method4255(method4254("Czk4X")), method4255(method4254("Ys1\u0003\u0019Dq6J")), method4255(method4254("Iy*\u001c\u0019Of7\u0012\u0016Cn")), method4255(method4254("\u00116\b\u0016\b\u0007W\"\u0012M")), method4255(method4254("Czk?X")), method4255(method4254("Iy*\u001c\u0019O~*\u0004\u0004")), method4255(method4254("\u001163\u0012\u0002Y\u007f*\u0019M\u001b-e\u0007\u0011^~xXK\nr*\u001a\u0011Cxx")), method4255(method4254("Ny&\u0002\u001dOx1Y\u0013Ey.\u001e\u0015\u00174")), method4255(method4254("\u00116\u0000\u000f\u0000Cd \u0004M")), method4255(method4254("\u00116\u0000\u000f\u0000Cd \u0004M~~0[P\u001a'h=\u0011D;tNG\u001a6uGJ\u001a&\u007fG@\nQ\b#K\n[$\u000f]kq J@")), method4255(method4254("Czk2X")), method4255(method4254("Czk5X")), method4255(method4254("Czk1X"))};
   @OriginalMember(
      owner = "client!il",
      name = "d",
      descriptor = "[C"
   )
   public static char[] field8113 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   @OriginalMember(
      owner = "client!il",
      name = "j",
      descriptor = "Lfm;"
   )
   public static class164 field8116 = new class164(1, -1);
   @OriginalMember(
      owner = "client!il",
      name = "f",
      descriptor = "I"
   )
   public static int field8115;
   @OriginalMember(
      owner = "client!il",
      name = "c",
      descriptor = "I"
   )
   public static int field8117;
   @OriginalMember(
      owner = "client!il",
      name = "h",
      descriptor = "I"
   )
   public static int field8119;
   @OriginalMember(
      owner = "client!il",
      name = "l",
      descriptor = "I"
   )
   public static int field8120;
   @OriginalMember(
      owner = "client!il",
      name = "k",
      descriptor = "I"
   )
   public static int field8121;
   @OriginalMember(
      owner = "client!il",
      name = "g",
      descriptor = "I"
   )
   public static int field8122;
   @OriginalMember(
      owner = "client!il",
      name = "i",
      descriptor = "I"
   )
   public static int field8123;

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)V"
   )
   public static final void method4246(String arg0, boolean arg1) {
      try {
         ++field8115;
         class432.field6350 = arg0;
         if (class289.field4303 != null) {
            try {
               String var2 = class289.field4303.getParameter(field8125[8]);
               if (arg1) {
                  field8116 = null;
               }

               String var4;
               label29: {
                  String var3 = class289.field4303.getParameter(field8125[11]);
                  var4 = var2 + field8125[7] + arg0 + field8125[12] + var3;
                  if (~arg0.length() != -1) {
                     var4 = var4 + field8125[14] + class626.method4606(-113, class604.method4452(123) + 94608000000L) + field8125[9] + 94608000L;
                     if (!client.field10022) {
                        break label29;
                     }
                  }

                  var4 = var4 + field8125[15];
               }

               class726.method5253(field8125[13] + var4 + "\"", class289.field4303, (byte)-106);
            } catch (Throwable var6) {
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8125[10] + (arg0 != null ? field8125[3] : field8125[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method4247(int arg0, int arg1) {
      try {
         class107 var3 = this.field8114;
         synchronized(this.field8114) {
            this.field8114.method1048(arg0, -8543);
         }

         ++field8120;
         class107 var4 = this.field8124;
         synchronized(this.field8124) {
            this.field8124.method1048(arg0, arg1 + -6728);
         }

         if (arg1 != -1815) {
            this.field8114 = null;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8125[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(BI)Llj;"
   )
   public final class797 method4248(byte arg0, int arg1) {
      try {
         ++field8122;
         class107 var3 = this.field8124;
         synchronized(this.field8124) {
            class797 var4 = (class797)this.field8124.method1041((long)arg1, 8);
            if (var4 == null) {
               var4 = new class797(arg1);
               this.field8124.method1050(-72, var4, (long)arg1);
            }

            if (arg0 < 72) {
               method4250((byte)83);
            }

            return !var4.method5746(-8704) ? null : var4;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field8125[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4249(byte arg0) {
      try {
         int var2 = 101 % ((-34 - arg0) / 56);
         ++field8121;
         class107 var3 = this.field8114;
         synchronized(this.field8114) {
            this.field8114.method1052(true);
         }

         class107 var4 = this.field8124;
         synchronized(this.field8124) {
            this.field8124.method1052(true);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8125[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4250(byte arg0) {
      try {
         if (arg0 != 73) {
            method4246((String)null, false);
         }

         field8116 = null;
         field8113 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8125[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method4251(boolean arg0) {
      try {
         if (!arg0) {
            field8113 = null;
         }

         class107 var2 = this.field8114;
         synchronized(this.field8114) {
            this.field8114.method1045(3);
         }

         ++field8119;
         class107 var3 = this.field8124;
         synchronized(this.field8124) {
            this.field8124.method1045(3);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8125[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(II)Luf;"
   )
   public final class33 method4252(int arg0, int arg1) {
      try {
         ++field8117;
         class107 var3 = this.field8114;
         class33 var4;
         synchronized(this.field8114) {
            var4 = (class33)this.field8114.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field8118;
            byte[] var6;
            synchronized(this.field8118) {
               var6 = this.field8118.method460((byte)-11, class526.method3947(arg0, -118), class468.method3590(arg0, 3));
            }

            class33 var7 = new class33();
            var7.field478 = arg0;
            if (arg1 != -1) {
               return null;
            } else {
               if (var6 != null) {
                  var7.method379(arg1 + 127, new class65(var6));
               }

               var7.method380(arg1 + 3);
               class107 var8 = this.field8114;
               synchronized(this.field8114) {
                  this.field8114.method1050(arg1 + -125, var7, (long)arg0);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field8125[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method4253(class17 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!il",
      name = "<init>",
      descriptor = "(Ltb;ILsa;Lsa;Lsa;)V"
   )
   public class574(class392 arg0, int arg1, class39 arg2, class39 arg3, class39 arg4) {
      try {
         this.field8118 = arg2;
         if (this.field8118 != null) {
            int var6 = this.field8118.method454(100) + -1;
            this.field8118.method434((byte)-106, var6);
         }

         class585.method4296(2, arg3, arg4, true);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8125[4] + (arg0 != null ? field8125[3] : field8125[1]) + ',' + arg1 + ',' + (arg2 != null ? field8125[3] : field8125[1]) + ',' + (arg3 != null ? field8125[3] : field8125[1]) + ',' + (arg4 != null ? field8125[3] : field8125[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4254(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4255(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
