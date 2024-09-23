import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ACEWFDYF")
public class class1 extends class39 {

    @OriginalMember(owner = "ACEWFDYF", name = "o", descriptor = "I")
    private int field3 = 6;

    @OriginalMember(owner = "ACEWFDYF", name = "p", descriptor = "I")
    private int field4 = -39282;

    @OriginalMember(owner = "ACEWFDYF", name = "u", descriptor = "B")
    private byte field9 = 1;

    @OriginalMember(owner = "ACEWFDYF", name = "C", descriptor = "Z")
    private boolean field17 = true;

    @OriginalMember(owner = "ACEWFDYF", name = "r", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "ACEWFDYF", name = "s", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "ACEWFDYF", name = "t", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "ACEWFDYF", name = "v", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "ACEWFDYF", name = "w", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "ACEWFDYF", name = "x", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "ACEWFDYF", name = "y", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "ACEWFDYF", name = "D", descriptor = "LGMRGYXFL;")
    private class21 field18;

    @OriginalMember(owner = "ACEWFDYF", name = "q", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "ACEWFDYF", name = "A", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "ACEWFDYF", name = "m", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "ACEWFDYF", name = "n", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "ACEWFDYF", name = "B", descriptor = "[I")
    public int[] field16;

    @OriginalMember(owner = "ACEWFDYF", name = "z", descriptor = "Lclient;")
    public static client field14;

    @OriginalMember(owner = "ACEWFDYF", name = "a", descriptor = "(B)LSIUJJQHQ;")
    public final class58 method1(byte arg0) {
        if (this.field9 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field1 != -1) {
            class67 var4 = class67.field1619[this.field1];
            int var5 = var4.field1621;
            int var6 = var4.field1622;
            int var7 = var4.field1623;
            int var8 = client.field257[var7 - var6];
            var3 = field14.field584[var5] >> var6 & var8;
        } else if (this.field2 != -1) {
            var3 = field14.field584[this.field2];
        }
        return var3 < 0 || var3 >= this.field16.length || this.field16[var3] == -1 ? null : class58.method455(this.field16[var3]);
    }

    @OriginalMember(owner = "ACEWFDYF", name = "<init>", descriptor = "(IIIIIIIZII)V")
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        this.field6 = arg5;
        this.field7 = arg3;
        this.field8 = arg2;
        this.field10 = arg0;
        this.field11 = arg1;
        this.field12 = arg6;
        this.field13 = arg8;
        if (arg4 != -1) {
            this.field18 = class21.field817[arg4];
            this.field5 = 0;
            this.field15 = client.field421;
            if (arg7 && this.field18.field822 != -1) {
                this.field5 = (int) (Math.random() * (double) this.field18.field818);
                this.field15 -= (int) (Math.random() * (double) this.field18.method277((byte) 110, this.field5));
            }
        }
        class58 var11 = class58.method455(this.field6);
        this.field1 = var11.field1477;
        this.field2 = var11.field1471;
        if (arg9 < this.field3 || arg9 > this.field3) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        this.field16 = var11.field1467;
    }

    @OriginalMember(owner = "ACEWFDYF", name = "a", descriptor = "(I)LFUTAQMCE;")
    public final class19 method2(int arg0) {
        int var2 = -1;
        if (this.field18 != null) {
            int var3 = client.field421 - this.field15;
            if (var3 > 100 && this.field18.field822 > 0) {
                var3 = 100;
            }
            label50: {
                do {
                    do {
                        if (var3 <= this.field18.method277((byte) 110, this.field5)) {
                            break label50;
                        }
                        var3 -= this.field18.method277((byte) 110, this.field5);
                        this.field5++;
                    } while (this.field5 < this.field18.field818);
                    this.field5 -= this.field18.field822;
                } while (this.field5 >= 0 && this.field5 < this.field18.field818);
                this.field18 = null;
            }
            this.field15 = client.field421 - var3;
            if (this.field18 != null) {
                var2 = this.field18.field819[this.field5];
            }
        }
        if (this.field4 != arg0) {
            this.field17 = !this.field17;
        }
        class58 var4;
        if (this.field16 == null) {
            var4 = class58.method455(this.field6);
        } else {
            var4 = this.method1((byte) 1);
        }
        return var4 == null ? null : var4.method456(this.field7, this.field8, this.field10, this.field11, this.field12, this.field13, var2);
    }
}
