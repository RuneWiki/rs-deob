import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class260 extends class557 {
   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3990 = new String[]{method2234(method2233("sMk\u0018\u0007")), method2234(method2233("sMk\u0016\u0007")), method2234(method2233("sMk\u0015\u0007")), method2234(method2233("]Y 3DvE\"rAz\\e1@qE 1[vD+!\u000fyD7r\u001a?X 1@qO6")), method2234(method2233("~^1=\u000fhD7>K?X >J|_ 6")), method2234(method2233("}Y 3D|D+")), method2234(method2233("}G*=B")), method2234(method2233("iJ7\"Mv_x")), method2234(method2233("IN7h\u000f")), method2234(method2233("xH")), method2234(method2233("g\u0011")), method2234(method2233("MN''FsO,<H?F$\"\u000f7\\,&G?[7=IvG,<H6")), method2234(method2233("SB' NmB !\u000fjE)=N{N!")), method2234(method2233("k@w")), method2234(method2233("|D)?No\u000b,!\u000flC*%A")), method2234(method2233("mN''FsO5 @yB)7")), method2234(method2233("hFtrI~B)7K")), method2234(method2233("Ri")), method2234(method2233("xN1%@mG!")), method2234(method2233("lH73B}G $NmH6")), method2234(method2233("xN11NrN73_pX")), method2234(method2233("[Y*\"_zOe!Jm]  \u000fuXprAz_e#Zz^ ")), method2234(method2233("VE33CvOe J|_\u001a6J}^\"rY~G07")), method2234(method2233("xN11CvN+&Y~Y5")), method2234(method2233("oN7?\u000fiJ71\\?X& NrI)7K")), method2234(method2233("YD71J{\u000b1%JzE,<H?O,!N}G 6\u0001")), method2234(method2233("pY1:@kB)7\\vQ r")), method2234(method2233("YJ,>J{\u000b1=\u000fzE17]?_.c")), method2234(method2233("ZE17]zOe&D,")), method2234(method2233("[\u0018\u0001r[pD)9Fk\u0011er")), method2234(method2233("|G6r\u0002?h)7Nm\u000b&=AlD)7")), method2234(method2233("|D)?No\u000b,!\u000fwB!6Jq")), method2234(method2233("xN1:JvL-&")), method2234(method2233("\\D(\"Cz_ |\u000fKD*>Dv_e<@h\u0011e")), method2234(method2233("|G6")), method2234(method2233("lC*%_mD#;CvE\"o")), method2234(method2233("YD71J{\u000b1%JzE,<H?n\u000b\u0013mSn\u0001s")), method2234(method2233("m[")), method2234(method2233("qD+\"Ll\u0016")), method2234(method2233("yB)7\u000f~G77N{Re7WvX1!\u000e")), method2234(method2233("wN$\"")), method2234(method2233("h\u0019!7MjL")), method2234(method2233("|Xw6J}^\"h\u000f7")), method2234(method2233("rN(o")), method2234(method2233("Y{\u0016r@yM")), method2234(method2233("|X5 @yB)7@j_5'[k")), method2234(method2233("\\J+<@k\u000b2 FkNe&@?")), method2234(method2233("PH&>\\vD+rAp\\e=Iy\n")), method2234(method2233("pX")), method2234(method2233("QDe!Z|Ce4FsN")), method2234(method2233("mN67[|J&:J")), method2234(method2233("?c ;Hw_\u007fr")), method2234(method2233("IN+6@m\u0011e")), method2234(method2233("qD+\"Ll")), method2234(method2233("sMk\u0013\u0007")), method2234(method2233("iJ7\"\u0012")), method2234(method2233("V\u0003({\u0015?")), method2234(method2233("|D(\"N|_")), method2234(method2233("|X5 @yB)7LsN$ ")), method2234(method2233("[Y*\"_zOe1CvN+&\u000f|D+<J|_,=A")), method2234(method2233("|X5 @yB)7@j_5'[|")), method2234(method2233("oY*4FsN&\"Z")), method2234(method2233("UJ33\u000fkD*>Dv_\u007fr")), method2234(method2233("Lx\u0000r[pD)9Fk\u0011er")), method2234(method2233("|G*!Jp^1\"Zk")), method2234(method2233("pH&>Z{N")), method2234(method2233("wB!7LpG(3_")), method2234(method2233("mN67[rB+;B~[")), method2234(method2233("|J&:Jl[$1J")), method2234(method2233("|Xw6J}^\"")), method2234(method2233("SD*9\u0015?")), method2234(method2233("wN)\"")), method2234(method2233("hFvr\\jH&7J{N!")), method2234(method2233("wN$\"KjF5")), method2234(method2233("[Y,$Jm\u000b\u00137]lB*<\u0015?")), method2234(method2233("{B6\"C~R#\"\\?\u0006e\u0006@xL)7\u000fY{\u0016rNqOe=[wN7rFqM* B~_,=A")), method2234(method2233("^Y&:\u0015?")), method2234(method2233("hFtr\\jH&7J{N!")), method2234(method2233("rJ=0ZvG!3]zJx")), method2234(method2233("l@<6JkJ,>\u000f")), method2234(method2233("\\\u0011\u0019\u0006Jr[\u0019:J~[k6Zr[")), method2234(method2233("^H1;Yz\u000b6&]zJ(!\u0015?")), method2234(method2233("ZE17]zOe&D.")), method2234(method2233("mN+6JmN7")), method2234(method2233("|D(?NqO6r\u0002?\u007f-;\\?H*?B~E!")), method2234(method2233("oY,<[y[6")), method2234(method2233("k\\ 7A")), method2234(method2233("WN,5Gk\u0011e")), method2234(method2233("mN&&p{N''H")), method2234(method2233("k@p")), method2234(method2233("y[6=A")), method2234(method2233("y[6rKzI05\u000fzE$0CzO")), method2234(method2233("m^+!LmB5&\u000f")), method2234(method2233("RI")), method2234(method2233("KN=&\u000f|D* Kl\u000b&>J~Y 6")), method2234(method2233("pY1:@?_,>J?X,(J\"")), method2234(method2233("QJ(7\u0015?")), method2234(method2233("pY1:@?")), method2234(method2233("zY7=]kN6&")), method2234(method2233("YJ,>J{\u000b1=\u000f|C$<Hz\u000b* [wDe?@{N")), method2234(method2233("oN7?\u000fiJ71\\?X$$J{")), method2234(method2233("zY7=]rN6!NxN")), method2234(method2233("RN(=]f\u000b'7IpY rLsN$<Zo\u0016")), method2234(method2233("KD\"5CzOd")), method2234(method2233("RB+;B~[e JlN1")), method2234(method2233("y[6=Iy")), method2234(method2233("OD6h\u000f")), method2234(method2233("|G 3]kN=&")), method2234(method2233("lC,4[|G,1D")), method2234(method2233("YJ,>J{\u000b1=\u000fmN$6\u000fyB)7")), method2234(method2233("mN+6Jm[7=IvG ")), method2234(method2233("YJ,>J{\u000b1=\u000fzE17]?_.g")), method2234(method2233("0_(\"\u0000wN$\"\u0001{^(\"")), method2234(method2233("lR6&JrF ?")), method2234(method2233("pM#")), method2234(method2233("L^&1JlX#'CsRe1G~E\"7K?D7&Gp\u000b(=Kz")), method2234(method2233("pY1:@eD*?\u000f")), method2234(method2233("|G,\"LpF5=AzE1!\u0012")), method2234(method2233("pE")), method2234(method2233("hFv")), method2234(method2233("\\^7 Jq_e&@pG.;[?O*7\\q\f1r\\j[5=]k\u000b('CkB5>J?H* Jl")), method2234(method2233("YJ,>J{\u000b1=\u000fzE17]?_.b")), method2234(method2233("SB' NmRe'AsD$6FqLe4NvG 6\u000e")), method2234(method2233("LC,4[2H);Lt\u000b!;\\~I)7K1")), method2234(method2233("lN7$JmA6gKmD5")), method2234(method2233("WN$\"\u0015?")), method2234(method2233("q^)>")), method2234(method2233("y[6rKzI05\u000f{B63MsN!")), method2234(method2233("?Q\u007f")), method2234(method2233("h\u0011e")), method2234(method2233("RN(=]f\u000b$4[zYe1CzJ+'_\"")), method2234(method2233("sD2")), method2234(method2233("mN+6JmN7r\u0002?{7;Ak\u000b\" NoC,1\\?Y <KzY  \u000fvE#=]rJ1;@q")), method2234(method2233("oN74@mF$<Lz_ ![")), method2234(method2233("YJ,>J{\u000b1=\u000fzE$0Cz\u000b'>@pF")), method2234(method2233("eD*?\u000f")), method2234(method2233("YJ,>J{\u000b1=\u000fzE17]?_.`")), method2234(method2233("\\J&:Jl\u000b77\\z_")), method2234(method2233("hFw")), method2234(method2233("{B77LkG*5Fq")), method2234(method2233("~^1=XpY)6")), method2234(method2233("|G,7AkA6gKmD5")), method2234(method2233("pY1:@?H$?JmJe>@|@e;\\?")), method2234(method2233("wN$\"\u000f2\u000b\u0015 Fq_e8NiJe?JrD7+\u000fvE#=]rJ1;@q")), method2234(method2233("hB+")), method2234(method2233("kN=!FeN")), method2234(method2233("qJ1;Yz\u0003\b\u0002}")), method2234(method2233("|G,7AkO7=_")), method2234(method2233("[D+7")), method2234(method2233("ON74@mF$<Lz\u0011e")), method2234(method2233("lN10N")), method2234(method2233("hFvrI~B)7K")), method2234(method2233("mD13[zH*<AzH1?JkC*6\\")), method2234(method2233("pY1:@eD*?\u0012")), method2234(method2233("MN+6Jm\u000b&=]zXe<@h\u0011e")), method2234(method2233("xN11H|D* K")), method2234(method2233("lJ37Y~Y&!")), method2234(method2233("d\u0005k|R")), method2234(method2233("l@<6JkJ,>\u000fvXe")), method2234(method2233("xN11CvN+&Y~Y50Fk")), method2234(method2233("hFwr\\jH&7J{N!")), method2234(method2233("\\D0>K?E*&\u000f|Y 3[z\u000b")), method2234(method2233("k@v")), method2234(method2233("V\u00036{\u0015?")), method2234(method2233("|D(?NqO6")), method2234(method2233("l\\,&LwN!")), method2234(method2233("lE)=HvEe")), method2234(method2233("P\u00036{\u0015?")), method2234(method2233("l\\,&Lw\\* C{")), method2234(method2233("nJ\u001a=_@_ ![")), method2234(method2233("qJ1;YzF ?JmY* ")), method2234(method2233("jE)=N{E$&FiN6")), method2234(method2233("ZE17]zOe&D/")), method2234(method2233("LR6&Jr\u000b(7BpY<h\u000f")), method2234(method2233("hFt")), method2234(method2233("zE$0Cz\u000b* [wDe?@{Ne4FmX1r\u0007jX r\bpY1:@?\u0017+l\b6")), method2234(method2233("LC,4[2H);Lt\u000b\u0000\u001cn]g\u0000\u0016\u000e")), method2234(method2233("Xg\u001dr[pD)9Fk\u0011er")), method2234(method2233("|G,\"LpF5=AzE1!")), method2234(method2233("MD13[zOe1@qE 1[vD+rBz_-=Kl")), method2234(method2233("wB\":")), method2234(method2233("rX")), method2234(method2233("nJ\u001a=_@_ ![\"")), method2234(method2233("MN''FsO,<H?F$\"")), method2234(method2233("ZE17]zOe&D-")), method2234(method2233("1G*5")), method2234(method2233("mN''FsO")), method2234(method2233("y[6r")), method2234(method2233("LR+&Ng\u0011e=]kC*r\u0013q\u0015")), method2234(method2233("oH")), method2234(method2233("[Y*\"_zOe1CvN+&\u000fuXprAz_e#Zz^ ")), method2234(method2233("lC*%LpG(3_")), method2234(method2233("mN&&p{N''H\"")), method2234(method2233("lD0<Kl_77NrH*'Ak")), method2234(method2233("lN1=Zk[0&\u000f")), method2234(method2233("{B6\"C~R#\"\\")), method2234(method2233("[N3;Lz\u0011e")), method2234(method2233("ZE17]zOe&D*")), method2234(method2233("k@t")), method2234(method2233("IN7!FpE\u007fr")), method2234(method2233("hFwrI~B)7K")), method2234(method2233("VE33CvOe0ZvG!3]zJe$Ns^ ")), method2234(method2233("Y{\u0016h\u000f")), method2234(method2233("YJ,>J{\u000b1=\u000fzE17]?_.a")), method2234(method2233("pY1:@|J(>@|@")), method2234(method2233("|Xw6J}^\"h")), method2234(method2233("~^1=\\z_0\"")), method2234(method2233("PH&>\\vD+rAp\\e=A>")), method2234(method2233("]G*=B?N+3MsN!")), method2234(method2233("]G*=B?O,!N}G 6")), method2234(method2233("Y{\u0016r@q")), method2234(method2233("rH")), method2234(method2233("k@u")), method2234(method2233("Xge&@pG.;[%\u000ber")), method2234(method2233("sMk\u0014\u0007")), method2234(method2233("sMk\u0011\u0007"))};
   @OriginalMember(
      owner = "client!lf",
      name = "k",
      descriptor = "I"
   )
   public static int field3983;
   @OriginalMember(
      owner = "client!lf",
      name = "l",
      descriptor = "I"
   )
   public static int field3985;
   @OriginalMember(
      owner = "client!lf",
      name = "j",
      descriptor = "I"
   )
   public static int field3986;
   @OriginalMember(
      owner = "client!lf",
      name = "i",
      descriptor = "I"
   )
   public static int field3987;
   @OriginalMember(
      owner = "client!lf",
      name = "n",
      descriptor = "I"
   )
   public static int field3988;
   @OriginalMember(
      owner = "client!lf",
      name = "h",
      descriptor = "I"
   )
   public static int field3989;
   @OriginalMember(
      owner = "client!lf",
      name = "m",
      descriptor = "J"
   )
   public static long field3984;

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(Ljava/lang/String;IZZ)V"
   )
   public static final void method2231(String arg0, int arg1, boolean arg2, boolean arg3) {
      boolean var4 = client.field10022;

      try {
         ++field3986;

         try {
            if (arg0.equalsIgnoreCase(field3990[164]) || arg0.equalsIgnoreCase(field3990[71])) {
               class137.method1389(-116, field3990[84]);
               class137.method1389(-99, field3990[30]);
               class137.method1389(-125, field3990[75]);
               class137.method1389(-126, field3990[132]);
               class137.method1389(-125, field3990[143]);
               return;
            }

            if (arg0.equalsIgnoreCase(field3990[34])) {
               class383.field5590 = 0;
               class362.field5351 = 0;
               return;
            }

            if (arg0.equalsIgnoreCase(field3990[195])) {
               class434.field6364 = !class434.field6364;
               if (!class434.field6364) {
                  class137.method1389(-111, field3990[44]);
                  return;
               }

               class137.method1389(-99, field3990[210]);
               return;
            }

            if (arg0.equals(field3990[83])) {
               class56 var5 = class54.field794.method157();
               class137.method1389(-96, field3990[52] + var5.field804);
               class137.method1389(-95, field3990[96] + var5.field806);
               class137.method1389(-96, field3990[199] + var5.field807);
               class137.method1389(-99, field3990[196] + var5.field810);
               class137.method1389(-115, field3990[74] + var5.field808);
               return;
            }

            if (arg0.equals(field3990[40])) {
               class137.method1389(-104, field3990[125] + class654.field9274 + field3990[17]);
               return;
            }
         } catch (Exception var56) {
            class137.method1389(-105, class765.field10905.method5512(-2, class777.field11340));
            return;
         }

         if (class479.field6892 != class160.field2451 || ~class33.field489 <= -3) {
            if (arg0.equalsIgnoreCase(field3990[98])) {
               throw new RuntimeException();
            }

            if (arg0.equals(field3990[170])) {
               throw new OutOfMemoryError(field3990[146]);
            }

            try {
               label808: {
                  if (arg0.equalsIgnoreCase(field3990[85])) {
                     class137.method1389(-125, field3990[202] + class368.field5433);
                     return;
                  }

                  if (arg0.equalsIgnoreCase(field3990[65])) {
                     class66.field971 = !class66.field971;
                     if (!class66.field971) {
                        class137.method1389(-123, field3990[47]);
                        return;
                     }

                     class137.method1389(-114, field3990[207]);
                     return;
                  }

                  if (arg0.equalsIgnoreCase(field3990[90])) {
                     class434.field6364 = true;
                     class137.method1389(-100, field3990[91]);
                     return;
                  }

                  if (arg0.equalsIgnoreCase(field3990[105])) {
                     class434.field6364 = false;
                     class137.method1389(-127, field3990[127]);
                     return;
                  }

                  if (arg0.equals(field3990[113])) {
                     try {
                        class137.method1389(-108, field3990[173] + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class223.field3173.field6015 + field3990[93]);
                        return;
                     } catch (Throwable var50) {
                        return;
                     }
                  }

                  if (arg0.equalsIgnoreCase(field3990[107])) {
                     class784.field11424.method3306(0);
                     class137.method1389(-104, field3990[94]);
                     return;
                  }

                  if (!arg0.equalsIgnoreCase(field3990[9])) {
                     if (arg0.equalsIgnoreCase(field3990[57])) {
                        class776.method5605(-118);
                        int var9 = 0;
                        if (var4) {
                           System.gc();
                           ++var9;
                        }

                        while(true) {
                           while(var9 < 10) {
                              System.gc();
                              ++var9;
                           }

                           Runtime var10 = Runtime.getRuntime();
                           int var11 = (int)((var10.totalMemory() + -var10.freeMemory()) / 1024L);
                           class137.method1389(-122, field3990[102] + var11 + "k");
                           class509.method3835(1);
                           class776.method5605(-124);
                           int var12 = 0;
                           if (!var4) {
                              if (var4) {
                                 System.gc();
                                 ++var12;
                              }

                              while(true) {
                                 while(var12 < 10) {
                                    System.gc();
                                    ++var12;
                                 }

                                 int var13 = (int)((var10.totalMemory() + -var10.freeMemory()) / 1024L);
                                 class137.method1389(-125, field3990[130] + var13 + "k");
                                 if (!var4) {
                                    return;
                                 }

                                 ++var12;
                              }
                           }

                           ++var9;
                        }
                     }

                     if (arg0.equalsIgnoreCase(field3990[171])) {
                        class137.method1389(-115, !class591.method4346(119) ? field3990[122] : field3990[12]);
                        return;
                     }

                     if (arg0.equalsIgnoreCase(field3990[147])) {
                        class137.method1389(-110, field3990[59]);
                        if (class394.field5712 != 11) {
                           if (class394.field5712 == 12) {
                              class745.field10605.field3726 = true;
                              return;
                           }
                        } else {
                           class570.method4224(14);
                        }

                        return;
                     }

                     if (arg0.equalsIgnoreCase(field3990[152])) {
                        class750.field10662.method1415((byte)-111);
                        class137.method1389(-115, field3990[179]);
                        return;
                     }

                     if (arg0.equalsIgnoreCase(field3990[141])) {
                        class456.field6660.method4731(-119);
                        class137.method1389(-103, field3990[190]);
                        return;
                     }

                     if (arg0.equalsIgnoreCase(field3990[124])) {
                        class456.field6660.method4726(10089);
                        class137.method1389(-117, field3990[21]);
                        return;
                     }

                     if (!arg0.equalsIgnoreCase(field3990[5])) {
                        if (arg0.equalsIgnoreCase(field3990[186])) {
                           class411.method3213((byte)15);
                           class762.method5498(-124);
                           class137.method1389(-98, field3990[183]);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[15])) {
                           class60.field855 = class604.method4452(95);
                           class355.field5249 = true;
                           class411.method3213((byte)-104);
                           class762.method5498(-119);
                           class137.method1389(-125, field3990[11]);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[174])) {
                           class306.method2519(1, -1, (byte)-122, false, -1);
                           if (class40.method477(false) != 1) {
                              class137.method1389(-111, field3990[16]);
                              return;
                           }

                           class137.method1389(-105, field3990[77]);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[138])) {
                           class306.method2519(2, -1, (byte)-121, false, -1);
                           if (class40.method477(false) != 2) {
                              class137.method1389(-126, field3990[200]);
                              return;
                           }

                           class137.method1389(-128, field3990[160]);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[119])) {
                           class306.method2519(3, 1024, (byte)-125, false, 768);
                           if (~class40.method477(false) == -4) {
                              class137.method1389(-120, field3990[72]);
                              return;
                           }

                           class137.method1389(-104, field3990[151]);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[212])) {
                           class508.method3828(1, false, 0);
                           if (class476.field6870.field9109.method4676(-102) == 0) {
                              class137.method1389(-100, field3990[172]);
                              class476.field6870.method4707(0, false, class476.field6870.field9103);
                              class737.method5332(0);
                              class664.field9354 = false;
                              return;
                           }

                           class137.method1389(-108, field3990[121]);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[198])) {
                           class508.method3828(1, false, 1);
                           if (~class476.field6870.field9109.method4676(-102) != -2) {
                              class137.method1389(-112, field3990[27]);
                              return;
                           }

                           class137.method1389(-107, field3990[82]);
                           class476.field6870.method4707(1, false, class476.field6870.field9103);
                           class737.method5332(0);
                           class664.field9354 = false;
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[13])) {
                           class508.method3828(1, false, 2);
                           if (class476.field6870.field9109.method4676(-103) != 2) {
                              class137.method1389(-121, field3990[136]);
                              return;
                           }

                           class137.method1389(-101, field3990[184]);
                           class476.field6870.method4707(2, false, class476.field6870.field9103);
                           class737.method5332(0);
                           class664.field9354 = false;
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[162])) {
                           class508.method3828(1, false, 3);
                           if (~class476.field6870.field9109.method4676(-117) != -4) {
                              class137.method1389(-117, field3990[203]);
                              return;
                           }

                           class137.method1389(-118, field3990[28]);
                           class476.field6870.method4707(3, false, class476.field6870.field9103);
                           class737.method5332(0);
                           class664.field9354 = false;
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[89])) {
                           class508.method3828(1, false, 5);
                           if (~class476.field6870.field9109.method4676(-102) != -6) {
                              class137.method1389(-116, field3990[111]);
                              return;
                           }

                           class137.method1389(-98, field3990[197]);
                           class476.field6870.method4707(5, false, class476.field6870.field9103);
                           class737.method5332(0);
                           class664.field9354 = false;
                           return;
                        }

                        if (arg0.startsWith(field3990[150])) {
                           if (arg0.length() < 6) {
                              class137.method1389(-97, field3990[201]);
                              return;
                           }

                           int var17 = class510.method3842(arg0.substring(6), -93);
                           if (var17 >= 0 && ~class524.method3923(1, class654.field9274) <= ~var17) {
                              class476.field6870.method4707(var17, false, class476.field6870.field9150);
                              class737.method5332(0);
                              class664.field9354 = false;
                              class137.method1389(-95, field3990[78] + class476.field6870.field9150.method1776(-113));
                              return;
                           }

                           class137.method1389(-121, field3990[201]);
                           return;
                        }

                        if (arg0.startsWith(field3990[88])) {
                           if (~arg0.length() > -11) {
                              class137.method1389(-107, field3990[22]);
                              return;
                           }

                           class622.field8886 = class510.method3842(arg0.substring(10).trim(), 121);
                           class137.method1389(-123, field3990[192] + class622.field8886);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[169])) {
                           class34.field514 = true;
                           class137.method1389(-123, field3990[182] + class34.field514);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[178])) {
                           class654.field9267 = !class654.field9267;
                           class137.method1389(-107, field3990[117] + class654.field9267);
                           return;
                        }

                        if (arg0.startsWith(field3990[6])) {
                           boolean var18 = class54.field794.method237();
                           if (!class209.method1807(!var18, false)) {
                              class137.method1389(-95, field3990[134]);
                              return;
                           }

                           if (!var18) {
                              class137.method1389(-114, field3990[208]);
                              return;
                           }

                           class137.method1389(-104, field3990[209]);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[86])) {
                           if (!class561.field7982) {
                              class561.field7982 = true;
                              class137.method1389(-98, field3990[36]);
                              return;
                           }

                           class561.field7982 = false;
                           class137.method1389(-124, field3990[25]);
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[108])) {
                           if (!class233.field3613) {
                              class137.method1389(-123, field3990[176]);
                              class233.field3613 = true;
                              return;
                           }

                           class137.method1389(-115, field3990[123]);
                           class233.field3613 = false;
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[155])) {
                           class137.method1389(-99, field3990[10] + (class117.field1849.field6832 >> 9) + field3990[128] + (class117.field1849.field6833 >> 9));
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[32])) {
                           class137.method1389(-112, field3990[87] + class225.field3197[class117.field1849.field6824].method5400(-1, class117.field1849.field6833 >> 9, class117.field1849.field6832 >> 9));
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[67])) {
                           class790.field11506.method457((byte)-64);
                           class790.field11506.method438((byte)71);
                           class376.field5490.method2360(-9370);
                           class33.field467.method1753(-7404);
                           class762.method5498(-126);
                           class137.method1389(-106, field3990[104]);
                           return;
                        }

                        if (arg0.startsWith(field3990[211])) {
                           if (!class54.field794.method260()) {
                              class137.method1389(-125, field3990[120]);
                              return;
                           }

                           int var19;
                           label620: {
                              var19 = Integer.parseInt(arg0.substring(3));
                              if (~var19 > -2) {
                                 var19 = 1;
                                 if (!var4) {
                                    break label620;
                                 }
                              }

                              if (var19 > 4) {
                                 var19 = 4;
                              }
                           }

                           class88.field1320 = var19;
                           class411.method3213((byte)64);
                           class137.method1389(-97, field3990[154] + class88.field1320);
                           return;
                        }

                        if (arg0.startsWith(field3990[68])) {
                           class137.method1389(-104, field3990[163] + class196.field2827.method1049(1) + "/" + class196.field2827.method1046((byte)97));
                           class137.method1389(-108, field3990[56] + class564.field8028.method1049(1) + "/" + class564.field8028.method1046((byte)97));
                           class137.method1389(-110, field3990[167] + class201.field2882.field11284.method3740(101) + "/" + class201.field2882.field11284.method3736(-9560));
                           return;
                        }

                        if (arg0.equalsIgnoreCase(field3990[20])) {
                           class137.method1389(-107, field3990[106] + class117.field1849.field6824 + "," + ((class670.field9407 >> 9) - -class115.field1824 >> 6) + "," + ((class222.field3158 >> 9) + class480.field6903 >> 6) + "," + (63 & (class670.field9407 >> 9) + class115.field1824) + "," + ((class222.field3158 >> 9) + class480.field6903 & 63) + field3990[51] + (class478.method3658(class117.field1849.field6824, class670.field9407, class222.field3158, (byte)-20) + -class576.field8141));
                           class137.method1389(-110, field3990[70] + class117.field1849.field6824 + "," + (class494.field7054 - -class115.field1824 >> 6) + "," + (class480.field6903 + class155.field2379 >> 6) + "," + (63 & class494.field7054 - -class115.field1824) + "," + (63 & class480.field6903 + class155.field2379) + field3990[51] + (class478.method3658(class117.field1849.field6824, class494.field7054, class155.field2379, (byte)-20) + -class699.field10073));
                           return;
                        }

                        if (!arg0.equals(field3990[110]) && !arg0.equals(field3990[37])) {
                           if (arg0.startsWith(field3990[133])) {
                              int var20 = -1;
                              int var21 = 1000;
                              if (arg0.length() > 15) {
                                 String[] var22 = class757.method5467(5, arg0, ' ');

                                 try {
                                    if (~var22.length < -2) {
                                       var21 = Integer.parseInt(var22[1]);
                                    }
                                 } catch (Throwable var52) {
                                 }

                                 try {
                                    if (var22.length > 2) {
                                       var20 = Integer.parseInt(var22[2]);
                                    }
                                 } catch (Throwable var51) {
                                 }
                              }

                              if (var20 != -1) {
                                 class137.method1389(-123, field3990[149] + class635.method4642(20, var20, var21));
                                 return;
                              }

                              class137.method1389(-97, field3990[62] + class635.method4642(20, 0, var21));
                              class137.method1389(-104, field3990[63] + class635.method4642(20, 2, var21));
                              class137.method1389(-103, field3990[29] + class635.method4642(20, 3, var21));
                              class137.method1389(-127, field3990[213] + class635.method4642(20, 1, var21));
                              class137.method1389(-114, field3990[177] + class635.method4642(20, 5, var21));
                              return;
                           }

                           if (arg0.equals(field3990[53])) {
                              class769.field11031 = !class769.field11031;
                              class137.method1389(-118, field3990[38] + class769.field11031);
                              return;
                           }

                           if (arg0.equals(field3990[140])) {
                              class414.method3242((byte)-94);
                              class137.method1389(-115, field3990[4]);
                              return;
                           }

                           if (arg0.startsWith(field3990[168])) {
                              int var23 = Integer.parseInt(arg0.substring(12));
                              class14.method119(var23, 6410, class605.method4458(var23, -28137).field9024);
                              class137.method1389(-119, field3990[165]);
                              return;
                           }

                           if (arg0.equals(field3990[18])) {
                              class137.method1389(-109, field3990[129] + class750.field10662.field2262);
                              return;
                           }

                           if (arg0.startsWith(field3990[189])) {
                              class242 var24 = class735.method5318(-109);
                              class381 var25 = class801.method5775(class700.field10087, 0, var24.field3718);
                              var25.field5570.method656((byte)101, 0);
                              int var26 = var25.field5570.field945;
                              int var27 = arg0.indexOf(" ", 4);
                              var25.field5570.method658(arg0.substring(3, var27), -53);
                              class222.method1912(arg0.substring(var27), 0, var25.field5570);
                              var25.field5570.method683(var25.field5570.field945 - var26, -1);
                              var24.method2111(14024, var25);
                              return;
                           }

                           if (arg0.equals(field3990[156])) {
                              class132.method1358((byte)4);
                              class137.method1389(-110, field3990[100]);
                              return;
                           }

                           if (!arg0.equals(field3990[19])) {
                              if (arg0.equals(field3990[191])) {
                                 class29.field424 = true;
                                 class762.method5498(-104);
                                 class137.method1389(-100, field3990[14]);
                                 return;
                              }

                              if (arg0.equals(field3990[66])) {
                                 class29.field424 = false;
                                 class762.method5498(-128);
                                 class137.method1389(-112, field3990[31]);
                                 return;
                              }

                              if (arg0.equals(field3990[50])) {
                                 class372.method2915((byte)35);
                                 class137.method1389(-103, field3990[137]);
                                 return;
                              }

                              if (arg0.equals(field3990[61])) {
                                 class137.method1389(-115, class543.method4050(125) + field3990[181]);
                                 return;
                              }

                              if (arg0.startsWith(field3990[159])) {
                                 int var29 = Integer.parseInt(arg0.substring(17));
                                 class137.method1389(-98, field3990[7] + class344.field5074.method907(var29, -127));
                                 return;
                              }

                              if (arg0.startsWith(field3990[23])) {
                                 int var30 = Integer.parseInt(arg0.substring(14));
                                 class137.method1389(-115, field3990[55] + class344.field5074.method906(0, var30));
                                 return;
                              }

                              if (arg0.startsWith(field3990[139])) {
                                 String[] var31 = class757.method5467(5, arg0.substring(12), ' ');
                                 if (var31.length >= 2) {
                                    int var32 = var31.length > 2 ? Integer.parseInt(var31[2]) : 0;
                                    class188.method1683(var32, true, var31[1], var31[0]);
                                    return;
                                 }
                              }

                              if (arg0.startsWith(field3990[166])) {
                                 String[] var33 = class757.method5467(5, arg0.substring(8), ' ');
                                 int var34 = Integer.parseInt(var33[0]);
                                 int var35 = ~var33.length != -3 ? 0 : Integer.parseInt(var33[1]);
                                 class15.method128(var35, var34, (byte)56);
                                 return;
                              }

                              if (arg0.startsWith(field3990[58])) {
                                 class427.method3340();
                                 return;
                              }

                              if (arg0.startsWith(field3990[60])) {
                                 class427.method3339(100, false);
                                 return;
                              }

                              if (arg0.startsWith(field3990[45])) {
                                 class427.method3339(10, true);
                                 return;
                              }

                              if (arg0.startsWith(field3990[145])) {
                                 int var36 = Integer.parseInt(arg0.substring(8));
                                 class54.field794.method204(var36);
                                 return;
                              }

                              if (arg0.equals(field3990[193])) {
                                 class137.method1389(-120, field3990[81] + class129.field2068.method565());
                                 return;
                              }

                              if (arg0.equals(field3990[206])) {
                                 class595.method4368(26793);
                                 class137.method1389(-109, field3990[33] + class476.field6870.field9109.method4676(-74));
                                 return;
                              }

                              if (arg0.equals(field3990[101])) {
                                 class137.method1389(-95, class183.field2683.method510((byte)-84));
                                 return;
                              }

                              if (arg0.equals(field3990[73])) {
                                 label628: {
                                    if (class82.field1290.startsWith(field3990[144])) {
                                       class237.method2090(new File(field3990[80]), 0, false);
                                       if (!var4) {
                                          break label628;
                                       }
                                    }

                                    class237.method2090(new File(field3990[112]), 0, false);
                                 }

                                 class137.method1389(-97, field3990[148]);
                                 return;
                              }

                              if (arg0.equals(field3990[48])) {
                                 class137.method1389(-127, field3990[96] + class82.field1290);
                                 class137.method1389(-116, field3990[76] + class82.field1271);
                                 class137.method1389(-97, field3990[8] + class82.field1281);
                                 return;
                              }

                              if (arg0.startsWith(field3990[41])) {
                                 int var37 = Integer.parseInt(arg0.substring(8, 9));
                                 class430.field6302 = var37;
                                 class411.method3213((byte)-105);
                                 class137.method1389(-113, field3990[103]);
                                 return;
                              }

                              if (arg0.startsWith(field3990[97])) {
                                 int var38 = arg0.indexOf(32);
                                 if (~var38 > -1) {
                                    class137.method1389(-101, field3990[188]);
                                    return;
                                 }

                                 int var39 = class510.method3842(arg0.substring(var38 + 1), 63);
                                 class476.field6870.method4707(var39, false, class476.field6870.field9144);
                                 class737.method5332(0);
                                 class664.field9354 = false;
                                 class745.method5366(true);
                                 if (class476.field6870.field9144.method4124(-99) == var39) {
                                    class137.method1389(-108, field3990[115]);
                                    return;
                                 }

                                 class137.method1389(-120, field3990[99]);
                                 return;
                              }

                              if (arg0.startsWith(field3990[116])) {
                                 if (class476.field6870.field9144.method4124(-53) == 0) {
                                    class137.method1389(-100, field3990[175]);
                                    return;
                                 }

                                 int var40 = class510.method3842(arg0.substring(arg0.indexOf(32) - -1), 48);
                                 class582.field8174 = var40;
                                 class137.method1389(-99, field3990[153] + class582.field8174);
                                 return;
                              }

                              if (arg0.startsWith(field3990[26])) {
                                 int var41 = class510.method3842(arg0.substring(1 + arg0.indexOf(32)), 93);
                                 class654.field9257 = var41;
                                 class29.field430 = var41;
                                 class137.method1389(-110, field3990[95] + var41);
                                 class745.method5366(true);
                                 return;
                              }

                              if (arg0.equals(field3990[204])) {
                                 class531.field7490 = !class531.field7490;
                                 class137.method1389(-115, field3990[142] + (class531.field7490 ? field3990[118] : field3990[114]));
                                 return;
                              }

                              if (arg0.startsWith(field3990[79])) {
                                 int var42 = class510.method3842(arg0.substring(1 + arg0.indexOf(32)), -107);
                                 class476.field6870.method4707(var42, false, class476.field6870.field9141);
                                 class137.method1389(-103, field3990[158] + (~class476.field6870.field9141.method4436(-110) == -1 ? field3990[131] : field3990[180]));
                                 return;
                              }

                              if (arg0.startsWith(field3990[194])) {
                                 File var43 = new File(arg0.substring(10));
                                 if (var43.exists()) {
                                    var43 = new File(arg0.substring(10) + "." + class604.method4452(-106) + field3990[185]);
                                    if (var43.exists()) {
                                       class137.method1389(-125, field3990[39]);
                                       return;
                                    }
                                 }

                                 if (class131.field2129 != null) {
                                    class131.field2129.close();
                                    class131.field2129 = null;
                                 }

                                 try {
                                    class131.field2129 = new FileOutputStream(var43);
                                    return;
                                 } catch (FileNotFoundException var53) {
                                    class137.method1389(-123, field3990[161] + var43.getName());
                                    return;
                                 } catch (SecurityException var54) {
                                    class137.method1389(-116, field3990[46] + var43.getName());
                                    return;
                                 }
                              }

                              if (arg0.equals(field3990[64])) {
                                 if (class131.field2129 != null) {
                                    class131.field2129.close();
                                 }

                                 class131.field2129 = null;
                                 return;
                              }

                              if (arg0.startsWith(field3990[92])) {
                                 File var44 = new File(arg0.substring(10));
                                 if (!var44.exists()) {
                                    class137.method1389(-102, field3990[49]);
                                    return;
                                 }

                                 byte[] var45 = class258.method2206(256, var44);
                                 if (var45 == null) {
                                    class137.method1389(-115, field3990[109]);
                                    return;
                                 }

                                 String[] var46 = class757.method5467(5, class670.method4859('\r', 117, class455.method3502(7094, var45), ""), '\n');
                                 class212.method1839(var46, (byte)123);
                              }

                              if (arg0.startsWith(field3990[135])) {
                                 short var47 = (short)class510.method3842(arg0.substring(5), 114);
                                 if (var47 > 0) {
                                    class562.field7992 = var47;
                                 }

                                 return;
                              }

                              if (arg0.startsWith(field3990[69])) {
                                 if (arg0.length() > 9 && arg0.charAt(8) == ' ') {
                                    class427.field6265 = arg0.substring(9);
                                    class427.field6267 = true;
                                    class137.method1389(-115, field3990[42] + class427.field6265 + ")");
                                    return;
                                 }

                                 class427.field6265 = null;
                                 class427.field6267 = !class427.field6267;
                                 class137.method1389(-128, field3990[205] + class427.field6267);
                                 return;
                              }

                              if (~class394.field5712 == -12) {
                                 ++class10.field170;
                                 class381 var48 = class801.method5775(class9.field157, 0, class745.field10605.field3718);
                                 var48.field5570.method656((byte)-98, arg0.length() + 3);
                                 var48.field5570.method656((byte)91, arg2 ? 1 : 0);
                                 var48.field5570.method656((byte)-120, !arg3 ? 0 : 1);
                                 var48.field5570.method658(arg0, -44);
                                 class745.field10605.method2111(14024, var48);
                              }

                              if (arg0.startsWith(field3990[187]) && class479.field6892 != class160.field2451) {
                                 class308.method2526((byte)-109, class510.method3842(arg0.substring(4), -86));
                                 return;
                              }
                              break label808;
                           }

                           int var28 = 0;
                           if (var4) {
                              if (class785.field11459[var28]) {
                                 class436.field6379[var28] = (int)(Math.random() * 99999.0D);
                                 if (Math.random() > 0.5D) {
                                    class436.field6379[var28] *= -1;
                                 }
                              }

                              ++var28;
                           }

                           while(true) {
                              while(class436.field6379.length > var28) {
                                 if (class785.field11459[var28]) {
                                    class436.field6379[var28] = (int)(Math.random() * 99999.0D);
                                    if (Math.random() > 0.5D) {
                                       class436.field6379[var28] *= -1;
                                    }
                                 }

                                 ++var28;
                              }

                              class132.method1358((byte)4);
                              class137.method1389(-127, field3990[24]);
                              if (!var4) {
                                 return;
                              }

                              ++var28;
                           }
                        }

                        class737.field10518 = !class737.field10518;
                        class54.field794.method228(class737.field10518);
                        class530.method3959(true);
                        class137.method1389(-97, field3990[35] + class737.field10518);
                        return;
                     }

                     class720.field10318.method870((byte)-83);
                     class242[] var14 = class745.field10606;
                     int var15 = 0;
                     class242 var16;
                     if (var4) {
                        var16 = var14[var15];
                        if (var16.field3713 != null) {
                           var16.field3713.method2550(0);
                        }

                        ++var15;
                     }

                     while(~var15 > ~var14.length) {
                        var16 = var14[var15];
                        if (var16.field3713 != null) {
                           var16.field3713.method2550(0);
                        }

                        ++var15;
                     }

                     class456.field6660.method4732(0);
                     class137.method1389(-120, field3990[3]);
                     return;
                  }

                  class776.method5605(-126);
                  int var6 = 0;
                  if (var4) {
                     System.gc();
                     ++var6;
                  }

                  while(true) {
                     if (var6 >= 10) {
                        Runtime var7 = Runtime.getRuntime();
                        int var8 = (int)((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                        class137.method1389(-109, field3990[43] + var8 + "k");
                        if (!var4) {
                           return;
                        }
                     } else {
                        System.gc();
                     }

                     ++var6;
                  }
               }
            } catch (Exception var55) {
               class137.method1389(-100, class765.field10905.method5512(-2, class777.field11340));
               return;
            }
         }

         if (class394.field5712 != 11) {
            class137.method1389(-126, class765.field10906.method5512(-2, class777.field11340) + arg0);
         }

         if (arg1 <= 123) {
            field3984 = -45L;
         }
      } catch (RuntimeException var57) {
         throw class612.method4503(var57, field3990[54] + (arg0 != null ? field3990[157] : field3990[126]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field3988;
         super.field7905 = this.method97(arg0 ^ -22);
         if (arg0 != -22) {
            field3984 = 54L;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3990[214] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class260(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            field3984 = 111L;
         }

         ++field3983;
         return 3;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3990[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field3989;
         if (arg0 != 0) {
            this.method92(-125, 107);
         }

         return super.field7906.method4715((byte)-107) == class648.field9162 && super.field7906.method4710(124) ? 0 : 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3990[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method2232(int arg0) {
      try {
         if (arg0 > -52) {
            return 43;
         } else {
            ++field3987;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3990[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class260(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lf",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field3985;
         if (!arg1) {
            method2231((String)null, 96, true, false);
         }

         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3990[215] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2233(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2234(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
