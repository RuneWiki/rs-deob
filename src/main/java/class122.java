import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class122 {

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    private int field2019 = 2;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[I")
    private int[] field2016 = new int[2];

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "[I")
    private int[] field2017 = new int[2];

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    private int field2022;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    private int field2023;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    private int field2025;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    private int field2026;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "()V", line = 4)
    public final void method844() {
        this.field2023 = 0;
        this.field2024 = 0;
        this.field2026 = 0;
        this.field2022 = 0;
        this.field2025 = 0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I", line = 12)
    public final int method845(int arg0) {
        if (this.field2025 >= this.field2023) {
            this.field2022 = this.field2017[this.field2024++] << 15;
            if (this.field2024 >= this.field2019) {
                this.field2024 = this.field2019 - 1;
            }
            this.field2023 = (int) ((double) this.field2016[this.field2024] / 65536.0D * (double) arg0);
            if (this.field2023 > this.field2025) {
                this.field2026 = ((this.field2017[this.field2024] << 15) - this.field2022) / (this.field2023 - this.field2025);
            }
        }
        this.field2022 += this.field2026;
        this.field2025++;
        return this.field2022 - this.field2026 >> 15;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lha;)V", line = 30)
    public final void method846(class40 arg0) {
        this.field2020 = arg0.method257((byte) 22);
        this.field2018 = arg0.method255((byte) 96);
        this.field2021 = arg0.method255((byte) 96);
        this.method847(arg0);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Lha;)V", line = 41)
    public final void method847(class40 arg0) {
        this.field2019 = arg0.method257((byte) 67);
        this.field2016 = new int[this.field2019];
        this.field2017 = new int[this.field2019];
        for (int var2 = 0; var2 < this.field2019; var2++) {
            this.field2016[var2] = arg0.method254((byte) -90);
            this.field2017[var2] = arg0.method254((byte) -49);
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 56)
    public class122() {
        this.field2016[0] = 0;
        this.field2016[1] = 65535;
        this.field2017[0] = 0;
        this.field2017[1] = 65535;
    }
}
