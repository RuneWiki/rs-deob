import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class570 extends class154 {

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public int field8115 = 0;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public int field8102;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field8103;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public int field8107;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field8109;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public int field8110;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public int field8111;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public int field8112;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public int field8113;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public int field8117;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public int field8122;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public int field8124;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public int field8125;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    public int field8126;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public int field8131;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lho;")
    public class161 field8114;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "Lho;")
    public class161 field8119;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lrea;")
    public class221 field8105;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "Lrea;")
    public class221 field8129;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Ltea;")
    public class253 field8106;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "Ltea;")
    public class253 field8127;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Lij;")
    public class445 field8121;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lwda;")
    public class666 field8104;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Lfl;")
    public class771 field8116;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
    public boolean field8108;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Z")
    public boolean field8118;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Z")
    public boolean field8120;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
    public int[] field8123;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public final void method3310(byte arg0) {
        field8128++;
        int var2 = this.field8102;
        boolean var3 = this.field8108;
        if (this.field8121 != null) {
            class445 var4 = this.field8121.method2580(58, class694.field9613);
            if (var4 == null) {
                this.field8122 = 0;
                this.field8117 = 256;
                this.field8124 = 0;
                this.field8123 = null;
                this.field8102 = -1;
                this.field8103 = 256;
                this.field8125 = 0;
                this.field8108 = false;
                this.field8110 = 0;
                this.field8118 = false;
                this.field8111 = 0;
            } else {
                this.field8118 = var4.field6058;
                this.field8111 = var4.field6066;
                this.field8122 = var4.field6032 << 9;
                this.field8110 = var4.field6094;
                this.field8103 = var4.field6117;
                this.field8117 = var4.field6081;
                this.field8124 = var4.field6071;
                this.field8123 = var4.field6112;
                this.field8108 = var4.field6057;
                this.field8102 = var4.field6047;
            }
        } else if (this.field8104 != null) {
            int var5 = class69.method626(true, this.field8104);
            if (var2 != var5) {
                this.field8102 = var5;
                class568 var6 = this.field8104.field9253;
                if (var6.field8023 != null) {
                    var6 = var6.method3283((byte) -110, class694.field9613);
                }
                if (var6 == null) {
                    this.field8108 = this.field8104.field9253.field8050;
                    this.field8117 = 256;
                    this.field8110 = this.field8122 = this.field8125 = 0;
                    this.field8103 = 256;
                } else {
                    this.field8103 = var6.field8069;
                    this.field8125 = var6.field8030 << 9;
                    this.field8122 = var6.field8044 << 9;
                    this.field8110 = var6.field8033;
                    this.field8117 = var6.field8085;
                    this.field8108 = var6.field8050;
                }
            }
        } else if (this.field8116 != null) {
            this.field8102 = class448.method2602(this.field8116, (byte) 29);
            this.field8117 = 256;
            this.field8110 = this.field8116.field10651;
            this.field8103 = 256;
            this.field8122 = this.field8116.field10642 << 9;
            this.field8108 = this.field8116.field10621;
            this.field8125 = 0;
        }
        if (arg0 != -89 || this.field8102 == var2 && var3 == this.field8108) {
            return;
        }
        if (this.field8114 == null) {
            return;
        }
        class456.field6213.method352(this.field8114);
        this.field8129 = null;
        this.field8106 = null;
        this.field8114 = null;
    }
}
