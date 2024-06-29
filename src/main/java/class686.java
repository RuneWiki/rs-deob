import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class686 extends class337 implements class112 {
   @OriginalMember(
      owner = "client!tc",
      name = "r",
      descriptor = "I"
   )
   private int field10204;
   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10208 = new String[]{method5063(method5062("<-:E")), method5063(method5062(")vx\u00076")), method5063(method5062("&;x\u0015\"<1\"\u0017c")), method5063(method5062("&;xcc")), method5063(method5062("&;xmc")), method5063(method5062("&;x`c")), method5063(method5062("&;xjc")), method5063(method5062("&;xlc")), method5063(method5062("&;xnc")), method5063(method5062("&;xhc")), method5063(method5062("&;xkc")), method5063(method5062("&;xac"))};
   @OriginalMember(
      owner = "client!tc",
      name = "q",
      descriptor = "Llj;"
   )
   public static class304 field10203 = new class304(64);
   @OriginalMember(
      owner = "client!tc",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field10207 = false;
   @OriginalMember(
      owner = "client!tc",
      name = "t",
      descriptor = "I"
   )
   public static int field10197;
   @OriginalMember(
      owner = "client!tc",
      name = "m",
      descriptor = "I"
   )
   public static int field10198;
   @OriginalMember(
      owner = "client!tc",
      name = "w",
      descriptor = "I"
   )
   public static int field10199;
   @OriginalMember(
      owner = "client!tc",
      name = "u",
      descriptor = "I"
   )
   public static int field10200;
   @OriginalMember(
      owner = "client!tc",
      name = "v",
      descriptor = "I"
   )
   public static int field10201;
   @OriginalMember(
      owner = "client!tc",
      name = "s",
      descriptor = "I"
   )
   public static int field10202;
   @OriginalMember(
      owner = "client!tc",
      name = "p",
      descriptor = "I"
   )
   public static int field10205;
   @OriginalMember(
      owner = "client!tc",
      name = "o",
      descriptor = "I"
   )
   public static int field10206;

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(II)Ljava/lang/String;",
      line = 3
   )
   public static final String method5058(int arg0, int arg1) {
      try {
         ++field10199;
         class332 var2 = (class332)class570.field8426.method3141((long)arg1, true);
         if (var2 != null) {
            class563 var3 = var2.field5035.method4078(-26596);
            if (var3 != null) {
               double var4 = var2.field5035.method4086((byte)67);
               if ((double)var3.method4247(-14475) <= var4 && var4 <= (double)var3.method4245(false)) {
                  return var3.method4244(true);
               }
            }
         }

         if (arg0 >= -107) {
            field10198 = -127;
         }

         return null;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10208[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "f",
      descriptor = "(I)V",
      line = 36
   )
   public static final void method5059(int arg0) {
      boolean var1 = client.field1786;

      try {
         label35: {
            if (class342.field5204 != arg0) {
               if (class342.field5204 == 7) {
                  class69.method532(1, 8);
                  if (!var1) {
                     break label35;
                  }
               }

               if (class342.field5204 == 9) {
                  class69.method532(1, 10);
                  if (!var1) {
                     break label35;
                  }
               }

               if (~class342.field5204 != -12) {
                  break label35;
               }

               class69.method532(arg0 + -2, 12);
               if (!var1) {
                  break label35;
               }
            }

            class69.method532(1, 4);
         }

         ++field10200;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10208[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(I)I",
      line = 59
   )
   public final int method1055(int arg0) {
      try {
         if (arg0 != 20584) {
            field10203 = null;
         }

         ++field10202;
         return super.field5169;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10208[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "b",
      descriptor = "(I)J",
      line = 71
   )
   public final long method1057(int arg0) {
      try {
         if (arg0 != -18611) {
            this.field10204 = 67;
         }

         ++field10205;
         return 0L;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10208[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "<init>",
      descriptor = "(Lc;I[BIZ)V",
      line = 82
   )
   public class686(class652 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field10204 = arg1;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10208[2] + (arg0 != null ? field10208[1] : field10208[0]) + ',' + arg1 + ',' + (arg2 != null ? field10208[1] : field10208[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "e",
      descriptor = "(I)V",
      line = 90
   )
   public static void method5060(int arg0) {
      try {
         if (arg0 == 64) {
            field10203 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10208[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(III[B)V",
      line = 100
   )
   public final void method1056(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.method2748(arg1, arg3, (byte)125);
         if (arg0 != -1752) {
            this.field10204 = 116;
         }

         ++field10201;
         this.field10204 = arg2;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10208[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10208[1] : field10208[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(JJ)J",
      line = 112
   )
   public static long method5061(long arg0, long arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10208[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "c",
      descriptor = "(I)I",
      line = 127
   )
   public final int method1054(int arg0) {
      try {
         if (arg0 <= 5) {
            this.field10204 = -59;
         }

         ++field10197;
         return this.field10204;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10208[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "<init>",
      descriptor = "(Lc;ILjaclib/memory/Buffer;IZ)V",
      line = 146
   )
   public class686(class652 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field10204 = arg1;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10208[2] + (arg0 != null ? field10208[1] : field10208[0]) + ',' + arg1 + ',' + (arg2 != null ? field10208[1] : field10208[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(Z)V",
      line = 154
   )
   public final void method2746(boolean arg0) {
      try {
         super.field5166.method4813((byte)67, this);
         ++field10206;
         if (arg0) {
            field10198 = 10;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10208[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5062(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5063(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
