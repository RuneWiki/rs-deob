import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class672 extends class344 {

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Z")
    private boolean field9533 = false;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Z")
    private boolean field9534 = false;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Lpia;")
    private class100 field9531;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lir;")
    private class25 field9538;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9545 = new String[] { method4867(method4866("Y\u00010\rC")), method4867(method4866("G\u001cr%")), method4867(method4866("Y\u00010\fC")), method4867(method4866("RG0g\u0016")), method4867(method4866("K\u001b{(\u0000~\bj,\u0019f\u000fx:\u000e]")), method4867(method4866("]\u0000s,")), method4867(method4866("Y\u00010\u000eC")), method4867(method4866("K\u001b{(\u0000~\bj,\u0019m\fn=\u0003")), method4867(method4866("Z\n\u007f%\u000e")), method4867(method4866("Y\u00010\u000bC")), method4867(method4866("Y\u00010\u0001C")), method4867(method4866("Y\u00010\bC")), method4867(method4866("Y\u00010\nC")), method4867(method4866("Y\u00010\u000fC")), method4867(method4866("G\u0006l$\nE:\u007f$\u001bE\fl")), method4867(method4866("Z\u001cp\n\u0004E\u0006k;")), method4867(method4866("Z\u001cp\f\u0013Y\u0006p,\u0005]")), method4867(method4866("Z\u001cp\r\u0002[")), method4867(method4866("L\u0007h\u0004\nY:\u007f$\u001bE\fl")), method4867(method4866("Y\u00010\u0000C")), method4867(method4866("_\bl0\u0002G\u000e>?\u000eJZ>>\u001d\u007f\fl=\u000eQR\u0014?\n[\u0010w'\f\t\u000fr&\n]Ii(\u001fL\u001bZ,\u001b]\u0001%C\u001eG\u0000x&\u0019DIh,\b\u001aIm<\u0005m\u0000lra\\\u0007w/\u0004[\u0004>?\u000eJ]>:\u001eG*q%\u0004\\\u001b%C\u001eG\u0000x&\u0019DIx%\u0004H\u001d>:\u001eG,f9\u0004G\fp=P#\u001cp \rF\u001bsi\rE\u0006\u007f=KK\u001b{(\u0000~\bj,\u0019m\fn=\u0003\u0012ck'\u0002O\u0006l$KO\u0005q(\u001f\t\u000bl,\nB>\u007f=\u000e[&x/\u0018L\u001d%C\u001eG\u0000x&\u0019DIm(\u0006Y\u0005{;XmIp&\u0019D\br\u001a\nD\u0019r,\u0019\u0012ck'\u0002O\u0006l$KZ\bs9\u0007L\u001b]<\tLI{'\u001dd\bn\u001a\nD\u0019r,\u0019\u0012ch&\u0002MIs(\u0002GA7i\u0010#\u001f{*_\t\u001ep\u0007\u0004[\u0004\u007f%K\u0014Ij,\u0013]\u001cl,XmAp&\u0019D\br\u001a\nD\u0019r,\u0019\u0005Iy%4}\ff\n\u0004F\u001bz\u0012[tGf0\u0011\u0000Gl+\fHR\u0014>\u0005g\u0006l$\nEGf0\u0011\tT>{E\u0019Ci'%F\u001bs(\u0007\u0007\u0011g3F\u0018G.ra_\f}zK^\u0007H,\b]\u0006liV\t\u0007q;\u0006H\u0005w3\u000e\u0001\u001eh\u001f\u000e[\u001d{1B\u0012ch,\b\u001aIi'9L\u000fr,\b]\u0000q'K\u0014Il,\rE\f}=C^\u0007H,\b]\u0006leK^\u0007P&\u0019D\brg\u0013P\u00137ra_\f}zKL\u0007h\n\u0004E\u0006k;K\u0014Ij,\u0013]\u001cl,(\\\u000b{a\u000eG\u001fS(\u001bz\bs9\u0007L\u001b2i\u001cG;{/\u0007L\nj \u0004G@0;\fKR\u0014?\u000eJ]>:\u001bL\nk%\n[*q%\u0004\\\u001b>tKZ\u001cp\n\u0004E\u0006k;AY\u0006ia\bE\bs9C\u0004\rq=CZ\u001cp\r\u0002[E>>\u0005{\fx%\u000eJ\u001dw&\u0005\u0000E>yE\u0019E>xE\u0019@2i\u0018\\\u0007[1\u001bF\u0007{'\u001f\u0000R\u0014/\u0007F\bji\u0018A\u0006l,-H\nj&\u0019\tT>*\u0007H\u0004na\u001cH\u001d{;/L\u0019j!DK\u001b{(\u0000~\bj,\u0019m\fn=\u0003\u0004\u000bl,\nB>\u007f=\u000e[&x/\u0018L\u001d4>\u0005g\u0006l$\nEGieK\u0019G.eK\u0018G.`P#\u000fr&\n]Ip-\u0004]\f>tKM\u0006ja\u001cG?{*\u001fF\u001b2i\u001cG'q;\u0006H\u000501\u0012S@%C\rE\u0006\u007f=KO\u001b{:\u0005L\u0005>tKY\u0006iaZ\u0007Y3(\tZAp-\u0004]\f7eK\u001bG.`P#\u001f{*_\t\u001ak;\rH\n{\n\u0004E\u0006k;K\u0014Ih,\b\u001dA{'\u001dj\u0006r&\u001e[E>/\u0019L\u001ap,\u0007\u0003\u001av&\u0019L/\u007f*\u001fF\u001b7b\u0018Y\f}<\u0007H\u001b]&\u0007F\u001clc\u0018A\u0006l,-H\nj&\u0019\u0012cy%4o\u001b\u007f.(F\u0005q;K\u0014Ih,\b\u001dAs \u0013\u0001\u001ak;\rH\n{\n\u0004E\u0006k;E[\u000e|eKN\u0005A\u000f\u0004NG}&\u0007F\u001b0;\fKE>.\u0007v/q.-[\by\n\u0004F\u001bz`G\t\u001ak;\rH\n{\n\u0004E\u0006k;EH@%C\u0016#")), method4867(method4866("\\\u0007w/\u0004[\u0004>/\u0007F\bji\u001f@\u0004{ra\\\u0007w/\u0004[\u0004>/\u0007F\bji\u0018J\br,P#\u001f\u007f;\u0012@\u0007yi\u001dL\n-i\u001c_?{;\u001fL\u0011%C\u001dH\u001bg \u0005NIx%\u0004H\u001d>>\n]\fl\r\u000eY\u001dvra_\u0006w-KD\bw'C\u0000IeC\u001cH\u001d{;/L\u0019j!K\u0014Iy%4d\u001cr=\u0002}\ff\n\u0004F\u001bzyESR\u0014?\u000eJ]>,\b\u007f\fl=\u000eQI#i\fE6S&\u000fL\u0005H \u000e^$\u007f=\u0019@\u00114.\u0007v?{;\u001fL\u0011%C\u001c_?{;\u001fL\u001101K\u0014Iz&\u001f\u0001\u000er\u0016%F\u001bs(\u0007d\bj;\u0002Q2.\u0014G\t\f}\u001f\u000e[\u001d{1EQ\u0010d`P#\u001eh\u001f\u000e[\u001d{1EPI#i\u000fF\u001d6.\u0007v'q;\u0006H\u0005S(\u001f[\u0000f\u0012ZtE>,\b\u007f\fl=\u000eQGf0\u0011\u0000R\u0014>\u001d\u007f\fl=\u000eQGdiV\t\rq=CN\u0005A\u0007\u0004[\u0004\u007f%&H\u001dl \u0013r[CeKL\nH,\u0019]\ffg\u0013P\u00137raN\u0005A\u001d\u000eQ*q&\u0019M2.\u0014EQI#i\u000fF\u001d6.\u0007v={1\u001f\\\u001b{\u0004\n]\u001bw10\u00194Ey6\u0005Iy%4d\u001cr=\u0002}\ff\n\u0004F\u001bzyB\u0003\u001a}(\u0007LR\u0014.\u0007v={1(F\u0006l-0\u0019400K\u0014Iz&\u001f\u0001\u000er\u0016?L\u0011j<\u0019L$\u007f=\u0019@\u0011Ey6rXCeKN\u0005A\u0004\u001eE\u001dw\u001d\u000eQ*q&\u0019MY7c\u0018J\br,P#\u000er\u0016?L\u0011]&\u0004[\rEy6\u0007\u0013>tK]\u0000s,P#\u000er\u0016?L\u0011]&\u0004[\rEy6\u0007\u001e>tK\u0018G.raN\u0005A\u000f\u0004N/l(\fj\u0006q;\u000f\tT>xE\u0019D}%\nD\u00196a\fE6X&\f\u0007\fp-@L\nH,\u0019]\ffg\u0011\u0000Cy%4o\u0006yg\u0018J\br,G\tY0yG\tX0yB\u0012cy%4y\u0006m \u001f@\u0006piV\t\u000fj;\nG\u001ax&\u0019DA7raTc")), method4867(method4866("Y\u00010u\u0002G\u0000jwC")) };

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field9539 = 0;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field9542 = 0;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field9536;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field9543;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Lgda;")
    public static class58 field9530;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 6)
    public static void method4863(byte arg0) {
        try {
            field9530 = null;
            int var1 = -128 % ((arg0 - 7) / 51);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9545[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V", line = 15)
    public final void method835(int arg0, int arg1, int arg2) {
        try {
            ++field9535;
            if (arg1 != 16) {
                this.method831(true);
            }
            if (this.field9534) {
                int var4 = 1 << (3 & arg0);
                float var5 = (float) (1 << (arg0 >> 3 & 7)) / 32.0F;
                int var6 = 65535 & arg2;
                float var7 = (float) ((199166 & arg2) >> 16) / 8.0F;
                long var8 = this.field9538.field272;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field9545[5]), (float) (super.field5595.field2394 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field9545[8]), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field9545[7]), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, field9545[4]), var7);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field9545[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 43)
    public static final void method4864(int arg0) {
        try {
            ++field9532;
            if (class254.field3874 != null) {
                class254.field3874.method5700(false);
            }
            if (arg0 < 101) {
                method4864(-116);
            }
            if (class477.field7261 != null) {
                class477.field7261.method5700(false);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9545[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lvf;Lpia;)V", line = 62)
    public class672(class159 arg0, class100 arg1) {
        super(arg0);
        try {
            this.field9531 = arg1;
            if (this.field9531.field1463 != null && super.field5595.field2467 && super.field5595.field2518) {
                class789 var3 = class102.method970(35633, field9545[21], -7876, super.field5595);
                class789 var4 = class102.method970(35632, field9545[20], -7876, super.field5595);
                this.field9538 = class728.method5279(new class789[] { var3, var4 }, 3, super.field5595);
                this.field9533 = this.field9538 != null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9545[22] + (arg0 != null ? field9545[3] : field9545[1]) + ',' + (arg1 != null ? field9545[3] : field9545[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V", line = 85)
    public final void method834(int arg0, boolean arg1) {
        try {
            if (arg0 != 16) {
                method4864(88);
            }
            ++field9537;
            class12 var3 = super.field5595.method1468((byte) 29);
            if (this.field9533 && var3 != null) {
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1497(var3, true);
                super.field5595.method1432((byte) 3, 0);
                super.field5595.method1497(this.field9531.field1463, true);
                long var4 = this.field9538.field272;
                OpenGL.glUseProgramObjectARB(var4);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field9545[14]), 0);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field9545[18]), 1);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field9545[17]), -super.field5595.field2431[0], -super.field5595.field2431[1], -super.field5595.field2431[2]);
                OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field9545[15]), super.field5595.field2480, super.field5595.field2476, super.field5595.field2448, 1.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field9545[16]), 928.0F * Math.abs(super.field5595.field2431[1]) + 96.0F);
                this.field9534 = true;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9545[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lgb;II)V", line = 124)
    public final void method836(class224 arg0, int arg1, int arg2) {
        try {
            if (!this.field9534) {
                super.field5595.method1497(arg0, true);
                super.field5595.method1425((byte) 35, arg1);
            }
            ++field9541;
            if (arg2 != 16) {
                this.field9531 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9545[2] + (arg0 != null ? field9545[3] : field9545[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Z", line = 140)
    public final boolean method831(boolean arg0) {
        try {
            ++field9529;
            if (arg0) {
                this.method837((byte) -11, true);
            }
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9545[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZ)V", line = 151)
    public final void method837(byte arg0, boolean arg1) {
        try {
            if (arg0 >= -64) {
                this.method834(90, false);
            }
            ++field9540;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9545[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)I", line = 171)
    public static final int method4865(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field9536;
            int var5 = -class763.field11200[arg2 * 8192 / arg4] + 65536 >> 1;
            if (arg3 != 1) {
                field9542 = 106;
            }
            return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9545[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 185)
    public final void method833(int arg0) {
        try {
            if (arg0 <= 38) {
                this.method833(27);
            }
            ++field9543;
            if (this.field9534) {
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1497((class224) null, true);
                super.field5595.method1432((byte) 3, 0);
                super.field5595.method1497((class224) null, true);
                OpenGL.glUseProgramObjectARB(0L);
                this.field9534 = false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9545[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4866(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 107);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4867(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
