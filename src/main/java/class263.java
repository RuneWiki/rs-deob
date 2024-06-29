import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class263 extends class385 {
   @OriginalMember(
      owner = "client!sr",
      name = "o",
      descriptor = "I"
   )
   private int field3744;
   @OriginalMember(
      owner = "client!sr",
      name = "r",
      descriptor = "I"
   )
   private int field3743;
   @OriginalMember(
      owner = "client!sr",
      name = "l",
      descriptor = "I"
   )
   private int field3741;
   @OriginalMember(
      owner = "client!sr",
      name = "h",
      descriptor = "I"
   )
   private int field3742;
   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3748 = new String[]{method2110(method2109("\u00071 |e")), method2110(method2109("\u0012jb>")), method2110(method2109("\u000fm \u00110")), method2110(method2109("\u000fm \u00130")), method2110(method2109("\u000fm \u00100")), method2110(method2109("\u000fm \u00140")), method2110(method2109("\u000fm nq\u0012vzl0")), method2110(method2109("\u000fm \u00170")), method2110(method2109("\u000fm \u00160"))};
   @OriginalMember(
      owner = "client!sr",
      name = "q",
      descriptor = "I"
   )
   public static int field3739 = 0;
   @OriginalMember(
      owner = "client!sr",
      name = "i",
      descriptor = "Lgh;"
   )
   public static class572 field3740 = new class572(28, -1);
   @OriginalMember(
      owner = "client!sr",
      name = "m",
      descriptor = "I"
   )
   public static int field3737;
   @OriginalMember(
      owner = "client!sr",
      name = "k",
      descriptor = "I"
   )
   public static int field3738;
   @OriginalMember(
      owner = "client!sr",
      name = "j",
      descriptor = "I"
   )
   public static int field3745;
   @OriginalMember(
      owner = "client!sr",
      name = "n",
      descriptor = "I"
   )
   public static int field3746;
   @OriginalMember(
      owner = "client!sr",
      name = "p",
      descriptor = "I"
   )
   public static int field3747;

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(BII)V",
      line = 5
   )
   public final void method2103(byte arg0, int arg1, int arg2) {
      try {
         ++field3746;
         if (arg0 != -38) {
            this.field3741 = -30;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3748[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(III)V",
      line = 15
   )
   public final void method2104(int arg0, int arg1, int arg2) {
      try {
         ++field3738;
         int var4 = this.field3741 * arg1 >> 12;
         int var5 = this.field3744 * arg1 >> 12;
         if (arg2 != 5598) {
            this.method2103((byte)-124, 89, 71);
         }

         int var6 = this.field3743 * arg0 >> 12;
         int var7 = this.field3742 * arg0 >> 12;
         class653.method4802(var5, var6, var7, super.field5687, true, var4);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3748[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 34
   )
   public class263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(-1, arg4, arg5);

      try {
         this.field3744 = arg2;
         this.field3743 = arg1;
         this.field3741 = arg0;
         this.field3742 = arg3;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3748[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(IB)I",
      line = 50
   )
   public static final int method2105(int arg0, byte arg1) {
      try {
         if (arg1 <= 73) {
            method2107((class445)null, (String)null, false, (class66)null, 18, (class65)null);
         }

         ++field3737;
         return arg0 == 16711935 ? -1 : class89.method867((byte)74, arg0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3748[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(I)V",
      line = 66
   )
   public static void method2106(int arg0) {
      try {
         if (arg0 > -106) {
            field3739 = -91;
         }

         field3740 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3748[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(Lika;Ljava/lang/String;ZLda;ILha;)V",
      line = 78
   )
   public static final void method2107(class445 arg0, String arg1, boolean arg2, class66 arg3, int arg4, class65 arg5) {
      try {
         ++field3747;
         boolean var6 = !class308.field4439 || class315.method2440((byte)127);
         if (arg4 != 2) {
            field3739 = 93;
         }

         if (var6) {
            label73: {
               if (class308.field4439 && var6) {
                  arg0 = class444.field6468;
                  arg3 = arg5.method414(arg0, class441.field6444, true);
                  int var7 = arg0.method3344(arg4 + -18285, (class476[])null, arg1, 250);
                  int var8 = arg0.method3350(250, 7766, (class476[])null, arg0.field6485, arg1);
                  int var9 = class52.field1080.field1523;
                  int var10 = var9 + 4;
                  int var11 = var10 * 2 + var7;
                  int var12 = var10 * 2 + var8;
                  if (~var11 > ~class317.field4577) {
                     var11 = class317.field4577;
                  }

                  if (~var12 > ~class573.field8277) {
                     var12 = class573.field8277;
                  }

                  int var13 = class459.field6732.method4952(var11, class140.field2281, true) - -class13.field192;
                  int var14 = class173.field2671.method1060(var12, arg4 ^ -45, class664.field9661) + class563.field8193;
                  if (class262.field3734) {
                     var13 += class124.method1174((byte)-91);
                     var14 += class745.method5410(arg4 ^ -124);
                  }

                  arg5.method307(class710.field10320, false).method3007(var13 - -class773.field11327.field1523, class773.field11327.field1520 + var14, -(class773.field11327.field1523 * 2) + var11, -(class773.field11327.field1520 * 2) + var12, 1, 0, 0);
                  arg5.method307(class773.field11327, true).method3609(var13, var14);
                  class773.field11327.method918();
                  arg5.method307(class773.field11327, true).method3609(var11 + var13 + -var9, var14);
                  class773.field11327.method905();
                  arg5.method307(class773.field11327, true).method3609(var11 + var13 + -var9, -var9 + var14 + var12);
                  class773.field11327.method918();
                  arg5.method307(class773.field11327, true).method3609(var13, var12 - var9 + var14);
                  class773.field11327.method905();
                  arg5.method307(class52.field1080, true).method3607(var13, class773.field11327.field1520 + var14, var9, -(class773.field11327.field1520 * 2) + var12);
                  class52.field1080.method910();
                  arg5.method307(class52.field1080, true).method3607(class773.field11327.field1523 + var13, var14, var11 - class773.field11327.field1523 * 2, var9);
                  class52.field1080.method910();
                  arg5.method307(class52.field1080, true).method3607(var13 - (-var11 + var9), var14 - -class773.field11327.field1520, var9, -(class773.field11327.field1520 * 2) + var12);
                  class52.field1080.method910();
                  arg5.method307(class52.field1080, true).method3607(var13 - -class773.field11327.field1523, var14 - (-var12 + var9), -(class773.field11327.field1523 * 2) + var11, var9);
                  class52.field1080.method910();
                  arg3.method717((int[])null, var10 + var13, 0, -(var10 * 2) + var12, 0, (class476[])null, 1, var11 - var10 * 2, -1, var10 + var14, arg1, 0, (class510)null, class290.field4059 | -16777216, 1, 255);
                  class692.method5033(var11, true, var12, var13, var14);
                  if (!client.field4564) {
                     break label73;
                  }
               }

               int var15 = arg0.method3344(-18283, (class476[])null, arg1, 250);
               int var16 = arg0.method3348((class476[])null, 250, (byte)-116, arg1) * 13;
               byte var17 = 4;
               int var18 = 6 - -var17;
               int var19 = var17 + 6;
               arg5.method295(-var17 + var18, -var17 + var19, var15 + var17 + var17, var16 + var17 + var17, -16777216, 0);
               arg5.method403(var18 - var17, -var17 + var19, var15 + var17 + var17, var16 + var17 - -var17, -1, 0);
               arg3.method717((int[])null, var18, 0, var16, 0, (class476[])null, 1, var15, -1, var19, arg1, 0, (class510)null, -1, 1, 255);
               class692.method5033(var15 + var17 - -var17, true, var16 - -var17 + var17, -var17 + var18, var19 - var17);
            }

            if (arg2) {
               try {
                  if (class262.field3734) {
                     class435.method3272((byte)-64);
                  } else {
                     arg5.method690(-6145);
                  }
               } catch (class328 var21) {
               }
            }
         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field3748[2] + (arg0 != null ? field3748[0] : field3748[1]) + ',' + (arg1 != null ? field3748[0] : field3748[1]) + ',' + arg2 + ',' + (arg3 != null ? field3748[0] : field3748[1]) + ',' + arg4 + ',' + (arg5 != null ? field3748[0] : field3748[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "a",
      descriptor = "(IBI)V",
      line = 175
   )
   public final void method2108(int arg0, byte arg1, int arg2) {
      try {
         ++field3745;
         int var4 = 84 % ((-3 - arg1) / 51);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3748[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2109(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2110(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
