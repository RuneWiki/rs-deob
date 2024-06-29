import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class559 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field8117 = 0;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Llc;")
    public static class435 field8119 = new class435(22, 10);

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public int field8118;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public int field8120;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public int field8121;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public int field8123;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[S)[S", line = 4)
    public static final short[] method3354(int arg0, short[] arg1) {
        if (arg0 <= 35) {
            return null;
        }
        field8125++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class85.method682(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 25)
    public static void method3355(byte arg0) {
        if (arg0 != 127) {
            method3354(11, null);
        }
        field8119 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILla;)V", line = 48)
    public static final void method3356(int arg0, class423 arg1) {
        class744.field10384 = arg1.method2602((byte) -120, "hitmarks");
        field8122++;
        class613.field8756 = arg1.method2602((byte) -122, "hitbar_default");
        class642.field9132 = arg1.method2602((byte) -120, "timerbar_default");
        class746.field10414 = arg1.method2602((byte) -121, "headicons_pk");
        class663.field9476 = arg1.method2602((byte) -123, "headicons_prayer");
        class675.field9609 = arg1.method2602((byte) -122, "hint_headicons");
        class73.field1101 = arg1.method2602((byte) -126, "hint_mapmarkers");
        class91.field1300 = arg1.method2602((byte) -122, "mapflag");
        class286.field3980 = arg1.method2602((byte) -126, "cross");
        class647.field9317 = arg1.method2602((byte) -118, "mapdots");
        class693.field9814 = arg1.method2602((byte) -122, "scrollbar");
        class490.field7061 = arg1.method2602((byte) -121, "name_icons");
        class28.field265 = arg1.method2602((byte) -120, "floorshadows");
        class558.field8114 = arg1.method2602((byte) -118, "compass");
        if (arg0 != -7167) {
            field8124 = 91;
        }
        class507.field7372 = arg1.method2602((byte) -118, "otherlevel");
        class695.field9831 = arg1.method2602((byte) -120, "hint_mapedge");
    }
}
