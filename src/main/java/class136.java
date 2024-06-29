import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class136 extends class498 {

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public int field1783 = 0;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "Lir;")
    public class22 field1787;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "Ltc;")
    public class238 field1777;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "Ltc;")
    public class238 field1780;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "Lfu;")
    public class270 field1774;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Let;")
    public class429 field1778;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "Z")
    public boolean field1782;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "[I")
    public int[] field1781;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)V")
    public static final void method855(int arg0, byte arg1) {
        if (arg1 > -67) {
            method855(-63, (byte) 25);
        }
        field1775++;
        class45 var2 = class354.method2094(arg0, (byte) -50, 2);
        var2.method261(4);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method856(byte arg0) {
        field1786++;
        if (arg0 > -107) {
            this.method856((byte) -27);
        }
        int var2 = this.field1785;
        if (this.field1774 != null) {
            class270 var3 = this.field1774.method1704((byte) -109, class163.field2413);
            if (var3 == null) {
                this.field1790 = 0;
                this.field1785 = -1;
                this.field1781 = null;
                this.field1789 = 0;
                this.field1788 = 0;
                this.field1773 = 0;
            } else {
                this.field1781 = var3.field3999;
                this.field1789 = var3.field3974;
                this.field1790 = var3.field4015;
                this.field1785 = var3.field3963;
                this.field1773 = var3.field3935;
                this.field1788 = var3.field3936 << 7;
            }
        } else if (this.field1778 != null) {
            int var4 = class123.method812(this.field1778, 126);
            if (var2 != var4) {
                this.field1785 = var4;
                class322 var5 = this.field1778.field6055;
                if (var5.field4693 != null) {
                    var5 = var5.method1939(15964, class163.field2413);
                }
                if (var5 == null) {
                    this.field1773 = this.field1788 = 0;
                } else {
                    this.field1773 = var5.field4698;
                    this.field1788 = var5.field4650 << 7;
                }
            }
        } else if (this.field1787 != null) {
            this.field1785 = class460.method2684(-125, this.field1787);
            this.field1773 = this.field1787.field289;
            this.field1788 = this.field1787.field264 << 7;
        }
        if (this.field1785 != var2 && this.field1780 != null) {
            class138.field1810.method2312(this.field1780);
            this.field1780 = null;
        }
    }
}
