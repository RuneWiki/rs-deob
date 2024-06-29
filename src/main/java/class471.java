import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public abstract class class471 extends class686 {
   @OriginalMember(
      owner = "client!dea",
      name = "r",
      descriptor = "Z"
   )
   public boolean field6838 = false;
   @OriginalMember(
      owner = "client!dea",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6842 = new String[]{method3613(method3612("Z%[>I\u007fh")), method3613(method3612("Z%[>D\u007fh")), method3613(method3612("P5V|")), method3613(method3612("Z%[>J\u007fh")), method3613(method3612("En\u0014>~")), method3613(method3612("Z%[>K\u007fh"))};
   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "[F"
   )
   public static float[] field6835 = new float[16384];
   @OriginalMember(
      owner = "client!dea",
      name = "o",
      descriptor = "[F"
   )
   public static float[] field6836 = new float[16384];
   @OriginalMember(
      owner = "client!dea",
      name = "w",
      descriptor = "Lhha;"
   )
   public static class724 field6840;
   @OriginalMember(
      owner = "client!dea",
      name = "p",
      descriptor = "F"
   )
   public static float field6841;
   @OriginalMember(
      owner = "client!dea",
      name = "s",
      descriptor = "B"
   )
   public byte field6824;
   @OriginalMember(
      owner = "client!dea",
      name = "u",
      descriptor = "B"
   )
   public byte field6826;
   @OriginalMember(
      owner = "client!dea",
      name = "C",
      descriptor = "I"
   )
   public int field6825;
   @OriginalMember(
      owner = "client!dea",
      name = "q",
      descriptor = "I"
   )
   public static int field6828;
   @OriginalMember(
      owner = "client!dea",
      name = "l",
      descriptor = "I"
   )
   public int field6829;
   @OriginalMember(
      owner = "client!dea",
      name = "t",
      descriptor = "I"
   )
   public int field6830;
   @OriginalMember(
      owner = "client!dea",
      name = "v",
      descriptor = "I"
   )
   public static int field6831;
   @OriginalMember(
      owner = "client!dea",
      name = "x",
      descriptor = "I"
   )
   public int field6832;
   @OriginalMember(
      owner = "client!dea",
      name = "D",
      descriptor = "I"
   )
   public int field6833;
   @OriginalMember(
      owner = "client!dea",
      name = "m",
      descriptor = "I"
   )
   public static int field6834;
   @OriginalMember(
      owner = "client!dea",
      name = "n",
      descriptor = "I"
   )
   public int field6837;
   @OriginalMember(
      owner = "client!dea",
      name = "B",
      descriptor = "I"
   )
   public static int field6839;
   @OriginalMember(
      owner = "client!dea",
      name = "A",
      descriptor = "Ldea;"
   )
   public class471 field6823;
   @OriginalMember(
      owner = "client!dea",
      name = "y",
      descriptor = "Z"
   )
   public boolean field6827;

   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "(ZI)V"
   )
   public static final void method3609(boolean arg0, int arg1) {
      try {
         class54.field793 = arg1;
         ++field6834;
         class564.field8028.method1052(!arg0);
         if (arg0) {
            method3609(true, -61);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6842[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(ZLha;)Loga;"
   )
   public abstract class358 method722(boolean arg0, class17 arg1);

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(ILdea;IZLha;II)V"
   )
   public abstract void method719(int arg0, class471 arg1, int arg2, boolean arg3, class17 arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!dea",
      name = "f",
      descriptor = "(I)Z"
   )
   public abstract boolean method731(int arg0);

   @OriginalMember(
      owner = "client!dea",
      name = "i",
      descriptor = "(I)Z"
   )
   public abstract boolean method1685(int arg0);

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "([Lpha;III)I"
   )
   public final int method3610(class757[] arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field6828;
         long var6 = class232.field3604[this.field6824][arg3][arg1];
         if (arg2 != 32764) {
            this.field6827 = false;
         }

         int var10;
         int var11;
         label60: {
            long var8 = 0L;
            var10 = 0;
            if (var5) {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            } else if (var8 > 48L) {
               var11 = var10;
               if (!var5) {
                  break label60;
               }
            } else {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            }

            label59:
            do {
               while(true) {
                  if (~var11 >= -1) {
                     if (!var5) {
                        var11 = var10;
                        break;
                     }

                     var8 += 16L;
                     arg0[var10++] = class274.field4176[var11 - 1].field6218;
                  } else {
                     var8 += 16L;
                     arg0[var10++] = class274.field4176[var11 - 1].field6218;
                  }

                  if (var8 > 48L) {
                     var11 = var10;
                     if (!var5) {
                        break label59;
                     }
                  } else {
                     var11 = (int)(var6 >> (int)var8 & 65535L);
                  }
               }
            } while(var5);
         }

         if (var5) {
            arg0[var11] = null;
            ++var11;
         }

         while(true) {
            while(var11 < 4) {
               arg0[var11] = null;
               ++var11;
            }

            if (!var5) {
               return var10;
            }

            ++var11;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field6842[3] + (arg0 != null ? field6842[4] : field6842[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public abstract void method726(class17 arg0, byte arg1);

   @OriginalMember(
      owner = "client!dea",
      name = "k",
      descriptor = "(I)Z"
   )
   public abstract boolean method723(int arg0);

   @OriginalMember(
      owner = "client!dea",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method3611(byte arg0) {
      try {
         if (arg0 != -6) {
            method3609(true, 63);
         }

         field6835 = null;
         field6840 = null;
         field6836 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6842[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "j",
      descriptor = "(I)I"
   )
   public abstract int method728(int arg0);

   @OriginalMember(
      owner = "client!dea",
      name = "e",
      descriptor = "(I)I"
   )
   public int method2747(int arg0) {
      try {
         ++field6831;
         if (arg0 != 0) {
            field6840 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6842[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "(Lha;I)Z"
   )
   public abstract boolean method1682(class17 arg0, int arg1);

   @OriginalMember(
      owner = "client!dea",
      name = "e",
      descriptor = "(B)I"
   )
   public abstract int method720(byte arg0);

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public abstract boolean method718(int arg0, int arg1, int arg2, class17 arg3);

   @OriginalMember(
      owner = "client!dea",
      name = "h",
      descriptor = "(I)Z"
   )
   public abstract boolean method725(int arg0);

   @OriginalMember(
      owner = "client!dea",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method735(int arg0);

   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "(ILha;)Lwba;"
   )
   public abstract class731 method730(int arg0, class17 arg1);

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(B[Lpha;)I"
   )
   public abstract int method1681(byte arg0, class757[] arg1);

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field6836[var2] = (float)Math.sin((double)var2 * var0);
         field6835[var2] = (float)Math.cos((double)var2 * var0);
      }

      field6840 = new class724(73, -2);
      field6841 = 1.0F;
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3612(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3613(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
