import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class530 {
   @OriginalMember(
      owner = "client!od",
      name = "i",
      descriptor = "Lgw;"
   )
   private class179 field7706 = new class179(64);
   @OriginalMember(
      owner = "client!od",
      name = "h",
      descriptor = "I"
   )
   public int field7717 = 0;
   @OriginalMember(
      owner = "client!od",
      name = "p",
      descriptor = "Lhw;"
   )
   private class141 field7710;
   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "I"
   )
   public int field7707;
   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7722 = new String[]{method3974(method3973("@K\u000f\u0006/")), method3974(method3973("@K\u000f\u0001/")), method3974(method3973("AZM.")), method3974(method3973("T\u0001\u000flz")), method3974(method3973("@K\u000f~nAFU|/")), method3974(method3973("@K\u000f\u0007/")), method3974(method3973("@K\u000f\u0005/")), method3974(method3973("@K\u000f\u0003/")), method3974(method3973("@K\u000f\u0000/")), method3974(method3973("@K\u000f\u0004/")), method3974(method3973("@K\u000f\n/"))};
   @OriginalMember(
      owner = "client!od",
      name = "j",
      descriptor = "Lgw;"
   )
   public static class179 field7713 = new class179(8);
   @OriginalMember(
      owner = "client!od",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field7716 = new int[6];
   @OriginalMember(
      owner = "client!od",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field7715 = new int[4096];
   @OriginalMember(
      owner = "client!od",
      name = "g",
      descriptor = "I"
   )
   public static int field7720 = -1;
   @OriginalMember(
      owner = "client!od",
      name = "e",
      descriptor = "I"
   )
   public static int field7705;
   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "I"
   )
   public static int field7708;
   @OriginalMember(
      owner = "client!od",
      name = "m",
      descriptor = "I"
   )
   public static int field7709;
   @OriginalMember(
      owner = "client!od",
      name = "l",
      descriptor = "I"
   )
   public static int field7711;
   @OriginalMember(
      owner = "client!od",
      name = "n",
      descriptor = "I"
   )
   public static int field7712;
   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "I"
   )
   public static int field7714;
   @OriginalMember(
      owner = "client!od",
      name = "k",
      descriptor = "I"
   )
   public static int field7718;
   @OriginalMember(
      owner = "client!od",
      name = "d",
      descriptor = "[Ls;"
   )
   public static class293[] field7721;
   @OriginalMember(
      owner = "client!od",
      name = "f",
      descriptor = "[Llja;"
   )
   public static class743[] field7719;

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3965(int arg0, byte arg1) {
      try {
         if (arg1 < 71) {
            field7721 = null;
         }

         class179 var3 = this.field7706;
         synchronized(this.field7706) {
            this.field7706.method1579(83, arg0);
         }

         ++field7708;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7722[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(BIIIIILha;)Lka;"
   )
   public static final class495 method3966(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class65 arg6) {
      try {
         ++field7718;
         long var7 = (long)arg5;
         if (arg0 != -80) {
            field7720 = -34;
         }

         class495 var9 = (class495)class23.field355.method1584(var7, 1);
         short var10 = 2055;
         if (var9 == null) {
            class668 var11 = class783.method5653(0, true, class549.field7925, arg5);
            if (var11 == null) {
               return null;
            }

            if (var11.field9713 < 13) {
               var11.method4876(2, (byte)52);
            }

            var9 = arg6.method352(var11, var10, class397.field5827, 64, 768);
            class23.field355.method1581(var7, 0, var9);
         }

         class495 var12 = var9.method549((byte)2, var10, true);
         if (~arg1 != -1) {
            var12.method513(arg1);
         }

         if (~arg4 != -1) {
            var12.method524(arg4);
         }

         if (arg2 != 0) {
            var12.method538(arg2);
         }

         if (arg3 != 0) {
            var12.method514(0, arg3, 0);
         }

         return var12;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field7722[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field7722[3] : field7722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3967(int arg0) {
      try {
         class179 var2 = this.field7706;
         synchronized(this.field7706) {
            this.field7706.method1591((byte)58);
            int var3 = -90 % ((arg0 - -15) / 56);
         }

         ++field7712;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7722[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3968(int arg0) {
      try {
         field7715 = null;
         field7716 = null;
         if (arg0 > -15) {
            field7715 = null;
         }

         field7719 = null;
         field7721 = null;
         field7713 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7722[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public static final boolean method3969(String arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field7714;
         if (arg0 == null) {
            return false;
         } else {
            if (arg1 != -19730) {
               field7715 = null;
            }

            int var3 = 0;
            if (var2) {
               if (arg0.equalsIgnoreCase(class670.field9809[var3])) {
                  return true;
               }

               ++var3;
            }

            while(true) {
               while(~var3 > ~class128.field2146) {
                  if (arg0.equalsIgnoreCase(class670.field9809[var3])) {
                     return true;
                  }

                  ++var3;
               }

               boolean var10000 = arg0.equalsIgnoreCase(class304.field4398.field6665);
               if (!var2) {
                  if (var10000) {
                     return true;
                  }

                  return false;
               }

               if (var10000) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7722[5] + (arg0 != null ? field7722[3] : field7722[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(II)Leba;"
   )
   public final class612 method3970(int arg0, int arg1) {
      try {
         ++field7709;
         class179 var3 = this.field7706;
         class612 var4;
         synchronized(this.field7706) {
            var4 = (class612)this.field7706.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field7710;
            byte[] var6;
            synchronized(this.field7710) {
               var6 = this.field7710.method1347((byte)124, arg0, arg1);
            }

            class612 var7 = new class612();
            var7.field8885 = this;
            var7.field8886 = arg1;
            if (var6 != null) {
               var7.method4496(-98, new class473(var6));
            }

            var7.method4494(5);
            class179 var8 = this.field7706;
            synchronized(this.field7706) {
               this.field7706.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field7722[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method3971(byte arg0, int arg1) {
      try {
         ++field7711;
         if (arg0 != 46) {
            field7719 = null;
         }

         return ~arg1 == -8 || ~arg1 == -10;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7722[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3972(boolean arg0) {
      try {
         class179 var2 = this.field7706;
         synchronized(this.field7706) {
            this.field7706.method1589((byte)113);
         }

         ++field7705;
         if (arg0) {
            this.method3972(true);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7722[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V"
   )
   public class530(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field7710 = arg2;
         this.field7707 = this.field7710.method1346(4, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7722[4] + (arg0 != null ? field7722[3] : field7722[2]) + ',' + arg1 + ',' + (arg2 != null ? field7722[3] : field7722[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3973(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3974(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
