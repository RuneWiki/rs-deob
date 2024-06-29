import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class class328 implements class479 {

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "Lli;")
    private class451 field5180 = class643.field9328;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "Lpj;")
    public class157 field5162;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "Leu;")
    public class505 field5179;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
    private boolean field5171;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lrda;")
    public class690 field5165;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    private int field5161;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    private int field5172;

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5181 = new String[] { method2782(method2781("Ggk\u0010\u001e")), method2782(method2781("^f)-")), method2782(method2781("K=koK")), method2782(method2781("Ggk'_^r)(LU;")), method2782(method2781("Ggk\u000e\u001e")), method2782(method2781("Ggk\f\u001e")), method2782(method2781("Ggk\u0015\u001e")), method2782(method2781("Ggk\r\u001e")), method2782(method2781("G!!$TEt")), method2782(method2781("J|*,\u0016")), method2782(method2781("bv'4_\\w,/Q\u0010~$1")), method2782(method2781("_a1)Y\u0010")), method2782(method2781("^r1(@U~ ,SBa*3")), method2782(method2781("vr,-ST31.\u0016Bv$%\u0016Vz)$")), method2782(method2781("Xz!$U_\u007f( F")), method2782(method2781("C{,'BS\u007f,\"]")), method2782(method2781("\u007fp&-EY|+aX_de.PV2")), method2782(method2781("fv72__}\u007fa")), method2782(method2781("Dv=2_Jv")), method2782(method2781("_a1)Y\u0010g,-S\u0010`,;S\r")), method2782(method2781("S`53YVz)$YEg54BS")), method2782(method2781("R\u007f*.[")), method2782(method2781("E}).WT}$5_Fv6")), method2782(method2781("\u007f;6h\f\u0010")), method2782(method2781("vr,-ST31.\u0016S{$/QU3*3BX|e,YTv")), method2782(method2781("Bf+2UBz55\u0016")), method2782(method2781("~r($\f\u0010")), method2782(method2781("G)e")), method2782(method2781("|z'3WBje4X\\|$%_^te'WY\u007f %\u0017")), method2782(method2781("_a1)YSr(-YSx")), method2782(method2781("@v7,\u0016Fr7\"E\u0010`&3W]q)$R")), method2782(method2781("Bv+%SBv7")), method2782(method2781("Cv77SBy6tRB|5")), method2782(method2781("Vc6.X")), method2782(method2781("G~vaPQz)$R")), method2782(method2781("]p")), method2782(method2781("Wv1)SYt-5")), method2782(method2781("ta*1FUwe\"ZYv+5\u0016S|+/SSg,.X")), method2782(method2781("||**\f\u0010")), method2782(method2781("u}1$DUwe5]\u0003")), method2782(method2781("y}3 ZYwe3SSg\u001a%SRf\"a@Q\u007f0$")), method2782(method2781("sf73S^ge5Y_\u007f.(B\u0010w*$E^41aEEc5.DD3(4ZDz5-S\u0010p*3SC")), method2782(method2781("Cr3$@Qa&2")), method2782(method2781("Xv)1")), method2782(method2781("t|+$")), method2782(method2781("Cv1#W")), method2782(method2781("u}1$DUwe5]\u0002")), method2782(method2781("Gz+")), method2782(method2781("\u0010[ (QXg\u007fa")), method2782(method2781("Vc6aRUq0&\u0016Tz6 T\\v!")), method2782(method2781("Bv+%SBc7.PY\u007f ")), method2782(method2781("bv'4_\\w,/Q\u0010~$1\u0016\u0018d,5^\u0010c7.PY\u007f,/Q\u0019")), method2782(method2781("qp1(@U365DUr(2\f\u0010")), method2782(method2781("ra  ]Y}\"aXUde\"Y^} \"BY|+2\u0016V|7a\u0003\u0010` \"Y^w6")), method2782(method2781("xv$1\f\u0010")), method2782(method2781("S|),W@3,2\u0016C{*6X")), method2782(method2781("G~taEEp&$STv!")), method2782(method2781("^r1(@U;\b\u0011d")), method2782(method2781("Ra  ]S|+")), method2782(method2781("S|(1WSg")), method2782(method2781("S\u007f,1U_~5.XU}12\u000b")), method2782(method2781("\u007fp&-EY|+aX_de.X\u0011")), method2782(method2781("G~waPQz)$R")), method2782(method2781("vr,-ST31.\u0016U}1$D\u0010g.t")), method2782(method2781("dv=5\u0016S|*3RC3&-SQa %")), method2782(method2781("Cd,5UXd*3ZT")), method2782(method2781("}Q")), method2782(method2781("\u0010i\u007f")), method2782(method2781("S`53YVz)$YEg54BD")), method2782(method2781("}v(.DI3$'BUae\"ZUr+4F\r")), method2782(method2781("ta*1FUwe2SBe 3\u0016Z`paXUge0CUf ")), method2782(method2781("y;(h\f\u0010")), method2782(method2781("Wp")), method2782(method2781("`v7'YB~$/UU)e")), method2782(method2781("^|+1UC.")), method2782(method2781("cj65S]3($[_a<{\u0016")), method2782(method2781("c{,'B\u001dp)(U[3\u0000\u000fwr_\u0000\u0005\u0017")), method2782(method2781("S\u007f,1U_~5.XU}12")), method2782(method2781("vr,-ST31.\u0016U}1$D\u0010g.p")), method2782(method2781("Wv1\"ZYv+5@Qa5#_D")), method2782(method2781("S\u007f6")), method2782(method2781("Dxv")), method2782(method2781("u}1$DUwe5]\u0000")), method2782(method2781("w_\u001daB_|)*_D)ea")), method2782(method2781("xv,&^D)e")), method2782(method2781("]v(|")), method2782(method2781("Wv1\"W]v7 F_`")), method2782(method2781("vC\u0016aY^")), method2782(method2781("S|),W@3,2\u0016Xz!%S^")), method2782(method2781("ta*1FUwe\"ZYv+5\u0016Z`paXUge0CUf ")), method2782(method2781("^|+1UC")), method2782(method2781("_a1)YJ|*,\u000b")), method2782(method2781("]`")), method2782(method2781("Dd $X")), method2782(method2781("Bv&5iTv'4Q")), method2782(method2781("_a1)YJ|*,\u0016")), method2782(method2781("Wv1\"QS|*3R")), method2782(method2781("Bv&5iTv'4Q\r")), method2782(method2781("_p&-CTv")), method2782(method2781("Vz)$\u0016Q\u007f7$WTje$NY`12\u0017")), method2782(method2781("~|e2CS{e'_\\v")), method2782(method2781("Cp7 [R\u007f 7WBp6")), method2782(method2781("Ar\u001a.Fog 2B\r")), method2782(method2781("Fr71TYgx")), method2782(method2781("t \u0001aB_|)*_D)ea")), method2782(method2781("d|\"&ZUwd")), method2782(method2781("G~waEEp&$STv!")), method2782(method2781("}q")), method2782(method2781("s)\u0019\u0015S]c\u0019)SQck%C]c")), method2782(method2781("|z'3WBz 2\u0016E}).WTv!")), method2782(method2781("v|7\"ST316SU},/Q\u0010w,2WR\u007f %\u0018")), method2782(method2781("vr,-ST31.\u0016U}$#ZU3'-Y_~")), method2782(method2781("S\u007f  DDv=5")), method2782(method2781("\u001fg(1\u0019Xv$1\u0018Tf(1")), method2782(method2781("@p")), method2782(method2781("vC\u0016{\u0016")), method2782(method2781("c@\u0000aB_|)*_D)ea")), method2782(method2781("v|7\"ST316SU},/Q\u0010V\u000b\u0000t|V\u0001`")), method2782(method2781("Bc")), method2782(method2781("u}1$DUwe5]\u0001")), method2782(method2781("\u001e\u007f*&")), method2782(method2781("u}1$DUwe5]\u0005")), method2782(method2781("_u#")), method2782(method2781("Bv'4_\\w53YVz)$")), method2782(method2781("Wv16YB\u007f!")), method2782(method2781("Bv'4_\\w")), method2782(method2781("Ar\u001a.Fog 2B")), method2782(method2781("cf&\"SC`#4Z\\je\"^Q}\"$R\u0010|75^_3(.RU")), method2782(method2781("G~t")), method2782(method2781("Cv1.CDc05\u0016")), method2782(method2781("S\u007f6a\u001b\u0010P)$WB3&.XC|)$")), method2782(method2781("b|1 BUwe\"Y^} \"BY|+a[Ug-.RC")), method2782(method2781("]r=#CY\u007f! DUrx")), method2782(method2781("Bv6$B]z+([Qc")), method2782(method2781("vr,-ST31.\u0016U}1$D\u0010g.q")), method2782(method2781("Dxu")), method2782(method2781("S\u007f,$XDy6tRB|5")), method2782(method2781("Cd,5UXv!")), method2782(method2781("Ggk\u0011\u001e")), method2782(method2781("sr&)SC37$EUg")), method2782(method2781("Tz61ZQj#1E\u0010>e\u0015YWt)$\u0016vC\u0016aW^we.BXv7a_^u*3[Qg,.X")), method2782(method2781("Vc6a")), method2782(method2781("G~taPQz)$R")), method2782(method2781("vC\u0016aYVu")), method2782(method2781("S|(,W^w6")), method2782(method2781("vr,-ST31.\u0016U}1$D\u0010g.s")), method2782(method2781("Qf1.\u0016G|7-R\u0010` -SSg %")), method2782(method2781("G~v")), method2782(method2781("_a1)Y\u0010p$,SBre-YSxe(E\u0010")), method2782(method2781("Tz7$UD\u007f*&_^")), method2782(method2781("w_e5Y_\u007f.(B\n3ea")), method2782(method2781("Tz61ZQj#1E")), method2782(method2781("@v7,\u0016Fr7\"E\u0010`$7ST")), method2782(method2781("c{,'B\u001dp)(U[3!(EQq)$R\u001e")), method2782(method2781("G~vaEEp&$STv!")), method2782(method2781("H)")), method2782(method2781("vr,-ST31.\u0016U}1$D\u0010g.r")), method2782(method2781("bv+%SB3&.DU`e/YG)e")), method2782(method2781("@a,/BVc6")), method2782(method2781("}v(.DI3'$P_a aU\\v$/C@.")), method2782(method2781("Dxw")), method2782(method2781("Xv$1")), method2782(method2781("@a*'_\\v&1C")), method2782(method2781("y}3 ZYwe#CY\u007f! DUre7W\\f ")), method2782(method2781("Vc6aRUq0&\u0016U}$#ZUw")), method2782(method2781("G~w")), method2782(method2781("C}).QY}e")), method2782(method2781("Vc6.PV")), method2782(method2781("r\u007f*.[\u0010w,2WR\u007f %")), method2782(method2781("fv7{\u0016")), method2782(method2781("Xv$1\u0016\u001d3\u00153_^ge+WFre,S]|78\u0016Y}#.D]r1(Y^")), method2782(method2781("Xv$1RE~5")), method2782(method2781("C|0/RCg7$W]p*4XD")), method2782(method2781("`|6{\u0016")), method2782(method2781("S|(,W^w6a\u001b\u0010G-(E\u0010p*,[Q}!")), method2782(method2781("Ua7.DDv65")), method2782(method2781("S\u007f,$XDw7.F")), method2782(method2781("ta,7SB3\u0013$DCz*/\f\u0010")), method2782(method2781("B|1 BUp*/XUp1,SD{*%E")), method2782(method2781("Sr&)SCc$\"S")), method2782(method2781("fv+%YB)e")), method2782(method2781("Dxt")), method2782(method2781("_}")), method2782(method2781("r\u007f*.[\u0010v+ T\\v!")), method2782(method2781("Dxp")), method2782(method2781("Cj65S]~ ,")), method2782(method2781("tv3(UU)e")), method2782(method2781("sr+/YD323_Dve5Y\u0010")), method2782(method2781("s|(1ZUg o\u0016d|*-]Yge/YG)e")), method2782(method2781("_a1)YDz)$EYi a")), method2782(method2781("Wv1\"ZYv+5@Qa5")), method2782(method2781("}z+([Qce3SCv1")), method2782(method2781("Ua7.D]v62WWv")), method2782(method2781("Bv6$BSr&)S")), method2782(method2781("C{*6U_\u007f( F")), method2782(method2781("Bv+%SBv7a\u001b\u0010C7(XD3\"3W@{,\"E\u0010a /RUa 3\u0016Y}#.D]r1(Y^")), method2782(method2781("S`53YVz)$U\\v$3")), method2782(method2781("_`")), method2782(method2781("U}$#ZU3*3BX|e,YTve'_B`1a\u001eE` a\u0011_a1)Y\u0010/+\u007f\u0011\u0019")), method2782(method2781("cj+5WH)e.DD{*a\n^-")), method2782(method2781("@v7'YB~$/UUg 2B")), method2782(method2781("C{*6FB|#(ZY}\"|")), method2782(method2781("s|0-R\u0010}*5\u0016Sa  BU3")), method2782(method2781("S\u007f*2S_f11CD")), method2782(method2781("zr3 \u0016D|*-]Yg\u007fa")), method2782(method2781("Qf1.EUg01")), method2782(method2781("y;6h\f\u0010")), method2782(method2781("Qf1.A_a)%")), method2782(method2781("Fr71\u000b")), method2782(method2781("qa&)\f\u0010")), method2782(method2781("Ggk\u0013\u001e")), method2782(method2781("Ggk}_^z1\u007f\u001e")), method2782(method2781("Ggk\n\u001e")), method2782(method2781("Ggk\u0012\u001e")), method2782(method2781("Ggk\u000b\u001e")), method2782(method2781("Ggk\u000f\u001e")) };

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!wt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            this.method2771((byte) 39);
            field5173++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5181[3] + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[FIII)V")
    public final void method2770(int arg0, float[] arg1, int arg2, int arg3, int arg4) {
        try {
            field5178++;
            if (arg4 > 0 && !class40.method269(arg4, 109)) {
                throw new IllegalArgumentException("");
            } else if (arg0 <= 0 || class40.method269(arg0, 110)) {
                int var6 = this.field5179.field7318;
                int var7 = 0;
                int var8 = 68 / ((arg2 - 24) / 59);
                int var9 = arg4 >= arg0 ? arg0 : arg4;
                int var10 = arg4 >> 1;
                int var11 = arg0 >> 1;
                float[] var12 = arg1;
                float[] var13 = new float[var10 * var11 * var6];
                while (true) {
                    OpenGL.glTexImage2Df(arg3, var7, this.method2773(-64), arg4, arg0, 0, class311.method2626((byte) -117, this.field5179), 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg4 * var6;
                    float[] var15 = var13;
                    for (int var16 = 0; var16 < var6; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                float var22 = var12[var18];
                                int var23 = var6 + var18;
                                float var24 = var12[var23] + var22;
                                var18 = var6 + var23;
                                float var25 = var12[var19] + var24;
                                int var26 = var6 + var19;
                                float var27 = var12[var26] + var25;
                                var19 = var6 + var26;
                                var13[var17] = var27 * 0.25F;
                                var17 += var6;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    var13 = var12;
                    arg0 = var11;
                    var12 = var15;
                    arg4 = var10;
                    var7++;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                    var9 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field5181[0] + arg0 + ',' + (arg1 == null ? field5181[1] : field5181[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)V")
    private final void method2771(byte arg0) {
        try {
            if (this.field5172 > 0) {
                this.field5165.method5055((byte) 103, this.method2779((byte) -22), this.field5172);
                this.field5172 = 0;
            }
            field5177++;
            if (arg0 != 39) {
                this.method2773(-63);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5181[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
    private final void method2772(int arg0) {
        try {
            if (arg0 == 9984) {
                field5164++;
                this.field5165.method2467(12, this);
                if (class643.field9328 == this.field5180) {
                    OpenGL.glTexParameteri(this.field5167, 10241, this.field5171 ? 9987 : 9729);
                    OpenGL.glTexParameteri(this.field5167, 10240, 9729);
                } else {
                    OpenGL.glTexParameteri(this.field5167, 10241, this.field5171 ? 9984 : 9728);
                    OpenGL.glTexParameteri(this.field5167, 10240, 9728);
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5181[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)I")
    public final int method2773(int arg0) {
        try {
            if (arg0 > -36) {
                this.field5172 = -3;
            }
            field5176++;
            if (class157.field1952 == this.field5162) {
                if (class671.field9751 == this.field5179) {
                    return 6407;
                }
                if (class215.field3276 == this.field5179) {
                    return 6408;
                }
                if (class667.field9691 == this.field5179) {
                    return 6406;
                }
                if (class65.field675 == this.field5179) {
                    return 6409;
                }
                if (class172.field2400 == this.field5179) {
                    return 6410;
                }
                if (class218.field3374 == this.field5179) {
                    return 6145;
                }
            } else if (class157.field1955 == this.field5162) {
                if (class671.field9751 == this.field5179) {
                    return 34843;
                }
                if (class215.field3276 == this.field5179) {
                    return 34842;
                }
                if (class667.field9691 == this.field5179) {
                    return 34844;
                }
                if (class65.field675 == this.field5179) {
                    return 34846;
                }
                if (class172.field2400 == this.field5179) {
                    return 34847;
                }
                if (class218.field3374 == this.field5179) {
                    return 6145;
                }
            } else if (class157.field1956 == this.field5162) {
                if (class671.field9751 == this.field5179) {
                    return 34837;
                }
                if (class215.field3276 == this.field5179) {
                    return 34836;
                }
                if (class667.field9691 == this.field5179) {
                    return 34838;
                }
                if (class65.field675 == this.field5179) {
                    return 34840;
                }
                if (class172.field2400 == this.field5179) {
                    return 34841;
                }
                if (class218.field3374 == this.field5179) {
                    return 6145;
                }
            }
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5181[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public final void method2774(int arg0) {
        try {
            field5170++;
            if (arg0 != 15416) {
                this.method2770(-5, null, -14, -53, -72);
            }
            int var2 = this.field5165.method2435((byte) 126);
            int var3 = this.field5165.field10103[var2];
            if (this.field5167 != var3) {
                if (var3 != 0) {
                    OpenGL.glBindTexture(var3, 0);
                    OpenGL.glDisable(var3);
                }
                OpenGL.glEnable(this.field5167);
                this.field5165.field10103[var2] = this.field5167;
            }
            OpenGL.glBindTexture(this.field5167, this.field5172);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5181[212] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "([IIBII)V")
    public final void method2775(int[] arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            field5163++;
            if (arg4 > 0 && !class40.method269(arg4, 69)) {
                throw new IllegalArgumentException("");
            } else if (arg3 > 0 && !class40.method269(arg3, arg2 ^ 0xFFFFFF9F)) {
                throw new IllegalArgumentException("");
            } else if (class215.field3276 == this.field5179) {
                int var6 = 0;
                int var7 = arg4 >= arg3 ? arg3 : arg4;
                int var8 = arg4 >> 1;
                int var9 = arg3 >> 1;
                int[] var10 = arg0;
                if (arg2 != -5) {
                    this.field5171 = true;
                }
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg1, var6, this.method2773(-63), arg4, arg3, 0, 32993, this.field5165.field10112, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = var13 + arg4;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var16 = 0; var16 < var8; var16++) {
                            int var17 = var10[var13++];
                            int var18 = var10[var13++];
                            int var19 = var10[var14++];
                            int var20 = var17 >> 24 & 0xFF;
                            int var21 = (var17 & 0xFFB5) >> 8;
                            int var22 = var10[var14++];
                            int var23 = (var17 & 0xFF3DE5) >> 16;
                            int var24 = var17 & 0xFF;
                            int var25 = (var18 & 0xFF) + var24;
                            int var26 = (var18 >> 24 & 0xFF) + var20;
                            int var27 = ((var18 & 0xFF7A) >> 8) + var21;
                            int var28 = ((var18 & 0xFF859C) >> 16) + var23;
                            int var29 = ((var19 & 0xFFD091) >> 16) + var28;
                            int var30 = (var19 >> 24 & 0xFF) + var26;
                            int var31 = ((var19 & 0xFFBD) >> 8) + var27;
                            int var32 = (var19 & 0xFF) + var25;
                            int var33 = ((var22 & 0xFF5F) >> 8) + var31;
                            int var34 = ((var22 & 0xFFFE0A) >> 16) + var29;
                            int var35 = (var22 & 0xFF) + var32;
                            int var36 = (var22 >> 24 & 0xFF) + var30;
                            var11[var12++] = class544.method4107(class291.method2359(var35, 1020) >> 2, class544.method4107(class291.method2359(var33 << 6, 65280), class544.method4107(class291.method2359(var36 << 22, -16777216), class291.method2359(var34 << 14, 16711680))));
                        }
                        var14 += arg4;
                        var13 += arg4;
                    }
                    int[] var37 = var11;
                    var11 = var10;
                    var10 = var37;
                    arg4 = var8;
                    arg3 = var9;
                    var6++;
                    var9 >>= 0x1;
                    var7 >>= 0x1;
                    var8 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var39) {
            throw class759.method5498(var39, field5181[210] + (arg0 == null ? field5181[1] : field5181[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZLli;)V")
    public final void method2776(boolean arg0, class451 arg1) {
        try {
            field5175++;
            if (arg0 && this.field5180 != arg1) {
                this.field5180 = arg1;
                this.method2772(9984);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5181[7] + arg0 + ',' + (arg1 == null ? field5181[1] : field5181[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IZ)V")
    private final void method2777(int arg0, boolean arg1) {
        try {
            if (arg1) {
                this.field5161 = 115;
            }
            field5166++;
            this.field5165.field4545 -= arg0;
            this.field5165.field4545 += this.method2779((byte) -22);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5181[213] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZZILjava/lang/String;)V")
    public static final void method2778(boolean arg0, boolean arg1, int arg2, String arg3) {
        try {
            field5174++;
            try {
                if (arg3.equalsIgnoreCase(field5181[144]) || arg3.equalsIgnoreCase(field5181[43])) {
                    class437.method3350(123, field5181[174]);
                    class437.method3350(67, field5181[130]);
                    class437.method3350(82, field5181[140]);
                    class437.method3350(60, field5181[195]);
                    class437.method3350(92, field5181[170]);
                    return;
                }
                if (arg3.equalsIgnoreCase(field5181[80])) {
                    class627.field9183 = 0;
                    class787.field11485 = 0;
                    return;
                }
                if (arg3.equalsIgnoreCase(field5181[151])) {
                    class655.field9471 = !class655.field9471;
                    if (!class655.field9471) {
                        class437.method3350(arg2 ^ 0xFFFFA70F, field5181[143]);
                        return;
                    }
                    class437.method3350(55, field5181[87]);
                    return;
                }
                if (arg2 != -22665) {
                    method2778(true, true, 116, null);
                }
                if (arg3.equals(field5181[31])) {
                    class521 var4 = class610.field8913.method493();
                    class437.method3350(66, field5181[180] + var4.field7624);
                    class437.method3350(107, field5181[26] + var4.field7627);
                    class437.method3350(82, field5181[17] + var4.field7625);
                    class437.method3350(116, field5181[186] + var4.field7628);
                    class437.method3350(123, field5181[177] + var4.field7629);
                    return;
                }
                if (arg3.equals(field5181[161])) {
                    class437.method3350(52, field5181[54] + class568.field8403 + field5181[66]);
                    return;
                }
            } catch (Exception var50) {
                class437.method3350(31, class309.field4849.method2616(false, class167.field2300));
                return;
            }
            if (class64.field667 != class31.field364 || class757.field10995 >= 2) {
                if (arg3.equalsIgnoreCase(field5181[175])) {
                    throw new RuntimeException();
                }
                if (arg3.equals(field5181[12])) {
                    throw new OutOfMemoryError(field5181[57]);
                }
                try {
                    if (arg3.equalsIgnoreCase(field5181[158])) {
                        class437.method3350(94, field5181[115] + class48.field549);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[98])) {
                        class64.field658 = !class64.field658;
                        if (!class64.field658) {
                            class437.method3350(arg2 ^ 0xFFFFA732, field5181[16]);
                            return;
                        }
                        class437.method3350(63, field5181[61]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[33])) {
                        class655.field9471 = true;
                        class437.method3350(100, field5181[164]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[167])) {
                        class655.field9471 = false;
                        class437.method3350(24, field5181[49]);
                        return;
                    }
                    if (arg3.equals(field5181[185])) {
                        try {
                            class437.method3350(68, field5181[75] + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class306.field4779.field99 + field5181[107]);
                            return;
                        } catch (Throwable var44) {
                            return;
                        }
                    }
                    if (arg3.equalsIgnoreCase(field5181[112])) {
                        class712.field10331.method4539((byte) 93);
                        class437.method3350(arg2 + 22736, field5181[64]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[72])) {
                        class247.method2091((byte) 118);
                        for (int var5 = 0; var5 < 10; var5++) {
                            System.gc();
                        }
                        Runtime var6 = Runtime.getRuntime();
                        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                        class437.method3350(91, field5181[85] + var7 + "k");
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[59])) {
                        class247.method2091((byte) 86);
                        for (int var8 = 0; var8 < 10; var8++) {
                            System.gc();
                        }
                        Runtime var9 = Runtime.getRuntime();
                        int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                        class437.method3350(103, field5181[159] + var10 + "k");
                        class326.method2763((byte) 22);
                        class247.method2091((byte) -10);
                        for (int var11 = 0; var11 < 10; var11++) {
                            System.gc();
                        }
                        int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                        class437.method3350(109, field5181[69] + var12 + "k");
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[22])) {
                        class437.method3350(78, class7.method48(0) ? field5181[109] : field5181[28]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[176])) {
                        class437.method3350(45, field5181[37]);
                        if (class138.field1645 == 10) {
                            class95.method805(7);
                        } else if (class138.field1645 == 11) {
                            class248.field3876 = true;
                            return;
                        }
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[178])) {
                        class54.field592.method145((byte) 61);
                        class437.method3350(60, field5181[131]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[136])) {
                        class768.field11093.method1248(-13);
                        class437.method3350(arg2 ^ 0xFFFFA75A, field5181[89]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[32])) {
                        class768.field11093.method1260(0);
                        class437.method3350(60, field5181[70]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[58])) {
                        class580.field8601.method212(5000);
                        class629.field9198.method2696((byte) 116);
                        class768.field11093.method1249(0);
                        class437.method3350(57, field5181[53]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[125])) {
                        class152.method1273((byte) 114);
                        class233.method1993((byte) -116);
                        class437.method3350(arg2 + 22776, field5181[10]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[123])) {
                        class515.field7444 = class430.method3299(73);
                        class520.field7617 = true;
                        class152.method1273((byte) -1);
                        class233.method1993((byte) -50);
                        class437.method3350(119, field5181[51]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[128])) {
                        class178.method1563(false, -128, -1, -1, 1);
                        if (class451.method3463(1) != 1) {
                            class437.method3350(123, field5181[142]);
                            return;
                        }
                        class437.method3350(22, field5181[56]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[165])) {
                        class178.method1563(false, 108, -1, -1, 2);
                        if (class451.method3463(1) == 2) {
                            class437.method3350(94, field5181[106]);
                            return;
                        }
                        class437.method3350(35, field5181[62]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[147])) {
                        class178.method1563(false, 74, 1024, 768, 3);
                        if (class451.method3463(1) == 3) {
                            class437.method3350(38, field5181[154]);
                            return;
                        }
                        class437.method3350(27, field5181[34]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[135])) {
                        class640.method4693(0, arg2 ^ 0x6C7D, false);
                        if (class289.field4305.field812.method1610(false) == 0) {
                            class437.method3350(82, field5181[82]);
                            class289.field4305.method655(arg2 ^ 0xFFFFA766, 0, class289.field4305.field834);
                            class124.method1077(-3);
                            class28.field344 = false;
                            return;
                        }
                        class437.method3350(124, field5181[134]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[181])) {
                        class640.method4693(1, -13558, false);
                        if (class289.field4305.field812.method1610(false) == 1) {
                            class437.method3350(arg2 ^ 0xFFFFA717, field5181[119]);
                            class289.field4305.method655(17, 1, class289.field4305.field834);
                            class124.method1077(arg2 ^ 0x588A);
                            class28.field344 = false;
                            return;
                        }
                        class437.method3350(104, field5181[78]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[160])) {
                        class640.method4693(2, -13558, false);
                        if (class289.field4305.field812.method1610(false) != 2) {
                            class437.method3350(111, field5181[145]);
                            return;
                        }
                        class437.method3350(arg2 + 22706, field5181[46]);
                        class289.field4305.method655(arg2 + 22682, 2, class289.field4305.field834);
                        class124.method1077(-3);
                        class28.field344 = false;
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[81])) {
                        class640.method4693(3, -13558, false);
                        if (class289.field4305.field812.method1610(false) == 3) {
                            class437.method3350(84, field5181[39]);
                            class289.field4305.method655(17, 3, class289.field4305.field834);
                            class124.method1077(arg2 ^ 0x588A);
                            class28.field344 = false;
                            return;
                        }
                        class437.method3350(63, field5181[156]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[184])) {
                        class640.method4693(5, -13558, false);
                        if (class289.field4305.field812.method1610(false) == 5) {
                            class437.method3350(21, field5181[121]);
                            class289.field4305.method655(arg2 ^ 0xFFFFA766, 5, class289.field4305.field834);
                            class124.method1077(-3);
                            class28.field344 = false;
                            return;
                        }
                        class437.method3350(41, field5181[63]);
                        return;
                    }
                    if (arg3.startsWith(field5181[45])) {
                        if (arg3.length() < 6) {
                            class437.method3350(67, field5181[163]);
                            return;
                        }
                        int var13 = class244.method2078(-7431, arg3.substring(6));
                        if (var13 >= 0 && class417.method3237(class568.field8403, 20194) >= var13) {
                            class289.field4305.method655(17, var13, class289.field4305.field818);
                            class124.method1077(arg2 + 22662);
                            class28.field344 = false;
                            class437.method3350(44, field5181[132] + class289.field4305.field818.method1942(false));
                            return;
                        }
                        class437.method3350(arg2 ^ 0xFFFFA73C, field5181[163]);
                        return;
                    }
                    if (arg3.startsWith(field5181[94])) {
                        if (arg3.length() < 10) {
                            class437.method3350(arg2 ^ 0xFFFFA739, field5181[40]);
                            return;
                        }
                        class209.field3210 = class244.method2078(-7431, arg3.substring(10).trim());
                        class437.method3350(127, field5181[97] + class209.field3210);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[126])) {
                        class90.field1028 = true;
                        class437.method3350(arg2 + 22791, field5181[102] + class90.field1028);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[77])) {
                        class327.field5159 = !class327.field5159;
                        class437.method3350(arg2 + 22711, field5181[60] + class327.field5159);
                        return;
                    }
                    if (arg3.startsWith(field5181[21])) {
                        boolean var14 = class610.field8913.method566();
                        if (!class297.method2510((byte) 7, !var14)) {
                            class437.method3350(63, field5181[111]);
                            return;
                        }
                        if (var14) {
                            class437.method3350(94, field5181[168]);
                            return;
                        }
                        class437.method3350(84, field5181[183]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[93])) {
                        if (class341.field5310) {
                            class341.field5310 = false;
                            class437.method3350(40, field5181[110]);
                            return;
                        }
                        class341.field5310 = true;
                        class437.method3350(arg2 + 22690, field5181[117]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[15])) {
                        if (!class308.field4836) {
                            class437.method3350(44, field5181[76]);
                            class308.field4836 = true;
                            return;
                        }
                        class437.method3350(arg2 + 22720, field5181[153]);
                        class308.field4836 = false;
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[96])) {
                        class437.method3350(47, field5181[155] + (class225.field3446.field6197 >> 9) + field5181[67] + (class225.field3446.field6211 >> 9));
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[36])) {
                        class437.method3350(105, field5181[84] + class555.field8261[class225.field3446.field6200].method2407(class225.field3446.field6211 >> 9, class225.field3446.field6197 >> 9, 124));
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[133])) {
                        class383.field5798.method3645((byte) 3);
                        class383.field5798.method3642((byte) -105);
                        class617.field9073.method4600(0);
                        class643.field9316.method620(arg2 - 7733);
                        class233.method1993((byte) -127);
                        class437.method3350(94, field5181[191]);
                        return;
                    }
                    if (arg3.startsWith(field5181[35])) {
                        if (class610.field8913.method562()) {
                            int var15 = Integer.parseInt(arg3.substring(3));
                            if (var15 < 1) {
                                var15 = 1;
                            } else if (var15 > 4) {
                                var15 = 4;
                            }
                            class157.field1958 = var15;
                            class152.method1273((byte) -38);
                            class437.method3350(arg2 + 22775, field5181[157] + class157.field1958);
                            return;
                        }
                        class437.method3350(50, field5181[41]);
                        return;
                    }
                    if (arg3.startsWith(field5181[179])) {
                        class437.method3350(68, field5181[206] + class601.field8821.method1567((byte) 58) + "/" + class601.field8821.method1562((byte) 127));
                        class437.method3350(84, field5181[71] + class417.field6157.method1567((byte) 58) + "/" + class417.field6157.method1562((byte) 127));
                        class437.method3350(47, field5181[23] + class540.field7920.field9889.method4398(1) + "/" + class540.field7920.field9889.method4395(0));
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field5181[86])) {
                        class437.method3350(115, field5181[173] + class225.field3446.field6200 + "," + ((class271.field4116 >> 9) + class494.field7101 >> 6) + "," + ((class683.field9899 >> 9) + class281.field4219 >> 6) + "," + ((class271.field4116 >> 9) + class494.field7101 & 0x3F) + "," + ((class683.field9899 >> 9) + class281.field4219 & 0x3F) + field5181[48] + (class316.method2656(class271.field4116, class225.field3446.field6200, class683.field9899, 0) - class144.field1749));
                        class437.method3350(arg2 ^ 0xFFFFA718, field5181[38] + class225.field3446.field6200 + "," + (class494.field7101 + class243.field3724 >> 6) + "," + (class329.field5184 + class281.field4219 >> 6) + "," + (class243.field3724 + class494.field7101 & 0x3F) + "," + (class329.field5184 + class281.field4219 & 0x3F) + field5181[48] + (class316.method2656(class243.field3724, class225.field3446.field6200, class329.field5184, arg2 + 22665) - class239.field3626));
                        return;
                    }
                    if (arg3.equals(field5181[50]) || arg3.equals(field5181[118])) {
                        class437.field6396 = !class437.field6396;
                        class610.field8913.method554(class437.field6396);
                        class80.method698(0);
                        class437.method3350(arg2 + 22790, field5181[201] + class437.field6396);
                        return;
                    }
                    if (arg3.startsWith(field5181[200])) {
                        int var16 = -1;
                        int var17 = 1000;
                        if (arg3.length() > 15) {
                            String[] var18 = class350.method2878(arg3, ' ', (byte) 122);
                            try {
                                if (var18.length > 1) {
                                    var17 = Integer.parseInt(var18[1]);
                                }
                            } catch (Throwable var46) {
                            }
                            try {
                                if (var18.length > 2) {
                                    var16 = Integer.parseInt(var18[2]);
                                }
                            } catch (Throwable var45) {
                            }
                        }
                        if (var16 == -1) {
                            class437.method3350(80, field5181[204] + class537.method4049(0, arg2 + 16734345, var17));
                            class437.method3350(113, field5181[116] + class537.method4049(2, 16711680, var17));
                            class437.method3350(105, field5181[104] + class537.method4049(3, arg2 ^ 0xFF00A777, var17));
                            class437.method3350(59, field5181[150] + class537.method4049(1, arg2 + 16734345, var17));
                            class437.method3350(37, field5181[83] + class537.method4049(5, arg2 + 16734345, var17));
                            return;
                        }
                        class437.method3350(114, field5181[73] + class537.method4049(var16, 16711680, var17));
                        return;
                    }
                    if (arg3.equals(field5181[90])) {
                        class726.field10479 = !class726.field10479;
                        class437.method3350(23, field5181[74] + class726.field10479);
                        return;
                    }
                    if (arg3.equals(field5181[207])) {
                        class293.method2398(-126);
                        class437.method3350(88, field5181[146]);
                        return;
                    }
                    if (arg3.startsWith(field5181[65])) {
                        int var19 = Integer.parseInt(arg3.substring(12));
                        class197.method1696(10186, var19, class83.method712((byte) -75, var19).field8850);
                        class437.method3350(arg2 ^ 0xFFFFA73E, field5181[137]);
                        return;
                    }
                    if (arg3.equals(field5181[124])) {
                        class437.method3350(106, field5181[27] + class54.field592.field243);
                        return;
                    }
                    if (arg3.startsWith(field5181[114])) {
                        class280 var20 = class610.method4508(class730.field10599, class279.field4190, (byte) -125);
                        var20.field4197.method1428((byte) -24, 0);
                        int var21 = var20.field4197.field2201;
                        int var22 = arg3.indexOf(" ", 4);
                        var20.field4197.method1464(arg3.substring(3, var22), 255);
                        class252.method2133(arg3.substring(var22), var20.field4197, (byte) 115);
                        var20.field4197.method1467(var20.field4197.field2201 - var21, (byte) 108);
                        class106.method934((byte) 53, var20);
                        return;
                    }
                    if (arg3.equals(field5181[42])) {
                        class457.method3489(arg2 - 5351);
                        class437.method3350(37, field5181[152]);
                        return;
                    }
                    if (arg3.equals(field5181[101])) {
                        for (int var23 = 0; var23 < class86.field960.length; var23++) {
                            if (class199.field3112[var23]) {
                                class86.field960[var23] = (int) (Math.random() * 99999.0D);
                                if (Math.random() > 0.5D) {
                                    class86.field960[var23] *= -1;
                                }
                            }
                        }
                        class457.method3489(-28016);
                        class437.method3350(117, field5181[30]);
                        return;
                    }
                    if (arg3.equals(field5181[194])) {
                        class74.field859 = true;
                        class233.method1993((byte) -83);
                        class437.method3350(110, field5181[55]);
                        return;
                    }
                    if (arg3.equals(field5181[14])) {
                        class74.field859 = false;
                        class233.method1993((byte) -50);
                        class437.method3350(80, field5181[88]);
                        return;
                    }
                    if (arg3.equals(field5181[193])) {
                        class344.method2848(-6177);
                        class437.method3350(111, field5181[139]);
                        return;
                    }
                    if (arg3.equals(field5181[162])) {
                        class437.method3350(57, class279.method2290((byte) -79) + field5181[92]);
                        return;
                    }
                    if (arg3.startsWith(field5181[79])) {
                        int var24 = Integer.parseInt(arg3.substring(17));
                        class437.method3350(arg2 ^ 0xFFFFA721, field5181[103] + class276.field4168.method1150(0, var24));
                        return;
                    }
                    if (arg3.startsWith(field5181[190])) {
                        int var25 = Integer.parseInt(arg3.substring(14));
                        class437.method3350(arg2 + 22774, field5181[208] + class276.field4168.method1149(35, var25));
                        return;
                    }
                    if (arg3.startsWith(field5181[149])) {
                        String[] var26 = class350.method2878(arg3.substring(12), ' ', (byte) 118);
                        if (var26.length >= 2) {
                            int var27 = var26.length <= 2 ? 0 : Integer.parseInt(var26[2]);
                            class513.method3877(var26[1], var27, 32428, var26[0]);
                            return;
                        }
                    }
                    if (arg3.startsWith(field5181[166])) {
                        String[] var28 = class350.method2878(arg3.substring(8), ' ', (byte) 120);
                        int var29 = Integer.parseInt(var28[0]);
                        int var30 = var28.length == 2 ? Integer.parseInt(var28[1]) : 0;
                        class504.method3801(var30, (byte) 95, var29);
                        return;
                    }
                    if (arg3.startsWith(field5181[196])) {
                        class782.method5650();
                        return;
                    }
                    if (arg3.startsWith(field5181[20])) {
                        class782.method5662(100, false);
                        return;
                    }
                    if (arg3.startsWith(field5181[68])) {
                        class782.method5662(10, true);
                        return;
                    }
                    if (arg3.startsWith(field5181[18])) {
                        int var31 = Integer.parseInt(arg3.substring(8));
                        class610.field8913.method481(var31);
                        return;
                    }
                    if (arg3.equals(field5181[172])) {
                        class437.method3350(89, field5181[52] + class594.field8714.method4976());
                        return;
                    }
                    if (arg3.equals(field5181[205])) {
                        class322.method2727(-120);
                        class437.method3350(arg2 + 22694, field5181[188] + class289.field4305.field812.method1610(false));
                        return;
                    }
                    if (arg3.equals(field5181[192])) {
                        class437.method3350(arg2 ^ 0xFFFFA74A, class43.field504.method1325((byte) -99));
                        return;
                    }
                    if (arg3.equals(field5181[171])) {
                        if (class33.field386.startsWith(field5181[47])) {
                            class139.method1193(-1, false, new File(field5181[108]));
                        } else {
                            class139.method1193(arg2 ^ 0x5888, false, new File(field5181[113]));
                        }
                        class437.method3350(arg2 + 22725, field5181[44]);
                        return;
                    }
                    if (arg3.equals(field5181[197])) {
                        class437.method3350(arg2 ^ 0xFFFFA703, field5181[26] + class33.field386);
                        class437.method3350(57, field5181[209] + class33.field372);
                        class437.method3350(41, field5181[169] + class33.field385);
                        return;
                    }
                    if (arg3.startsWith(field5181[8])) {
                        int var32 = Integer.parseInt(arg3.substring(8, 9));
                        class153.field1892 = var32;
                        class152.method1273((byte) -81);
                        class437.method3350(arg2 ^ 0xFFFFA736, field5181[105]);
                        return;
                    }
                    if (arg3.startsWith(field5181[11])) {
                        int var33 = arg3.indexOf(32);
                        if (var33 < 0) {
                            class437.method3350(107, field5181[199]);
                            return;
                        }
                        int var34 = class244.method2078(arg2 + 15234, arg3.substring(var33 - -1));
                        class289.field4305.method655(arg2 + 22682, var34, class289.field4305.field816);
                        class124.method1077(arg2 + 22662);
                        class28.field344 = false;
                        class176.method1543(23);
                        if (var34 != class289.field4305.field816.method646(false)) {
                            class437.method3350(105, field5181[24]);
                            return;
                        }
                        class437.method3350(114, field5181[127]);
                        return;
                    }
                    if (arg3.startsWith(field5181[95])) {
                        if (class289.field4305.field816.method646(false) == 0) {
                            class437.method3350(48, field5181[198]);
                            return;
                        }
                        int var35 = class244.method2078(arg2 + 15234, arg3.substring(arg3.indexOf(32) + 1));
                        class726.field10489 = var35;
                        class437.method3350(46, field5181[91] + class726.field10489);
                        return;
                    }
                    if (arg3.startsWith(field5181[189])) {
                        int var36 = class244.method2078(-7431, arg3.substring(arg3.indexOf(32) + 1));
                        class443.field6517 = var36;
                        class280.field4202 = var36;
                        class437.method3350(95, field5181[19] + var36);
                        class176.method1543(-127);
                        return;
                    }
                    if (arg3.equals(field5181[29])) {
                        class268.field4092 = !class268.field4092;
                        class437.method3350(arg2 ^ 0xFFFFA749, field5181[148] + (class268.field4092 ? field5181[182] : field5181[122]));
                        return;
                    }
                    if (arg3.startsWith(field5181[129])) {
                        File var37 = new File(arg3.substring(10));
                        if (var37.exists()) {
                            var37 = new File(arg3.substring(10) + "." + class430.method3299(101) + field5181[120]);
                            if (var37.exists()) {
                                class437.method3350(45, field5181[99]);
                                return;
                            }
                        }
                        if (class643.field9331 != null) {
                            class643.field9331.close();
                            class643.field9331 = null;
                        }
                        try {
                            class643.field9331 = new FileOutputStream(var37);
                            return;
                        } catch (FileNotFoundException var47) {
                            class437.method3350(42, field5181[202] + var37.getName());
                            return;
                        } catch (SecurityException var48) {
                            class437.method3350(arg2 + 22686, field5181[187] + var37.getName());
                            return;
                        }
                    }
                    if (arg3.equals(field5181[203])) {
                        if (class643.field9331 != null) {
                            class643.field9331.close();
                        }
                        class643.field9331 = null;
                        return;
                    }
                    if (arg3.startsWith(field5181[25])) {
                        File var38 = new File(arg3.substring(10));
                        if (!var38.exists()) {
                            class437.method3350(68, field5181[100]);
                            return;
                        }
                        byte[] var39 = class655.method4807(var38, (byte) -52);
                        if (var39 == null) {
                            class437.method3350(57, field5181[13]);
                            return;
                        }
                        String[] var40 = class350.method2878(class200.method1793(class367.method2973(var39, (byte) -101), false, "", '\r'), '\n', (byte) 99);
                        class540.method4065(arg2 + 22670, var40);
                    }
                    if (arg3.startsWith(field5181[9])) {
                        short var41 = (short) class244.method2078(-7431, arg3.substring(5));
                        if (var41 > 0) {
                            class106.field1225 = var41;
                        }
                        return;
                    }
                    if (class138.field1645 == 10) {
                        class534.field7818++;
                        class280 var42 = class610.method4508(class131.field1533, class279.field4190, (byte) -99);
                        var42.field4197.method1428((byte) -24, arg3.length() + 3);
                        var42.field4197.method1428((byte) -24, arg0 ? 1 : 0);
                        var42.field4197.method1428((byte) -24, arg1 ? 1 : 0);
                        var42.field4197.method1464(arg3, 255);
                        class106.method934((byte) 53, var42);
                    }
                    if (arg3.startsWith(field5181[141]) && class64.field667 != class31.field364) {
                        class729.method5319(false, class244.method2078(-7431, arg3.substring(4)));
                        return;
                    }
                } catch (Exception var49) {
                    class437.method3350(93, class309.field4849.method2616(false, class167.field2300));
                    return;
                }
            }
            if (class138.field1645 != 10) {
                class437.method3350(75, class309.field4850.method2616(false, class167.field2300) + arg3);
            }
        } catch (RuntimeException var51) {
            throw class759.method5498(var51, field5181[138] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5181[1] : field5181[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)I")
    private final int method2779(byte arg0) {
        try {
            if (arg0 == -22) {
                field5169++;
                int var2 = this.field5179.field7318 * this.field5162.field1946 * this.field5161;
                return this.field5171 ? var2 * 4 / 3 : var2;
            } else {
                return 82;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5181[214] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "([BIIBI)V")
    public final void method2780(byte[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field5168++;
            if (arg4 > 0 && !class40.method269(arg4, 127)) {
                throw new IllegalArgumentException("");
            } else if (arg2 <= 0 || class40.method269(arg2, 94)) {
                int var6 = this.field5179.field7318;
                int var7 = 0;
                if (arg3 < 104) {
                    this.field5180 = null;
                }
                int var8 = arg2 > arg4 ? arg4 : arg2;
                int var9 = arg4 >> 1;
                int var10 = arg2 >> 1;
                byte[] var11 = arg0;
                byte[] var12 = new byte[var6 * var10 * var9];
                while (true) {
                    OpenGL.glTexImage2Dub(arg1, var7, this.method2773(-83), arg4, arg2, 0, class311.method2626((byte) -117, this.field5179), 5121, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg4 * var6;
                    byte[] var14 = var12;
                    for (int var15 = 0; var15 < var6; var15++) {
                        int var16 = var15;
                        int var17 = var15;
                        int var18 = var15 + var13;
                        for (int var19 = 0; var19 < var10; var19++) {
                            for (int var20 = 0; var20 < var9; var20++) {
                                byte var21 = var11[var17];
                                int var22 = var6 + var17;
                                int var23 = var11[var22] + var21;
                                int var24 = var11[var18] + var23;
                                var17 = var6 + var22;
                                int var25 = var6 + var18;
                                int var26 = var11[var25] + var24;
                                var12[var16] = (byte) (var26 >> 2);
                                var18 = var6 + var25;
                                var16 += var6;
                            }
                            var17 += var13;
                            var18 += var13;
                        }
                    }
                    var12 = var11;
                    arg2 = var10;
                    var11 = var14;
                    arg4 = var9;
                    var8 >>= 0x1;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                    var7++;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var28) {
            throw class759.method5498(var28, field5181[215] + (arg0 == null ? field5181[1] : field5181[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lrda;ILeu;Lpj;IZ)V")
    public class328(class690 arg0, int arg1, class505 arg2, class157 arg3, int arg4, boolean arg5) {
        try {
            this.field5162 = arg3;
            this.field5179 = arg2;
            this.field5167 = arg1;
            this.field5171 = arg5;
            this.field5165 = arg0;
            this.field5161 = arg4;
            OpenGL.glGenTextures(1, class324.field5126, 0);
            this.field5172 = class324.field5126[0];
            this.method2772(9984);
            this.method2777(0, false);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5181[211] + (arg0 == null ? field5181[1] : field5181[2]) + ',' + arg1 + ',' + (arg2 == null ? field5181[1] : field5181[2]) + ',' + (arg3 == null ? field5181[1] : field5181[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2781(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2782(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
