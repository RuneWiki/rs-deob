import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class204 {
   @OriginalMember(
      owner = "client!ef",
      name = "e",
      descriptor = "Lvia;"
   )
   private class627 field2604 = new class627();
   @OriginalMember(
      owner = "client!ef",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field2597;
   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2609 = new String[]{method1695(method1694("_n-!\u0014")), method1695(method1694("_n-$\u0014")), method1695(method1694("A&-KA")), method1695(method1694("_n- \u0014")), method1695(method1694("T}o\t")), method1695(method1694("_n-YUTaw[\u0014")), method1695(method1694("_n--\u0014")), method1695(method1694("_n-#\u0014")), method1695(method1694("_n-\"\u0014")), method1695(method1694("_n-&\u0014")), method1695(method1694("_n-'\u0014")), method1695(method1694("_n-,\u0014"))};
   @OriginalMember(
      owner = "client!ef",
      name = "i",
      descriptor = "J"
   )
   public static volatile long field2596 = 0L;
   @OriginalMember(
      owner = "client!ef",
      name = "g",
      descriptor = "I"
   )
   public static int field2595 = 0;
   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "I"
   )
   public static int field2600 = -1;
   @OriginalMember(
      owner = "client!ef",
      name = "p",
      descriptor = "I"
   )
   public static int field2591;
   @OriginalMember(
      owner = "client!ef",
      name = "n",
      descriptor = "I"
   )
   public static int field2592;
   @OriginalMember(
      owner = "client!ef",
      name = "m",
      descriptor = "I"
   )
   public static int field2594;
   @OriginalMember(
      owner = "client!ef",
      name = "o",
      descriptor = "I"
   )
   public static int field2598;
   @OriginalMember(
      owner = "client!ef",
      name = "j",
      descriptor = "I"
   )
   public static int field2599;
   @OriginalMember(
      owner = "client!ef",
      name = "k",
      descriptor = "I"
   )
   public static int field2601;
   @OriginalMember(
      owner = "client!ef",
      name = "r",
      descriptor = "I"
   )
   public static int field2602;
   @OriginalMember(
      owner = "client!ef",
      name = "l",
      descriptor = "I"
   )
   public static int field2603;
   @OriginalMember(
      owner = "client!ef",
      name = "c",
      descriptor = "I"
   )
   public static int field2605;
   @OriginalMember(
      owner = "client!ef",
      name = "b",
      descriptor = "I"
   )
   public static int field2606;
   @OriginalMember(
      owner = "client!ef",
      name = "q",
      descriptor = "I"
   )
   private volatile int field2607;
   @OriginalMember(
      owner = "client!ef",
      name = "h",
      descriptor = "Ljca;"
   )
   private class656 field2608;
   @OriginalMember(
      owner = "client!ef",
      name = "f",
      descriptor = "Lsa;"
   )
   public static class783 field2593;

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method1685(int arg0, int arg1, int arg2) {
      try {
         ++field2603;
         int var3 = arg0 >>> 24;
         int var4 = -var3 + 255;
         int var7 = ((arg2 & arg0) * var3 & -16711936 | (arg0 & 65280) * var3 & 16711680) >>> 8;
         return ((16711680 & (arg1 & 65280) * var4 | (arg1 & 16711935) * var4 & -16711936) >>> 8) + var7;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2609[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(Ljca;I)V"
   )
   public final void method1686(class656 arg0, int arg1) {
      try {
         this.field2608 = arg0;
         ++field2601;
         if (arg1 != 65280) {
            this.field2607 = 19;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2609[3] + (arg0 != null ? field2609[2] : field2609[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1687(byte arg0) {
      try {
         if (arg0 < 8) {
            field2605 = 12;
         }

         field2593 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2609[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(B)Lqq;"
   )
   public final class82 method1688(byte arg0) {
      try {
         ++field2598;
         Object var2 = null;
         class627 var3 = this.field2604;
         synchronized(this.field2604) {
            class82 var4 = this.field2604.method4639(-122);
            var4.method797((byte)93);
            if (arg0 >= -67) {
               return null;
            } else {
               --this.field2607;
               return var4;
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field2609[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1689(boolean arg0) {
      try {
         if (!arg0) {
            method1685(-25, 106, 54);
         }

         ++field2591;
         return this.field2607 == 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2609[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(Lnl;B)V"
   )
   public final void method1690(class713 arg0, byte arg1) {
      try {
         arg0.field10458 = true;
         ++field2602;
         class627 var3 = this.field2604;
         synchronized(this.field2604) {
            this.field2604.method4637(arg0, (byte)119);
            if (arg1 > -74) {
               return;
            }

            ++this.field2607;
         }

         if (this.field2608 != null) {
            class656 var4 = this.field2608;
            synchronized(this.field2608) {
               this.field2608.notify();
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field2609[7] + (arg0 != null ? field2609[2] : field2609[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(ILgea;)Lip;"
   )
   public static final class598 method1691(int arg0, class66 arg1) {
      try {
         ++field2606;
         if (arg0 != 16711935) {
            field2599 = -25;
         }

         class773 var2 = class486.method3690(arg1, (byte)-41);
         int var3 = arg1.method652((byte)109);
         return new class598(var2.field2861, var2.field2857, var2.field2855, var2.field2854, var2.field2853, var2.field2850, var2.field2856, var2.field2859, var2.field2862, var2.field11264, var2.field11259, var2.field11266, var2.field11260, var2.field11263, var2.field11267, var3);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2609[9] + arg0 + ',' + (arg1 != null ? field2609[2] : field2609[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(BLnl;)V"
   )
   public final void method1692(byte arg0, class713 arg1) {
      try {
         arg1.field10458 = false;
         ++field2592;
         class627 var3 = this.field2604;
         synchronized(this.field2604) {
            this.field2604.method4637(arg1, (byte)118);
            ++this.field2607;
            if (arg0 >= -5) {
               this.method1688((byte)-5);
            }
         }

         if (this.field2608 != null) {
            class656 var4 = this.field2608;
            synchronized(this.field2608) {
               this.field2608.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2609[11] + arg0 + ',' + (arg1 != null ? field2609[2] : field2609[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(Lkba;B)V"
   )
   public final void method1693(class25 arg0, byte arg1) {
      try {
         ++field2594;
         class627 var3 = this.field2604;
         synchronized(this.field2604) {
            this.field2604.method4637(arg0, (byte)98);
            ++this.field2607;
            if (arg1 > -56) {
               method1687((byte)16);
            }
         }

         if (this.field2608 != null) {
            class656 var4 = this.field2608;
            synchronized(this.field2608) {
               this.field2608.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2609[6] + (arg0 != null ? field2609[2] : field2609[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class204(String arg0) {
      try {
         this.field2597 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2609[5] + (arg0 != null ? field2609[2] : field2609[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1694(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1695(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
