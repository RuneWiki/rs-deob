import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
    public int[] field172;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    public int[] field173;

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class4() {
        class95.method783(16);
        this.field171 = class95.method788() == 0 ? 1 : class95.method783(4) + 1;
        if (class95.method788() != 0) {
            class95.method783(8);
        }
        class95.method783(2);
        if (this.field171 > 1) {
            this.field170 = class95.method783(4);
        }
        this.field172 = new int[this.field171];
        this.field173 = new int[this.field171];
        for (int var1 = 0; var1 < this.field171; var1++) {
            class95.method783(8);
            this.field172[var1] = class95.method783(8);
            this.field173[var1] = class95.method783(8);
        }
    }
}
