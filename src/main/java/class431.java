import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class431 extends class66 {
   @OriginalMember(
      owner = "client!mb",
      name = "Vb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5866 = new String[]{method3342(method3341("*\u0002\u001a_{")), method3342(method3341("<N\u001a;.")), method3342(method3341(")\u0015Xy")), method3342(method3341("*\u0002\u001aR{")), method3342(method3341("*\u0002\u001a]{")), method3342(method3341("*\u0002\u001a\\{")), method3342(method3341("*\u0002\u001aX{")), method3342(method3341("*\u0002\u001aP{")), method3342(method3341("*\u0002\u001aY{")), method3342(method3341("*\u0002\u001aT{")), method3342(method3341("*\u0002\u001aQ{")), method3342(method3341("*\u0002\u001a^{")), method3342(method3341("*\u0002\u001aW{")), method3342(method3341("*\u0002\u001aV{"))};
   @OriginalMember(
      owner = "client!mb",
      name = "Sb",
      descriptor = "Laka;"
   )
   public static class418 field5861 = new class418(43, -2);
   @OriginalMember(
      owner = "client!mb",
      name = "Mb",
      descriptor = "I"
   )
   public static int field5852;
   @OriginalMember(
      owner = "client!mb",
      name = "Lb",
      descriptor = "I"
   )
   public static int field5853;
   @OriginalMember(
      owner = "client!mb",
      name = "Pb",
      descriptor = "I"
   )
   public static int field5854;
   @OriginalMember(
      owner = "client!mb",
      name = "Qb",
      descriptor = "I"
   )
   private int field5856;
   @OriginalMember(
      owner = "client!mb",
      name = "Ib",
      descriptor = "I"
   )
   public static int field5857;
   @OriginalMember(
      owner = "client!mb",
      name = "Ob",
      descriptor = "I"
   )
   public static int field5858;
   @OriginalMember(
      owner = "client!mb",
      name = "Ub",
      descriptor = "I"
   )
   public static int field5859;
   @OriginalMember(
      owner = "client!mb",
      name = "Nb",
      descriptor = "I"
   )
   public static int field5860;
   @OriginalMember(
      owner = "client!mb",
      name = "Jb",
      descriptor = "I"
   )
   public static int field5862;
   @OriginalMember(
      owner = "client!mb",
      name = "Hb",
      descriptor = "I"
   )
   public static int field5863;
   @OriginalMember(
      owner = "client!mb",
      name = "Tb",
      descriptor = "I"
   )
   public static int field5864;
   @OriginalMember(
      owner = "client!mb",
      name = "Kb",
      descriptor = "I"
   )
   public static int field5865;
   @OriginalMember(
      owner = "client!mb",
      name = "Rb",
      descriptor = "Lps;"
   )
   private class7 field5855;

   @OriginalMember(
      owner = "client!mb",
      name = "d",
      descriptor = "(Z)V"
   )
   public final void method3328(boolean arg0) {
      try {
         ++field5865;
         if (!arg0) {
            field5861 = null;
         }

         super.field864 = (this.field5856 + 7) / 8;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5866[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "e",
      descriptor = "(Z)V"
   )
   public static void method3329(boolean arg0) {
      try {
         if (arg0) {
            field5861 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5866[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(BLps;)V"
   )
   public final void method3330(byte arg0, class7 arg1) {
      try {
         this.field5855 = arg1;
         ++field5862;
         int var3 = 54 / ((arg0 - 5) / 57);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5866[4] + arg0 + ',' + (arg1 != null ? field5866[1] : field5866[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "s",
      descriptor = "(B)I"
   )
   public static final int method3331(byte arg0) {
      try {
         ++field5852;
         if (~class175.field2258 == -2) {
            return class713.field10470;
         } else {
            if (arg0 != 63) {
               field5861 = null;
            }

            return class197.field2522;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5866[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "w",
      descriptor = "(I)V"
   )
   public static final void method3332(int arg0) {
      class406.field5574 = arg0;

      for(int var1 = 0; var1 < class137.field1743; ++var1) {
         for(int var2 = 0; var2 < class181.field2297; ++var2) {
            if (class548.field8080[arg0][var1][var2] == null) {
               class548.field8080[arg0][var1][var2] = new class731(arg0);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!mb",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method3333(boolean arg0) {
      try {
         this.field5856 = super.field864 * 8;
         ++field5858;
         if (arg0) {
            this.field5855 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5866[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "f",
      descriptor = "(BI)I"
   )
   public final int method3334(byte arg0, int arg1) {
      try {
         ++field5864;
         int var3 = 81 / ((arg0 - -23) / 59);
         return arg1 * 8 + -this.field5856;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5866[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "q",
      descriptor = "(II)I"
   )
   public final int method3335(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field5863;
         if (arg0 != 4756) {
            this.method3337(-123, (int[])null);
         }

         int var4 = this.field5856 >> 3;
         int var5 = -(7 & this.field5856) + 8;
         int var6 = 0;
         this.field5856 += arg1;
         if (var3) {
            var6 += (class9.field200[var5] & super.field859[var4++]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
         }

         while(true) {
            while(var5 < arg1) {
               var6 += (class9.field200[var5] & super.field859[var4++]) << -var5 + arg1;
               arg1 -= var5;
               var5 = 8;
            }

            int var10000 = ~var5;
            int var10001 = ~arg1;
            if (!var3) {
               if (var10000 == var10001) {
                  var6 += class9.field200[var5] & super.field859[var4];
                  if (!var3) {
                     return var6;
                  }
               }

               var6 += super.field859[var4] >> -arg1 + var5 & class9.field200[arg1];
               return var6;
            }

            arg1 = var10000 - var10001;
            var5 = 8;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5866[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class431(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mb",
      name = "r",
      descriptor = "(B)Z"
   )
   public final boolean method3336(byte arg0) {
      try {
         ++field5857;
         int var2 = super.field859[super.field864] + -this.field5855.method58(256) & 255;
         if (arg0 <= 73) {
            this.method3335(103, -68);
         }

         return var2 >= 128;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5866[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(I[I)V"
   )
   public final void method3337(int arg0, int[] arg1) {
      try {
         this.field5855 = new class7(arg1);
         if (arg0 == 128) {
            ++field5860;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5866[3] + arg0 + ',' + (arg1 != null ? field5866[1] : field5866[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "p",
      descriptor = "(II)V"
   )
   public final void method3338(int arg0, int arg1) {
      try {
         ++field5859;
         int var3 = 61 / ((arg1 - -53) / 32);
         super.field859[super.field864++] = (byte)(arg0 + this.field5855.method57((byte)-106));
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5866[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "x",
      descriptor = "(I)I"
   )
   public final int method3339(int arg0) {
      try {
         if (arg0 != 8) {
            this.field5856 = 126;
         }

         ++field5853;
         int var2 = super.field859[super.field864++] - this.field5855.method57((byte)-109) & 255;
         return ~var2 > -129 ? var2 : (var2 - 128 << 8) - -(super.field859[super.field864++] - this.field5855.method57((byte)-108) & 255);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5866[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "([BIII)V"
   )
   public final void method3340(byte[] param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3341(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3342(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
