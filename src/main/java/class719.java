import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class719 extends class76 implements class376 {
   @OriginalMember(
      owner = "client!jm",
      name = "N",
      descriptor = "I"
   )
   private int field10500 = -1;
   @OriginalMember(
      owner = "client!jm",
      name = "G",
      descriptor = "I"
   )
   private int field10503 = -1;
   @OriginalMember(
      owner = "client!jm",
      name = "F",
      descriptor = "Lea;"
   )
   private class573 field10504;
   @OriginalMember(
      owner = "client!jm",
      name = "I",
      descriptor = "I"
   )
   public int field10499;
   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "I"
   )
   public int field10507;
   @OriginalMember(
      owner = "client!jm",
      name = "A",
      descriptor = "I"
   )
   private int field10505;
   @OriginalMember(
      owner = "client!jm",
      name = "H",
      descriptor = "I"
   )
   private int field10497;
   @OriginalMember(
      owner = "client!jm",
      name = "M",
      descriptor = "I"
   )
   private int field10496;
   @OriginalMember(
      owner = "client!jm",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10509 = new String[]{method5234(method5233("._\f\u0019j*SN\u0016y!\u001a")), method5234(method5233("._\fCj*[VA+")), method5234(method5233("?\u001c\fQ~")), method5234(method5233("*GN\u0013")), method5234(method5233("._\f<+")), method5234(method5233("._\f=+")), method5234(method5233("._\f:+")), method5234(method5233("._\f>+")), method5234(method5233("._\f;+")), method5234(method5233("._\f9+")), method5234(method5233("xQM\u0013>\"TD\u0019e\"\f")), method5234(method5233("\nGN\u0013"))};
   @OriginalMember(
      owner = "client!jm",
      name = "L",
      descriptor = "Lek;"
   )
   public static class536 field10508 = new class536(3, -1);
   @OriginalMember(
      owner = "client!jm",
      name = "E",
      descriptor = "I"
   )
   public static int field10492;
   @OriginalMember(
      owner = "client!jm",
      name = "B",
      descriptor = "I"
   )
   public static int field10494;
   @OriginalMember(
      owner = "client!jm",
      name = "D",
      descriptor = "I"
   )
   public static int field10495;
   @OriginalMember(
      owner = "client!jm",
      name = "Q",
      descriptor = "I"
   )
   public static int field10498;
   @OriginalMember(
      owner = "client!jm",
      name = "K",
      descriptor = "I"
   )
   public static int field10501;
   @OriginalMember(
      owner = "client!jm",
      name = "P",
      descriptor = "I"
   )
   public static int field10502;
   @OriginalMember(
      owner = "client!jm",
      name = "J",
      descriptor = "Lqv;"
   )
   public static class472 field10493;
   @OriginalMember(
      owner = "client!jm",
      name = "C",
      descriptor = "[I"
   )
   public static int[] field10506;

   @OriginalMember(
      owner = "client!jm",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method5228(byte arg0) {
      try {
         if (arg0 < 117) {
            field10506 = null;
         }

         ++field10495;
         if (~this.field10497 < -1) {
            this.field10504.method4157(this.field10497, this.field10496, (byte)-100);
            this.field10497 = 0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10509[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(Liha;IIB)V"
   )
   public static final void method5229(class32 arg0, int arg1, int arg2, byte arg3) {
      boolean var4 = client.field4360;

      try {
         ++field10501;
         if (arg0 != null && class627.field9216.field5611 != arg0) {
            int var5 = arg0.field457;
            int var6 = arg0.field460;
            int var7 = arg0.field458;
            int var8 = (int)arg0.field456;
            if (~var7 <= -2001) {
               var7 -= 2000;
            }

            long var9 = arg0.field456;
            if (var7 == 30) {
               class121 var11 = class380.field5483[var8];
               if (var11 != null) {
                  class81.field1061 = arg1;
                  class600.field8819 = 2;
                  class618.field9107 = 0;
                  ++class371.field5389;
                  class481.field6892 = arg2;
                  class447 var12 = class40.method350(class470.field6751, class430.field6150.field106, true);
                  var12.field6359.method1190(-9720, var8);
                  var12.field6359.method1165(128, class195.field2767.method1779(82, -101) ? 1 : 0);
                  class430.field6150.method55(13256, var12);
                  class53.method418(true, var11.method972(-1), var11.method972(-1), var11.field3888[0], var11.field3884[0], 0, (byte)106, -2, 0);
               }
            }

            if (var7 == 17) {
               class529 var13 = (class529)class328.field4479.method329((byte)-23, (long)var8);
               if (var13 != null) {
                  class600.field8819 = 2;
                  class481.field6892 = arg2;
                  class81.field1061 = arg1;
                  class618.field9107 = 0;
                  class506 var14 = var13.field7559;
                  ++class42.field584;
                  class447 var15 = class40.method350(class436.field6246, class430.field6150.field106, true);
                  var15.field6359.method1185(var8, true);
                  var15.field6359.method1186(!class195.field2767.method1779(82, -101) ? 0 : 1, 0);
                  class430.field6150.method55(13256, var15);
                  class53.method418(true, var14.method972(-1), var14.method972(-1), var14.field3888[0], var14.field3884[0], 0, (byte)69, -2, 0);
               }
            }

            if (var7 == 57) {
               class121 var16 = class380.field5483[var8];
               if (var16 != null) {
                  class618.field9107 = 0;
                  class600.field8819 = 2;
                  class81.field1061 = arg1;
                  class481.field6892 = arg2;
                  ++class128.field1631;
                  class447 var17 = class40.method350(class491.field7024, class430.field6150.field106, true);
                  var17.field6359.method1190(-9720, var8);
                  var17.field6359.method1200(!class195.field2767.method1779(82, -101) ? 0 : 1, -12649);
                  class430.field6150.method55(13256, var17);
                  class53.method418(true, var16.method972(-1), var16.method972(-1), var16.field3888[0], var16.field3884[0], 0, (byte)41, -2, 0);
               }
            }

            if (~var7 == -53) {
               class481.field6892 = arg2;
               ++class521.field7492;
               class618.field9107 = 0;
               class600.field8819 = 2;
               class81.field1061 = arg1;
               class447 var18 = class40.method350(class388.field5628, class430.field6150.field106, true);
               var18.field6359.method1183(-637822779, !class195.field2767.method1779(82, -101) ? 0 : 1);
               var18.field6359.method1185(class672.field9740 + var5, true);
               var18.field6359.method1155(class533.field7595 + var6, (byte)42);
               var18.field6359.method1163((byte)77, (int)(var9 >>> 32) & Integer.MAX_VALUE);
               class430.field6150.method55(13256, var18);
               class444.method3262(var9, var6, var5, -3);
            }

            if (var7 == 23) {
               class121 var19 = class380.field5483[var8];
               if (var19 != null) {
                  class600.field8819 = 2;
                  class618.field9107 = 0;
                  class481.field6892 = arg2;
                  ++class746.field10942;
                  class81.field1061 = arg1;
                  class447 var20 = class40.method350(class110.field1386, class430.field6150.field106, true);
                  var20.field6359.method1183(-637822779, class195.field2767.method1779(82, -101) ? 1 : 0);
                  var20.field6359.method1185(var8, true);
                  class430.field6150.method55(13256, var20);
                  class53.method418(true, var19.method972(-1), var19.method972(-1), var19.field3888[0], var19.field3884[0], 0, (byte)52, -2, 0);
               }
            }

            if (var7 == 22) {
               class529 var21 = (class529)class328.field4479.method329((byte)-116, (long)var8);
               if (var21 != null) {
                  class81.field1061 = arg1;
                  class481.field6892 = arg2;
                  class600.field8819 = 2;
                  class506 var22 = var21.field7559;
                  ++class528.field7553;
                  class618.field9107 = 0;
                  class447 var23 = class40.method350(class435.field6228, class430.field6150.field106, true);
                  var23.field6359.method1155(var8, (byte)10);
                  var23.field6359.method1183(-637822779, class195.field2767.method1779(82, -101) ? 1 : 0);
                  class430.field6150.method55(13256, var23);
                  class53.method418(true, var22.method972(-1), var22.method972(-1), var22.field3888[0], var22.field3884[0], 0, (byte)109, -2, 0);
               }
            }

            if (~var7 == -3) {
               class678 var24 = class504.method3657(-128, var5, var6);
               if (var24 != null) {
                  class529.method3823(var24, 15716);
               }
            }

            if (~var7 == -61) {
               class600.field8819 = 2;
               class618.field9107 = 0;
               class481.field6892 = arg2;
               class81.field1061 = arg1;
               ++class237.field3297;
               class447 var25 = class40.method350(class194.field2755, class430.field6150.field106, true);
               var25.field6359.method1190(-9720, Integer.MAX_VALUE & (int)(var9 >>> 32));
               var25.field6359.method1185(class672.field9740 + var5, true);
               var25.field6359.method1200(class195.field2767.method1779(82, -101) ? 1 : 0, -12649);
               var25.field6359.method1185(class533.field7595 + var6, true);
               class430.field6150.method55(13256, var25);
               class444.method3262(var9, var6, var5, -3);
            }

            if (~var7 == -6) {
               class121 var26 = class380.field5483[var8];
               if (var26 != null) {
                  class618.field9107 = 0;
                  class81.field1061 = arg1;
                  class481.field6892 = arg2;
                  ++class241.field3353;
                  class600.field8819 = 2;
                  class447 var27 = class40.method350(class538.field7677, class430.field6150.field106, true);
                  var27.field6359.method1185(var8, true);
                  var27.field6359.method1186(class195.field2767.method1779(82, -101) ? 1 : 0, 0);
                  class430.field6150.method55(13256, var27);
                  class53.method418(true, var26.method972(-1), var26.method972(-1), var26.field3888[0], var26.field3884[0], 0, (byte)-108, -2, 0);
               }
            }

            if (~var7 == -50) {
               class481.field6892 = arg2;
               ++class484.field6919;
               class81.field1061 = arg1;
               class600.field8819 = 1;
               class618.field9107 = 0;
               class447 var28 = class40.method350(class549.field7859, class430.field6150.field106, true);
               var28.field6359.method1197(-431142104, class535.field7636);
               var28.field6359.method1185(class672.field9740 - -var5, true);
               var28.field6359.method1163((byte)114, class533.field7595 + var6);
               var28.field6359.method1155(class573.field8327, (byte)-125);
               var28.field6359.method1163((byte)113, class732.field10714);
               class430.field6150.method55(13256, var28);
               class53.method418(true, 1, 1, var5, var6, 0, (byte)50, -4, 0);
            }

            if (~var7 == -26 && class602.field8848 == null) {
               class784.method5649(0, var6, var5);
               class602.field8848 = class504.method3657(-84, var5, var6);
               class743.method5384(class602.field8848, (byte)-19);
            }

            if (~var7 == -5) {
               label472: {
                  if (~class295.field4073 < -1 && class195.field2767.method1779(82, -101) && class195.field2767.method1779(81, -101)) {
                     class229.method1783(class672.field9740 + var5, class533.field7595 - -var6, class564.field8045.field10701, true);
                     if (!var4) {
                        break label472;
                     }
                  }

                  class447 var29;
                  label438: {
                     var29 = class624.method4534(-3320, var5, var8, var6);
                     if (~var8 != -2) {
                        class481.field6892 = arg2;
                        class600.field8819 = 1;
                        class81.field1061 = arg1;
                        class618.field9107 = 0;
                        if (!var4) {
                           break label438;
                        }
                     }

                     var29.field6359.method1186(-1, 0);
                     var29.field6359.method1186(-1, 0);
                     var29.field6359.method1185((int)class117.field1467, true);
                     var29.field6359.method1186(57, 0);
                     var29.field6359.method1186(class237.field3298, 0);
                     var29.field6359.method1186(class642.field9387, 0);
                     var29.field6359.method1186(89, 0);
                     var29.field6359.method1185(class564.field8045.field10694, true);
                     var29.field6359.method1185(class564.field8045.field10693, true);
                     var29.field6359.method1186(63, 0);
                  }

                  class430.field6150.method55(13256, var29);
                  class53.method418(true, 1, 1, var5, var6, 0, (byte)56, -4, 0);
               }
            }

            if (~var7 == -51) {
               class618.field9107 = 0;
               ++class29.field428;
               class600.field8819 = 2;
               class81.field1061 = arg1;
               class481.field6892 = arg2;
               class447 var30 = class40.method350(class606.field8900, class430.field6150.field106, true);
               var30.field6359.method1190(-9720, class533.field7595 + var6);
               var30.field6359.method1165(128, !class195.field2767.method1779(82, -101) ? 0 : 1);
               var30.field6359.method1190(-9720, Integer.MAX_VALUE & (int)(var9 >>> 32));
               var30.field6359.method1190(-9720, class672.field9740 + var5);
               class430.field6150.method55(13256, var30);
               class444.method3262(var9, var6, var5, -3);
            }

            if (arg3 <= -59) {
               if (var7 == 19) {
                  class121 var31 = class380.field5483[var8];
                  if (var31 != null) {
                     class600.field8819 = 2;
                     class618.field9107 = 0;
                     ++class176.field2430;
                     class81.field1061 = arg1;
                     class481.field6892 = arg2;
                     class447 var32 = class40.method350(class636.field9305, class430.field6150.field106, true);
                     var32.field6359.method1163((byte)98, var8);
                     var32.field6359.method1200(!class195.field2767.method1779(82, -101) ? 0 : 1, -12649);
                     class430.field6150.method55(13256, var32);
                     class53.method418(true, var31.method972(-1), var31.method972(-1), var31.field3888[0], var31.field3884[0], 0, (byte)59, -2, 0);
                  }
               }

               if (~var7 == -16) {
                  class678 var33 = class504.method3657(-82, var5, var6);
                  if (var33 != null) {
                     class763.method5535(-1);
                     class287 var34 = client.method2351(var33);
                     class675.method4907(var34.method2167((byte)-111), var33, var34.field3969, false);
                     class198.field2816 = class352.method2567(var33, 2);
                     if (class198.field2816 == null) {
                        class198.field2816 = field10509[11];
                     }

                     class37.field523 = var33.field9861 + field10509[10];
                  }

               } else {
                  if (var7 == 13) {
                     class529 var35 = (class529)class328.field4479.method329((byte)106, (long)var8);
                     if (var35 != null) {
                        class81.field1061 = arg1;
                        class618.field9107 = 0;
                        ++class783.field11473;
                        class481.field6892 = arg2;
                        class506 var36 = var35.field7559;
                        class600.field8819 = 2;
                        class447 var37 = class40.method350(class525.field7525, class430.field6150.field106, true);
                        var37.field6359.method1165(128, class195.field2767.method1779(82, -101) ? 1 : 0);
                        var37.field6359.method1163((byte)97, var8);
                        class430.field6150.method55(13256, var37);
                        class53.method418(true, var36.method972(-1), var36.method972(-1), var36.field3888[0], var36.field3884[0], 0, (byte)73, -2, 0);
                     }
                  }

                  if (~var7 == -49 || var7 == 1006) {
                     class123.method992(var8, var5, -19390, var6, arg0.field471);
                  }

                  if (~var7 == -1012 || var7 == 1007 || var7 == 1008 || var7 == 1001 || ~var7 == -1004) {
                     class616.method4476(var8, var7, (byte)-108, var5);
                  }

                  if (var7 == 18) {
                     class121 var38 = class380.field5483[var8];
                     if (var38 != null) {
                        class618.field9107 = 0;
                        class81.field1061 = arg1;
                        class481.field6892 = arg2;
                        ++class727.field10637;
                        class600.field8819 = 2;
                        class447 var39 = class40.method350(class583.field8641, class430.field6150.field106, true);
                        var39.field6359.method1155(var8, (byte)4);
                        var39.field6359.method1200(!class195.field2767.method1779(82, -101) ? 0 : 1, -12649);
                        class430.field6150.method55(13256, var39);
                        class53.method418(true, var38.method972(-1), var38.method972(-1), var38.field3888[0], var38.field3884[0], 0, (byte)-121, -2, 0);
                     }
                  }

                  if (var7 == 16) {
                     ++class460.field6622;
                     class81.field1061 = arg1;
                     class600.field8819 = 2;
                     class481.field6892 = arg2;
                     class618.field9107 = 0;
                     class447 var40 = class40.method350(class452.field6402, class430.field6150.field106, true);
                     var40.field6359.method1172(-29898, class535.field7636);
                     var40.field6359.method1185(Integer.MAX_VALUE & (int)(var9 >>> 32), true);
                     var40.field6359.method1155(var6 - -class533.field7595, (byte)114);
                     var40.field6359.method1190(-9720, class573.field8327);
                     var40.field6359.method1190(-9720, class732.field10714);
                     var40.field6359.method1185(class672.field9740 + var5, true);
                     var40.field6359.method1183(-637822779, !class195.field2767.method1779(82, -101) ? 0 : 1);
                     class430.field6150.method55(13256, var40);
                     class444.method3262(var9, var6, var5, -3);
                  }

                  if (var7 == 1009) {
                     class481.field6892 = arg2;
                     class600.field8819 = 2;
                     class618.field9107 = 0;
                     ++class595.field8755;
                     class81.field1061 = arg1;
                     class447 var41 = class40.method350(class738.field10776, class430.field6150.field106, true);
                     var41.field6359.method1185(class533.field7595 + var6, true);
                     var41.field6359.method1200(class195.field2767.method1779(82, -101) ? 1 : 0, -12649);
                     var41.field6359.method1190(-9720, (int)(var9 >>> 32) & Integer.MAX_VALUE);
                     var41.field6359.method1163((byte)-106, class672.field9740 + var5);
                     class430.field6150.method55(13256, var41);
                     class444.method3262(var9, var6, var5, -3);
                  }

                  if (~var7 == -12) {
                     label539: {
                        if (class295.field4073 <= 0 || !class195.field2767.method1779(82, -101) || !class195.field2767.method1779(81, -101)) {
                           ++class655.field9585;
                           class81.field1061 = arg1;
                           class481.field6892 = arg2;
                           class600.field8819 = 1;
                           class618.field9107 = 0;
                           class447 var42 = class40.method350(class534.field7605, class430.field6150.field106, true);
                           var42.field6359.method1163((byte)52, class672.field9740 + var5);
                           var42.field6359.method1190(-9720, class533.field7595 + var6);
                           class430.field6150.method55(13256, var42);
                           if (!var4) {
                              break label539;
                           }
                        }

                        class229.method1783(class672.field9740 + var5, class533.field7595 - -var6, class564.field8045.field10701, true);
                     }
                  }

                  if (~var7 == -1011) {
                     class618.field9107 = 0;
                     ++class23.field262;
                     class81.field1061 = arg1;
                     class600.field8819 = 2;
                     class481.field6892 = arg2;
                     class447 var43 = class40.method350(class497.field7207, class430.field6150.field106, true);
                     var43.field6359.method1185(var8, true);
                     class430.field6150.method55(13256, var43);
                  }

                  if (~var7 == -47) {
                     class618.field9107 = 0;
                     class600.field8819 = 2;
                     ++class100.field1279;
                     class481.field6892 = arg2;
                     class81.field1061 = arg1;
                     class447 var44 = class40.method350(class138.field1767, class430.field6150.field106, true);
                     var44.field6359.method1183(-637822779, class195.field2767.method1779(82, -101) ? 1 : 0);
                     var44.field6359.method1155(Integer.MAX_VALUE & (int)(var9 >>> 32), (byte)-118);
                     var44.field6359.method1155(var6 - -class533.field7595, (byte)51);
                     var44.field6359.method1163((byte)-100, class672.field9740 + var5);
                     class430.field6150.method55(13256, var44);
                     class444.method3262(var9, var6, var5, -3);
                  }

                  if (var7 == 44) {
                     class121 var45 = class380.field5483[var8];
                     if (var45 != null) {
                        ++class179.field2474;
                        class81.field1061 = arg1;
                        class481.field6892 = arg2;
                        class618.field9107 = 0;
                        class600.field8819 = 2;
                        class447 var46 = class40.method350(class121.field1536, class430.field6150.field106, true);
                        var46.field6359.method1165(128, !class195.field2767.method1779(82, -101) ? 0 : 1);
                        var46.field6359.method1155(var8, (byte)105);
                        class430.field6150.method55(13256, var46);
                        class53.method418(true, var45.method972(-1), var45.method972(-1), var45.field3888[0], var45.field3884[0], 0, (byte)-96, -2, 0);
                     }
                  }

                  if (~var7 == -11) {
                     class121 var47 = class380.field5483[var8];
                     if (var47 != null) {
                        class481.field6892 = arg2;
                        class618.field9107 = 0;
                        ++class610.field8963;
                        class600.field8819 = 2;
                        class81.field1061 = arg1;
                        class447 var48 = class40.method350(class695.field10200, class430.field6150.field106, true);
                        var48.field6359.method1165(128, class195.field2767.method1779(82, -101) ? 1 : 0);
                        var48.field6359.method1190(-9720, var8);
                        class430.field6150.method55(13256, var48);
                        class53.method418(true, var47.method972(-1), var47.method972(-1), var47.field3888[0], var47.field3884[0], 0, (byte)90, -2, 0);
                     }
                  }

                  if (var7 == 8) {
                     class121 var49 = class380.field5483[var8];
                     if (var49 != null) {
                        class481.field6892 = arg2;
                        class81.field1061 = arg1;
                        class618.field9107 = 0;
                        ++class668.field9713;
                        class600.field8819 = 2;
                        class447 var50 = class40.method350(class397.field5731, class430.field6150.field106, true);
                        var50.field6359.method1185(var8, true);
                        var50.field6359.method1183(-637822779, !class195.field2767.method1779(82, -101) ? 0 : 1);
                        var50.field6359.method1190(-9720, class573.field8327);
                        var50.field6359.method1172(-29898, class535.field7636);
                        var50.field6359.method1155(class732.field10714, (byte)3);
                        class430.field6150.method55(13256, var50);
                        class53.method418(true, var49.method972(-1), var49.method972(-1), var49.field3888[0], var49.field3884[0], 0, (byte)-114, -2, 0);
                     }
                  }

                  if (var7 == 20) {
                     class529 var51 = (class529)class328.field4479.method329((byte)108, (long)var8);
                     if (var51 != null) {
                        class600.field8819 = 2;
                        class481.field6892 = arg2;
                        class506 var52 = var51.field7559;
                        class618.field9107 = 0;
                        ++class80.field1037;
                        class81.field1061 = arg1;
                        class447 var53 = class40.method350(class613.field9013, class430.field6150.field106, true);
                        var53.field6359.method1163((byte)75, var8);
                        var53.field6359.method1200(!class195.field2767.method1779(82, -101) ? 0 : 1, -12649);
                        class430.field6150.method55(13256, var53);
                        class53.method418(true, var52.method972(-1), var52.method972(-1), var52.field3888[0], var52.field3884[0], 0, (byte)-99, -2, 0);
                     }
                  }

                  if (~var7 == -10) {
                     class529 var54 = (class529)class328.field4479.method329((byte)98, (long)var8);
                     if (var54 != null) {
                        class506 var55 = var54.field7559;
                        class81.field1061 = arg1;
                        class618.field9107 = 0;
                        class600.field8819 = 2;
                        ++class358.field4833;
                        class481.field6892 = arg2;
                        class447 var56 = class40.method350(class713.field10397, class430.field6150.field106, true);
                        var56.field6359.method1165(128, !class195.field2767.method1779(82, -101) ? 0 : 1);
                        var56.field6359.method1190(-9720, var8);
                        var56.field6359.method1185(class732.field10714, true);
                        var56.field6359.method1163((byte)-116, class573.field8327);
                        var56.field6359.method1141(-16271, class535.field7636);
                        class430.field6150.method55(13256, var56);
                        class53.method418(true, var55.method972(-1), var55.method972(-1), var55.field3888[0], var55.field3884[0], 0, (byte)31, -2, 0);
                     }
                  }

                  if (var7 == 51) {
                     class481.field6892 = arg2;
                     class81.field1061 = arg1;
                     class618.field9107 = 0;
                     class600.field8819 = 2;
                     ++class776.field11381;
                     class447 var57 = class40.method350(class421.field6019, class430.field6150.field106, true);
                     var57.field6359.method1183(-637822779, class195.field2767.method1779(82, -101) ? 1 : 0);
                     var57.field6359.method1163((byte)99, class533.field7595 + var6);
                     var57.field6359.method1155(var8, (byte)-124);
                     var57.field6359.method1185(var5 - -class672.field9740, true);
                     class430.field6150.method55(13256, var57);
                     class158.method1324(var5, 2303, var6);
                  }

                  if (var7 == 3) {
                     class618.field9107 = 0;
                     class481.field6892 = arg2;
                     class81.field1061 = arg1;
                     class600.field8819 = 2;
                     ++class271.field3740;
                     class447 var58 = class40.method350(class754.field11173, class430.field6150.field106, true);
                     var58.field6359.method1200(class195.field2767.method1779(82, -101) ? 1 : 0, -12649);
                     var58.field6359.method1185(class533.field7595 + var6, true);
                     var58.field6359.method1155(var8, (byte)76);
                     var58.field6359.method1190(-9720, var5 - -class672.field9740);
                     class430.field6150.method55(13256, var58);
                     class158.method1324(var5, 2303, var6);
                  }

                  if (var7 == 58) {
                     class618.field9107 = 0;
                     class81.field1061 = arg1;
                     ++class668.field9713;
                     class481.field6892 = arg2;
                     class600.field8819 = 2;
                     class447 var59 = class40.method350(class397.field5731, class430.field6150.field106, true);
                     var59.field6359.method1185(class564.field8045.field3862, true);
                     var59.field6359.method1183(-637822779, !class195.field2767.method1779(82, -101) ? 0 : 1);
                     var59.field6359.method1190(-9720, class573.field8327);
                     var59.field6359.method1172(-29898, class535.field7636);
                     var59.field6359.method1155(class732.field10714, (byte)41);
                     class430.field6150.method55(13256, var59);
                  }

                  if (var7 == 53) {
                     class81.field1061 = arg1;
                     class618.field9107 = 0;
                     ++class470.field6746;
                     class600.field8819 = 2;
                     class481.field6892 = arg2;
                     class447 var60 = class40.method350(class132.field1697, class430.field6150.field106, true);
                     var60.field6359.method1163((byte)-99, var8);
                     var60.field6359.method1165(128, !class195.field2767.method1779(82, -101) ? 0 : 1);
                     var60.field6359.method1163((byte)66, var6 - -class533.field7595);
                     var60.field6359.method1190(-9720, class672.field9740 + var5);
                     class430.field6150.method55(13256, var60);
                     class158.method1324(var5, 2303, var6);
                  }

                  if (var7 == 1002) {
                     class481.field6892 = arg2;
                     class81.field1061 = arg1;
                     class600.field8819 = 2;
                     ++class76.field954;
                     class618.field9107 = 0;
                     class447 var61 = class40.method350(class377.field5446, class430.field6150.field106, true);
                     var61.field6359.method1185(var8, true);
                     class430.field6150.method55(13256, var61);
                  }

                  if (var7 == 59) {
                     ++class157.field2237;
                     class600.field8819 = 2;
                     class618.field9107 = 0;
                     class481.field6892 = arg2;
                     class81.field1061 = arg1;
                     class447 var62 = class40.method350(class60.field737, class430.field6150.field106, true);
                     var62.field6359.method1163((byte)52, var8);
                     var62.field6359.method1190(-9720, var6 - -class533.field7595);
                     var62.field6359.method1163((byte)-94, class672.field9740 + var5);
                     var62.field6359.method1186(!class195.field2767.method1779(82, -101) ? 0 : 1, 0);
                     class430.field6150.method55(13256, var62);
                     class158.method1324(var5, 2303, var6);
                  }

                  if (var7 == 1004) {
                     class481.field6892 = arg2;
                     class600.field8819 = 2;
                     class81.field1061 = arg1;
                     class618.field9107 = 0;
                     class529 var63 = (class529)class328.field4479.method329((byte)116, (long)var8);
                     if (var63 != null) {
                        class506 var64 = var63.field7559;
                        class745 var65 = var64.field7333;
                        if (var65.field10912 != null) {
                           var65 = var65.method5405(class21.field248, 116);
                        }

                        if (var65 != null) {
                           ++class194.field2745;
                           class447 var66 = class40.method350(class125.field1619, class430.field6150.field106, true);
                           var66.field6359.method1185(var65.field10873, true);
                           class430.field6150.method55(13256, var66);
                        }
                     }
                  }

                  if (var7 == 47) {
                     class618.field9107 = 0;
                     class81.field1061 = arg1;
                     ++class169.field2363;
                     class481.field6892 = arg2;
                     class600.field8819 = 2;
                     class447 var67 = class40.method350(class545.field7816, class430.field6150.field106, true);
                     var67.field6359.method1185(var6 - -class533.field7595, true);
                     var67.field6359.method1155(class672.field9740 + var5, (byte)43);
                     var67.field6359.method1183(-637822779, !class195.field2767.method1779(82, -101) ? 0 : 1);
                     var67.field6359.method1190(-9720, var8);
                     class430.field6150.method55(13256, var67);
                     class158.method1324(var5, 2303, var6);
                  }

                  if (~var7 == -46) {
                     class81.field1061 = arg1;
                     class618.field9107 = 0;
                     class481.field6892 = arg2;
                     class600.field8819 = 2;
                     ++class648.field9462;
                     class447 var68 = class40.method350(class267.field3709, class430.field6150.field106, true);
                     var68.field6359.method1190(-9720, class732.field10714);
                     var68.field6359.method1190(-9720, class672.field9740 + var5);
                     var68.field6359.method1190(-9720, class573.field8327);
                     var68.field6359.method1155(var6 - -class533.field7595, (byte)-124);
                     var68.field6359.method1183(-637822779, !class195.field2767.method1779(82, -101) ? 0 : 1);
                     var68.field6359.method1155(var8, (byte)-124);
                     var68.field6359.method1172(-29898, class535.field7636);
                     class430.field6150.method55(13256, var68);
                     class158.method1324(var5, 2303, var6);
                  }

                  if (~var7 == -13) {
                     class121 var69 = class380.field5483[var8];
                     if (var69 != null) {
                        ++class179.field2474;
                        class481.field6892 = arg2;
                        class618.field9107 = 0;
                        class81.field1061 = arg1;
                        class600.field8819 = 2;
                        class447 var70 = class40.method350(class491.field7032, class430.field6150.field106, true);
                        var70.field6359.method1186(class195.field2767.method1779(82, -101) ? 1 : 0, 0);
                        var70.field6359.method1163((byte)127, var8);
                        class430.field6150.method55(13256, var70);
                        class53.method418(true, var69.method972(-1), var69.method972(-1), var69.field3888[0], var69.field3884[0], 0, (byte)-84, -2, 0);
                     }
                  }

                  if (~var7 == -22) {
                     class529 var71 = (class529)class328.field4479.method329((byte)-107, (long)var8);
                     if (var71 != null) {
                        class481.field6892 = arg2;
                        class600.field8819 = 2;
                        class506 var72 = var71.field7559;
                        class618.field9107 = 0;
                        class81.field1061 = arg1;
                        ++class222.field3161;
                        class447 var73 = class40.method350(class55.field681, class430.field6150.field106, true);
                        var73.field6359.method1190(-9720, var8);
                        var73.field6359.method1200(class195.field2767.method1779(82, -101) ? 1 : 0, -12649);
                        class430.field6150.method55(13256, var73);
                        class53.method418(true, var72.method972(-1), var72.method972(-1), var72.field3888[0], var72.field3884[0], 0, (byte)-105, -2, 0);
                     }
                  }

                  if (~var7 == -7) {
                     class121 var74 = class380.field5483[var8];
                     if (var74 != null) {
                        class600.field8819 = 2;
                        class81.field1061 = arg1;
                        class481.field6892 = arg2;
                        ++class179.field2474;
                        class618.field9107 = 0;
                        class447 var75 = class40.method350(class94.field1222, class430.field6150.field106, true);
                        var75.field6359.method1185(var8, true);
                        var75.field6359.method1183(-637822779, !class195.field2767.method1779(82, -101) ? 0 : 1);
                        class430.field6150.method55(13256, var75);
                        class53.method418(true, var74.method972(-1), var74.method972(-1), var74.field3888[0], var74.field3884[0], 0, (byte)86, -2, 0);
                     }
                  }

                  if (class613.field9015) {
                     class763.method5535(-1);
                  }

                  if (class490.field7019 != null && ~class39.field558 == -1) {
                     class743.method5384(class490.field7019, (byte)-93);
                  }
               }
            }
         }
      } catch (RuntimeException var77) {
         throw class237.method1823(var77, field10509[9] + (arg0 != null ? field10509[2] : field10509[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5230(int arg0) {
      try {
         field10493 = null;
         field10506 = null;
         field10508 = null;
         if (arg0 != -21685) {
            field10508 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10509[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method5231(int arg0, int arg1, int arg2) {
      try {
         OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, arg0, this.field10497);
         ++field10502;
         this.field10500 = arg2;
         this.field10503 = arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10509[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1678(int arg0) {
      try {
         ++field10498;
         OpenGL.glFramebufferRenderbufferEXT(this.field10500, this.field10503, 36161, arg0);
         this.field10503 = -1;
         this.field10500 = -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10509[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field10492;
         this.method5228((byte)121);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10509[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(Ljava/lang/String;Laa;ILru;Lda;IIIIIILbl;)V"
   )
   public static final void method5232(String arg0, class515 arg1, int arg2, class206 arg3, class67 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class678 arg11) {
      try {
         int var12;
         label67: {
            ++field10494;
            if (class380.field5481 != 4) {
               var12 = (int)class117.field1467 + class237.field3298 & 16383;
               if (!client.field4360) {
                  break label67;
               }
            }

            var12 = 16383 & (int)class117.field1467;
         }

         int var13 = Math.max(arg11.field9904 / 2, arg11.field9980 / 2) - -10;
         int var14 = arg2 * arg2 - -(arg8 * arg8);
         if (var14 <= var13 * var13) {
            int var15 = class363.field4956[var12];
            int var16 = class363.field4987[var12];
            if (~class380.field5481 != -5) {
               var16 = var16 * 256 / (class642.field9387 + 256);
               var15 = var15 * 256 / (class642.field9387 - -256);
            }

            int var17 = arg2 * var16 + arg8 * var15 >> 14;
            int var18 = arg8 * var16 + -(arg2 * var15) >> 14;
            if (arg9 > 8) {
               int var19 = arg3.method1630((byte)-84, arg0, 100, (class492[])null);
               int var20 = var17 - var19 / 2;
               int var21 = arg3.method1637(arg0, -1, 0, 100, (class492[])null);
               if (~(-arg11.field9904) >= ~var20 && ~arg11.field9904 <= ~var20 && ~var18 <= ~(-arg11.field9980) && ~arg11.field9980 <= ~var18) {
                  arg4.method626(0, arg7 - (var18 + var21) + arg11.field9980 / 2 + -arg5, var19, 50, arg6, arg1, 0, (int[])null, 0, arg11.field9904 / 2 + var20 + arg6, 0, arg10, arg7, 1, (class492[])null, arg0);
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field10509[5] + (arg0 != null ? field10509[2] : field10509[3]) + ',' + (arg1 != null ? field10509[2] : field10509[3]) + ',' + arg2 + ',' + (arg3 != null ? field10509[2] : field10509[3]) + ',' + (arg4 != null ? field10509[2] : field10509[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field10509[2] : field10509[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "<init>",
      descriptor = "(Lea;III)V"
   )
   public class719(class573 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field10504 = arg0;
         this.field10499 = arg2;
         this.field10507 = arg3;
         this.field10505 = arg1;
         OpenGL.glGenRenderbuffersEXT(1, class118.field1474, 0);
         this.field10497 = class118.field1474[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field10497);
         OpenGL.glRenderbufferStorageEXT(36161, this.field10505, this.field10499, this.field10507);
         this.field10496 = this.field10507 * this.field10499 * this.field10504.method4111(this.field10505, false);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10509[1] + (arg0 != null ? field10509[2] : field10509[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "<init>",
      descriptor = "(Lea;IIII)V"
   )
   public class719(class573 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field10499 = arg2;
         this.field10507 = arg3;
         this.field10504 = arg0;
         this.field10505 = arg1;
         OpenGL.glGenRenderbuffersEXT(1, class118.field1474, 0);
         this.field10497 = class118.field1474[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field10497);
         OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field10505, this.field10499, this.field10507);
         this.field10496 = this.field10507 * this.field10499 * this.field10504.method4111(this.field10505, false);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10509[1] + (arg0 != null ? field10509[2] : field10509[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5233(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5234(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
