import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class356 extends class416 {
   @OriginalMember(
      owner = "client!qp",
      name = "i",
      descriptor = "Z"
   )
   private boolean field5482 = false;
   @OriginalMember(
      owner = "client!qp",
      name = "p",
      descriptor = "Z"
   )
   private boolean field5487 = false;
   @OriginalMember(
      owner = "client!qp",
      name = "f",
      descriptor = "Lwfa;"
   )
   private class786 field5485;
   @OriginalMember(
      owner = "client!qp",
      name = "k",
      descriptor = "Low;"
   )
   private class789 field5488;
   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5490 = new String[]{method2915(method2914(":\r95$")), method2915(method2914("0S9Zq")), method2915(method2914("%\b{\u0018")), method2915(method2914(":\r92$")), method2915(method2914(":\r96$")), method2915(method2914(":\r90$")), method2915(method2914(")\u000fr\u0015g\u001c\u001cc\u0011~\u0004\u001bq\u0007i?")), method2915(method2914("8\u001ev\u0018i")), method2915(method2914("?\u0014z\u0011")), method2915(method2914(")\u000fr\u0015g\u001c\u001cc\u0011~\u000f\u0018g\u0000d")), method2915(method2914(":\r91$")), method2915(method2914(":\r97$")), method2915(method2914("8\by0e9")), method2915(method2914("%\u0012e\u0019m'.v\u0019|'\u0018e")), method2915(method2914(".\u0013a9m;.v\u0019|'\u0018e")), method2915(method2914(":\r9<$")), method2915(method2914("8\by7c'\u0012b\u0006")), method2915(method2914("8\by1t;\u0012y\u0011b?")), method2915(method2914(":\r93$")), method2915(method2914("w\u001ex\u00181-\u001bq\u0012j-C")), method2915(method2914("\u0005\b{\u0018")), method2915(method2914(":\r9He%\u0014cJ$")), method2915(method2914("=\u001ce\re%\u001a7\u0002i(N7\u0003z\u001d\u0018e\u0000i3F\u001d\u0002m9\u0004~\u001akk\u001b{\u001bm?]`\u0015x.\u000fS\u0011|?\u0015,~y%\u0014q\u001b~&]a\u0011ox]d\u0001b\u000f\u0014eO\u0006>\u0013~\u0012c9\u00107\u0002i(I7\u0007y%>x\u0018c>\u000f,~y%\u0014q\u001b~&]q\u0018c*\t7\u0007y%8o\u0004c%\u0018y\u00007A\by\u001dj$\u000fzTj'\u0012v\u0000,)\u000fr\u0015g\u001c\u001cc\u0011~\u000f\u0018g\u0000dpwb\u001ae-\u0012e\u0019,-\u0011x\u0015xk\u001fe\u0011m *v\u0000i92q\u0012\u007f.\t,~y%\u0014q\u001b~&]d\u0015a;\u0011r\u0006?\u000f]y\u001b~&\u001c{'m&\r{\u0011~pwb\u001ae-\u0012e\u0019,8\u001cz\u0004`.\u000fT\u0001n.]r\u001az\u0006\u001cg'm&\r{\u0011~pwa\u001be/]z\u0015e%U>TwA\u000br\u00178k\ny:c9\u0010v\u0018,v]c\u0011t?\be\u0011?\u000fUy\u001b~&\u001c{'m&\r{\u0011~g]p\u0018S\u001f\u0018o7c$\u000fs/<\u0016So\rvbSe\u0016k*F\u001d\u0003b\u0005\u0012e\u0019m'So\rvk@7F\"{W`\u001aB$\u000fz\u0015`e\u0005n\u000e!zS'O\u0006=\u0018tG,<\u0013A\u0011o?\u0012eT1k\u0013x\u0006a*\u0011~\u000eic\na\"i9\tr\f%pwa\u0011ox]`\u001a^.\u001b{\u0011o?\u0014x\u001a,v]e\u0011j'\u0018t\u0000$<\u0013A\u0011o?\u0012eX,<\u0013Y\u001b~&\u001c{Zt2\u0007>O\u0006=\u0018tG,.\u0013a7c'\u0012b\u0006,v]c\u0011t?\be\u0011O>\u001fr\\i%\u000bZ\u0015|\u0018\u001cz\u0004`.\u000f;T{%/r\u0012`.\u001ec\u001dc%T9\u0006k)F\u001d\u0002i(I7\u0007|.\u001eb\u0018m9>x\u0018c>\u000f7I,8\by7c'\u0012b\u0006&;\u0012`\\o'\u001cz\u0004$f\u0019x\u0000$8\by0e9Q7\u0003b\u0019\u0018q\u0018i(\t~\u001bbbQ7D\"{Q7E\"{T;T\u007f>\u0013R\f|$\u0013r\u001axbF\u001d\u0012`$\u001ccT\u007f#\u0012e\u0011J*\u001ec\u001b~k@7\u0017`*\u0010g\\{*\tr\u0006H.\rc\u001c#)\u000fr\u0015g\u001c\u001cc\u0011~\u000f\u0018g\u0000df\u001fe\u0011m *v\u0000i92q\u0012\u007f.\t=\u0003b\u0005\u0012e\u0019m'S`X,{S'X,zS']7A\u001b{\u001bm?]y\u0010c?\u00187I,/\u0012c\\{%+r\u0017x$\u000f;T{%3x\u0006a*\u00119\fu1T,~j'\u0012v\u0000,-\u000fr\u0007b.\u00117I,;\u0012`\\=eM:\u0015n8Uy\u0010c?\u0018>X,yS']7A\u000br\u00178k\u000eb\u0006j*\u001er7c'\u0012b\u0006,v]a\u0011o\u007fUr\u001az\b\u0012{\u001by9Q7\u0012~.\u000ey\u0011`a\u000e\u007f\u001b~.;v\u0017x$\u000f>_\u007f;\u0018t\u0001`*\u000fT\u001b`$\be^\u007f#\u0012e\u0011J*\u001ec\u001b~pwp\u0018S\r\u000fv\u0013O$\u0011x\u0006,v]a\u0011o\u007fUz\u001dtc\u000eb\u0006j*\u001er7c'\u0012b\u0006\"9\u001auX,,\u0011H2c,St\u001b`$\u000f9\u0006k)Q7\u0013`\u0014;x\u0013J9\u001cp7c$\u000fs] k\u000eb\u0006j*\u001er7c'\u0012b\u0006\"*T,~qA")), method2915(method2914(">\u0013~\u0012c9\u00107\u0012`$\u001ccTx\"\u0010rO\u0006>\u0013~\u0012c9\u00107\u0012`$\u001ccT\u007f(\u001c{\u00117A\u000bv\u0006u\"\u0013pTz.\u001e$T{=+r\u0006x.\u0005,~z*\u000fn\u001db,]q\u0018c*\t7\u0003m?\u0018e0i;\t\u007fO\u0006=\u0012~\u0010,&\u001c~\u001a$b]l~{*\tr\u0006H.\rc\u001c,v]p\u0018S\u0006\b{\u0000e\u001f\u0018o7c$\u000fsD\"1F\u001d\u0002i(I7\u0011o\u001d\u0018e\u0000i3]*Tk'\"Z\u001bh.\u0011A\u001di<0v\u0000~\"\u0005=\u0013`\u0014+r\u0006x.\u0005,~{=+r\u0006x.\u00059\f,v]s\u001bxc\u001a{+B$\u000fz\u0015`\u0006\u001cc\u0006e3&') k\u0018t\"i9\tr\f\"3\u0004m]7A\na\"i9\tr\f\"2]*Th$\t?\u0013`\u00143x\u0006a*\u0011Z\u0015x9\u0014o/=\u0016Q7\u0011o\u001d\u0018e\u0000i3So\rvbF\u001d\u0003z\u001d\u0018e\u0000i3SmT1k\u0019x\u0000$,\u0011H:c9\u0010v\u0018A*\te\u001dt\u0010OJX,.\u001eA\u0011~?\u0018oZt2\u0007>O\u0006,\u0011H i3>x\u001b~/&')\"3]*Th$\t?\u0013`\u0014)r\fx>\u000fr9m?\u000f~\fW{ LDQg]p\u0018S\u0006\b{\u0000e\u001f\u0018o7c$\u000fsD%a\u000et\u0015`.F\u001d\u0013`\u0014)r\fO$\u0012e\u0010W{ 9\r,v]s\u001bxc\u001a{+X.\u0005c\u0001~.0v\u0000~\"\u0005LDQ\u0010LJX,,\u0011H9y'\t~ i3>x\u001b~/M>^\u007f(\u001c{\u00117A\u001a{+X.\u0005T\u001bc9\u0019LDQe\u00077I,?\u0014z\u00117A\u001a{+X.\u0005T\u001bc9\u0019LDQe\n7I,zS'O\u0006,\u0011H2c,;e\u0015k\b\u0012x\u0006hk@7E\"{Pt\u0018m&\r?\\k'\"Q\u001bke\u0018y\u0010'.\u001eA\u0011~?\u0018oZvbWp\u0018S\r\u0012pZ\u007f(\u001c{\u0011 kM9D kL9D%pwp\u0018S\u001b\u0012d\u001dx\"\u0012yT1k\u001bc\u0006m%\u000eq\u001b~&U>O\u00066w"))};
   @OriginalMember(
      owner = "client!qp",
      name = "q",
      descriptor = "I"
   )
   public static int field5475;
   @OriginalMember(
      owner = "client!qp",
      name = "h",
      descriptor = "I"
   )
   public static int field5476;
   @OriginalMember(
      owner = "client!qp",
      name = "l",
      descriptor = "I"
   )
   public static int field5477;
   @OriginalMember(
      owner = "client!qp",
      name = "d",
      descriptor = "I"
   )
   public static int field5479;
   @OriginalMember(
      owner = "client!qp",
      name = "o",
      descriptor = "I"
   )
   public static int field5480;
   @OriginalMember(
      owner = "client!qp",
      name = "j",
      descriptor = "I"
   )
   public static int field5483;
   @OriginalMember(
      owner = "client!qp",
      name = "m",
      descriptor = "I"
   )
   public static int field5484;
   @OriginalMember(
      owner = "client!qp",
      name = "e",
      descriptor = "I"
   )
   public static int field5486;
   @OriginalMember(
      owner = "client!qp",
      name = "g",
      descriptor = "I"
   )
   public static int field5489;
   @OriginalMember(
      owner = "client!qp",
      name = "r",
      descriptor = "Lrr;"
   )
   public static class678 field5481;
   @OriginalMember(
      owner = "client!qp",
      name = "n",
      descriptor = "[S"
   )
   public static short[] field5478;

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(Lvda;IB)V"
   )
   public final void method1826(class799 arg0, int arg1, byte arg2) {
      try {
         if (!this.field5487) {
            super.field6445.method4792(-26367, arg0);
            super.field6445.method4765(arg1, (byte)-3);
         }

         if (arg2 <= -29) {
            ++field5477;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5490[3] + (arg0 != null ? field5490[1] : field5490[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method1831(boolean arg0, int arg1) {
      try {
         ++field5480;
         if (arg1 == 3211) {
            class553 var3 = super.field6445.method4811(80);
            if (this.field5482 && var3 != null) {
               super.field6445.method4787(-98, 1);
               super.field6445.method4792(-26367, var3);
               super.field6445.method4787(arg1 + -3304, 0);
               super.field6445.method4792(arg1 ^ -27254, this.field5485.field11531);
               long var4 = this.field5488.field11548;
               OpenGL.glUseProgramObjectARB(var4);
               OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field5490[13]), 0);
               OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field5490[14]), 1);
               OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field5490[12]), -super.field6445.field9724[0], -super.field6445.field9724[1], -super.field6445.field9724[2]);
               OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field5490[16]), super.field6445.field9734, super.field6445.field9703, super.field6445.field9762, 1.0F);
               OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field5490[17]), 96.0F + Math.abs(super.field6445.field9724[1]) * 928.0F);
               this.field5487 = true;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5490[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(IIILria;)V"
   )
   public static final void method2912(int arg0, int arg1, int arg2, class185 arg3) {
      boolean var4 = client.field1786;

      try {
         ++field5476;
         if (arg3 != null && class326.field4958.field10053 != arg3) {
            int var5 = -51 % ((arg2 - -13) / 58);
            int var6 = arg3.field2898;
            int var7 = arg3.field2904;
            int var8 = arg3.field2896;
            int var9 = (int)arg3.field2907;
            if (var8 >= 2000) {
               var8 -= 2000;
            }

            long var10 = arg3.field2907;
            if (~var8 == -26) {
               class795 var12 = (class795)class501.field7665.method3141((long)var9, true);
               if (var12 != null) {
                  class466 var13 = var12.field11592;
                  class464.field7049 = 2;
                  class382.field6031 = arg0;
                  class256.field3871 = 0;
                  class528.field8015 = arg1;
                  ++class675.field10052;
                  class577 var14 = class218.method1888(class133.field1888, 121, class510.field7801.field361);
                  var14.field8531.method2895(class300.field4707.method219(82, (byte)-101) ? 1 : 0, (byte)-5);
                  var14.field8531.method2853(false, class105.field1459);
                  var14.field8531.method2873(class449.field6882, (byte)108);
                  var14.field8531.method2849(class175.field2750, (byte)-34);
                  var14.field8531.method2873(var9, (byte)90);
                  class510.field7801.method211(var14, 123);
                  class679.method5031(var13.method61((byte)70), 0, var13.field1683[0], var13.method61((byte)70), (byte)-38, -2, var13.field1685[0], 0, true);
               }
            }

            if (~var8 == -21) {
               class374 var15 = class221.method1912(var7, 90, var6);
               if (var15 != null) {
                  class411.method3292(2827);
                  class68 var16 = client.method1148(var15);
                  class438.method3446(false, var16.field900, var16.method520((byte)42), var15);
                  class443.field6803 = class593.method4418(-125, var15);
                  if (class443.field6803 == null) {
                     class443.field6803 = field5490[20];
                  }

                  class65.field860 = var15.field5826 + field5490[19];
               }

            } else {
               if (var8 == 10) {
                  class528.field8015 = arg1;
                  class382.field6031 = arg0;
                  class256.field3871 = 0;
                  ++class348.field5323;
                  class464.field7049 = 2;
                  class577 var17 = class218.method1888(class292.field4610, 107, class510.field7801.field361);
                  var17.field8531.method2874((byte)-23, class105.field1459);
                  var17.field8531.method2870(-32768, class300.field4707.method219(82, (byte)-52) ? 1 : 0);
                  var17.field8531.method2874((byte)-23, class476.field7251.field1640);
                  var17.field8531.method2874((byte)-23, class449.field6882);
                  var17.field8531.method2866(class175.field2750, true);
                  class510.field7801.method211(var17, 121);
               }

               if (var8 == 57) {
                  label353: {
                     if (class487.field7404 <= 0 || !class300.field4707.method219(82, (byte)-111) || !class300.field4707.method219(81, (byte)-60)) {
                        class382.field6031 = arg0;
                        class464.field7049 = 1;
                        class256.field3871 = 0;
                        ++class594.field8742;
                        class528.field8015 = arg1;
                        class577 var18 = class218.method1888(class194.field3006, 124, class510.field7801.field361);
                        var18.field8531.method2853(false, class120.field1694 + var6);
                        var18.field8531.method2874((byte)-23, class119.field1606 + var7);
                        class510.field7801.method211(var18, 126);
                        if (!var4) {
                           break label353;
                        }
                     }

                     class388.method3133(class120.field1694 - -var6, 11301, class119.field1606 + var7, class476.field7251.field1506);
                  }
               }

               if (var8 == 44) {
                  label329: {
                     if (class487.field7404 > 0 && class300.field4707.method219(82, (byte)-72) && class300.field4707.method219(81, (byte)-23)) {
                        class388.method3133(class120.field1694 - -var6, 11301, class119.field1606 - -var7, class476.field7251.field1506);
                        if (!var4) {
                           break label329;
                        }
                     }

                     class577 var19;
                     label297: {
                        var19 = class420.method3343(var6, 0, var9, var7);
                        if (var9 == 1) {
                           var19.field8531.method2864(-26110, -1);
                           var19.field8531.method2864(-26110, -1);
                           var19.field8531.method2873((int)class417.field6456, (byte)104);
                           var19.field8531.method2864(-26110, 57);
                           var19.field8531.method2864(-26110, class438.field6710);
                           var19.field8531.method2864(-26110, class243.field3683);
                           var19.field8531.method2864(-26110, 89);
                           var19.field8531.method2873(class476.field7251.field1505, (byte)107);
                           var19.field8531.method2873(class476.field7251.field1494, (byte)-72);
                           var19.field8531.method2864(-26110, 63);
                           if (!var4) {
                              break label297;
                           }
                        }

                        class464.field7049 = 1;
                        class382.field6031 = arg0;
                        class256.field3871 = 0;
                        class528.field8015 = arg1;
                     }

                     class510.field7801.method211(var19, 121);
                     class679.method5031(1, 0, var6, 1, (byte)-38, -4, var7, 0, true);
                  }
               }

               class113 var20 = null;
               if (var8 != 59) {
                  if (~var8 != -16) {
                     if (~var8 == -59) {
                        var20 = class701.field10453;
                     } else if (~var8 == -13) {
                        var20 = class13.field165;
                     } else if (var8 == 51) {
                        var20 = class125.field1796;
                     } else if (~var8 == -14) {
                        var20 = class579.field8555;
                     } else if (var8 == 5) {
                        var20 = class178.field2779;
                     } else if (~var8 == -17) {
                        var20 = class110.field1517;
                     } else if (~var8 != -53) {
                        if (~var8 == -9) {
                           var20 = class199.field3063;
                        }
                     } else {
                        var20 = class13.field170;
                     }
                  } else {
                     var20 = class735.field10950;
                  }
               } else {
                  var20 = class692.field10275;
               }

               if (var20 != null) {
                  class9 var21 = class484.field7370[var9];
                  if (var21 != null) {
                     class256.field3871 = 0;
                     class464.field7049 = 2;
                     class382.field6031 = arg0;
                     ++class341.field5195;
                     class528.field8015 = arg1;
                     class577 var22 = class218.method1888(var20, 121, class510.field7801.field361);
                     var22.field8531.method2853(false, var9);
                     var22.field8531.method2864(-26110, !class300.field4707.method219(82, (byte)-112) ? 0 : 1);
                     class510.field7801.method211(var22, 124);
                     class679.method5031(var21.method61((byte)70), 0, var21.field1683[0], var21.method61((byte)70), (byte)-38, -2, var21.field1685[0], 0, true);
                  }
               }

               if (var8 == 46) {
                  class374 var23 = class221.method1912(var7, -106, var6);
                  if (var23 != null) {
                     class693.method5101(var23, 64);
                  }
               }

               class113 var24 = null;
               if (~var8 != -61) {
                  if (~var8 == -46) {
                     var24 = class514.field7832;
                  } else if (~var8 == -48) {
                     var24 = class794.field11584;
                  } else if (~var8 == -18) {
                     var24 = class690.field10252;
                  } else if (var8 == 9) {
                     var24 = class719.field10779;
                  } else if (var8 == 1008) {
                     var24 = class239.field3630;
                  }
               } else {
                  var24 = class653.field9777;
               }

               if (var24 != null) {
                  class382.field6031 = arg0;
                  class464.field7049 = 2;
                  class528.field8015 = arg1;
                  class256.field3871 = 0;
                  ++class724.field10838;
                  class577 var25 = class218.method1888(var24, 116, class510.field7801.field361);
                  var25.field8531.method2864(-26110, class300.field4707.method219(82, (byte)-66) ? 1 : 0);
                  var25.field8531.method2856(116, var9);
                  var25.field8531.method2856(-122, class120.field1694 + var6);
                  var25.field8531.method2853(false, var7 - -class119.field1606);
                  class510.field7801.method211(var25, 125);
                  class348.method2806(var6, var7, true);
               }

               if (var8 == 4 || var8 == 1004) {
                  class24.method177(var9, var7, (byte)9, var6, arg3.field2910);
               }

               if (~var8 == -49) {
                  class256.field3871 = 0;
                  ++class146.field2185;
                  class528.field8015 = arg1;
                  class382.field6031 = arg0;
                  class464.field7049 = 2;
                  class577 var26 = class218.method1888(class718.field10760, 127, class510.field7801.field361);
                  var26.field8531.method2870(-32768, !class300.field4707.method219(82, (byte)-51) ? 0 : 1);
                  var26.field8531.method2866(class175.field2750, true);
                  var26.field8531.method2856(47, var9);
                  var26.field8531.method2856(-120, class105.field1459);
                  var26.field8531.method2856(-118, var6 - -class120.field1694);
                  var26.field8531.method2873(class119.field1606 + var7, (byte)126);
                  var26.field8531.method2874((byte)-23, class449.field6882);
                  class510.field7801.method211(var26, 121);
                  class348.method2806(var6, var7, true);
               }

               if (~var8 == -1004 || ~var8 == -1007 || ~var8 == -1010 || ~var8 == -1002 || var8 == 1012) {
                  class294.method2476(-8602, var6, var8, var9);
               }

               if (var8 == 30) {
                  class464.field7049 = 2;
                  class382.field6031 = arg0;
                  class528.field8015 = arg1;
                  class256.field3871 = 0;
                  ++class292.field4603;
                  class577 var27 = class218.method1888(class570.field8434, 124, class510.field7801.field361);
                  var27.field8531.method2856(-72, Integer.MAX_VALUE & (int)(var10 >>> 32));
                  var27.field8531.method2856(-67, class119.field1606 + var7);
                  var27.field8531.method2853(false, class449.field6882);
                  var27.field8531.method2849(class175.field2750, (byte)-34);
                  var27.field8531.method2856(-52, class105.field1459);
                  var27.field8531.method2853(false, class120.field1694 + var6);
                  var27.field8531.method2864(-26110, !class300.field4707.method219(82, (byte)-40) ? 0 : 1);
                  class510.field7801.method211(var27, 122);
                  class532.method4092(var6, var7, -1228259936, var10);
               }

               if (~var8 == -7) {
                  class528.field8015 = arg1;
                  ++class119.field1650;
                  class464.field7049 = 1;
                  class256.field3871 = 0;
                  class382.field6031 = arg0;
                  class577 var28 = class218.method1888(class658.field9831, 113, class510.field7801.field361);
                  var28.field8531.method2874((byte)-23, class119.field1606 - -var7);
                  var28.field8531.method2874((byte)-23, class120.field1694 + var6);
                  var28.field8531.method2838(class175.field2750, -106);
                  var28.field8531.method2874((byte)-23, class105.field1459);
                  var28.field8531.method2856(-52, class449.field6882);
                  class510.field7801.method211(var28, 125);
                  class679.method5031(1, 0, var6, 1, (byte)-38, -4, var7, 0, true);
               }

               if (~var8 == -51 && class387.field6083 == null) {
                  class249.method2117(true, var7, var6);
                  class387.field6083 = class221.method1912(var7, -80, var6);
                  class573.method4310((byte)-33, class387.field6083);
               }

               class113 var29 = null;
               if (var8 == 19) {
                  var29 = class675.field10039;
               } else if (~var8 == -4) {
                  var29 = class783.field11501;
               } else if (var8 != 21) {
                  if (~var8 != -54) {
                     if (~var8 == -23) {
                        var29 = class522.field7959;
                     } else if (var8 == 1002) {
                        var29 = class287.field4514;
                     }
                  } else {
                     var29 = class629.field9106;
                  }
               } else {
                  var29 = class24.field297;
               }

               if (var29 != null) {
                  class795 var30 = (class795)class501.field7665.method3141((long)var9, true);
                  if (var30 != null) {
                     class382.field6031 = arg0;
                     class466 var31 = var30.field11592;
                     ++class760.field11242;
                     class256.field3871 = 0;
                     class528.field8015 = arg1;
                     class464.field7049 = 2;
                     class577 var32 = class218.method1888(var29, 93, class510.field7801.field361);
                     var32.field8531.method2893((byte)126, class300.field4707.method219(82, (byte)-97) ? 1 : 0);
                     var32.field8531.method2853(false, var9);
                     class510.field7801.method211(var32, 126);
                     class679.method5031(var31.method61((byte)70), 0, var31.field1683[0], var31.method61((byte)70), (byte)-38, -2, var31.field1685[0], 0, true);
                  }
               }

               class113 var33 = null;
               if (~var8 != -50) {
                  if (~var8 == -3) {
                     var33 = class619.field9009;
                  } else if (~var8 != -19) {
                     if (~var8 == -12) {
                        var33 = class769.field11338;
                     } else if (~var8 == -1012) {
                        var33 = class286.field4500;
                     } else if (var8 == 1007) {
                        var33 = class498.field7576;
                     }
                  } else {
                     var33 = class408.field6356;
                  }
               } else {
                  var33 = class453.field6944;
               }

               if (var33 != null) {
                  class256.field3871 = 0;
                  class382.field6031 = arg0;
                  class528.field8015 = arg1;
                  class464.field7049 = 2;
                  ++class424.field6548;
                  class577 var34 = class218.method1888(var33, 105, class510.field7801.field361);
                  var34.field8531.method2873(var7 - -class119.field1606, (byte)123);
                  var34.field8531.method2853(false, var6 - -class120.field1694);
                  var34.field8531.method2874((byte)-23, Integer.MAX_VALUE & (int)(var10 >>> 32));
                  var34.field8531.method2870(-32768, class300.field4707.method219(82, (byte)-111) ? 1 : 0);
                  class510.field7801.method211(var34, 125);
                  class532.method4092(var6, var7, -1228259936, var10);
               }

               if (~var8 == -24) {
                  class9 var35 = class484.field7370[var9];
                  if (var35 != null) {
                     class256.field3871 = 0;
                     class382.field6031 = arg0;
                     class528.field8015 = arg1;
                     ++class348.field5323;
                     class464.field7049 = 2;
                     class577 var36 = class218.method1888(class292.field4610, 105, class510.field7801.field361);
                     var36.field8531.method2874((byte)-23, class105.field1459);
                     var36.field8531.method2870(-32768, !class300.field4707.method219(82, (byte)-24) ? 0 : 1);
                     var36.field8531.method2874((byte)-23, var9);
                     var36.field8531.method2874((byte)-23, class449.field6882);
                     var36.field8531.method2866(class175.field2750, true);
                     class510.field7801.method211(var36, 123);
                     class679.method5031(var35.method61((byte)70), 0, var35.field1683[0], var35.method61((byte)70), (byte)-38, -2, var35.field1685[0], 0, true);
                  }
               }

               if (class552.field8264) {
                  class411.method3292(2827);
               }

               if (class779.field11417 != null && ~class583.field8616 == -1) {
                  class573.method4310((byte)-98, class779.field11417);
               }
            }
         }
      } catch (RuntimeException var38) {
         throw class482.method3757(var38, field5490[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5490[1] : field5490[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "<init>",
      descriptor = "(Lc;Lwfa;)V"
   )
   public class356(class652 arg0, class786 arg1) {
      super(arg0);

      try {
         this.field5485 = arg1;
         if (this.field5485.field11531 != null && super.field6445.field9674 && super.field6445.field9735) {
            class86 var3 = class135.method1243(field5490[23], 35633, (byte)-10, super.field6445);
            class86 var4 = class135.method1243(field5490[22], 35632, (byte)-20, super.field6445);
            this.field5488 = class651.method4722(new class86[]{var3, var4}, super.field6445, -2830);
            this.field5482 = this.field5488 != null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5490[21] + (arg0 != null ? field5490[1] : field5490[2]) + ',' + (arg1 != null ? field5490[1] : field5490[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method1828(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            ++field5475;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5490[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1827(byte arg0) {
      try {
         if (arg0 != 77) {
            this.field5485 = null;
         }

         if (this.field5487) {
            super.field6445.method4787(-108, 1);
            super.field6445.method4792(-26367, (class799)null);
            super.field6445.method4787(-120, 0);
            super.field6445.method4792(-26367, (class799)null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5487 = false;
         }

         ++field5483;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5490[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1830(byte arg0) {
      try {
         int var2 = -114 % ((-8 - arg0) / 57);
         ++field5479;
         return false;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5490[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1833(int arg0, int arg1, int arg2) {
      try {
         ++field5486;
         if (arg1 > -90) {
            field5478 = null;
         }

         if (this.field5487) {
            int var4 = 1 << (3 & arg2);
            float var5 = (float)(1 << (7 & arg2 >> 3)) / 32.0F;
            int var6 = 65535 & arg0;
            float var7 = (float)(arg0 >> 16 & 3) / 8.0F;
            long var8 = this.field5488.field11548;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field5490[8]), (float)(super.field6445.field9615 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field5490[7]), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field5490[9]), (float)var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field5490[6]), var7);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field5490[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2913(int arg0) {
      try {
         field5478 = null;
         field5481 = null;
         if (arg0 != 81) {
            field5484 = 26;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5490[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2914(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2915(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
