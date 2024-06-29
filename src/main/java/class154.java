import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class154 extends class732 {

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "[[B")
    private byte[][] field2389 = new byte[10][];

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lofa;")
    private class301 field2388 = new class301(null);

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Lofa;")
    private class301 field2396 = new class301(null);

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    private int field2393;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Lla;")
    private class422 field2394;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    private int field2395;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Lla;")
    public static class422 field2390;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "[I")
    private int[] field2391;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)V")
    public final void method1162(byte arg0) {
        field2386++;
        if (this.field2391 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10 && this.field2391.length > (this.field2395 + var2); var2++) {
            if (this.field2389[var2] == null && this.field2394.method2640(this.field2391[this.field2395 + var2], 0, 123)) {
                this.field2389[var2] = this.field2394.method2624(0, this.field2391[this.field2395 + var2], 0);
            }
        }
        if (arg0 != 85) {
            method1164(105);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[B)I")
    public final int method1163(int arg0, byte[] arg1) throws IOException {
        field2387++;
        if (this.field2391 == null) {
            if (!this.field2394.method2640(this.field2393, 0, 127)) {
                return 0;
            }
            byte[] var3 = this.field2394.method2624(arg0 ^ 0xFFFFFFFE, this.field2393, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field2396.field4534 = 0;
            this.field2396.field4543 = var3;
            int var4 = var3.length >> 1;
            this.field2391 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2391[var5] = this.field2396.method1989((byte) -30);
            }
        }
        if (this.field2391.length <= this.field2395) {
            return -1;
        }
        this.method1162((byte) 85);
        this.field2396.field4534 = 0;
        if (arg0 != -2) {
            this.method1162((byte) 67);
        }
        this.field2396.field4543 = arg1;
        do {
            if (this.field2396.field4534 >= this.field2396.field4543.length) {
                this.field2396.field4543 = null;
                return arg1.length;
            }
            if (this.field2388.field4543 == null) {
                if (this.field2389[0] == null) {
                    this.field2396.field4543 = null;
                    return this.field2396.field4534;
                }
                this.field2388.field4543 = this.field2389[0];
            }
            int var6 = this.field2396.field4543.length - this.field2396.field4534;
            int var7 = this.field2388.field4543.length - this.field2388.field4534;
            if (var7 > var6) {
                this.field2388.method1936(this.field2396.field4534, 10046, var6, this.field2396.field4543);
                this.field2396.field4543 = null;
                return arg1.length;
            }
            this.field2396.method1946(1735499792, this.field2388.field4543, this.field2388.field4534, var7);
            this.field2388.field4534 = 0;
            this.field2388.field4543 = null;
            this.field2395++;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field2389[var8] = this.field2389[var8 + 1];
            }
            this.field2389[9] = null;
        } while (this.field2391.length > this.field2395);
        this.field2396.field4543 = null;
        return this.field2396.field4534;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILla;I)V")
    public class154(int arg0, class422 arg1, int arg2) {
        super(arg0);
        this.field2393 = arg2;
        this.field2394 = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public static void method1164(int arg0) {
        field2390 = null;
        if (arg0 < 70) {
            field2390 = null;
        }
    }
}
