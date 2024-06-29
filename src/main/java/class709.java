import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class709 extends class55 {
   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10358 = new String[]{method5163(method5162("\u001aJ\t\u00111\\")), method5163(method5162("\u001aJ\t\u00116\\")), method5163(method5162("\u001aJ\t\u00115\\")), method5163(method5162("\u001aJ\t\u00117\\")), method5163(method5162("\u001aJ\t\u00113\\")), method5163(method5162("\u001aJ\t\u0011;\\")), method5163(method5162("\u001aJ\t\u0011:\\")), method5163(method5162("\u001aJ\t\u00114\\")), method5163(method5162("\u001aJ\t\u00110\\")), method5163(method5162("\u000f\u0002F\u0011\u000f")), method5163(method5162("\u001aY\u0004S")), method5163(method5162("\u001aJ\t\u00118\\"))};
   @OriginalMember(
      owner = "client!nfa",
      name = "g",
      descriptor = "I"
   )
   public static int field10353 = -1;
   @OriginalMember(
      owner = "client!nfa",
      name = "p",
      descriptor = "I"
   )
   public static int field10346;
   @OriginalMember(
      owner = "client!nfa",
      name = "f",
      descriptor = "I"
   )
   public static int field10347;
   @OriginalMember(
      owner = "client!nfa",
      name = "m",
      descriptor = "I"
   )
   public static int field10348;
   @OriginalMember(
      owner = "client!nfa",
      name = "n",
      descriptor = "I"
   )
   public static int field10349;
   @OriginalMember(
      owner = "client!nfa",
      name = "l",
      descriptor = "I"
   )
   public static int field10350;
   @OriginalMember(
      owner = "client!nfa",
      name = "o",
      descriptor = "I"
   )
   public static int field10351;
   @OriginalMember(
      owner = "client!nfa",
      name = "j",
      descriptor = "I"
   )
   public static int field10352;
   @OriginalMember(
      owner = "client!nfa",
      name = "e",
      descriptor = "I"
   )
   public static int field10354;
   @OriginalMember(
      owner = "client!nfa",
      name = "i",
      descriptor = "I"
   )
   public static int field10355;
   @OriginalMember(
      owner = "client!nfa",
      name = "h",
      descriptor = "I"
   )
   public static int field10356;
   @OriginalMember(
      owner = "client!nfa",
      name = "k",
      descriptor = "I"
   )
   public static int field10357;

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(IIIII)V",
      line = 3
   )
   public static final void method5156(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4360;

      try {
         label80: {
            ++field10347;
            if (~arg1 != -9 && arg1 != 16) {
               class517 var6 = class663.field9659[arg4][arg0][arg3];
               if (var6 != null) {
                  label83: {
                     if (arg1 == 1) {
                        var6.field7470 = 0;
                        if (!var5) {
                           break label83;
                        }
                     }

                     if (arg1 == 2) {
                        var6.field7471 = 0;
                     }
                  }
               }

               class137.method1080(126);
               if (!var5) {
                  break label80;
               }
            }

            int var7 = 0;
            if (var5 || var7 < class562.field8027) {
               do {
                  class311 var8 = class484.field6923[var7];
                  if (var8.field4262 == arg1 && var8.field4276 == arg0 && var8.field4266 == arg3 || ~var8.field4270 == ~arg0 && ~var8.field4266 == ~arg3) {
                     if (class562.field8027 != var7) {
                        class242.method1847(class484.field6923, var7 + 1, class484.field6923, var7, class484.field6923.length - (var7 + 1));
                     }

                     --class562.field8027;
                     return;
                  }

                  ++var7;
               } while(var7 < class562.field8027);
            }
         }

         if (arg2 != 16) {
            method5158(3, 114, (byte[])null);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field10358[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(II)Z",
      line = 59
   )
   public static final boolean method5157(int arg0, int arg1) {
      try {
         ++field10350;
         if (arg1 != 12) {
            return true;
         } else {
            return ~arg0 == -5 || ~arg0 == -9 || arg0 == 12 || arg0 == 10;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10358[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(II[B)[B",
      line = 70
   )
   public static final byte[] method5158(int arg0, int arg1, byte[] arg2) {
      try {
         ++field10348;
         byte[] var3 = new byte[arg0];
         class242.method1848(arg2, arg1, var3, 0, arg0);
         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10358[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10358[9] : field10358[10]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 81
   )
   public class709(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 84
   )
   public class709(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(IB)I",
      line = 90
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field10355;
         if (arg1 != 105) {
            this.method98(28);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10358[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "b",
      descriptor = "(IB)V",
      line = 101
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = -85 / ((arg1 - 47) / 46);
         ++field10356;
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10358[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(FFIF)F",
      line = 114
   )
   public static final float method5159(float arg0, float arg1, int arg2, float arg3) {
      try {
         ++field10351;
         return arg2 <= 79 ? 2.1614747F : (-arg0 + arg3) * arg1 + arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10358[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(I)V",
      line = 125
   )
   public final void method98(int arg0) {
      try {
         if (super.field680 < arg0 || super.field680 > 4) {
            super.field680 = this.method101(-125);
         }

         ++field10349;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10358[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "c",
      descriptor = "(I)I",
      line = 136
   )
   public final int method5160(int arg0) {
      try {
         int var2 = -91 / ((arg0 - 36) / 41);
         ++field10352;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10358[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "b",
      descriptor = "(I)I",
      line = 152
   )
   public final int method101(int arg0) {
      try {
         ++field10346;
         return arg0 >= -116 ? -97 : 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10358[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(IBI)V",
      line = 173
   )
   public static final void method5161(int arg0, byte arg1, int arg2) {
      try {
         ++field10354;
         class755 var3 = class317.method2325((long)arg0, 108, 17);
         var3.method5479(1288);
         var3.field11184 = arg2;
         if (arg1 < 79) {
            field10353 = 22;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10358[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5162(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5163(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
