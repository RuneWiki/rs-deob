import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class570 extends class465 {
   @OriginalMember(
      owner = "client!nd",
      name = "i",
      descriptor = "Z"
   )
   private boolean field8492 = true;
   @OriginalMember(
      owner = "client!nd",
      name = "j",
      descriptor = "Z"
   )
   public boolean field8498 = false;
   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8504 = new String[]{method4229(method4228("\u0003OY\rH")), method4229(method4228("\u0003OY\nH")), method4229(method4228("\u0003OY\u0004H")), method4229(method4228("\u0016\u0005Y`\u001d")), method4229(method4228("\u0003^\u001b\"")), method4229(method4228("\u0003OY\bH")), method4229(method4228("\u0003OY\tH")), method4229(method4228("\u0003OY\fH")), method4229(method4228("\u0003OY\u0006H")), method4229(method4228("\u0003OY\u000bH")), method4229(method4228("\u0007J\u0010*\u0018")), method4229(method4228("\u0003OY\u000fH")), method4229(method4228("\u0003OY\u0007H"))};
   @OriginalMember(
      owner = "client!nd",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field8493 = new int[4];
   @OriginalMember(
      owner = "client!nd",
      name = "h",
      descriptor = "I"
   )
   public static int field8491;
   @OriginalMember(
      owner = "client!nd",
      name = "q",
      descriptor = "I"
   )
   public static int field8494;
   @OriginalMember(
      owner = "client!nd",
      name = "n",
      descriptor = "I"
   )
   public static int field8496;
   @OriginalMember(
      owner = "client!nd",
      name = "l",
      descriptor = "I"
   )
   public static int field8497;
   @OriginalMember(
      owner = "client!nd",
      name = "o",
      descriptor = "I"
   )
   public static int field8499;
   @OriginalMember(
      owner = "client!nd",
      name = "r",
      descriptor = "I"
   )
   public static int field8500;
   @OriginalMember(
      owner = "client!nd",
      name = "f",
      descriptor = "I"
   )
   public static int field8501;
   @OriginalMember(
      owner = "client!nd",
      name = "k",
      descriptor = "I"
   )
   public static int field8502;
   @OriginalMember(
      owner = "client!nd",
      name = "g",
      descriptor = "I"
   )
   public static int field8503;
   @OriginalMember(
      owner = "client!nd",
      name = "p",
      descriptor = "[Lat;"
   )
   public static class396[] field8495;

   @OriginalMember(
      owner = "client!nd",
      name = "b",
      descriptor = "(II)V",
      line = 3
   )
   public final void method77(int arg0, int arg1) {
      try {
         ++field8496;
         super.field6984 = arg1;
         if (arg0 == -14812) {
            this.field8498 = false;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8504[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(Z)V",
      line = 16
   )
   public final void method69(boolean arg0) {
      try {
         ++field8494;
         if (!super.field6980.method4673((byte)-76).method3315((byte)-108)) {
            super.field6984 = 0;
         }

         if (~super.field6984 > -1 || ~super.field6984 < -6) {
            super.field6984 = this.method78(16726277);
         }

         if (arg0) {
            this.method4227(false, 106);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8504[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "c",
      descriptor = "(I)V",
      line = 33
   )
   public static void method4222(int arg0) {
      try {
         field8495 = null;
         if (arg0 == 4) {
            field8493 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8504[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(B)Z",
      line = 44
   )
   public final boolean method4223(byte arg0) {
      try {
         ++field8497;
         int var2 = -60 / ((arg0 - 45) / 32);
         return this.field8492;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8504[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "c",
      descriptor = "(Z)Z",
      line = 54
   )
   public final boolean method4224(boolean arg0) {
      try {
         ++field8499;
         if (arg0) {
            return true;
         } else {
            return super.field6980.method4673((byte)-76).method3315((byte)56);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8504[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "b",
      descriptor = "(I)I",
      line = 71
   )
   public final int method4225(int arg0) {
      try {
         if (arg0 <= 81) {
            field8493 = null;
         }

         ++field8500;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8504[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 86
   )
   public class570(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(IB)I",
      line = 89
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field8501;
         if (!super.field6980.method4673((byte)-76).method3315((byte)-56)) {
            return 3;
         } else {
            int var3 = -120 / ((arg1 - -51) / 60);
            return arg0 == 3 && !class354.method2767(field8504[10], (byte)-65) ? 3 : 2;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8504[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(I)I",
      line = 106
   )
   public final int method78(int arg0) {
      try {
         ++field8502;
         if (arg0 != 16726277) {
            field8495 = null;
         }

         this.field8498 = true;
         return !super.field6980.method4673((byte)-76).method3315((byte)50) ? 0 : 2;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8504[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(Ljfa;Z)I",
      line = 122
   )
   public static final int method4226(class303 arg0, boolean arg1) {
      try {
         ++field8503;
         String var2 = class63.method520((byte)-17, arg0);
         int[] var3 = null;
         if (!class57.method476(arg1, arg0.field4333)) {
            if (arg0.field4332 == -1) {
               if (!class550.method4065(arg0.field4333, 114)) {
                  if (class132.method1129(arg0.field4333, -116)) {
                     Object var4 = null;
                     class557 var5;
                     if (~arg0.field4333 != -1010) {
                        var5 = class151.field1896.method5072(30, (int)(2147483647L & arg0.field4324 >>> 32));
                     } else {
                        var5 = class151.field1896.method5072(30, (int)arg0.field4324);
                     }

                     if (var5.field8320 != null) {
                        var5 = var5.method4125(class597.field8793, 79);
                     }

                     if (var5 != null) {
                        var3 = var5.field8271;
                     }
                  }
               } else {
                  class726 var6 = (class726)class259.field3509.method5681((long)((int)arg0.field4324), -1);
                  if (var6 != null) {
                     class155 var7 = var6.field10794;
                     class369 var8 = var7.field1971;
                     if (var8.field5590 != null) {
                        var8 = var8.method2872(true, class597.field8793);
                     }

                     if (var8 != null) {
                        var3 = var8.field5564;
                     }
                  }
               }
            } else {
               var3 = class54.field616.method1689(arg0.field4332, (byte)107).field1128;
            }
         } else {
            var3 = class54.field616.method1689((int)arg0.field4324, (byte)83).field1128;
         }

         if (var3 != null) {
            var2 = var2 + class163.method1331(var3, -1);
         }

         int var9 = class173.field2160.method5526(var2, class75.field966, 114);
         if (arg0.field4319) {
            var9 += class689.field10392.method1965() - -4;
         }

         return var9;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field8504[2] + (arg0 != null ? field8504[3] : field8504[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(ZI)V",
      line = 194
   )
   public final void method4227(boolean arg0, int arg1) {
      try {
         int var3 = 93 / ((23 - arg1) / 33);
         this.field8492 = arg0;
         ++field8491;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8504[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 217
   )
   public class570(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4228(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4229(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
