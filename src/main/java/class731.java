import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class731 {
   @OriginalMember(
      owner = "client!bq",
      name = "c",
      descriptor = "B"
   )
   public byte field10647;
   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10657 = new String[]{method5286(method5285("\\7`\u001d3")), method5286(method5285("\\7`brP/:`3")), method5286(method5285("Eh`pf")), method5286(method5285("\\7`\u001c3")), method5286(method5285("P3\"2")), method5286(method5285("\\7`\u001f3")), method5286(method5285("\\7`\u001a3"))};
   @OriginalMember(
      owner = "client!bq",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field10652 = false;
   @OriginalMember(
      owner = "client!bq",
      name = "l",
      descriptor = "I"
   )
   public static int field10639;
   @OriginalMember(
      owner = "client!bq",
      name = "q",
      descriptor = "I"
   )
   public static int field10640;
   @OriginalMember(
      owner = "client!bq",
      name = "f",
      descriptor = "I"
   )
   public static int field10641;
   @OriginalMember(
      owner = "client!bq",
      name = "m",
      descriptor = "I"
   )
   public static int field10650;
   @OriginalMember(
      owner = "client!bq",
      name = "r",
      descriptor = "Ldv;"
   )
   public class131 field10654;
   @OriginalMember(
      owner = "client!bq",
      name = "j",
      descriptor = "Lpf;"
   )
   public class30 field10642;
   @OriginalMember(
      owner = "client!bq",
      name = "h",
      descriptor = "Lpf;"
   )
   public class30 field10656;
   @OriginalMember(
      owner = "client!bq",
      name = "k",
      descriptor = "Llka;"
   )
   public class403 field10649;
   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "Ldi;"
   )
   public class488 field10644;
   @OriginalMember(
      owner = "client!bq",
      name = "n",
      descriptor = "Lbq;"
   )
   public class731 field10646;
   @OriginalMember(
      owner = "client!bq",
      name = "i",
      descriptor = "Lon;"
   )
   public class762 field10651;
   @OriginalMember(
      owner = "client!bq",
      name = "g",
      descriptor = "Lon;"
   )
   public class762 field10655;
   @OriginalMember(
      owner = "client!bq",
      name = "p",
      descriptor = "S"
   )
   public short field10643;
   @OriginalMember(
      owner = "client!bq",
      name = "e",
      descriptor = "S"
   )
   public short field10645;
   @OriginalMember(
      owner = "client!bq",
      name = "o",
      descriptor = "S"
   )
   public short field10648;
   @OriginalMember(
      owner = "client!bq",
      name = "b",
      descriptor = "S"
   )
   public short field10653;

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5281(int arg0) {
      boolean var2 = client.field1481;

      try {
         if (arg0 != 4) {
            this.field10651 = null;
         }

         ++field10641;
         if (var2 || this.field10654 != null) {
            do {
               class131 var3 = this.field10654.field1670;
               this.field10654.method1111(true);
               this.field10654 = var3;
            } while(this.field10654 != null);

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10657[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5282(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V"
   )
   public static final void method5283(int arg0, String arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         ++field10650;
         int var4 = class304.field4255;
         int[] var5 = class710.field10421;
         boolean var6 = false;
         int var7 = arg0;
         if (var3 || ~arg0 > ~var4) {
            do {
               class783 var8 = class59.field771[var5[var7]];
               if (var8 != null && class204.field2593 != var8 && var8.field11422 != null && var8.field11422.equalsIgnoreCase(arg1)) {
                  var6 = true;
                  if (arg2 == 1) {
                     ++class99.field1310;
                     class702 var9 = class19.method142(class387.field5365.field8765, class789.field11509, (byte)-117);
                     var9.field10264.method607(125, var5[var7]);
                     var9.field10264.method614((byte)-33, 0);
                     class387.field5365.method4423(var9, (byte)104);
                     if (!var3) {
                        break;
                     }
                  }

                  if (arg2 != 4) {
                     if (~arg2 != -6) {
                        if (arg2 == 6) {
                           ++class765.field11193;
                           class702 var10 = class19.method142(class387.field5365.field8765, class39.field538, (byte)-108);
                           var10.field10264.method593(0, arg0 + 867770704);
                           var10.field10264.method609(-3, var5[var7]);
                           class387.field5365.method4423(var10, (byte)113);
                           if (!var3) {
                              break;
                           }
                        }

                        if (~arg2 == -8) {
                           ++class205.field2610;
                           class702 var11 = class19.method142(class387.field5365.field8765, class684.field10086, (byte)-98);
                           var11.field10264.method609(-3, var5[var7]);
                           var11.field10264.method598(0, 76);
                           class387.field5365.method4423(var11, (byte)125);
                           if (!var3) {
                              break;
                           }
                        }

                        if (~arg2 != -10) {
                           break;
                        }

                        class702 var12 = class19.method142(class387.field5365.field8765, class278.field3551, (byte)-103);
                        var12.field10264.method609(-3, var5[var7]);
                        var12.field10264.method617((byte)53, 0);
                        class387.field5365.method4423(var12, (byte)126);
                        if (!var3) {
                           break;
                        }
                     }

                     ++class762.field11154;
                     class702 var13 = class19.method142(class387.field5365.field8765, class733.field10693, (byte)-92);
                     var13.field10264.method609(-3, var5[var7]);
                     var13.field10264.method593(0, 867770704);
                     class387.field5365.method4423(var13, (byte)96);
                     if (!var3) {
                        break;
                     }
                  }

                  ++class597.field8827;
                  class702 var14 = class19.method142(class387.field5365.field8765, class496.field6919, (byte)-86);
                  var14.field10264.method643(false, var5[var7]);
                  var14.field10264.method614((byte)-121, 0);
                  class387.field5365.method4423(var14, (byte)125);
                  if (!var3) {
                     break;
                  }
               }

               ++var7;
            } while(~var7 > ~var4);
         }

         if (!var6) {
            class632.method4663(class606.field8924.method4490(class782.field11389, -16777216) + arg1, 4, -110);
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field10657[3] + arg0 + ',' + (arg1 != null ? field10657[2] : field10657[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class731(int arg0) {
      try {
         this.field10647 = (byte)arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10657[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method5284(int arg0, int arg1, int arg2) {
      try {
         if (arg0 >= -87) {
            method5283(56, (String)null, -103);
         }

         ++field10640;
         double var3 = Math.log((double)arg2) / Math.log(2.0D);
         double var5 = Math.log((double)arg1) / Math.log(2.0D);
         double var7 = Math.random() * (var3 - var5) + var5;
         return (int)(0.5D + Math.pow(2.0D, var7));
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field10657[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5285(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5286(char[] arg0) {
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
            var10005 = 70;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
