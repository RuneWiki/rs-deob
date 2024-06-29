import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class340 extends class55 {

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field4580;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Z")
    public static boolean field4586 = true;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method2004(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class24.field186[var1] = true;
        }
        field4579++;
        if (arg0 != 2) {
            field4586 = true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public abstract void method1724(OggPacket arg0, boolean arg1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILcea;I[I)V")
    public static final void method2005(int arg0, class215 arg1, int arg2, int[] arg3) {
        if (arg1.field821 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field821.length; var5++) {
                if (arg1.field821[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field871 != -1) {
                class300 var6 = class460.field6365.method1090(arg1.field871, 16383);
                int var7 = var6.field4043;
                if (var7 == 1) {
                    arg1.field862 = 0;
                    arg1.field855 = arg0;
                    arg1.field846 = 0;
                    arg1.field811 = 0;
                    arg1.field806 = 1;
                    if (!arg1.field819) {
                        class153.method930((byte) -126, arg1, arg1.field846, var6);
                    }
                }
                if (var7 == 2) {
                    arg1.field862 = 0;
                }
            }
        }
        field4582++;
        if (arg2 != 1) {
            method2005(58, null, 36, null);
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg1.field821 == null || arg1.field821[var9] == -1 || class460.field6365.method1090(arg3[var9], 16383).field4056 >= class460.field6365.method1090(arg1.field821[var9], arg2 ^ 0x3FFE).field4056) {
                arg1.field821 = arg3;
                arg1.field897 = arg1.field895;
                arg1.field855 = arg0;
            }
        }
        if (var8) {
            arg1.field855 = arg0;
            arg1.field897 = arg1.field895;
            arg1.field821 = arg3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)[Loe;")
    public static final class202[] method2006(int arg0) {
        field4583++;
        if (arg0 != 0) {
            method2004(96);
        }
        return new class202[] { class696.field9719, class696.field9722, class696.field9723, class696.field9724, class696.field9725, class696.field9726, class696.field9727, class696.field9728, class696.field9729, class696.field9730, class696.field9731, class696.field9732 };
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class340(OggStreamState arg0) {
        this.field4580 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public static final void method2007(int arg0) {
        field4584++;
        if (arg0 != -1) {
            method2006(-108);
        }
        if (!class436.field6123) {
            class436.field6123 = true;
            class249.field3236 = true;
            class285.field3771 += (-12.0F - class285.field3771) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method2008(OggPacket arg0, int arg1) {
        field4585++;
        this.method1724(arg0, false);
        if (arg1 != 21000) {
            field4586 = false;
        }
        this.field4578++;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public abstract void method1723(int arg0);
}
