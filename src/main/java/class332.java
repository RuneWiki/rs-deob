import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class332 implements Runnable {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[Lfl;")
    public volatile class75[] field5222 = new class75[2];

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
    public volatile boolean field5227 = false;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Z")
    public volatile boolean field5221 = false;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field5226 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lnv;")
    public class493 field5228;

    @OriginalMember(owner = "client!ul", name = "run", descriptor = "()V")
    public final void run() {
        field5224++;
        this.field5221 = true;
        try {
            while (!this.field5227) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class75 var2 = this.field5222[var1];
                    if (var2 != null) {
                        var2.method532(-1);
                    }
                }
                class444.method2667(-28210, 10L);
                class177.method1196(null, -117, this.field5228);
            }
        } catch (Exception var9) {
            class502.method2968(null, (byte) -112, var9);
        } finally {
            Object var6 = null;
            this.field5221 = false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lza;IIIIII)Le;")
    public static final class530 method2089(class491 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5229++;
        long var7 = (long) arg3;
        if (arg4 != 27696) {
            method2090(true, null);
        }
        class530 var9 = (class530) class239.field4117.method1593((byte) 104, var7);
        short var10 = 2055;
        if (var9 == null) {
            class227 var11 = class280.method1839(2, 0, class81.field1407, arg3);
            if (var11 == null) {
                return null;
            }
            if (var11.field3936 < 13) {
                var11.method1571(-6296, 0);
            }
            var9 = arg0.method875(var11, var10, class247.field4237, 64, 768);
            class239.field4117.method1595(var9, var7, (byte) 83);
        }
        class530 var12 = var9.method739((byte) 2, var10, true);
        if (arg1 != 0) {
            var12.method756(arg1);
        }
        if (arg5 != 0) {
            var12.method734(arg5);
        }
        if (arg6 != 0) {
            var12.method761(arg6);
        }
        if (arg2 != 0) {
            var12.method773(0, arg2, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLjg;)Z")
    public static final boolean method2090(boolean arg0, class518 arg1) {
        field5225++;
        class39 var2 = class61.field928.method791(arg1.method28((byte) -118), arg0);
        if (var2.field651 == -1) {
            return true;
        } else {
            class517 var3 = class272.field4515.method2005(var2.field651, 34);
            return var3.field7645 == -1 ? true : var3.method3063(1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I")
    public static final int method2091(int arg0, int arg1) {
        if (arg0 == -17427) {
            field5220++;
            return arg1 & 0xFF;
        } else {
            return 111;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(CI)C")
    public static final char method2092(char arg0, int arg1) {
        field5223++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else if (arg1 == 69) {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        } else {
            return '\u0015';
        }
    }
}
