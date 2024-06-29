import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class693 extends class417 {

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "[Lak;")
    public static class369[] field9663 = new class369[14];

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "[Lwm;")
    public static class589[] field9665 = new class589[8];

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "B")
    private byte field9662;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "B")
    private byte field9669;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "J")
    public static long field9668;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Ljava/lang/String;")
    private String field9670;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lso;I)V")
    public final void method610(class494 arg0, int arg1) {
        this.field9670 = arg0.method2984((byte) -92);
        field9667++;
        if (arg1 >= -121) {
            method3909(-80, 13, null, -66, null, 101);
        }
        if (this.field9670 != null) {
            arg0.method2964((byte) 48);
            this.field9662 = arg0.method2943((byte) 16);
            this.field9669 = arg0.method2943((byte) 16);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhs;Z)V")
    public final void method611(class344 arg0, boolean arg1) {
        field9666++;
        if (this.field9670 != null) {
            arg0.field4806 = this.field9662;
            arg0.field4798 = this.field9669;
        }
        if (arg1) {
            arg0.field4802 = this.field9670;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
    public static void method3908(byte arg0) {
        if (arg0 > -104) {
            field9664 = -97;
        }
        field9663 = null;
        field9665 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[BILjava/lang/String;I)I")
    public static final int method3909(int arg0, int arg1, byte[] arg2, int arg3, String arg4, int arg5) {
        field9671++;
        if (arg0 != 27535) {
            method3909(69, -36, null, 22, null, 114);
        }
        int var6 = arg5 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg3 + var7] = -97;
            } else {
                arg2[arg3 + var7] = 63;
            }
        }
        return var6;
    }
}
