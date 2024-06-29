import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class100 implements class534 {
   @OriginalMember(
      owner = "client!jo",
      name = "i",
      descriptor = "Lsa;"
   )
   public class39 field1587;
   @OriginalMember(
      owner = "client!jo",
      name = "p",
      descriptor = "Ltaa;"
   )
   public class612 field1580;
   @OriginalMember(
      owner = "client!jo",
      name = "q",
      descriptor = "Lsa;"
   )
   private class39 field1583;
   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1592 = new String[]{method991(method990("a[JaE")), method991(method990("a[JbE")), method991(method990("a[JlE")), method991(method990("+\u001c")), method991(method990("a[JcE")), method991(method990("a[J`E")), method991(method990("p\u001aJ\u0005\u0010")), method991(method990("eA\bG")), method991(method990("a[JgE")), method991(method990("a[JfE")), method991(method990("a[J\u0017\u0004e]\u0010\u0015E"))};
   @OriginalMember(
      owner = "client!jo",
      name = "e",
      descriptor = "Lfm;"
   )
   public static class164 field1578 = new class164(63, 4);
   @OriginalMember(
      owner = "client!jo",
      name = "c",
      descriptor = "[Lbc;"
   )
   public static class663[] field1588 = new class663[4];
   @OriginalMember(
      owner = "client!jo",
      name = "d",
      descriptor = "I"
   )
   private int field1575;
   @OriginalMember(
      owner = "client!jo",
      name = "n",
      descriptor = "I"
   )
   public static int field1576;
   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "I"
   )
   public static int field1581;
   @OriginalMember(
      owner = "client!jo",
      name = "f",
      descriptor = "I"
   )
   public static int field1582;
   @OriginalMember(
      owner = "client!jo",
      name = "m",
      descriptor = "I"
   )
   public static int field1584;
   @OriginalMember(
      owner = "client!jo",
      name = "l",
      descriptor = "I"
   )
   public static int field1585;
   @OriginalMember(
      owner = "client!jo",
      name = "o",
      descriptor = "I"
   )
   public static int field1586;
   @OriginalMember(
      owner = "client!jo",
      name = "h",
      descriptor = "I"
   )
   public static int field1590;
   @OriginalMember(
      owner = "client!jo",
      name = "k",
      descriptor = "I"
   )
   public static int field1591;
   @OriginalMember(
      owner = "client!jo",
      name = "g",
      descriptor = "J"
   )
   private long field1577;
   @OriginalMember(
      owner = "client!jo",
      name = "j",
      descriptor = "Lda;"
   )
   private class216 field1579;
   @OriginalMember(
      owner = "client!jo",
      name = "b",
      descriptor = "Lvr;"
   )
   public static class584 field1589;

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method983(boolean arg0, int arg1) {
      try {
         if (arg1 >= -55) {
            this.field1583 = null;
         }

         ++field1586;
         int var3 = this.field1580.field8705.method4636(class111.field1737, (byte)-88, this.field1580.field8701) - -this.field1580.field8712;
         int var4 = this.field1580.field8709.method5290(this.field1580.field8708, class595.field8386, 106) - -this.field1580.field8703;
         this.method952(1, var3, arg0, var4);
         this.method951(arg0, (byte)52, var4, var3);
         String var5 = class752.field10681.method1835(-1029);
         if (-this.field1577 + class604.method4452(114) > 10000L) {
            var5 = var5 + field1592[3] + class752.field10681.method1838(100).method3720((byte)-21) + ")";
         }

         this.field1579.method1861(var5, this.field1580.field8708 / 2 + var4 + 4 + this.field1580.field8707, -1, this.field1580.field8704, this.field1580.field8701 / 2 + var3, false);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1592[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(ZBII)V"
   )
   public abstract void method951(boolean arg0, byte arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(I)Z"
   )
   public boolean method984(int arg0) {
      try {
         ++field1581;
         boolean var2 = true;
         if (!this.field1587.method450(0, this.field1580.field8706)) {
            var2 = false;
         }

         if (!this.field1583.method450(0, this.field1580.field8706)) {
            var2 = false;
         }

         return arg0 < 67 ? true : var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1592[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method985(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1576;
         int var3 = class752.field10681.method1834(31297);
         int var4 = var3 * 100;
         if (arg0 > -28) {
            field1590 = 118;
         }

         if (this.field1575 != var3 || var3 == 0) {
            this.field1575 = var3;
            this.field1577 = class604.method4452(-125);
            if (!var2) {
               return var4;
            }
         }

         int var5 = class752.field10681.method1830(-116);
         if (~var3 > ~var5) {
            long var6 = this.field1577 + -class752.field10681.method1841(68);
            if (~var6 < -1L) {
               long var8 = var6 * 10000L / (long)var3 * (long)(-var3 + var5);
               long var10 = 10000L * (-this.field1577 + class604.method4452(-112));
               if (var8 <= var10) {
                  var4 = var5 * 100;
                  if (!var2) {
                     return var4;
                  }
               }

               var4 = (int)((long)(var5 - var3) * 100L * var10 / var8 + (long)(var3 * 100));
            }
         }

         return var4;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1592[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public abstract void method952(int arg0, int arg1, boolean arg2, int arg3);

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "([Ljava/lang/Object;[JIII)V"
   )
   public static final void method986(Object[] arg0, long[] arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         if (arg3 != -1) {
            method989(72, (byte)12, 95, -105, (int[])null);
         }

         if (arg2 > arg4) {
            int var6 = (arg2 + arg4) / 2;
            int var7 = arg4;
            long var8 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var8;
            Object var10 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var10;
            int var11 = ~var8 != Long.MIN_VALUE ? 1 : 0;
            int var12 = arg4;
            long var13;
            Object var15;
            if (var5) {
               if (~((long)(arg4 & var11) + var8) < ~arg1[arg4]) {
                  var13 = arg1[arg4];
                  arg1[arg4] = arg1[arg4];
                  arg1[arg4] = var13;
                  var15 = arg0[arg4];
                  arg0[arg4] = arg0[arg4];
                  var7 = arg4 + 1;
                  arg0[arg4] = var15;
               }

               var12 = arg4 + 1;
            }

            while(true) {
               while(var12 < arg2) {
                  if (~((long)(var12 & var11) + var8) < ~arg1[var12]) {
                     var13 = arg1[var12];
                     arg1[var12] = arg1[var7];
                     arg1[var7] = var13;
                     var15 = arg0[var12];
                     arg0[var12] = arg0[var7];
                     arg0[var7++] = var15;
                  }

                  ++var12;
               }

               arg1[arg2] = arg1[var7];
               arg1[var7] = var8;
               arg0[arg2] = arg0[var7];
               arg0[var7] = var10;
               method986(arg0, arg1, var7 + -1, -1, arg4);
               if (!var5) {
                  method986(arg0, arg1, arg2, -1, var7 - -1);
                  break;
               }

               ++var12;
            }
         }

         ++field1585;
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field1592[5] + (arg0 != null ? field1592[6] : field1592[7]) + ',' + (arg1 != null ? field1592[6] : field1592[7]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method987(int arg0) {
      try {
         if (arg0 != 0) {
            field1591 = 24;
         }

         field1578 = null;
         field1589 = null;
         field1588 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1592[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(B)V"
   )
   public void method988(byte arg0) {
      try {
         ++field1582;
         if (arg0 < 88) {
            this.field1579 = null;
         }

         class440 var2 = class604.method4453(this.field1580.field8706, 29306, this.field1583);
         this.field1579 = class54.field794.method170(var2, class433.method3381(this.field1587, this.field1580.field8706), true);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1592[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "<init>",
      descriptor = "(Lsa;Lsa;Ltaa;)V"
   )
   public class100(class39 arg0, class39 arg1, class612 arg2) {
      try {
         this.field1587 = arg0;
         this.field1580 = arg2;
         this.field1583 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1592[10] + (arg0 != null ? field1592[6] : field1592[7]) + ',' + (arg1 != null ? field1592[6] : field1592[7]) + ',' + (arg2 != null ? field1592[6] : field1592[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(IBII[I)V"
   )
   public static final void method989(int arg0, byte arg1, int arg2, int arg3, int[] arg4) {
      boolean var5 = client.field10022;

      try {
         if (arg1 == 22) {
            --arg0;
            ++field1584;
            int var14 = arg2 - 1;
            int var6 = var14 - 7;
            int var9;
            if (var5) {
               var9 = arg0 + 1;
               arg4[var9] = arg3;
               int var10 = var9 + 1;
               arg4[var10] = arg3;
               int var11 = var10 + 1;
               arg4[var11] = arg3;
               int var12 = var11 + 1;
               arg4[var12] = arg3;
               int var13 = var12 + 1;
               arg4[var13] = arg3;
               int var15 = var13 + 1;
               arg4[var15] = arg3;
               int var16 = var15 + 1;
               arg4[var16] = arg3;
               arg0 = var16 + 1;
               arg4[arg0] = arg3;
            }

            while(true) {
               while(arg0 < var6) {
                  var9 = arg0 + 1;
                  arg4[var9] = arg3;
                  ++var9;
                  arg4[var9] = arg3;
                  ++var9;
                  arg4[var9] = arg3;
                  ++var9;
                  arg4[var9] = arg3;
                  ++var9;
                  arg4[var9] = arg3;
                  ++var9;
                  arg4[var9] = arg3;
                  ++var9;
                  arg4[var9] = arg3;
                  arg0 = var9 + 1;
                  arg4[arg0] = arg3;
               }

               if (!var5) {
                  if (var5) {
                     ++arg0;
                     arg4[arg0] = arg3;
                  }

                  while(~arg0 > ~var14) {
                     ++arg0;
                     arg4[arg0] = arg3;
                  }

                  return;
               }

               ++arg0;
               arg4[arg0] = arg3;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1592[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1592[6] : field1592[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method990(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method991(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
