import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class206 implements class623 {
   @OriginalMember(
      owner = "client!tj",
      name = "c",
      descriptor = "Lld;"
   )
   private class178 field3082 = new class178(128);
   @OriginalMember(
      owner = "client!tj",
      name = "i",
      descriptor = "[I"
   )
   public int[] field3068;
   @OriginalMember(
      owner = "client!tj",
      name = "g",
      descriptor = "[I"
   )
   private int[] field3069;
   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3084 = new String[]{method1764(method1763("MRLO\u007f")), method1764(method1763("MRLA\u007f")), method1764(method1763("MRLL\u007f")), method1764(method1763("MRLK\u007f")), method1764(method1763("MRLI\u007f")), method1764(method1763("MRLB\u007f")), method1764(method1763("MRLD\u007f")), method1764(method1763("I\\")), method1764(method1763("WM\u000ed")), method1764(method1763("MRLM\u007f")), method1764(method1763("B\u0016L&*")), method1764(method1763("MRLJ\u007f")), method1764(method1763("MRL4>WQ\u00166\u007f")), method1764(method1763("MRLN\u007f")), method1764(method1763("MRLC\u007f")), method1764(method1763("MRLE\u007f")), method1764(method1763("MRL@\u007f"))};
   @OriginalMember(
      owner = "client!tj",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field3067 = new int[200];
   @OriginalMember(
      owner = "client!tj",
      name = "j",
      descriptor = "I"
   )
   public static int field3077 = 0;
   @OriginalMember(
      owner = "client!tj",
      name = "m",
      descriptor = "I"
   )
   public static int field3065;
   @OriginalMember(
      owner = "client!tj",
      name = "q",
      descriptor = "I"
   )
   public static int field3066;
   @OriginalMember(
      owner = "client!tj",
      name = "d",
      descriptor = "I"
   )
   public static int field3070;
   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "I"
   )
   public static int field3071;
   @OriginalMember(
      owner = "client!tj",
      name = "r",
      descriptor = "I"
   )
   public static int field3072;
   @OriginalMember(
      owner = "client!tj",
      name = "f",
      descriptor = "I"
   )
   public static int field3073;
   @OriginalMember(
      owner = "client!tj",
      name = "o",
      descriptor = "I"
   )
   public static int field3074;
   @OriginalMember(
      owner = "client!tj",
      name = "e",
      descriptor = "I"
   )
   public static int field3075;
   @OriginalMember(
      owner = "client!tj",
      name = "p",
      descriptor = "I"
   )
   public static int field3076;
   @OriginalMember(
      owner = "client!tj",
      name = "h",
      descriptor = "I"
   )
   public static int field3078;
   @OriginalMember(
      owner = "client!tj",
      name = "l",
      descriptor = "I"
   )
   public static int field3079;
   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "I"
   )
   public static int field3080;
   @OriginalMember(
      owner = "client!tj",
      name = "k",
      descriptor = "Les;"
   )
   public static class400 field3081;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!tj",
      name = "s",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3083;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method1762(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(III)Z",
      line = 4
   )
   public static final boolean method1749(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 7002) {
            method1752((byte)120, (class452)null);
         }

         ++field3074;
         return class192.method1676(arg2, false, arg1) | (262144 & arg2) != 0 || class455.method3422(arg0 ^ 6952, arg2, arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3084[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(BI)I",
      line = 16
   )
   public final int method1750(byte arg0, int arg1) {
      try {
         if (arg0 != -12) {
            method1754(false);
         }

         ++field3071;
         return this.field3068[arg1];
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3084[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "c",
      descriptor = "(III)V",
      line = 28
   )
   public final void method1751(int arg0, int arg1, int arg2) {
      try {
         ++field3080;
         class722 var4 = class440.field6431.method2076(arg1, (byte)-101);
         int var5 = var4.field10445;
         int var6 = var4.field10444;
         int var7 = var4.field10440;
         int var8 = -86 / ((54 - arg0) / 44);
         int var9 = class126.field2107[-var6 + var7];
         if (arg2 < 0 || var9 < arg2) {
            arg2 = 0;
         }

         int var10 = var9 << var6;
         this.method1756(var10 & arg2 << var6 | ~var10 & this.field3069[var5], 10, var5);
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field3084[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(BLss;)V",
      line = 54
   )
   public static final void method1752(byte arg0, class452 arg1) {
      try {
         ++field3076;
         if (class90.field1473 != null) {
            if (arg0 != 29) {
               method1752((byte)52, (class452)null);
            }

            class268 var2 = null;
            if (arg1.field6616 == 0) {
               var2 = (class268)class245.method1990(arg1.field6625, arg1.field6622, arg1.field6613);
            }

            if (arg1.field6616 == 1) {
               var2 = (class268)class615.method4514(arg1.field6625, arg1.field6622, arg1.field6613);
            }

            if (arg1.field6616 == 2) {
               var2 = (class268)class740.method5337(arg1.field6625, arg1.field6622, arg1.field6613, field3083 != null ? field3083 : (field3083 = method1762(field3084[7])));
            }

            if (arg1.field6616 == 3) {
               var2 = (class268)class439.method3309(arg1.field6625, arg1.field6622, arg1.field6613);
            }

            if (var2 == null) {
               arg1.field6617 = 0;
               arg1.field6623 = -1;
               arg1.field6614 = 0;
            } else {
               arg1.field6623 = var2.method591((byte)-31);
               arg1.field6614 = var2.method596(16202);
               arg1.field6617 = var2.method587(true);
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3084[9] + arg0 + ',' + (arg1 != null ? field3084[10] : field3084[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(IBI)V",
      line = 105
   )
   public final void method1753(int arg0, byte arg1, int arg2) {
      try {
         this.field3068[arg0] = arg2;
         ++field3075;
         if (arg1 == -9) {
            class304 var4 = (class304)this.field3082.method1572((long)arg0, arg1 + -16280);
            if (var4 != null) {
               var4.field4399 = class57.method650(99) + 500L;
            } else {
               class304 var5 = new class304(500L + class57.method650(99));
               this.field3082.method1566(var5, 24742, (long)arg0);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3084[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(Z)V",
      line = 128
   )
   public static final void method1754(boolean arg0) {
      boolean var1 = client.field4564;

      try {
         if (!arg0) {
            if (class143.field2345 != null) {
               class705[] var2 = class143.field2345;
               int var3 = 0;
               class705 var4;
               if (var1) {
                  var4 = var2[var3];
                  var4.method4130(18973);
                  ++var3;
               }

               while(~var3 > ~var2.length) {
                  var4 = var2[var3];
                  var4.method4130(18973);
                  ++var3;
               }
            }

            ++field3079;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3084[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(II)I",
      line = 152
   )
   public final int method1755(int arg0, int arg1) {
      try {
         if (arg1 != -661) {
            return -98;
         } else {
            ++field3066;
            class722 var3 = class440.field6431.method2076(arg0, (byte)-101);
            int var4 = var3.field10445;
            int var5 = var3.field10444;
            int var6 = var3.field10440;
            int var7 = class126.field2107[-var5 + var6];
            return this.field3068[var4] >> var5 & var7;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3084[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(III)V",
      line = 177
   )
   public final void method1756(int arg0, int arg1, int arg2) {
      try {
         this.field3069[arg2] = arg0;
         int var4 = 37 % ((arg1 - -77) / 48);
         ++field3073;
         class304 var5 = (class304)this.field3082.method1572((long)arg2, -16289);
         if (var5 == null) {
            class304 var6 = new class304(4611686018427387905L);
            this.field3082.method1566(var6, 24742, (long)arg2);
         } else if (~var5.field4399 != -4611686018427387906L) {
            var5.field4399 = 500L + class57.method650(107) | 4611686018427387904L;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3084[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(IBI)V",
      line = 204
   )
   public final void method1757(int arg0, byte arg1, int arg2) {
      try {
         ++field3070;
         if (arg1 < 55) {
            this.method1757(-24, (byte)51, -105);
         }

         class722 var4 = class440.field6431.method2076(arg2, (byte)-101);
         int var5 = var4.field10445;
         int var6 = var4.field10444;
         int var7 = var4.field10440;
         int var8 = class126.field2107[-var6 + var7];
         if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
         }

         int var9 = var8 << var6;
         this.method1753(var5, (byte)-9, var9 & arg0 << var6 | this.field3068[var5] & ~var9);
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field3084[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(ZI)I",
      line = 240
   )
   public final int method1758(boolean arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 0) {
            this.method1751(34, 93, 44);
         }

         ++field3078;
         long var4 = class57.method650(118);
         class304 var6 = !arg0 ? (class304)this.field3082.method1575((byte)-122) : (class304)this.field3082.method1567((byte)-44);
         int var10000;
         if (var3) {
            long var10;
            var10000 = (var10 = ~var4 - ~(4611686018427387903L & var6.field4399)) == 0L ? 0 : (var10 < 0L ? -1 : 1);
         } else if (var6 == null) {
            var10000 = -1;
            if (!var3) {
               return -1;
            }
         } else {
            long var11;
            var10000 = (var11 = ~var4 - ~(4611686018427387903L & var6.field4399)) == 0L ? 0 : (var11 < 0L ? -1 : 1);
         }

         while(true) {
            if (var10000 < 0) {
               if (~(4611686018427387904L & var6.field4399) != -1L) {
                  break;
               }

               var6.method154(-109);
               if (var3) {
                  break;
               }
            }

            var6 = (class304)this.field3082.method1575((byte)-123);
            if (var6 == null) {
               var10000 = -1;
               if (!var3) {
                  return -1;
               }
            } else {
               long var12;
               var10000 = (var12 = ~var4 - ~(4611686018427387903L & var6.field4399)) == 0L ? 0 : (var12 < 0L ? -1 : 1);
            }
         }

         int var7 = (int)var6.field347;
         this.field3068[var7] = this.field3069[var7];
         var6.method154(-114);
         return var7;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3084[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "c",
      descriptor = "(I)Z",
      line = 278
   )
   public static final boolean method1759(int arg0) {
      try {
         if (arg0 > -32) {
            method1752((byte)-61, (class452)null);
         }

         ++field3065;

         try {
            class498 var1 = new class498();
            byte[] var2 = var1.method3754(class292.field4072, 1000000);
            class607.method4458((byte)-121, var2);
            return true;
         } catch (Exception var4) {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3084[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "a",
      descriptor = "(I)V",
      line = 305
   )
   public final void method1760(int arg0) {
      boolean var2 = client.field4564;

      try {
         int var3 = 0;
         class598 var4;
         if (var2) {
            var4 = class516.field7514.method5501(15192, var3);
            if (var4 != null && var4.field8626 == 0) {
               this.field3069[var3] = 0;
               this.field3068[var3] = 0;
            }

            ++var3;
         }

         while(~class516.field7514.field11036 < ~var3) {
            var4 = class516.field7514.method5501(15192, var3);
            if (var4 != null && var4.field8626 == 0) {
               this.field3069[var3] = 0;
               this.field3068[var3] = 0;
            }

            ++var3;
         }

         ++field3072;
         this.field3082 = new class178(128);
         int var5 = -92 / ((arg0 - 41) / 44);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3084[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "b",
      descriptor = "(I)V",
      line = 331
   )
   public static void method1761(int arg0) {
      try {
         field3067 = null;
         field3081 = null;
         if (arg0 != -25334) {
            field3077 = 20;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3084[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "<init>",
      descriptor = "()V",
      line = 345
   )
   public class206() {
      try {
         this.field3068 = new int[class516.field7514.field11036];
         this.field3069 = new int[class516.field7514.field11036];
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3084[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1763(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1764(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
