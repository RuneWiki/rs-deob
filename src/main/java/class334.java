import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class334 extends class18 {

    @OriginalMember(owner = "client!jj", name = "jc", descriptor = "Ltf;")
    private class524 field4684 = new class524();

    @OriginalMember(owner = "client!jj", name = "Df", descriptor = "Z")
    public boolean field4710 = true;

    @OriginalMember(owner = "client!jj", name = "uc", descriptor = "Lie;")
    public class639 field4708 = new class639();

    @OriginalMember(owner = "client!jj", name = "uf", descriptor = "Lie;")
    public class639 field4713 = new class639();

    @OriginalMember(owner = "client!jj", name = "mf", descriptor = "Lie;")
    public class639 field4714 = new class639();

    @OriginalMember(owner = "client!jj", name = "Tf", descriptor = "Lie;")
    public class639 field4715 = new class639();

    @OriginalMember(owner = "client!jj", name = "Je", descriptor = "Lie;")
    private class639 field4716 = new class639();

    @OriginalMember(owner = "client!jj", name = "ab", descriptor = "Lie;")
    private class639 field4717 = new class639();

    @OriginalMember(owner = "client!jj", name = "rf", descriptor = "I")
    public int field4728 = 512;

    @OriginalMember(owner = "client!jj", name = "Eb", descriptor = "Z")
    private boolean field4744 = false;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    private int field4725 = 1;

    @OriginalMember(owner = "client!jj", name = "sf", descriptor = "[F")
    private float[] field4719 = new float[16];

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "I")
    private int field4724 = 0;

    @OriginalMember(owner = "client!jj", name = "tf", descriptor = "F")
    public float field4758 = 1.0F;

    @OriginalMember(owner = "client!jj", name = "Be", descriptor = "I")
    public int field4731 = 0;

    @OriginalMember(owner = "client!jj", name = "Gb", descriptor = "I")
    public int field4732 = -1;

    @OriginalMember(owner = "client!jj", name = "Me", descriptor = "F")
    public float field4729 = 3584.0F;

    @OriginalMember(owner = "client!jj", name = "Pc", descriptor = "Z")
    public boolean field4765 = true;

    @OriginalMember(owner = "client!jj", name = "Yc", descriptor = "I")
    private int field4753 = -1;

    @OriginalMember(owner = "client!jj", name = "bd", descriptor = "I")
    public int field4727 = 0;

    @OriginalMember(owner = "client!jj", name = "ug", descriptor = "Z")
    private boolean field4759 = false;

    @OriginalMember(owner = "client!jj", name = "Kf", descriptor = "I")
    public int field4745 = 0;

    @OriginalMember(owner = "client!jj", name = "qc", descriptor = "I")
    public int field4779 = 0;

    @OriginalMember(owner = "client!jj", name = "Gc", descriptor = "I")
    private int field4743 = 0;

    @OriginalMember(owner = "client!jj", name = "qf", descriptor = "F")
    public float field4757 = -1.0F;

    @OriginalMember(owner = "client!jj", name = "Xd", descriptor = "I")
    public int field4773 = 3;

    @OriginalMember(owner = "client!jj", name = "Qd", descriptor = "I")
    public int field4769 = 128;

    @OriginalMember(owner = "client!jj", name = "Id", descriptor = "Z")
    public boolean field4738 = false;

    @OriginalMember(owner = "client!jj", name = "db", descriptor = "I")
    public int field4768 = -1;

    @OriginalMember(owner = "client!jj", name = "nc", descriptor = "I")
    public int field4721 = 0;

    @OriginalMember(owner = "client!jj", name = "hg", descriptor = "[Loo;")
    private class593[] field4793 = new class593[10];

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "Z")
    public boolean field4782 = true;

    @OriginalMember(owner = "client!jj", name = "kd", descriptor = "[F")
    public float[] field4746 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!jj", name = "cc", descriptor = "F")
    private float field4777 = 1.0F;

    @OriginalMember(owner = "client!jj", name = "Le", descriptor = "I")
    private int field4788 = -1;

    @OriginalMember(owner = "client!jj", name = "hc", descriptor = "Lff;")
    public class733 field4770 = class28.field357;

    @OriginalMember(owner = "client!jj", name = "ag", descriptor = "[F")
    private float[] field4778 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!jj", name = "Tc", descriptor = "I")
    public int field4754 = 0;

    @OriginalMember(owner = "client!jj", name = "ie", descriptor = "F")
    public float field4736 = -1.0F;

    @OriginalMember(owner = "client!jj", name = "yg", descriptor = "F")
    public float field4767 = 1.0F;

    @OriginalMember(owner = "client!jj", name = "Zd", descriptor = "I")
    private int field4783 = 16777215;

    @OriginalMember(owner = "client!jj", name = "Yf", descriptor = "Liea;")
    public class421 field4726 = class686.field9617;

    @OriginalMember(owner = "client!jj", name = "Uc", descriptor = "F")
    public float field4801 = 1.0F;

    @OriginalMember(owner = "client!jj", name = "Ub", descriptor = "Z")
    private boolean field4799 = false;

    @OriginalMember(owner = "client!jj", name = "Zf", descriptor = "I")
    public int field4787 = 0;

    @OriginalMember(owner = "client!jj", name = "fc", descriptor = "[F")
    public float[] field4771 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!jj", name = "xd", descriptor = "Z")
    public boolean field4734 = false;

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "I")
    public int field4803 = 8;

    @OriginalMember(owner = "client!jj", name = "ze", descriptor = "I")
    public int field4784 = 0;

    @OriginalMember(owner = "client!jj", name = "Fb", descriptor = "Z")
    public boolean field4766 = true;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "Z")
    private boolean field4772 = false;

    @OriginalMember(owner = "client!jj", name = "Jc", descriptor = "Z")
    private boolean field4755 = false;

    @OriginalMember(owner = "client!jj", name = "me", descriptor = "[F")
    private float[] field4806 = new float[16];

    @OriginalMember(owner = "client!jj", name = "Ee", descriptor = "F")
    public float field4807 = 1.0F;

    @OriginalMember(owner = "client!jj", name = "Od", descriptor = "I")
    public int field4735 = 0;

    @OriginalMember(owner = "client!jj", name = "rc", descriptor = "[F")
    private float[] field4776 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!jj", name = "Ne", descriptor = "[F")
    private float[] field4762 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!jj", name = "Vb", descriptor = "[F")
    public float[] field4792 = this.field4776;

    @OriginalMember(owner = "client!jj", name = "zf", descriptor = "I")
    public int field4812 = 0;

    @OriginalMember(owner = "client!jj", name = "jd", descriptor = "I")
    public int field4813 = 50;

    @OriginalMember(owner = "client!jj", name = "je", descriptor = "[F")
    private float[] field4791 = new float[16];

    @OriginalMember(owner = "client!jj", name = "Qb", descriptor = "Z")
    public boolean field4811 = false;

    @OriginalMember(owner = "client!jj", name = "Pb", descriptor = "Z")
    public boolean field4789 = false;

    @OriginalMember(owner = "client!jj", name = "He", descriptor = "I")
    private int field4785 = 0;

    @OriginalMember(owner = "client!jj", name = "Wc", descriptor = "I")
    private int field4761 = 0;

    @OriginalMember(owner = "client!jj", name = "Se", descriptor = "Z")
    public boolean field4794 = true;

    @OriginalMember(owner = "client!jj", name = "mb", descriptor = "I")
    private int field4815 = -1;

    @OriginalMember(owner = "client!jj", name = "Dc", descriptor = "Z")
    public boolean field4804 = true;

    @OriginalMember(owner = "client!jj", name = "Ud", descriptor = "I")
    public int field4814 = 512;

    @OriginalMember(owner = "client!jj", name = "vd", descriptor = "I")
    public int field4786 = 3584;

    @OriginalMember(owner = "client!jj", name = "we", descriptor = "Z")
    private boolean field4747 = false;

    @OriginalMember(owner = "client!jj", name = "pf", descriptor = "F")
    public float field4818 = 3584.0F;

    @OriginalMember(owner = "client!jj", name = "Kd", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4741 = new Stream();

    @OriginalMember(owner = "client!jj", name = "Sd", descriptor = "Lie;")
    private class639 field4821 = new class639();

    @OriginalMember(owner = "client!jj", name = "Re", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!jj", name = "Hf", descriptor = "Llga;")
    public class47 field4705;

    @OriginalMember(owner = "client!jj", name = "Jf", descriptor = "Ljava/lang/Object;")
    public Object field4658;

    @OriginalMember(owner = "client!jj", name = "ad", descriptor = "Ljava/lang/Object;")
    private Object field4607;

    @OriginalMember(owner = "client!jj", name = "Lb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field4557;

    @OriginalMember(owner = "client!jj", name = "Nb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4598;

    @OriginalMember(owner = "client!jj", name = "yb", descriptor = "I")
    private int field4596;

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!jj", name = "Kb", descriptor = "I")
    private int field4608;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!jj", name = "jg", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!jj", name = "Cg", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field4656;

    @OriginalMember(owner = "client!jj", name = "wc", descriptor = "Lju;")
    private class270 field4748;

    @OriginalMember(owner = "client!jj", name = "Dg", descriptor = "[Ljava/lang/String;")
    private static final String[] field4843 = new String[] { method2691(method2690("\u007f\u0013\u001d,z=")), method2691(method2690("\u007f\u0013\u001d\t^=")), method2691(method2690("\u007f\u0013\u001d\u0004Z=")), method2691(method2690("\u007f\u0013\u001d\u0012Y=")), method2691(method2690("\u007f\u0013\u001d\u0002_=")), method2691(method2690("\u007f\u0013\u001d$z=")), method2691(method2690("nW\u001dnf")), method2691(method2690("{\f_,")), method2691(method2690("\u007f\u0013\u001d\r\\=")), method2691(method2690("\u007f\u0013\u001d\rX=")), method2691(method2690("\u007f\u0013\u001d\u0002X=")), method2691(method2690("\u007f\u0013\u001d\u0003]=")), method2691(method2690("\u007f\u0013\u001d\u0016\\=")), method2691(method2690("\u007f\u0013\u001d\u0002^=")), method2691(method2690("\u007f\u0013\u001d\u0016]=")), method2691(method2690("\u007f\u0013\u001d\u0012_=")), method2691(method2690("\u007f\u0013\u001d\u000b3")), method2691(method2690("\u007f\u0013\u001d\u0016Z=")), method2691(method2690("\u007f\u0013\u001d\u000f^=")), method2691(method2690("\u007f\u0013\u001d\u00043")), method2691(method2690("\u007f\u0013\u001d|r{\u0010G~3")), method2691(method2690("\u007f\u0013\u001d\b_=")), method2691(method2690("\u007f\u0013\u001d\bY=")), method2691(method2690("\u007f\u0013\u001d\fZ=")), method2691(method2690("\u007f\u0013\u001d\u000bZ=")), method2691(method2690("\u007f\u0013\u001d\u0011]=")), method2691(method2690("\u007f\u0013\u001d\u0004Y=")), method2691(method2690("\u007f\u0013\u001d\tX=")), method2691(method2690("\u007f\u0013\u001d\u0005S=")), method2691(method2690("\u007f\u0013\u001d\u0013^=")), method2691(method2690("\u007f\u0013\u001d\u000eY=")), method2691(method2690("\u007f\u0013\u001d)3")), method2691(method2690("\u007f\u0013\u001d\u0010\\=")), method2691(method2690("\u007f\u0013\u001d\u00153")), method2691(method2690("\u007f\u0013\u001d\u0006]=")), method2691(method2690("\u007f\u0013\u001d\u0012\\=")), method2691(method2690("\u007f\u0013\u001d\n_=")), method2691(method2690("\u007f\u0013\u001d0z=")), method2691(method2690("\u007f\u0013\u001d\t_=")), method2691(method2690("\u007f\u0013\u001d\u000f]=")), method2691(method2690("\u007f\u0013\u001d\u000f_=")), method2691(method2690("\u007f\u0013\u001d\u000fY=")), method2691(method2690("\u007f\u0013\u001d\u0017X=")), method2691(method2690("\u007f\u0013\u001d\tS=")), method2691(method2690("\u007f\u0013\u001d\u0001Y=")), method2691(method2690("\u007f\u0013\u001d\u000b\\=")), method2691(method2690("\u007f\u0013\u001d\u000fS=")), method2691(method2690("\u007f\u0013\u001d\u001aZ=")), method2691(method2690("\u007f\u0013\u001d\u0016_=")), method2691(method2690("\u007f\u0013\u001d:z=")), method2691(method2690("\u007f\u0013\u001d\bZ=")), method2691(method2690("\u007f\u0013\u001d2z=")), method2691(method2690("\u007f\u0013\u001d\tZ=")), method2691(method2690("\u007f\u0013\u001d\u0005\\=")), method2691(method2690("\u007f\u0013\u001d\u0016X=")), method2691(method2690("\u007f\u0013\u001d\u0006X=")), method2691(method2690("\u007f\u0013\u001d\u0014S=")), method2691(method2690("\u007f\u0013\u001d\u0012]=")), method2691(method2690("\u007f\u0013\u001d\u0001R=")), method2691(method2690("\u007f\u0013\u001d\u0015]=")), method2691(method2690("\u007f\u0013\u001d\n^=")), method2691(method2690("\u007f\u0013\u001d\u0017_=")), method2691(method2690("\u007f\u0013\u001d\u0001_=")), method2691(method2690("\u007f\u0013\u001d\u0005_=")), method2691(method2690("\u007f\u0013\u001d\u0015Y=")), method2691(method2690("\u007f\u0013\u001d\u0010Z=")), method2691(method2690("\u007f\u0013\u001d\u000b]=")), method2691(method2690("\u007f\u0013\u001d\b3")), method2691(method2690("\u007f\u0013\u001d\u0007X=")), method2691(method2690("\u007f\u0013\u001d\n\\=")), method2691(method2690("\u007f\u0013\u001d\u0002R=")), method2691(method2690("\u007f\u0013\u001d\u00113")), method2691(method2690("\u007f\u0013\u001d\u0006\\=")), method2691(method2690("\u007f\u0013\u001d\u0018Z=")), method2691(method2690("\u007f\u0013\u001d\u0005^=")), method2691(method2690("\u007f\u0013\u001d\u0010_=")), method2691(method2690("\u007f\u0013\u001d\u000f\\=")), method2691(method2690("\u007f\u0013\u001d\u0003X=")), method2691(method2690("\u007f\u0013\u001d\u0003R=")), method2691(method2690("\u007f\u0013\u001d\u0013_=")), method2691(method2690("\u007f\u0013\u001d\u00103")), method2691(method2690("\u007f\u0013\u001d\bX=")), method2691(method2690("\u007f\u0013\u001d\fX=")), method2691(method2690("\u007f\u0013\u001d\u0005Z=")), method2691(method2690("\u007f\u0013\u001d\u0010]=")), method2691(method2690("\u007f\u0013\u001d\r3")), method2691(method2690("\u007f\u0013\u001d\u000eS=")), method2691(method2690("\u007f\u0013\u001d\u000bS=")), method2691(method2690("\u007f\u0013\u001d\u0006S=")), method2691(method2690("\u007f\u0013\u001d\u00193")), method2691(method2690("\u007f\u0013\u001d\u0015\\=")), method2691(method2690("\u007f\u0013\u001d\n3")), method2691(method2690("\u007f\u0013\u001d\u0004\\=")), method2691(method2690("\u007f\u0013\u001d\u0004]=")), method2691(method2690("f\u001cG\t|{\u0016A%Ip\tR)ua")), method2691(method2690("\u007f\u0018E!5t\u000eGnXt\u0017E!h")), method2691(method2690("\u007f\u0013\u001d\u0013S=")), method2691(method2690("\u007f\u0013\u001d\u0003\\=")), method2691(method2690("\u007f\u0013\u001d\u0004^=")), method2691(method2690("\u007f\u0013\u001d\u000e]=")), method2691(method2690("\u007f\u0013\u001d\u00133")), method2691(method2690("\u007f\u0013\u001d\u0005Y=")), method2691(method2690("\u007f\u0013\u001d\u0001S=")), method2691(method2690("\u007f\u0013\u001d\u0007_=")), method2691(method2690("\u007f\u0013\u001d\u0016Y=")), method2691(method2690("\u007f\u0013\u001d\f\\=")), method2691(method2690("\u007f\u0013\u001d\u000b^=")), method2691(method2690("\u007f\u0013\u001d8z=")), method2691(method2690("\u007f\u0013\u001d\u0015Z=")), method2691(method2690("\u007f\u0013\u001d\u000e_=")), method2691(method2690("\u007f\u0013\u001d\b^=")), method2691(method2690("\u007f\u0013\u001d\u0006Y=")), method2691(method2690("\u007f\u0013\u001d\u0004R=")), method2691(method2690("\u007f\u0013\u001d\nS=")), method2691(method2690("\u007f\u0013\u001d\u0013Y=")), method2691(method2690("\u007f\u0013\u001d\b]=")), method2691(method2690("\u007f\u0013\u001d\u0001\\=")), method2691(method2690("\u007f\u0013\u001d\u0017^=")), method2691(method2690("\u007f\u0013\u001d\fS=")), method2691(method2690("\u007f\u0013\u001d\u0004S=")), method2691(method2690("\u007f\u0013\u001d\f^=")), method2691(method2690("\u007f\u0013\u001d\nX=")), method2691(method2690("\u007f\u0013\u001d\u0017\\=")), method2691(method2690("\u007f\u0013\u001d\u000eZ=")), method2691(method2690("\u007f\u0013\u001d\u0003_=")), method2691(method2690("\u007f\u0013\u001d\u0011X=")), method2691(method2690("\u007f\u0013\u001d\u0010Y=")), method2691(method2690("\u007f\u0013\u001d\u0017Y=")), method2691(method2690("\u007f\u0013\u001d\u00183")), method2691(method2690("\u007f\u0013\u001d\f_=")), method2691(method2690("\u007f\u0013\u001d\u0004_=")), method2691(method2690("\u007f\u0013\u001d\u00053")), method2691(method2690("\u007f\u0013\u001d\u0010S=")), method2691(method2690("\u007f\u0013\u001d23")), method2691(method2690("\u007f\u0013\u001d\u0001X=")), method2691(method2690("\u007f\u0013\u001d\u0017S=")), method2691(method2690("\u007f\u0013\u001d\u0015_=")), method2691(method2690("\u007f\u0013\u001d\u00143")), method2691(method2690("\u007f\u0013\u001d\u0011Y=")), method2691(method2690("\u007f\u0013\u001d\t\\=")), method2691(method2690("\u007f\u0013\u001d\u00033")), method2691(method2690("\u007f\u0013\u001d\rY=")), method2691(method2690("\u007f\u0013\u001d\t]=")), method2691(method2690("\u007f\u0013\u001d\u0014X=")), method2691(method2690("\u007f\u0013\u001d\u0005X=")), method2691(method2690("\u007f\u0013\u001d\u000eX=")), method2691(method2690("\u007f\u0013\u001d\u0004X=")), method2691(method2690("\u007f\u0013\u001d\b\\=")), method2691(method2690("\u007f\u0013\u001d\bS=")), method2691(method2690("\u007f\u0013\u001d\u0013Z=")), method2691(method2690("\u007f\u0013\u001d\u0013]=")), method2691(method2690("\u007f\u0013\u001d\r]=")), method2691(method2690("\u007f\u0013\u001d\u0015^=")), method2691(method2690("\u007f\u0013\u001d\u0005]=")), method2691(method2690("\u007f\u0013\u001d\u0012S=")), method2691(method2690("\u007f\u0013\u001d\u0005R=")), method2691(method2690("\u007f\u0013\u001d\u00013")), method2691(method2690("\u007f\u0013\u001d\nZ=")), method2691(method2690("\u007f\u0013\u001d\nY=")), method2691(method2690("\u007f\u0013\u001d!z=")), method2691(method2690("\u007f\u0013\u001d\r^=")), method2691(method2690("\u007f\u0013\u001d\u0016S=")), method2691(method2690("\u007f\u0013\u001d\f3")), method2691(method2690("\u007f\u0013\u001d&3")), method2691(method2690("\u007f\u0013\u001d\fY=")), method2691(method2690("\u007f\u0013\u001d\u0001]=")), method2691(method2690("\u007f\u0013\u001d\u0014Z=")), method2691(method2690("\u007f\u0013\u001d\u0012^=")), method2691(method2690("\u007f\u0013\u001d\u0001^=")), method2691(method2690("\u007f\u0013\u001d\u0012X=")), method2691(method2690("\u007f\u0013\u001d\u0014\\=")), method2691(method2690("\u007f\u0013\u001d\bR=")), method2691(method2690("\u007f\u0013\u001d\u0010X=")), method2691(method2690("\u007f\u0013\u001d\u0002]=")), method2691(method2690("\u007f\u0013\u001d\u0015S=")) };

    @OriginalMember(owner = "client!jj", name = "Qe", descriptor = "F")
    public float field4718;

    @OriginalMember(owner = "client!jj", name = "Bc", descriptor = "F")
    private float field4795;

    @OriginalMember(owner = "client!jj", name = "Gd", descriptor = "F")
    private float field4796;

    @OriginalMember(owner = "client!jj", name = "bc", descriptor = "F")
    public float field4800;

    @OriginalMember(owner = "client!jj", name = "Af", descriptor = "F")
    public float field4808;

    @OriginalMember(owner = "client!jj", name = "ff", descriptor = "F")
    public float field4809;

    @OriginalMember(owner = "client!jj", name = "nd", descriptor = "F")
    public float field4810;

    @OriginalMember(owner = "client!jj", name = "ib", descriptor = "F")
    public float field4816;

    @OriginalMember(owner = "client!jj", name = "qg", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!jj", name = "jb", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!jj", name = "Jb", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!jj", name = "Zc", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!jj", name = "Ob", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!jj", name = "ce", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!jj", name = "Bb", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!jj", name = "Nd", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!jj", name = "Nf", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!jj", name = "ye", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!jj", name = "bg", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!jj", name = "Sc", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!jj", name = "cd", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!jj", name = "Ae", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!jj", name = "Ab", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!jj", name = "he", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!jj", name = "gd", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!jj", name = "ed", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!jj", name = "eb", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!jj", name = "Hc", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!jj", name = "rd", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!jj", name = "dc", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!jj", name = "Pe", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!jj", name = "Ag", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!jj", name = "ic", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!jj", name = "gf", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!jj", name = "Rd", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!jj", name = "Uf", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!jj", name = "Cc", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!jj", name = "Fe", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!jj", name = "yd", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!jj", name = "Db", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!jj", name = "Ed", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!jj", name = "Xf", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!jj", name = "lb", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!jj", name = "ef", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!jj", name = "ac", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!jj", name = "De", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!jj", name = "fe", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!jj", name = "lf", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!jj", name = "ne", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!jj", name = "Oe", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!jj", name = "ig", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!jj", name = "Ac", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!jj", name = "yc", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!jj", name = "cg", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!jj", name = "xe", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!jj", name = "qd", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!jj", name = "sg", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!jj", name = "xb", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!jj", name = "hf", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!jj", name = "bf", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!jj", name = "Qf", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!jj", name = "gc", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!jj", name = "tb", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!jj", name = "If", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!jj", name = "kc", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!jj", name = "Tb", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!jj", name = "cf", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!jj", name = "ue", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!jj", name = "Ge", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!jj", name = "ud", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!jj", name = "fg", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!jj", name = "Hb", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!jj", name = "lg", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!jj", name = "Ib", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!jj", name = "vf", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!jj", name = "Ve", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!jj", name = "kf", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!jj", name = "lc", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!jj", name = "wd", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!jj", name = "rg", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!jj", name = "bb", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!jj", name = "xg", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!jj", name = "Pd", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!jj", name = "Wf", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!jj", name = "Vd", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!jj", name = "Bd", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!jj", name = "wg", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!jj", name = "pc", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!jj", name = "Ie", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!jj", name = "dg", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!jj", name = "Ef", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!jj", name = "Hd", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!jj", name = "fb", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!jj", name = "zc", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!jj", name = "tg", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!jj", name = "Md", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!jj", name = "Dd", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!jj", name = "Cd", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!jj", name = "Pf", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!jj", name = "Ye", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!jj", name = "Gf", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!jj", name = "sb", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!jj", name = "pb", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!jj", name = "Fd", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!jj", name = "de", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!jj", name = "te", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!jj", name = "pe", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!jj", name = "Ue", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!jj", name = "gg", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!jj", name = "sd", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!jj", name = "Ec", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!jj", name = "hb", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!jj", name = "Ce", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!jj", name = "Mf", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!jj", name = "Ze", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!jj", name = "Fc", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!jj", name = "le", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!jj", name = "gb", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!jj", name = "be", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!jj", name = "rb", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!jj", name = "qe", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!jj", name = "ee", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!jj", name = "hd", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!jj", name = "id", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!jj", name = "mg", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!jj", name = "oc", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!jj", name = "qb", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!jj", name = "eg", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!jj", name = "vg", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!jj", name = "wb", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!jj", name = "Ff", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!jj", name = "jf", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!jj", name = "se", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!jj", name = "td", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!jj", name = "nb", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!jj", name = "Rc", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!jj", name = "Xc", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!jj", name = "zb", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!jj", name = "Sb", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!jj", name = "Jd", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!jj", name = "kg", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!jj", name = "Rf", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!jj", name = "Of", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!jj", name = "ke", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!jj", name = "Cf", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!jj", name = "Sf", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!jj", name = "Bg", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!jj", name = "Bf", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!jj", name = "fd", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!jj", name = "ob", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!jj", name = "ub", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!jj", name = "wf", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!jj", name = "We", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!jj", name = "oe", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!jj", name = "Wb", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!jj", name = "Vf", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!jj", name = "Rb", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!jj", name = "Oc", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!jj", name = "md", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!jj", name = "og", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!jj", name = "Te", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!jj", name = "of", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!jj", name = "ge", descriptor = "I")
    public int field4711;

    @OriginalMember(owner = "client!jj", name = "tc", descriptor = "I")
    public int field4712;

    @OriginalMember(owner = "client!jj", name = "zd", descriptor = "I")
    public int field4720;

    @OriginalMember(owner = "client!jj", name = "Nc", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!jj", name = "Cb", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!jj", name = "Ld", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!jj", name = "vb", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!jj", name = "yf", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!jj", name = "kb", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!jj", name = "pd", descriptor = "I")
    private int field4805;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    private int field4841;

    @OriginalMember(owner = "client!jj", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "Ljd;")
    public class130 field4687;

    @OriginalMember(owner = "client!jj", name = "Xb", descriptor = "Lqja;")
    private class137 field4790;

    @OriginalMember(owner = "client!jj", name = "Qc", descriptor = "Lot;")
    private class218 field4820;

    @OriginalMember(owner = "client!jj", name = "ec", descriptor = "Lot;")
    public class218 field4826;

    @OriginalMember(owner = "client!jj", name = "Ic", descriptor = "Lot;")
    public class218 field4830;

    @OriginalMember(owner = "client!jj", name = "re", descriptor = "Lot;")
    public class218 field4831;

    @OriginalMember(owner = "client!jj", name = "xf", descriptor = "Lot;")
    public class218 field4836;

    @OriginalMember(owner = "client!jj", name = "Yb", descriptor = "Lot;")
    private class218 field4839;

    @OriginalMember(owner = "client!jj", name = "ng", descriptor = "Lot;")
    private class218 field4840;

    @OriginalMember(owner = "client!jj", name = "Mb", descriptor = "Lnka;")
    public class37 field4819;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "Lnka;")
    public class37 field4822;

    @OriginalMember(owner = "client!jj", name = "Ke", descriptor = "Lnka;")
    public class37 field4823;

    @OriginalMember(owner = "client!jj", name = "xc", descriptor = "Lnka;")
    public class37 field4825;

    @OriginalMember(owner = "client!jj", name = "nf", descriptor = "Lnka;")
    public class37 field4827;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Lnka;")
    public class37 field4828;

    @OriginalMember(owner = "client!jj", name = "sc", descriptor = "Lnka;")
    public class37 field4829;

    @OriginalMember(owner = "client!jj", name = "Lc", descriptor = "Lnka;")
    public class37 field4835;

    @OriginalMember(owner = "client!jj", name = "Wd", descriptor = "Lnka;")
    public class37 field4837;

    @OriginalMember(owner = "client!jj", name = "af", descriptor = "Lnka;")
    public class37 field4838;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "Luba;")
    private class517 field4824;

    @OriginalMember(owner = "client!jj", name = "Vc", descriptor = "Lov;")
    private class564 field4797;

    @OriginalMember(owner = "client!jj", name = "Td", descriptor = "Loo;")
    private class593 field4756;

    @OriginalMember(owner = "client!jj", name = "Yd", descriptor = "Lbl;")
    private class719 field4832;

    @OriginalMember(owner = "client!jj", name = "ve", descriptor = "Lbl;")
    private class719 field4833;

    @OriginalMember(owner = "client!jj", name = "mc", descriptor = "Lbl;")
    private class719 field4834;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "Lah;")
    public class764 field4751;

    @OriginalMember(owner = "client!jj", name = "od", descriptor = "Lfl;")
    public static class794 field4579;

    @OriginalMember(owner = "client!jj", name = "Xe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4536;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field4524;

    @OriginalMember(owner = "client!jj", name = "Ad", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4582;

    @OriginalMember(owner = "client!jj", name = "pg", descriptor = "Z")
    public boolean field4723;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "Z")
    public boolean field4750;

    @OriginalMember(owner = "client!jj", name = "ae", descriptor = "Z")
    public boolean field4760;

    @OriginalMember(owner = "client!jj", name = "zg", descriptor = "Z")
    public boolean field4763;

    @OriginalMember(owner = "client!jj", name = "Lf", descriptor = "Z")
    public boolean field4780;

    @OriginalMember(owner = "client!jj", name = "Mc", descriptor = "Z")
    public boolean field4842;

    @OriginalMember(owner = "client!jj", name = "dd", descriptor = "[Lta;")
    public class330[] field4730;

    @OriginalMember(owner = "client!jj", name = "Zb", descriptor = "[Ltka;")
    public class599[] field4798;

    @OriginalMember(owner = "client!jj", name = "ld", descriptor = "[Ltka;")
    public class599[] field4817;

    @OriginalMember(owner = "client!jj", name = "vc", descriptor = "[Lie;")
    public class639[] field4722;

    @OriginalMember(owner = "client!jj", name = "Kc", descriptor = "[Lkl;")
    public class740[] field4764;

    @OriginalMember(owner = "client!jj", name = "df", descriptor = "[Lah;")
    private class764[] field4739;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "(I)V")
    public final void method2609(int arg0) {
        try {
            ++field4645;
            Hashtable var2 = new Hashtable();
            if (this.field4582 != null && !this.field4582.isEmpty()) {
                Enumeration var3 = this.field4582.keys();
                while (var3.hasMoreElements()) {
                    Canvas var4 = (Canvas) var3.nextElement();
                    var2.put(var4, this.method2065(var4, 0));
                }
            }
            this.field4582 = var2;
            this.method2673(97);
            this.method2640(119);
            if (arg0 <= 117) {
                this.method171(-46, 115, -5, -62, (int[]) null);
            }
            this.method2654(true);
            this.field4790.method1197(this, (byte) -88);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4843[104] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
    public abstract void method2097(int arg0);

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(Z)Lie;")
    public final class639 method2610(boolean arg0) {
        try {
            if (!arg0) {
                return null;
            } else {
                ++field4571;
                return this.field4715;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[99] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "(I)V")
    private final void method2611(int arg0) {
        try {
            if (arg0 != 0) {
                this.field4797 = null;
            }
            if (class24.field284 != this.field4770) {
                class733 var2 = this.field4770;
                this.field4770 = class24.field284;
                if (var2.method5331(-30751)) {
                    this.method2643(-60);
                }
                this.method2688(true);
                this.field4792 = this.field4719;
                this.method2645(-121);
                this.field4781 &= -25;
            }
            ++field4681;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[77] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method2066(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZ)V")
    public final void method2612(boolean arg0, boolean arg1) {
        try {
            ++field4599;
            if (arg1) {
                if (!this.field4782 != !arg0) {
                    this.field4782 = arg0;
                    this.method2097(-12888);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[152] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "gb", descriptor = "(I)V")
    public abstract void method2100(int arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class751 method206(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        try {
            ++field4551;
            return new class544(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4843[109] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4843[6] : field4843[7]) + ',' + (arg3 != null ? field4843[6] : field4843[7]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)V")
    public final void method154(int arg0) {
        try {
            ++field4601;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[52] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZ[II)Lcf;")
    public final class196 method2613(int arg0, int arg1, boolean arg2, int[] arg3, int arg4) {
        try {
            if (arg1 != 10) {
                return null;
            } else {
                ++field4692;
                return this.method2078(0, arg0, arg1 ^ -20090, arg2, arg3, arg4, 0);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4843[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4843[6] : field4843[7]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "(B)V")
    public final void method2614(byte arg0) {
        try {
            ++field4567;
            int var2 = -3 / ((57 - arg0) / 47);
            this.method2687(-84);
            this.method2645(-111);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[74] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "(I)I")
    public final int method2615(int arg0) {
        try {
            ++field4568;
            if (arg0 != 2) {
                this.field4746 = null;
            }
            return this.field4815;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[113] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(B)V")
    public abstract void method2085(byte arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII)V")
    public final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field4670;
            float var8 = (float) arg2 - (float) arg0;
            float var9 = (float) (-arg1) + (float) arg3;
            float var10 = 0.0F;
            float var11 = 1.0F;
            if (var8 != 0.0F || var9 != 0.0F) {
                var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
                var10 = (float) Math.atan2((double) var9, (double) var8);
            }
            this.method2632(false);
            this.method2658(arg4, -8793);
            this.method2655(1, 0, class659.field9335);
            this.method2670(-128, 0, class659.field9335);
            this.method2619(arg6, 1);
            this.field4708.method4664((float) arg5, 22931, 1.0F, var11);
            this.field4708.method721(0, -arg5 / 2, 0);
            this.field4708.method724(16383 & (int) ((double) var10 * 2607.5945876176133D));
            this.field4708.method721(arg0, arg1, 0);
            this.method2671((byte) -112);
            this.method2101((byte) 46, false);
            this.method2663(-63);
            this.method2101((byte) 46, true);
            this.method2670(-128, 0, class784.field11325);
            this.method2655(1, 0, class784.field11325);
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4843[64] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
    public final void method2616(int arg0, byte arg1) {
        try {
            ++field4575;
            this.method2658(arg1 << 24 | arg1 << 16 | arg1 << 8 | arg1, -8793);
            if (arg0 != 0) {
                this.field4723 = true;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[121] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "(I)V")
    private final void method2617(int arg0) {
        try {
            this.field4818 = (float) this.field4786;
            ++field4669;
            if (arg0 != 14547) {
                this.field4706 = -11;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[144] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method148(Canvas arg0, int arg1, int arg2) {
        try {
            ++field4707;
            if (this.field4557 == arg0) {
                throw new RuntimeException();
            } else if (!this.field4582.containsKey(arg0)) {
                if (!arg0.isShowing()) {
                    throw new RuntimeException();
                } else {
                    try {
                        Class var4 = Class.forName(field4843[95]);
                        Method var5 = var4.getMethod(field4843[94], Boolean.TYPE);
                        var5.invoke(arg0, Boolean.TRUE);
                    } catch (Exception var8) {
                    }
                    Object var6 = this.method2065(arg0, 0);
                    if (var6 == null) {
                        throw new RuntimeException();
                    } else {
                        this.field4582.put(arg0, var6);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4843[93] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)F")
    public abstract float method2095(byte arg0);

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "(I)Lie;")
    public final class639 method2618(int arg0) {
        try {
            ++field4694;
            if (arg0 > -110) {
                this.method2613(-55, 13, true, (int[]) null, -60);
            }
            return this.field4708;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[172] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "()I")
    public final int method198() {
        try {
            ++field4614;
            return this.field4740 - 2;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[46] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "(I)V")
    public abstract void method2092(int arg0);

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "(II)V")
    public final void method2619(int arg0, int arg1) {
        try {
            ++field4555;
            if (arg1 != 1) {
                this.field4813 = 38;
            }
            if (this.field4725 != arg0) {
                boolean var3;
                boolean var4;
                class421 var5;
                if (arg0 == 1) {
                    var3 = true;
                    var4 = true;
                    var5 = class686.field9617;
                } else if (~arg0 != -3) {
                    if (arg0 != 128) {
                        var3 = false;
                        var5 = class465.field6779;
                        var4 = false;
                    } else {
                        var3 = true;
                        var5 = class618.field8809;
                        var4 = true;
                    }
                } else {
                    var3 = false;
                    var4 = true;
                    var5 = class503.field7340;
                }
                if (!var3 == this.field4766) {
                    this.field4766 = var3;
                    this.method2115((byte) -95);
                }
                if (this.field4804 != var4) {
                    this.field4804 = var4;
                    this.method2108((byte) -126);
                }
                if (this.field4726 != var5) {
                    this.field4726 = var5;
                    this.method2098(-23832);
                }
                this.field4725 = arg0;
                this.field4781 &= -29;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4843[56] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "(I)V")
    private final void method2620(int arg0) {
        try {
            this.field4791[14] = this.field4796;
            this.field4791[10] = this.field4795;
            ++field4595;
            this.field4729 = (this.field4791[14] + (float) (-this.field4786)) / this.field4791[10];
            if (arg0 <= 71) {
                this.field4827 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[43] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "za", descriptor = "(IIIII)V")
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method2632(false);
            ++field4632;
            this.method2658(arg3, -8793);
            this.method2655(1, 0, class659.field9335);
            this.method2670(-128, 0, class659.field9335);
            this.method2619(arg4, 1);
            this.field4708.method4664((float) arg2, 22931, 1.0F, (float) arg2);
            this.field4708.method721(arg0, arg1, 0);
            this.method2671((byte) -121);
            this.method2101((byte) 46, false);
            this.method2088(this.field4834, 0, false);
            this.method2120(this.field4840, -1);
            this.method2103(class36.field443, 256, 0, 114);
            this.method2101((byte) 46, true);
            this.method2670(-128, 0, class784.field11325);
            this.method2655(1, 0, class784.field11325);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4843[49] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "ra", descriptor = "(IIII)V")
    public final void method150(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4546;
            this.field4805 = arg0;
            this.field4753 = arg1;
            this.field4815 = arg2;
            this.field4724 = arg3;
            this.field4723 = true;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4843[51] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)I")
    public final int method226(int arg0, int arg1) {
        try {
            ++field4606;
            return arg1 ^ arg1 & arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[170] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "()Z")
    public final boolean method137() {
        try {
            ++field4540;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[88] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "(I)V")
    public final void method2621(int arg0) {
        try {
            int var2 = 107 / ((arg0 - 29) / 53);
            if (~this.field4781 != -5) {
                this.method2611(0);
                this.method2685(false, -32);
                this.method2647(false, 0);
                this.method2669(false, -18819);
                this.method2628(1, false);
                this.method2664(false, false, 16, -2);
                this.method2619(1, 1);
                this.method2679(2, 0);
                this.field4781 = 4;
            }
            ++field4660;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[116] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "()I")
    public final int method122() {
        try {
            ++field4531;
            return this.field4712 + this.field4711 - -this.field4706;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[131] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "()Z")
    public final boolean method181() {
        try {
            ++field4562;
            return this.field4763;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[169] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "(I)V")
    public abstract void method2125(int arg0);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
    public final void method199(boolean arg0) {
        try {
            ++field4581;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[153] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "(I)V")
    public abstract void method2116(int arg0);

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "(ILaa;II)V")
    public final void method153(int arg0, class685 arg1, int arg2, int arg3) {
        try {
            ++field4589;
            class430 var5 = (class430) arg1;
            class196 var6 = var5.field6239;
            this.method2666(0);
            this.method2668(24, var6);
            this.method2619(1, 1);
            this.method2624(class256.field3668, (byte) 116, class256.field3668);
            this.method2655(1, 0, class659.field9335);
            this.method2658(arg0, -8793);
            this.field4708.method4664((float) this.field4646, 22931, 0.0F, (float) this.field4653);
            this.method2671((byte) -118);
            this.field4722[0].method4664(var6.method1703(false, (float) this.field4646), 22931, 1.0F, var6.method1702(41, (float) this.field4653));
            this.field4722[0].method4650(0.0F, 121, var6.method1702(105, (float) (-arg2)), var6.method1703(false, (float) (-arg3)));
            this.field4764[0] = class467.field6818;
            this.method2662(0);
            this.method2663(-13);
            this.method2625(Integer.MAX_VALUE);
            this.method2655(1, 0, class784.field11325);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4843[156] + arg0 + ',' + (arg1 != null ? field4843[6] : field4843[7]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(FIFFFFF)Z")
    private final boolean method2622(float arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        try {
            ++field4573;
            Buffer var8 = this.field4833.method2401(true, true);
            if (arg1 <= 42) {
                this.field4777 = 1.749866F;
            }
            if (var8 == null) {
                return false;
            } else {
                Stream var9 = this.method2651(var8, 16);
                if (!Stream.method3200()) {
                    var9.method3206(arg3);
                    var9.method3206(arg6);
                    var9.method3206(arg2);
                    var9.method3206(arg0);
                    var9.method3206(arg5);
                    var9.method3206(arg4);
                } else {
                    var9.method3202(arg3);
                    var9.method3202(arg6);
                    var9.method3202(arg2);
                    var9.method3202(arg0);
                    var9.method3202(arg5);
                    var9.method3202(arg4);
                }
                var9.method3199();
                return this.field4833.method2405(-9200);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field4843[161] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "(Z)V")
    private final void method2623(boolean arg0) {
        try {
            if (arg0) {
                this.field4744 = false;
                ++field4631;
                this.method2630((byte) -56);
                if (class414.field5944 == this.field4770) {
                    this.method2645(-118);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[100] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ltka;BLtka;)V")
    public final void method2624(class599 arg0, byte arg1, class599 arg2) {
        try {
            ++field4700;
            if (arg1 > 94) {
                boolean var4 = false;
                if (this.field4798[this.field4735] != arg0) {
                    this.field4798[this.field4735] = arg0;
                    var4 = true;
                    this.method2106((byte) -124);
                }
                if (this.field4817[this.field4735] != arg2) {
                    this.field4817[this.field4735] = arg2;
                    var4 = true;
                    this.method2116(13730);
                }
                if (var4) {
                    this.field4781 &= -30;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4843[22] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ',' + (arg2 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "(I)V")
    public final void method2625(int arg0) {
        try {
            if (arg0 != Integer.MAX_VALUE) {
                this.method156((Canvas) null);
            }
            ++field4558;
            if (this.field4764[this.field4735] != class684.field9603) {
                this.field4764[this.field4735] = class684.field9603;
                this.field4722[this.field4735].method735();
                this.method2662(0);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[36] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "(B)V")
    public abstract void method2108(byte arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcb;IILuba;III)V")
    public abstract void method2074(class700 arg0, int arg1, int arg2, class517 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jj", name = "XA", descriptor = "()I")
    public final int method187() {
        try {
            ++field4640;
            return this.field4786;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[73] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "(B)V")
    public abstract void method2115(byte arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcu;Z)Ltb;")
    public final class392 method231(class66 arg0, boolean arg1) {
        try {
            ++field4691;
            class392 var11;
            if (~arg0.field981 != -1 && arg0.field977 != 0) {
                int[] var3 = new int[arg0.field981 * arg0.field977];
                int var4 = 0;
                int var5 = 0;
                if (arg0.field976 != null) {
                    for (int var6 = 0; ~arg0.field977 < ~var6; ++var6) {
                        for (int var7 = 0; ~var7 > ~arg0.field981; ++var7) {
                            var3[var5++] = class10.method71(arg0.field979[class434.method3377(255, arg0.field982[var4])], arg0.field976[var4] << 24);
                            ++var4;
                        }
                    }
                } else {
                    for (int var8 = 0; var8 < arg0.field977; ++var8) {
                        for (int var9 = 0; ~var9 > ~arg0.field981; ++var9) {
                            int var10 = arg0.field979[arg0.field982[var4++] & 255];
                            var3[var5++] = ~var10 != -1 ? class10.method71(var10, -16777216) : 0;
                        }
                    }
                }
                var11 = this.method201(arg0.field977, arg0.field981, var3, arg0.field981, (byte) 16, 0);
            } else {
                var11 = this.method201(1, 1, new int[1], 1, (byte) 44, 0);
            }
            var11.method1379(arg0.field984, arg0.field983, arg0.field978, arg0.field980);
            return var11;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4843[90] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[FIIIZILhh;)Lcf;")
    public abstract class196 method2073(int arg0, float[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class250 arg7);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZF)V")
    public final void method2626(boolean arg0, float arg1) {
        try {
            if (!arg0) {
                this.field4822 = null;
            }
            ++field4652;
            if (this.field4777 != arg1) {
                this.field4777 = arg1;
                this.method2648(2);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[112] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(BI)Loo;")
    public class593 method2127(byte arg0, int arg1) {
        try {
            if (arg0 <= 72) {
                this.method2633(43);
            }
            ++field4701;
            if (~arg1 != -7) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        return ~arg1 == -8 ? new class772(this) : new class151(this);
                    } else {
                        return new class40(this, this.field4687);
                    }
                } else {
                    return new class438(this);
                }
            } else {
                return new class467(this);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[126] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "()Z")
    public final boolean method125() {
        try {
            ++field4525;
            return this.field4793[3].method458(92);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[111] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "(I)V")
    public final void method2627(int arg0) {
        try {
            ++field4633;
            Enumeration var2 = this.field4582.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method2076(this.field4582.get(var3), var3, 0);
            }
            this.field4832.method2342(true);
            this.field4833.method2342(true);
            this.field4834.method2342(true);
            this.field4829.method420((byte) 88);
            this.field4823.method420((byte) 127);
            this.field4825.method420((byte) 80);
            this.field4827.method420((byte) 112);
            if (arg0 != 1) {
                this.method205(-7);
            }
            this.field4837.method420((byte) 48);
            this.field4790.method1202((byte) 67);
            this.field4824.method2342(true);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[42] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(IZ)V")
    public final void method2628(int arg0, boolean arg1) {
        try {
            if (arg0 != 1) {
                this.field4798 = null;
            }
            ++field4544;
            if (this.field4738 != arg1) {
                this.field4738 = arg1;
                this.method2119(-50);
                this.field4781 &= -32;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[53] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "()[I")
    public final int[] method157() {
        try {
            ++field4635;
            return new int[] { this.field4745, this.field4727, this.field4728, this.field4814 };
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[89] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lot;I)V")
    public abstract void method2120(class218 arg0, int arg1);

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(Z)V")
    private final void method2629(boolean arg0) {
        try {
            this.method2109(1);
            ++field4615;
            this.method2085((byte) -23);
            this.method2102(106);
            this.method2070(0);
            this.method2114(-5072);
            this.method2094(arg0);
            this.method2100(4);
            this.method2075(-88);
            this.method2119(-49);
            this.method2097(-12888);
            this.method2081((byte) -104);
            this.method2108((byte) -127);
            this.method2098(-23832);
            this.method2115((byte) 96);
            for (int var2 = this.field4733 + -1; ~var2 <= -1; --var2) {
                this.method2661(68, var2);
                this.method2106((byte) -125);
                this.method2116(13730);
                this.method2625(Integer.MAX_VALUE);
            }
            this.method2110(110);
            this.method2069(-4984);
            this.method2125(-113);
            this.method2072(10979);
            this.method2104((byte) -106);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[78] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "la", descriptor = "()V")
    public final void method240() {
        try {
            this.field4787 = 0;
            this.field4754 = this.field4646;
            this.field4812 = this.field4653;
            this.field4731 = 0;
            ++field4629;
            if (this.field4842) {
                this.field4842 = false;
                this.method2090((byte) -94);
            }
            this.method2684((byte) -32);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[0] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
    private final void method2630(byte arg0) {
        try {
            if (arg0 > 0) {
                this.field4741 = null;
            }
            if (!this.field4744) {
                float[] var2 = this.field4791;
                float var3 = (float) (-this.field4745 * this.field4813) / (float) this.field4728;
                float var4 = (float) ((-this.field4745 + this.field4653) * this.field4813) / (float) this.field4728;
                float var5 = (float) (this.field4813 * this.field4727) / (float) this.field4814;
                float var6 = (float) ((this.field4727 - this.field4646) * this.field4813) / (float) this.field4814;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field4813 * 2.0F;
                    var2[3] = 0.0F;
                    var2[13] = 0.0F;
                    var2[10] = this.field4795 = (float) this.field4786 / (float) (-this.field4786 + this.field4813);
                    var2[11] = -1.0F;
                    var2[1] = 0.0F;
                    var2[7] = 0.0F;
                    var2[14] = this.field4796 = (float) (this.field4813 * this.field4786) / (float) (-this.field4786 + this.field4813);
                    var2[9] = (var5 + var6) / (-var6 + var5);
                    var2[5] = var7 / (var5 - var6);
                    var2[4] = 0.0F;
                    var2[12] = 0.0F;
                    var2[2] = 0.0F;
                    var2[15] = 0.0F;
                    var2[6] = 0.0F;
                    var2[8] = (var3 + var4) / (var4 - var3);
                    var2[0] = var7 / (var4 - var3);
                } else {
                    var2[4] = 0.0F;
                    var2[6] = 0.0F;
                    var2[10] = 1.0F;
                    var2[1] = 0.0F;
                    var2[8] = 0.0F;
                    var2[11] = 0.0F;
                    var2[15] = 1.0F;
                    var2[5] = 1.0F;
                    var2[9] = 0.0F;
                    var2[13] = 0.0F;
                    var2[14] = 0.0F;
                    var2[7] = 0.0F;
                    var2[3] = 0.0F;
                    var2[2] = 0.0F;
                    var2[12] = 0.0F;
                    var2[0] = 1.0F;
                }
                this.method2620(84);
                this.field4744 = true;
            }
            ++field4543;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4843[154] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public final void method205(int arg0) {
        try {
            ++field4685;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[29] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(IZ)V")
    public final void method2631(int arg0, boolean arg1) {
        try {
            if (arg1 == !this.field4794) {
                this.field4794 = arg1;
                this.method2100(4);
            }
            ++field4625;
            if (arg0 < 30) {
                this.method215();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[21] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "(I)V")
    public abstract void method2064(int arg0);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(IIIIII)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4539;
            float var7 = (float) arg2 - (float) arg0;
            float var8 = (float) arg3 - (float) arg1;
            float var10;
            if (var7 == 0.0F && var8 == 0.0F) {
                var10 = 1.0F;
            } else {
                float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
                var10 = var7 * var9;
                var8 *= var9;
            }
            if (this.method2622((float) arg2 + var10, 104, 0.0F, (float) arg0, 0.0F, (float) arg3 + var8, (float) arg1)) {
                this.method2632(false);
                this.method2658(arg4, -8793);
                this.method2655(1, 0, class659.field9335);
                this.method2670(-128, 0, class659.field9335);
                this.method2619(arg5, 1);
                this.method2644((byte) 64);
                this.method2101((byte) 46, false);
                this.method2646(-103);
                this.method2101((byte) 46, true);
                this.method2670(-128, 0, class784.field11325);
                this.method2655(1, 0, class784.field11325);
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field4843[102] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "(Z)V")
    private final void method2632(boolean arg0) {
        try {
            if (arg0) {
                this.field4828 = null;
            }
            if (~this.field4781 != -2) {
                this.method2611(0);
                this.method2685(false, -32);
                this.method2647(false, 0);
                this.method2669(false, -18819);
                this.method2628(1, false);
                this.method2664(false, false, 16, -2);
                this.method2679(2, 1);
                this.method2668(24, this.field4751);
                this.field4781 = 1;
            }
            ++field4591;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[135] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "(I)V")
    private final void method2633(int arg0) {
        try {
            ++field4602;
            if (class24.field284 == this.field4770) {
                float var2 = this.method2095((byte) -111);
                this.field4708.method4650(0.0F, arg0 + 107, var2, var2);
            }
            this.field4799 = false;
            this.method2072(10979);
            if (arg0 == 0) {
                if (this.field4756 != null) {
                    this.field4756.method1470(113);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[146] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZILoba;Z)V")
    public abstract void method2063(boolean arg0, int arg1, class739 arg2, boolean arg3);

    @OriginalMember(owner = "client!jj", name = "DA", descriptor = "(IIII)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field4728 = arg2;
            this.field4727 = arg1;
            this.field4814 = arg3;
            ++field4586;
            this.field4745 = arg0;
            this.method2648(2);
            this.method2623(true);
            this.method2687(-39);
            this.method2684((byte) -32);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4843[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIF)Lta;")
    public final class330 method142(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            ++field4675;
            return new class347(arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4843[23] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "(IIIII)V")
    public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method219(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
            ++field4657;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4843[33] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "(I)V")
    public final void method2634(int arg0) {
        try {
            if (this.field4781 != 16) {
                this.method2677((byte) 99);
                this.method2685(true, arg0 ^ -32);
                this.method2669(true, -18819);
                this.method2628(1, true);
                this.method2619(1, 1);
                this.field4781 = 16;
            }
            ++field4621;
            if (arg0 != 0) {
                this.field4536 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[136] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lrha;IIII)Lka;")
    public final class761 method197(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field4527;
            return new class37(this, arg0, arg1, arg3, arg4, arg2);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4843[11] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "(Z)I")
    public final int method2635(boolean arg0) {
        try {
            ++field4564;
            if (arg0) {
                this.field4721 = 81;
            }
            return this.field4735;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[124] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()Z")
    public final boolean method166() {
        try {
            ++field4696;
            return false;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[14] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(Z)V")
    public static void method2636(boolean arg0) {
        try {
            if (arg0) {
                field4579 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[55] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "(I)V")
    private final void method2637(int arg0) {
        try {
            ++field4548;
            this.field4747 = false;
            if (arg0 != 0) {
                this.method2640(-118);
            }
            if (class24.field284 == this.field4770) {
                this.method2688(true);
                this.method2645(-110);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[155] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lsn;)V")
    public final void method228(class369 arg0) {
        try {
            ++field4550;
            this.field4797 = (class564) arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[82] + (arg0 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[[IZ)Lnm;")
    public abstract class361 method2083(int arg0, int arg1, int[][] arg2, boolean arg3);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIZ[III)Lcf;")
    public abstract class196 method2078(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "(Z)V")
    private final void method2638(boolean arg0) {
        try {
            ++field4672;
            if (arg0) {
                if (class414.field5944 != this.field4770) {
                    class733 var2 = this.field4770;
                    this.field4770 = class414.field5944;
                    if (!var2.method5331(-30751)) {
                        this.method2643(-69);
                    }
                    this.method2630((byte) -79);
                    this.field4792 = this.field4791;
                    this.method2645(-99);
                    this.field4781 &= -8;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[54] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(ZI)Lbl;")
    public abstract class719 method2117(boolean arg0, int arg1);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILlc;)V")
    public abstract void method2062(int arg0, class608 arg1);

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method2076(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILcb;)V")
    private final void method2639(int arg0, int arg1, class700 arg2) {
        try {
            ++field4677;
            if (arg0 > -54) {
                this.field4740 = 51;
            }
            this.method2088(this.field4832, 0, false);
            this.method2120(this.field4839, -1);
            this.method2103(arg2, arg1, 0, 119);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[70] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "eb", descriptor = "(I)V")
    private final void method2640(int arg0) {
        try {
            this.field4833 = this.method2117(true, 16);
            if (arg0 >= 117) {
                ++field4559;
                this.field4833.method2402(13179, 24, 12);
                this.field4820 = this.method2080(105, new class121[] { new class121(class212.field3105) });
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[69] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
    public final void method130(int arg0) {
        try {
            ++field4620;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[44] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "ab", descriptor = "(I)Lie;")
    public final class639 method2641(int arg0) {
        try {
            ++field4702;
            if (arg0 != 2) {
                this.field4582 = null;
            }
            return this.field4716;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[166] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)V")
    public abstract void method2104(byte arg0);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(Z)Lie;")
    public final class639 method2642(boolean arg0) {
        try {
            if (!arg0) {
                this.field4729 = 0.20826906F;
            }
            ++field4659;
            return this.field4722[this.field4735];
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[127] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "pa", descriptor = "()V")
    public final void method169() {
        try {
            ++field4587;
            this.field4723 = false;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[37] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "()Z")
    public final boolean method158() {
        try {
            ++field4638;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[118] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "(I)V")
    private final void method2643(int arg0) {
        try {
            this.field4799 = false;
            ++field4572;
            if (arg0 >= -35) {
                this.method2688(true);
            }
            if (this.field4756 != null) {
                this.field4756.method1473(126);
            }
            this.method2104((byte) -106);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[129] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "(B)V")
    public final void method2644(byte arg0) {
        try {
            this.field4708.method735();
            ++field4529;
            if (arg0 != 64) {
                this.method2624((class599) null, (byte) 121, (class599) null);
            }
            this.field4710 = true;
            this.method2633(0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[60] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "(I)V")
    private final void method2645(int arg0) {
        try {
            if (arg0 < -87) {
                this.method2125(119);
                ++field4642;
                if (this.field4756 != null) {
                    this.field4756.method1471(false);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[160] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "(I)V")
    private final void method2646(int arg0) {
        try {
            this.method2088(this.field4833, 0, false);
            ++field4693;
            this.method2120(this.field4820, -1);
            if (arg0 >= -81) {
                this.field4733 = -21;
            }
            this.method2103(class434.field6287, 1, 0, 112);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[150] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "()Lqa;")
    public final class104 method129() {
        try {
            ++field4627;
            return this.field4713;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[165] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[Lta;)V")
    public final void method189(int arg0, class330[] arg1) {
        try {
            for (int var3 = 0; ~var3 > ~arg0; ++var3) {
                this.field4730[var3] = arg1[var3];
            }
            ++field4526;
            this.field4737 = arg0;
            if (this.field4770.method5331(-30751)) {
                this.method2070(0);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[123] + arg0 + ',' + (arg1 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(ZI)V")
    public final void method2647(boolean arg0, int arg1) {
        try {
            if (arg1 != 0) {
                this.field4796 = -0.16368873F;
            }
            if (this.field4789 != arg0) {
                this.field4789 = arg0;
                this.method2102(101);
                this.field4781 &= -8;
            }
            ++field4666;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method156(Canvas arg0) {
        try {
            this.field4607 = null;
            ++field4689;
            this.field4598 = null;
            if (arg0 != null && this.field4557 != arg0) {
                if (this.field4582.containsKey(arg0)) {
                    this.field4607 = this.field4582.get(arg0);
                    this.field4598 = arg0;
                }
            } else {
                this.field4598 = this.field4557;
                this.field4607 = this.field4658;
            }
            if (this.field4598 != null && this.field4607 != null) {
                this.method2113(this.field4607, this.field4598, 1125);
                this.method2659(true);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[91] + (arg0 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "(I)V")
    public abstract void method2069(int arg0);

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "(I)V")
    private final void method2648(int arg0) {
        try {
            this.field4772 = false;
            ++field4612;
            this.method2649(arg0 ^ arg0);
            if (class784.field11313 == this.field4770) {
                this.method2645(arg0 + -105);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[105] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method2065(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!jj", name = "fb", descriptor = "(I)V")
    private final void method2649(int arg0) {
        try {
            ++field4624;
            if (!this.field4772) {
                float[] var2 = this.field4806;
                float var3 = (float) this.field4813;
                float var4 = (float) this.field4786;
                float var5 = (float) (-this.field4727) * this.field4777 / (float) this.field4814;
                float var6 = (float) (-this.field4745) * this.field4777 / (float) this.field4728;
                float var7 = (float) (-this.field4745 + this.field4653) * this.field4777 / (float) this.field4728;
                float var8 = (float) (-this.field4727 + this.field4646) * this.field4777 / (float) this.field4814;
                if (var6 != var7 && var5 != var8) {
                    var2[5] = 2.0F / (var8 - var5);
                    var2[15] = 1.0F;
                    var2[6] = 0.0F;
                    var2[0] = 2.0F / (var7 - var6);
                    var2[12] = (var6 + var7) / (-var7 + var6);
                    var2[1] = 0.0F;
                    var2[10] = 1.0F / (-var4 + var3);
                    var2[2] = 0.0F;
                    var2[11] = 0.0F;
                    var2[9] = 0.0F;
                    var2[7] = 0.0F;
                    var2[4] = 0.0F;
                    var2[14] = var3 / (var3 - var4);
                    var2[3] = 0.0F;
                    var2[8] = 0.0F;
                    var2[13] = (var5 + var8) / (-var5 + var8);
                } else {
                    var2[10] = 1.0F;
                    var2[7] = 0.0F;
                    var2[5] = 1.0F;
                    var2[13] = 0.0F;
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[1] = 0.0F;
                    var2[14] = 0.0F;
                    var2[15] = 1.0F;
                    var2[8] = 0.0F;
                    var2[2] = 0.0F;
                    var2[6] = 0.0F;
                    var2[11] = 0.0F;
                    var2[12] = 0.0F;
                    var2[9] = 0.0F;
                    var2[0] = 1.0F;
                }
                this.method2617(14547);
                this.field4772 = true;
            }
            if (arg0 != 0) {
                this.field4769 = 8;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4843[57] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method203(int arg0) {
        try {
            ++field4530;
            if (arg0 != 1) {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[38] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "(I)V")
    public abstract void method2075(int arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILon;Lhh;)Z")
    public abstract boolean method2082(int arg0, class496 arg1, class250 arg2);

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "(IIIIIII)I")
    public final int method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field4665;
            int var8 = 0;
            float var9 = (float) arg2 * this.field4713.field9049 + (float) arg0 * this.field4713.field9042 + (float) arg1 * this.field4713.field9082 + this.field4713.field9061;
            float var10 = (float) arg5 * this.field4713.field9049 + (float) arg3 * this.field4713.field9042 + (float) arg4 * this.field4713.field9082 + this.field4713.field9061;
            if (var9 < (float) this.field4813 && (float) this.field4813 > var10) {
                var8 |= 16;
            } else if (var9 > (float) this.field4786 && (float) this.field4786 < var10) {
                var8 |= 32;
            }
            int var11 = (int) (((float) arg2 * this.field4713.field9062 + (float) arg0 * this.field4713.field9066 + (float) arg1 * this.field4713.field9076 + this.field4713.field9048) * (float) this.field4728 / (float) arg6);
            int var12 = (int) (((float) arg5 * this.field4713.field9062 + (float) arg3 * this.field4713.field9066 + (float) arg4 * this.field4713.field9076 + this.field4713.field9048) * (float) this.field4728 / (float) arg6);
            if ((float) var11 < this.field4808 && (float) var12 < this.field4808) {
                var8 |= 1;
            } else if ((float) var11 > this.field4810 && (float) var12 > this.field4810) {
                var8 |= 2;
            }
            int var13 = (int) (((float) arg2 * this.field4713.field9033 + (float) arg0 * this.field4713.field9060 + (float) arg1 * this.field4713.field9081 + this.field4713.field9053) * (float) this.field4814 / (float) arg6);
            int var14 = (int) (((float) arg5 * this.field4713.field9033 + (float) arg3 * this.field4713.field9060 + (float) arg4 * this.field4713.field9081 + this.field4713.field9053) * (float) this.field4814 / (float) arg6);
            if ((float) var13 < this.field4800 && this.field4800 > (float) var14) {
                var8 |= 4;
            } else if (this.field4816 < (float) var13 && (float) var14 > this.field4816) {
                var8 |= 8;
            }
            return var8;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field4843[133] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lkl;I)V")
    public final void method2650(class740 arg0, int arg1) {
        try {
            int var3 = -86 / ((arg1 - -22) / 61);
            ++field4690;
            this.field4764[this.field4735] = arg0;
            this.method2662(0);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[72] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field4698;
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) arg3 - (float) arg1;
            float var13;
            if (var10 == 0.0F && var11 == 0.0F) {
                var13 = 1.0F;
            } else {
                float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
                var13 = var10 * var12;
                var11 *= var12;
            }
            this.method2632(false);
            this.method2658(arg4, -8793);
            this.method2655(1, 0, class659.field9335);
            this.method2670(-128, 0, class659.field9335);
            this.method2619(arg5, 1);
            this.method2644((byte) 64);
            this.method2101((byte) 46, false);
            int var26 = arg8 % (arg6 + arg7);
            float var14 = (float) arg6 * var13;
            float var15 = (float) arg6 * var11;
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = var14;
            float var19 = var15;
            if (~var26 < ~arg6) {
                var17 = (float) (-var26 + arg6 - -arg7) * var11;
                var16 = (float) (arg6 - (-arg7 + var26)) * var13;
            } else {
                var19 = (float) (-var26 + arg6) * var11;
                var18 = (float) (-var26 + arg6) * var13;
            }
            float var20 = (float) arg0 + var16;
            float var21 = (float) arg1 + var17;
            float var22 = (float) arg7 * var13;
            float var23 = (float) arg7 * var11;
            while (true) {
                if (~arg0 <= ~arg2) {
                    if (var20 < (float) arg2) {
                        break;
                    }
                    if ((float) arg2 > var18 + var20) {
                        var18 = (float) arg2 + -var20;
                    }
                } else {
                    if (var20 > (float) arg2) {
                        break;
                    }
                    if ((float) arg2 < var18 + var20) {
                        var18 = (float) arg2 + -var20;
                    }
                }
                if (~arg1 > ~arg3) {
                    if (var21 > (float) arg3) {
                        break;
                    }
                    if (var19 + var21 > (float) arg3) {
                        var19 = (float) arg3 + -var21;
                    }
                } else {
                    if ((float) arg3 > var21) {
                        break;
                    }
                    if (var19 + var21 < (float) arg3) {
                        var19 = (float) arg3 + -var21;
                    }
                }
                if (!this.method2622(var18 + var20, 85, 0.0F, var20, 0.0F, var19 + var21, var21)) {
                    return;
                }
                var20 += var18 + var22;
                var21 += var19 + var23;
                this.method2646(-108);
                var18 = var14;
                var19 = var15;
            }
            this.method2101((byte) 46, true);
            this.method2670(-128, 0, class784.field11325);
            this.method2655(1, 0, class784.field11325);
        } catch (RuntimeException var25) {
            throw class665.method4799(var25, field4843[125] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;")
    public final Stream method2651(Buffer arg0, int arg1) {
        try {
            ++field4538;
            if (arg1 != 16) {
                this.method2655(-42, -65, (class739) null);
            }
            this.field4741.method3207(arg0);
            return this.field4741;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[26] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(II)V")
    public final void method120(int arg0, int arg1) {
        try {
            if (~this.field4813 != ~arg0 || ~this.field4786 != ~arg1) {
                this.field4813 = arg0;
                this.field4786 = arg1;
                this.method2623(true);
                this.method2648(2);
                this.method2660(0);
            }
            ++field4678;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[163] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "(I)V")
    public abstract void method2110(int arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lkia;)V")
    public final void method126(class788 arg0) {
        try {
            this.field4790.method1196(arg0, this, -1, -18);
            ++field4556;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[66] + (arg0 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "(I)V")
    public abstract void method2091(int arg0);

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "()I")
    public final int method184() {
        try {
            ++field4634;
            return this.field4841;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[85] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[I[I)Laa;")
    public final class685 method236(int arg0, int arg1, int[] arg2, int[] arg3) {
        try {
            ++field4603;
            return class238.method1974(31974, this, arg3, arg0, arg2, arg1);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4843[168] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4843[6] : field4843[7]) + ',' + (arg3 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "(I)V")
    public final void method2652(int arg0) {
        try {
            if (arg0 == 1) {
                ++field4577;
                if (this.field4781 != 8) {
                    this.method2638(true);
                    this.method2685(true, -32);
                    this.method2669(true, arg0 + -18820);
                    this.method2628(1, true);
                    this.method2619(1, arg0);
                    this.field4781 = 8;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[81] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "bb", descriptor = "(I)I")
    public final int method2653(int arg0) {
        try {
            if (arg0 != 3) {
                return -111;
            } else {
                ++field4630;
                return this.field4753;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "([I)V")
    public final void method229(int[] arg0) {
        try {
            arg0[3] = this.field4754;
            arg0[0] = this.field4731;
            arg0[2] = this.field4812;
            ++field4576;
            arg0[1] = this.field4787;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[16] + (arg0 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lqa;)V")
    public final void method204(class104 arg0) {
        try {
            ++field4637;
            this.field4713 = (class639) arg0;
            this.field4715.method733(this.field4713);
            this.field4715.method4667(11);
            this.field4716.method4659(62, this.field4715);
            this.field4714.method4659(-88, this.field4713);
            if (this.field4770.method5331(-30751)) {
                this.method2643(-101);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[34] + (arg0 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method220(Canvas arg0) {
        try {
            ++field4683;
            if (this.field4557 == arg0) {
                throw new RuntimeException();
            } else if (this.field4582.containsKey(arg0)) {
                this.method2076(this.field4582.get(arg0), arg0, 0);
                this.field4582.remove(arg0);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[114] + (arg0 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            ++field4583;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field4843[145] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4843[6] : field4843[7]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "(I)V")
    public abstract void method2084(int arg0);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "(Z)V")
    private final void method2654(boolean arg0) {
        try {
            if (arg0) {
                this.field4834 = this.method2117(false, 16);
                ++field4643;
                this.field4834.method2402(13179, 3096, 12);
                for (int var2 = 0; ~var2 > -5; ++var2) {
                    Buffer var3 = this.field4834.method2401(true, true);
                    if (var3 != null) {
                        Stream var4 = this.method2651(var3, 16);
                        var4.method3202(0.0F);
                        var4.method3202(0.0F);
                        var4.method3202(0.0F);
                        for (int var5 = 0; var5 <= 256; ++var5) {
                            double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                            float var8 = (float) Math.cos(var6);
                            float var9 = (float) Math.sin(var6);
                            if (!Stream.method3200()) {
                                var4.method3206(var9);
                                var4.method3206(var8);
                                var4.method3206(0.0F);
                            } else {
                                var4.method3202(var9);
                                var4.method3202(var8);
                                var4.method3202(0.0F);
                            }
                        }
                        var4.method3199();
                        if (this.field4834.method2405(-9200)) {
                            break;
                        }
                    }
                }
                this.field4840 = this.method2080(115, new class121[] { new class121(class212.field3105) });
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field4843[122] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "()Z")
    public final boolean method140() {
        try {
            ++field4648;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[151] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILoba;)V")
    public final void method2655(int arg0, int arg1, class739 arg2) {
        try {
            this.method2096(false, false, (byte) -107, arg2, arg1);
            ++field4560;
            if (arg0 != 1) {
                this.field4710 = true;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[134] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZIZZ)V")
    private final void method2656(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, boolean arg5) {
        try {
            boolean var9 = arg2 & this.method125();
            ++field4563;
            if (!var9 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
                arg1 = 2;
                arg3 = arg1 == 4 ? arg0 & 1 : 1;
                arg0 = 0;
            }
            if (!arg5) {
                this.method2643(-20);
            }
            if (arg1 != 0 && arg4) {
                arg1 |= Integer.MIN_VALUE;
            }
            if (this.field4785 == arg1) {
                if (~this.field4785 != -1) {
                    this.field4793[this.field4785 & Integer.MAX_VALUE].method460((byte) -20, arg4);
                    if (~this.field4761 != ~arg0 || this.field4743 != arg3) {
                        this.field4793[Integer.MAX_VALUE & this.field4785].method463(arg0, arg3, (byte) -120);
                        this.field4761 = arg0;
                        this.field4743 = arg3;
                    }
                    return;
                }
            } else {
                if (~this.field4785 != -1) {
                    this.field4793[Integer.MAX_VALUE & this.field4785].method455(-15226);
                }
                if (~arg1 == -1) {
                    this.field4756 = null;
                } else {
                    this.field4756 = this.field4793[arg1 & Integer.MAX_VALUE];
                    this.field4756.method454(122, arg4);
                    this.field4756.method460((byte) -20, arg4);
                    this.field4756.method463(arg0, arg3, (byte) -109);
                }
                this.field4785 = arg1;
                this.field4743 = arg3;
                this.field4761 = arg0;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4843[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "()V")
    public final void method123() {
        try {
            if (this.field4748 != null) {
                this.field4748.method2211((byte) -110);
            }
            ++field4647;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[158] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BZ)V")
    public abstract void method2101(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "(B)V")
    public abstract void method2081(byte arg0);

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "(IIII)V")
    public final void method230(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4641;
            boolean var5 = false;
            if (~arg0 < ~this.field4731) {
                this.field4731 = arg0;
                var5 = true;
            }
            if (this.field4812 > arg2) {
                var5 = true;
                this.field4812 = arg2;
            }
            if (~arg1 < ~this.field4787) {
                var5 = true;
                this.field4787 = arg1;
            }
            if (arg3 < this.field4754) {
                this.field4754 = arg3;
                var5 = true;
            }
            if (var5) {
                if (!this.field4842) {
                    this.field4842 = true;
                    this.method2090((byte) -94);
                }
                this.method2091(-9213);
                this.method2684((byte) -32);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4843[137] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lkia;I)V")
    public final void method193(class788 arg0, int arg1) {
        try {
            ++field4549;
            this.field4790.method1196(arg0, this, arg1, 127);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[173] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "aa", descriptor = "(IIIIII)V")
    public final void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4554;
            this.method2632(false);
            this.method2658(arg4, -8793);
            this.method2655(1, 0, class659.field9335);
            this.method2670(-128, 0, class659.field9335);
            this.method2619(arg5, 1);
            this.field4708.method4664((float) arg3, 22931, 1.0F, (float) arg2);
            this.field4708.method721(arg0, arg1, 0);
            this.method2671((byte) -100);
            this.method2101((byte) 46, false);
            this.method2663(-46);
            this.method2101((byte) 46, true);
            this.method2670(-128, 0, class784.field11325);
            this.method2655(1, 0, class784.field11325);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4843[159] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([I)V")
    public final void method170(int[] arg0) {
        try {
            ++field4682;
            arg0[0] = this.field4653;
            arg0[1] = this.field4646;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[41] + (arg0 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "HA", descriptor = "(IIII[I)V")
    public final void method171(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        try {
            ++field4650;
            float var6 = this.field4713.method4662((float) arg2, (float) arg0, (float) arg1, (byte) 81);
            if (!(var6 < (float) this.field4813) && !(var6 > (float) this.field4786)) {
                int var7 = (int) ((float) this.field4728 * this.field4713.method4660((float) arg0, (float) arg1, (float) arg2, 0) / (float) arg3);
                int var8 = (int) ((float) this.field4814 * this.field4713.method4661((float) arg1, 124, (float) arg0, (float) arg2) / (float) arg3);
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 + -this.field4800);
                arg4[0] = (int) ((float) var7 + -this.field4808);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4843[50] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "()V")
    public void method167() {
        try {
            ++field4649;
            if (!this.field4755) {
                for (class578 var1 = this.field4684.method3977((byte) -75); var1 != null; var1 = this.field4684.method3987(0)) {
                    ((class551) var1).method4125(4);
                }
                Enumeration var2 = this.field4582.keys();
                while (var2.hasMoreElements()) {
                    Canvas var3 = (Canvas) var2.nextElement();
                    this.method2076(this.field4582.get(var3), var3, 0);
                }
                class485.method3742(false, true, -18448);
                this.field4656.release();
                this.field4755 = true;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[13] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "(I)V")
    public abstract void method2098(int arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            ++field4570;
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field4843[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIII)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4695;
            float var7 = this.method2095((byte) -111);
            this.method2632(false);
            this.method2658(arg4, -8793);
            this.method2655(1, 0, class659.field9335);
            this.method2670(-128, 0, class659.field9335);
            this.method2619(arg5, 1);
            this.field4708.method4664((float) (arg3 - 1), 22931, 1.0F, (float) (arg2 + -1));
            this.field4708.method4650(0.0F, 113, (float) arg0 + -var7, (float) arg1 - var7);
            this.method2671((byte) -117);
            this.method2101((byte) 46, false);
            this.method2639(-89, 4, class696.field9752);
            this.method2101((byte) 46, true);
            this.method2670(-128, 0, class784.field11325);
            this.method2655(1, 0, class784.field11325);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4843[79] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([FI)[F")
    public final float[] method2657(float[] arg0, int arg1) {
        try {
            ++field4604;
            arg0[0] = this.field4792[0];
            arg0[4] = this.field4792[1];
            arg0[8] = this.field4792[2];
            arg0[12] = this.field4792[3];
            arg0[5] = this.field4792[5];
            arg0[2] = this.field4792[8];
            arg0[13] = this.field4792[7];
            arg0[9] = this.field4792[6];
            arg0[1] = this.field4792[4];
            arg0[6] = this.field4792[9];
            arg0[14] = this.field4792[11];
            arg0[7] = this.field4792[13];
            arg0[arg1] = this.field4792[10];
            arg0[3] = this.field4792[12];
            arg0[15] = this.field4792[15];
            arg0[11] = this.field4792[14];
            return arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[58] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "(II)V")
    public final void method2658(int arg0, int arg1) {
        try {
            ++field4594;
            if (this.field4720 != arg0) {
                this.field4720 = arg0;
                this.method2110(119);
            }
            if (arg1 != -8793) {
                this.method2096(true, false, (byte) 28, (class739) null, 19);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[96] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(Z)V")
    private final void method2659(boolean arg0) {
        try {
            ++field4600;
            if (this.field4598 != null) {
                Dimension var2 = this.field4598.getSize();
                this.field4596 = var2.width;
                this.field4608 = var2.height;
            } else {
                this.field4596 = this.field4608 = 1;
            }
            if (!arg0) {
                this.field4748 = null;
            }
            this.field4646 = this.field4608;
            this.field4653 = this.field4596;
            this.method2637(0);
            this.method2623(arg0);
            this.method2648(2);
            this.method2069(-4984);
            this.method2684((byte) -32);
            this.method2687(111);
            this.method240();
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[84] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[Luc;)Lot;")
    public abstract class218 method2080(int arg0, class121[] arg1);

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "(I)V")
    private final void method2660(int arg0) {
        try {
            if (arg0 == 0) {
                ++field4585;
                if (this.field4756 != null) {
                    this.field4756.method1472(-5405);
                }
                this.method2081((byte) -114);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "(II)V")
    public final void method2661(int arg0, int arg1) {
        try {
            ++field4610;
            if (this.field4735 != arg1) {
                this.field4735 = arg1;
                this.method2084(4843);
            }
            if (arg0 <= 34) {
                this.method2618(15);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[143] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "()Z")
    public final boolean method202() {
        try {
            ++field4644;
            return false;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[30] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "(Z)V")
    public final void method119(boolean arg0) {
        try {
            ++field4667;
            this.field4765 = arg0;
            this.method2119(-113);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[140] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()Z")
    public final boolean method172() {
        try {
            ++field4674;
            return false;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[68] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(B)V")
    public abstract void method2106(byte arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lza;)V")
    public final void method207(class348 arg0) {
        try {
            ++field4590;
            this.field4536 = ((class551) arg0).field8040;
            this.field4524 = this.field4536.method3189(32768, false);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[138] + (arg0 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IIIIII)Lsn;")
    public final class369 method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4663;
            return new class140(this, arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4843[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "(I)V")
    private final void method2662(int arg0) {
        try {
            this.method2064(1);
            if (arg0 != 0) {
                this.method2072(124);
            }
            ++field4574;
            if (this.field4756 != null) {
                this.field4756.method456(30824);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[142] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "(I)V")
    public final void method2663(int arg0) {
        try {
            this.method2639(-118, 2, class36.field443);
            ++field4703;
            if (arg0 > -4) {
                this.method231((class66) null, false);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "(IIIII)V")
    public final void method124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method219(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
            ++field4664;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4843[80] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZ)Ltb;")
    public final class392 method222(int arg0, int arg1, boolean arg2) {
        try {
            ++field4676;
            return new class383(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[148] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZII)V")
    public final void method2664(boolean arg0, boolean arg1, int arg2, int arg3) {
        try {
            if (~this.field4788 != ~arg3 || this.field4723 == !this.field4759) {
                class196 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = !this.field4723 ? 0 : 3;
                if (arg3 < 0) {
                    this.method2625(arg2 + 2147483631);
                } else {
                    var5 = this.field4748.method2214(arg3, (byte) -26);
                    class684 var10 = super.field237.method4500(-23641, arg3);
                    if (var10.field9598 == 0 && var10.field9592 == 0) {
                        this.method2625(Integer.MAX_VALUE);
                    } else {
                        int var11 = var10.field9599 ? 64 : 128;
                        int var12 = var11 * 50;
                        class639 var13 = this.method2642(true);
                        var13.method4651((float) (this.field4774 % var12 * var10.field9598) / (float) var12, (float) (this.field4774 % var12 * var10.field9592) / (float) var12, 0.0F, 1);
                        this.method2650(class467.field6818, arg2 ^ -125);
                    }
                    if (!this.field4723) {
                        var9 = var10.field9605;
                        var8 = var10.field9588;
                        var7 = var10.field9600;
                    }
                    var6 = var10.field9593;
                }
                this.method2656(var7, var9, arg0, var8, arg1, true);
                if (this.field4756 != null) {
                    this.field4756.method452(var6, (byte) -106, var5);
                } else {
                    this.method2668(24, var5);
                    this.method2679(2, var6);
                }
                this.field4788 = arg3;
                this.field4759 = this.field4723;
            }
            if (arg2 != 16) {
                this.field4826 = null;
            }
            ++field4532;
            this.field4781 &= -8;
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field4843[63] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "(B)I")
    public final int method2665(byte arg0) {
        try {
            ++field4545;
            if (arg0 <= 11) {
                this.field4822 = null;
            }
            return this.field4724;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[59] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "(I)V")
    public void method175(int arg0) {
        try {
            ++field4661;
            if (this.field4748 != null) {
                this.field4748.method2212((byte) 60);
            }
            this.field4774 = Integer.MAX_VALUE & arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[86] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "(III[I)V")
    public final void method223(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field4588;
            float var5 = this.field4713.method4662((float) arg2, (float) arg0, (float) arg1, (byte) 90);
            int var6;
            int var7;
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
                var6 = this.field4727;
                var7 = this.field4745;
            } else {
                var7 = (int) ((float) this.field4728 * this.field4713.method4660((float) arg0, (float) arg1, (float) arg2, 0) / var5);
                var6 = (int) ((float) this.field4814 * this.field4713.method4661((float) arg1, 109, (float) arg0, (float) arg2) / var5);
            }
            arg3[1] = (int) ((float) var6 + -this.field4800);
            arg3[0] = (int) ((float) var7 + -this.field4808);
            arg3[2] = (int) var5;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4843[67] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method168(Canvas arg0, int arg1, int arg2) {
        try {
            ++field4533;
            Object var4 = null;
            if (arg0 != null && this.field4557 != arg0) {
                if (this.field4582.containsKey(arg0)) {
                    var4 = this.field4582.get(arg0);
                }
            } else {
                var4 = this.field4607;
            }
            if (var4 == null) {
                throw new RuntimeException();
            } else {
                this.method2066(var4, arg0, 65);
                if (this.field4598 == arg0) {
                    this.method2659(true);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4843[147] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "(I)V")
    public final void method2666(int arg0) {
        try {
            if (~this.field4781 != -3) {
                this.method2611(0);
                this.method2685(false, -32);
                this.method2647(false, 0);
                this.method2669(false, -18819);
                this.method2628(1, false);
                this.method2664(false, false, 16, -2);
                this.field4781 = 2;
            }
            if (arg0 == 0) {
                ++field4697;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[45] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "(I)V")
    public abstract void method2072(int arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZB[FLhh;I)Lcf;")
    public final class196 method2667(int arg0, boolean arg1, byte arg2, float[] arg3, class250 arg4, int arg5) {
        try {
            if (arg2 < 3) {
                this.field4809 = 1.5854045F;
            }
            ++field4668;
            return this.method2073(0, arg3, 0, arg5, 0, arg1, arg0, arg4);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4843[101] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4843[6] : field4843[7]) + ',' + (arg4 != null ? field4843[6] : field4843[7]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILah;)V")
    public final void method2668(int arg0, class764 arg1) {
        try {
            if (this.field4739[this.field4735] != arg1) {
                this.field4739[this.field4735] = arg1;
                if (arg1 == null) {
                    this.method2092(arg0 + -17);
                } else {
                    arg1.method2251(14436);
                }
                this.field4781 &= -2;
            }
            ++field4535;
            if (arg0 != 24) {
                this.field4746 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[132] + arg0 + ',' + (arg1 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            ++field4686;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field4843[71] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4843[6] : field4843[7]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(ZI)V")
    public final void method2669(boolean arg0, int arg1) {
        try {
            if (arg0 == !this.field4734) {
                this.field4734 = arg0;
                this.method2075(arg1 + 18731);
                this.field4781 &= -32;
            }
            ++field4561;
            if (arg1 != -18819) {
                this.field4653 = -28;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[117] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IILoba;)V")
    public final void method2670(int arg0, int arg1, class739 arg2) {
        try {
            ++field4618;
            this.method2063(false, arg1, arg2, false);
            if (arg0 >= -127) {
                this.method126((class788) null);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[174] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)Luba;")
    public abstract class517 method2071(boolean arg0, int arg1);

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Llga;II)V")
    public class334(Canvas arg0, Object arg1, class673 arg2, class47 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            try {
                this.field4749 = arg4;
                this.field4705 = arg3;
                this.field4607 = this.field4658 = arg1;
                this.field4598 = this.field4557 = arg0;
                Dimension var7 = arg0.getSize();
                this.field4653 = this.field4596 = var7.width;
                this.field4646 = this.field4608 = var7.height;
                this.field4775 = arg5;
                class445.method3458(true, (byte) 99, false);
                if (super.field237 == null) {
                    this.field4656 = new NativeInterface(0, this.field4775);
                    this.field4748 = null;
                } else {
                    this.field4748 = new class270(this, super.field237);
                    this.field4656 = new NativeInterface(super.field237.method4503(true), this.field4775);
                    for (int var8 = 0; ~super.field237.method4503(true) < ~var8; ++var8) {
                        class684 var9 = super.field237.method4500(-23641, var8);
                        if (var9 != null) {
                            this.field4656.initTextureMetrics(var8, var9.field9589, var9.field9602);
                        }
                    }
                }
            } catch (Throwable var12) {
                var12.printStackTrace();
                this.method177((byte) -87);
                throw new RuntimeException("");
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4843[20] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + (arg1 != null ? field4843[6] : field4843[7]) + ',' + (arg2 != null ? field4843[6] : field4843[7]) + ',' + (arg3 != null ? field4843[6] : field4843[7]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
    public final int method194(int arg0, int arg1) {
        try {
            ++field4680;
            return arg0 | arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[119] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method235(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        try {
            ++field4654;
            boolean var7 = this.field4783 != arg0;
            if (var7 || this.field4757 != arg1 || this.field4736 != arg2) {
                this.field4783 = arg0;
                this.field4757 = arg1;
                this.field4736 = arg2;
                if (var7) {
                    this.field4758 = (float) (this.field4783 & 255) / 255.0F;
                    this.field4767 = (float) (65280 & this.field4783) / 65280.0F;
                    this.field4807 = (float) (this.field4783 & 16711680) / 1.671168E7F;
                    this.method2109(1);
                }
                this.field4656.setSunColour(this.field4807, this.field4767, this.field4758, arg1, arg2);
                this.method2085((byte) -23);
            }
            if (this.field4778[0] != arg3 || this.field4778[1] != arg4 || this.field4778[2] != arg5) {
                this.field4778[2] = arg5;
                this.field4778[1] = arg4;
                this.field4778[0] = arg3;
                this.field4762[2] = -arg5;
                this.field4762[0] = -arg3;
                this.field4762[1] = -arg4;
                float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
                this.field4746[1] = arg4 * var8;
                this.field4746[2] = arg5 * var8;
                this.field4746[0] = arg3 * var8;
                this.field4771[2] = -this.field4746[2];
                this.field4771[0] = -this.field4746[0];
                this.field4771[1] = -this.field4746[1];
                this.field4656.setSunDirection(this.field4746[0], this.field4746[1], this.field4746[2]);
                this.method2114(-5072);
                this.field4752 = (int) (arg5 * 256.0F / arg4);
                this.field4742 = (int) (arg3 * 256.0F / arg4);
            }
            this.method2094(false);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field4843[47] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lhh;IIILon;)Lcf;")
    public abstract class196 method2121(class250 arg0, int arg1, int arg2, int arg3, class496 arg4);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lhh;Lon;Z)Z")
    public abstract boolean method2079(class250 arg0, class496 arg1, boolean arg2);

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V")
    public final void method2671(byte arg0) {
        try {
            ++field4609;
            this.field4710 = false;
            if (arg0 > -98) {
                this.field4736 = 0.37257564F;
            }
            this.method2633(0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[48] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "()Lqa;")
    public final class104 method136() {
        try {
            ++field4619;
            return this.field4821;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[103] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "(I)V")
    public abstract void method2114(int arg0);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZI)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method2672(int arg0, boolean arg1, int arg2) {
        try {
            if (arg0 != 0) {
                return null;
            } else {
                ++field4592;
                return this.field4536.method3189(arg2, arg1);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[87] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "(I)V")
    private final void method2673(int arg0) {
        try {
            int var2 = -102 / ((arg0 - -2) / 39);
            ++field4709;
            this.field4832 = this.method2117(false, 16);
            this.field4832.method2402(13179, 140, 28);
            for (int var3 = 0; ~var3 > -5; ++var3) {
                Buffer var4 = this.field4832.method2401(true, true);
                if (var4 != null) {
                    Stream var5 = this.method2651(var4, 16);
                    if (!Stream.method3200()) {
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(1.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(1.0F);
                        var5.method3206(0.0F);
                        var5.method3206(1.0F);
                        var5.method3206(1.0F);
                        var5.method3206(1.0F);
                        var5.method3206(0.0F);
                        var5.method3206(1.0F);
                        var5.method3206(1.0F);
                        var5.method3206(1.0F);
                        var5.method3206(1.0F);
                        var5.method3206(1.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(1.0F);
                        var5.method3206(0.0F);
                        var5.method3206(1.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                        var5.method3206(0.0F);
                    } else {
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(1.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(1.0F);
                        var5.method3202(0.0F);
                        var5.method3202(1.0F);
                        var5.method3202(1.0F);
                        var5.method3202(1.0F);
                        var5.method3202(0.0F);
                        var5.method3202(1.0F);
                        var5.method3202(1.0F);
                        var5.method3202(1.0F);
                        var5.method3202(1.0F);
                        var5.method3202(1.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(1.0F);
                        var5.method3202(0.0F);
                        var5.method3202(1.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                        var5.method3202(0.0F);
                    }
                    var5.method3199();
                    if (this.field4832.method2405(-9200)) {
                        break;
                    }
                }
            }
            this.field4839 = this.method2080(125, new class121[] { new class121(new class212[] { class212.field3105, class212.field3113, class212.field3113 }) });
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4843[130] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lie;I)V")
    public final void method2674(class639 arg0, int arg1) {
        try {
            this.field4708.method733(arg0);
            ++field4671;
            this.field4710 = false;
            if (arg1 <= -117) {
                this.method2633(0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[167] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "()Z")
    public final boolean method186() {
        try {
            ++field4569;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[1] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ[BLhh;BI)Lcf;")
    public final class196 method2675(int arg0, boolean arg1, byte[] arg2, class250 arg3, byte arg4, int arg5) {
        try {
            if (arg4 >= -44) {
                return null;
            } else {
                ++field4688;
                return this.method2126(arg1, arg0, (byte) 82, arg2, 0, arg3, 0, arg5);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4843[40] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4843[6] : field4843[7]) + ',' + (arg3 != null ? field4843[6] : field4843[7]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)Lza;")
    public final class348 method214(int arg0) {
        try {
            ++field4622;
            class551 var2 = new class551(arg0);
            this.field4684.method3984(var2, 0);
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[27] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "(I)Lnm;")
    public final class361 method2676(int arg0) {
        try {
            if (arg0 != 1) {
                this.field4796 = 2.129137F;
            }
            ++field4611;
            return this.field4797 != null ? this.field4797.method1219((byte) -119) : null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[106] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lbl;IZ)V")
    public abstract void method2088(class719 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "(B)V")
    private final void method2677(byte arg0) {
        try {
            ++field4628;
            if (class784.field11313 != this.field4770) {
                class733 var2 = this.field4770;
                this.field4770 = class784.field11313;
                if (!var2.method5331(-30751)) {
                    this.method2643(-84);
                }
                this.method2649(0);
                this.field4792 = this.field4806;
                this.method2645(-128);
                this.field4781 &= -8;
            }
            int var3 = 37 % ((29 - arg0) / 39);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[75] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "(I)V")
    public final void method2678(int arg0) {
        try {
            this.field4739 = new class764[this.field4733];
            this.field4722 = new class639[this.field4733];
            ++field4528;
            this.field4764 = new class740[this.field4733];
            this.field4798 = new class599[this.field4733];
            this.field4817 = new class599[this.field4733];
            for (int var2 = 0; var2 < this.field4733; ++var2) {
                this.field4817[var2] = class539.field7920;
                this.field4798[var2] = class539.field7920;
                this.field4764[var2] = class684.field9603;
                this.field4722[var2] = new class639();
            }
            this.field4730 = new class330[this.field4740 - 2];
            this.field4751 = this.method2121(class385.field5635, 4, 1, 1, class496.field7281);
            this.method207(new class551(262144));
            this.field4836 = this.method2080(93, new class121[] { new class121(new class212[] { class212.field3105, class212.field3113 }) });
            this.field4830 = this.method2080(71, new class121[] { new class121(new class212[] { class212.field3105, class212.field3111 }) });
            this.field4831 = this.method2080(114, new class121[] { new class121(class212.field3105), new class121(class212.field3111), new class121(class212.field3113), new class121(class212.field3110) });
            this.field4826 = this.method2080(65, new class121[] { new class121(class212.field3105), new class121(class212.field3111), new class121(class212.field3113) });
            this.field4828 = new class37(this, 0, 0, false, false);
            this.field4829 = new class37(this, 0, 0, true, true);
            this.field4838 = new class37(this, 0, 0, false, false);
            this.field4823 = new class37(this, 0, 0, true, true);
            this.field4835 = new class37(this, 0, 0, false, false);
            this.field4825 = new class37(this, 0, 0, true, true);
            this.field4822 = new class37(this, 0, 0, false, false);
            this.field4827 = new class37(this, 0, 0, true, true);
            this.field4819 = new class37(this, arg0, 0, false, false);
            this.field4837 = new class37(this, 0, 0, true, true);
            this.field4790 = new class137(this);
            this.field4824 = this.method2071(true, -21663);
            this.method2609(120);
            this.field4687 = new class130(this);
            this.field4793[1] = this.method2127((byte) 93, 1);
            this.field4793[2] = this.method2127((byte) 106, 2);
            this.field4793[4] = this.method2127((byte) 112, 4);
            this.field4793[5] = this.method2127((byte) 90, 5);
            this.field4793[6] = this.method2127((byte) 82, 6);
            this.field4793[7] = this.method2127((byte) 99, 7);
            this.field4793[3] = this.method2127((byte) 85, 3);
            this.field4793[8] = this.method2127((byte) 108, 8);
            this.field4793[9] = this.method2127((byte) 75, 9);
            if (!this.field4793[2].method458(122)) {
                this.field4793[2] = this.method2127((byte) 111, 0);
            }
            if (!this.field4793[4].method458(arg0 + 101)) {
                this.field4793[4] = this.field4793[2];
            }
            if (!this.field4793[8].method458(arg0 + 126)) {
                this.field4793[8] = this.field4793[4];
            }
            if (!this.field4793[9].method458(102)) {
                this.field4793[9] = this.field4793[8];
            }
            this.method2123(5);
            this.method240();
            this.method238();
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[149] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "(II)V")
    public final void method2679(int arg0, int arg1) {
        try {
            if (~arg1 != -2) {
                if (arg1 == 0) {
                    this.method2624(class539.field7920, (byte) 124, class539.field7920);
                } else if (arg1 != 2) {
                    if (arg1 == 3) {
                        this.method2624(class647.field9205, (byte) 111, class539.field7920);
                    } else if (~arg1 == -5) {
                        this.method2624(class264.field3735, (byte) 121, class264.field3735);
                    }
                } else {
                    this.method2624(class795.field11565, (byte) 102, class256.field3668);
                }
            } else {
                this.method2624(class256.field3668, (byte) 118, class256.field3668);
            }
            if (arg0 != 2) {
                this.method156((Canvas) null);
            }
            ++field4616;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[139] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZBLoba;I)V")
    public abstract void method2096(boolean arg0, boolean arg1, byte arg2, class739 arg3, int arg4);

    @OriginalMember(owner = "client!jj", name = "JA", descriptor = "(IIIIII)I")
    public final int method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4636;
            int var7 = 0;
            float var8 = (float) arg2 * this.field4713.field9049 + (float) arg0 * this.field4713.field9042 + (float) arg1 * this.field4713.field9082 + this.field4713.field9061;
            if (var8 < 1.0F) {
                var8 = 1.0F;
            }
            float var9 = (float) arg5 * this.field4713.field9049 + (float) arg3 * this.field4713.field9042 + (float) arg4 * this.field4713.field9082 + this.field4713.field9061;
            if (var9 < 1.0F) {
                var9 = 1.0F;
            }
            if ((float) this.field4813 > var8 && (float) this.field4813 > var9) {
                var7 |= 16;
            } else if ((float) this.field4786 < var8 && var9 > (float) this.field4786) {
                var7 |= 32;
            }
            int var10 = (int) (((float) arg2 * this.field4713.field9062 + (float) arg0 * this.field4713.field9066 + (float) arg1 * this.field4713.field9076 + this.field4713.field9048) * (float) this.field4728 / var8);
            int var11 = (int) (((float) arg5 * this.field4713.field9062 + (float) arg3 * this.field4713.field9066 + (float) arg4 * this.field4713.field9076 + this.field4713.field9048) * (float) this.field4728 / var9);
            if ((float) var10 < this.field4808 && (float) var11 < this.field4808) {
                var7 |= 1;
            } else if (this.field4810 < (float) var10 && this.field4810 < (float) var11) {
                var7 |= 2;
            }
            int var12 = (int) (((float) arg2 * this.field4713.field9033 + (float) arg0 * this.field4713.field9060 + (float) arg1 * this.field4713.field9081 + this.field4713.field9053) * (float) this.field4814 / var8);
            int var13 = (int) (((float) arg5 * this.field4713.field9033 + (float) arg3 * this.field4713.field9060 + (float) arg4 * this.field4713.field9081 + this.field4713.field9053) * (float) this.field4814 / var9);
            if (this.field4800 > (float) var12 && (float) var13 < this.field4800) {
                var7 |= 4;
            } else if ((float) var12 > this.field4816 && this.field4816 < (float) var13) {
                var7 |= 8;
            }
            return var7;
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field4843[157] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "da", descriptor = "(III[I)V")
    public final void method239(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field4547;
            float var5 = this.field4713.method4662((float) arg2, (float) arg0, (float) arg1, (byte) 113);
            int var6;
            int var7;
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
                var6 = this.field4745;
                var7 = this.field4727;
            } else {
                var6 = (int) ((float) this.field4728 * this.field4713.method4660((float) arg0, (float) arg1, (float) arg2, 0) / var5);
                var7 = (int) ((float) this.field4814 * this.field4713.method4661((float) arg1, 125, (float) arg0, (float) arg2) / var5);
            }
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field4800);
            arg3[0] = (int) ((float) var6 + -this.field4808);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4843[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4843[6] : field4843[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "KA", descriptor = "(IIII)V")
    public final void method208(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4617;
            if (arg0 <= 0 && ~(this.field4653 + -1) >= ~arg2 && arg1 <= 0 && this.field4646 - 1 <= arg3) {
                this.method240();
            } else {
                this.field4787 = ~arg1 <= -1 ? arg1 : 0;
                this.field4731 = ~arg0 > -1 ? 0 : arg0;
                this.field4812 = ~this.field4653 <= ~arg2 ? arg2 : 0;
                this.field4754 = this.field4653 >= arg3 ? arg3 : 0;
                if (!this.field4842) {
                    this.field4842 = true;
                    this.method2090((byte) -94);
                }
                this.method2091(-9213);
                this.method2684((byte) -32);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4843[24] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V")
    public abstract void method2124(byte arg0, int arg1);

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "(I)V")
    public void method2123(int arg0) {
        try {
            ++field4673;
            this.method2629(false);
            if (arg0 != 5) {
                this.method2119(45);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[171] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "(III)V")
    public final void method232(int arg0, int arg1, int arg2) {
        try {
            if (this.field4768 != arg0 || ~this.field4732 != ~arg1 || this.field4779 != arg2) {
                this.field4768 = arg0;
                this.field4779 = arg2;
                this.field4732 = arg1;
                this.method2660(0);
                this.method2097(-12888);
            }
            ++field4552;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[162] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "(I)V")
    public final void method209(int arg0) {
        try {
            this.field4773 = 0;
            ++field4704;
            while (arg0 > 1) {
                arg0 >>= 1;
                ++this.field4773;
            }
            this.field4803 = 1 << this.field4773;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[128] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method2113(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!jj", name = "db", descriptor = "(I)V")
    public void method2070(int arg0) {
        try {
            ++field4655;
            this.field4802 = this.field4737;
            this.field4737 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "(B)Lie;")
    public final class639 method2680(byte arg0) {
        try {
            ++field4679;
            if (arg0 > -24) {
                this.field4787 = -107;
            }
            return this.field4722[this.field4735];
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[115] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIB[BILhh;II)Lcf;")
    public abstract class196 method2126(boolean arg0, int arg1, byte arg2, byte[] arg3, int arg4, class250 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
    public final void method2681(int arg0, boolean arg1) {
        try {
            if (arg0 <= 8) {
                this.method2622(-0.27218023F, -63, 2.4606216F, 0.13717346F, 0.7910839F, 0.6869497F, 0.23598336F);
            }
            if (this.field4811 != arg1) {
                this.field4811 = arg1;
                this.method2102(110);
            }
            ++field4584;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[120] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "(I)I")
    public final int method2682(int arg0) {
        try {
            if (arg0 != 8) {
                this.method216();
            }
            ++field4613;
            return this.field4805;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "()Z")
    public final boolean method215() {
        try {
            ++field4553;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[39] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "(B)[F")
    public final float[] method2683(byte arg0) {
        try {
            int var2 = -10 % ((arg0 - -74) / 42);
            ++field4542;
            return this.field4776;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[92] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "(I)V")
    public abstract void method2102(int arg0);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "(B)V")
    public abstract void method2090(byte arg0);

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public final void method218(int arg0) {
        try {
            ++field4565;
            if (arg0 >= 128 && arg0 <= 1024) {
                if (this.field4748 != null) {
                    this.field4748.method2211((byte) -110);
                }
                this.field4769 = arg0;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "(B)V")
    private final void method2684(byte arg0) {
        try {
            this.field4808 = (float) (this.field4731 - this.field4745);
            ++field4534;
            this.field4800 = (float) (-this.field4727 + this.field4787);
            this.field4816 = (float) (-this.field4727 + this.field4754);
            if (arg0 == -32) {
                this.field4810 = (float) (-this.field4745 + this.field4812);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[164] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "(I)V")
    public abstract void method2119(int arg0);

    @OriginalMember(owner = "client!jj", name = "xa", descriptor = "(F)V")
    public final void method127(float arg0) {
        try {
            ++field4639;
            if (this.field4801 != arg0) {
                this.field4801 = arg0;
                this.field4656.setAmbient(arg0);
                this.method2109(1);
                this.method2094(false);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[107] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "()Z")
    public final boolean method133() {
        try {
            ++field4626;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[108] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "(I)V")
    public abstract void method2109(int arg0);

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(ZI)V")
    public final void method2685(boolean arg0, int arg1) {
        try {
            if (!arg0 != !this.field4760) {
                this.field4760 = arg0;
                this.method2097(-12888);
                this.field4781 &= -32;
            }
            ++field4662;
            if (arg1 != -32) {
                this.field4835 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[65] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "()Z")
    public final boolean method216() {
        try {
            ++field4605;
            return true;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[32] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZ)Ltb;")
    public final class392 method196(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            ++field4523;
            class383 var6 = new class383(this, arg2, arg3, arg4);
            var6.method873(0, 0, arg2, arg3, arg0, arg1);
            return var6;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4843[110] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "(Z)V")
    public abstract void method2094(boolean arg0);

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "(I)Lie;")
    public final class639 method2686(int arg0) {
        try {
            ++field4578;
            if (!this.field4799) {
                this.field4717.method4658(this.field4715, this.field4708);
                this.field4799 = true;
            }
            if (arg0 > -109) {
                this.field4833 = null;
            }
            return this.field4717;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4843[76] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8) {
        try {
            ++field4597;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field4843[98] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4843[6] : field4843[7]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcd;[Lcu;Z)Lda;")
    public final class216 method145(class161 arg0, class66[] arg1, boolean arg2) {
        try {
            ++field4537;
            return new class368(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[35] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + (arg1 != null ? field4843[6] : field4843[7]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILhh;III[B)Ljca;")
    public abstract class542 method2093(int arg0, class250 arg1, int arg2, int arg3, int arg4, byte[] arg5);

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "(I)V")
    public final void method2687(int arg0) {
        try {
            if (class28.field357 != this.field4770) {
                class733 var2 = this.field4770;
                this.field4770 = class28.field357;
                if (var2.method5331(-30751)) {
                    this.method2643(-128);
                }
                this.field4792 = this.field4776;
                this.field4781 &= -32;
            }
            int var3 = 21 % ((39 - arg0) / 58);
            ++field4651;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4843[141] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(Z)V")
    private final void method2688(boolean arg0) {
        try {
            if (!this.field4747) {
                float[] var2 = this.field4719;
                if (this.field4653 != 0 && this.field4646 != 0) {
                    var2[2] = 0.0F;
                    var2[11] = 0.0F;
                    var2[9] = 0.0F;
                    var2[0] = 2.0F / (float) this.field4653;
                    var2[12] = -1.0F;
                    var2[10] = 0.5F;
                    var2[6] = 0.0F;
                    var2[7] = 0.0F;
                    var2[3] = 0.0F;
                    var2[14] = 0.5F;
                    var2[1] = 0.0F;
                    var2[8] = 0.0F;
                    var2[4] = 0.0F;
                    var2[13] = 1.0F;
                    var2[15] = 1.0F;
                    var2[5] = -2.0F / (float) this.field4646;
                } else {
                    var2[14] = 0.0F;
                    var2[12] = 0.0F;
                    var2[6] = 0.0F;
                    var2[5] = 1.0F;
                    var2[7] = 0.0F;
                    var2[1] = 0.0F;
                    var2[8] = 0.0F;
                    var2[13] = 0.0F;
                    var2[11] = 0.0F;
                    var2[9] = 0.0F;
                    var2[15] = 1.0F;
                    var2[3] = 0.0F;
                    var2[0] = 1.0F;
                    var2[4] = 0.0F;
                    var2[2] = 0.0F;
                    var2[10] = 1.0F;
                }
                this.field4747 = true;
            }
            ++field4566;
            if (!arg0) {
                this.field4776 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[61] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IZ)Luba;")
    public final class517 method2689(int arg0, boolean arg1) {
        try {
            ++field4580;
            if (arg1) {
                this.method2106((byte) -88);
            }
            if (this.field4824.method2346(34962) < arg0 * 2) {
                this.field4824.method2344(arg0, 25);
            }
            return this.field4824;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4843[28] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "EA", descriptor = "(IIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4699;
            if (!this.field4723) {
                throw new RuntimeException("");
            } else {
                this.field4805 = arg0;
                this.field4753 = arg1;
                this.field4815 = arg2;
                this.field4724 = arg3;
                if (this.field4759) {
                    this.field4793[3].method3256(16934);
                    this.field4793[3].method1472(-5405);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4843[83] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIIIIZ)Ltb;")
    public final class392 method180(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field4593;
            return new class383(this, arg3, arg4, arg0, arg1, arg2);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4843[97] + (arg0 != null ? field4843[6] : field4843[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcb;III)V")
    public abstract void method2103(class700 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "()Lqa;")
    public final class104 method221() {
        try {
            ++field4541;
            return new class639();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[62] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "()I")
    public final int method195() {
        try {
            ++field4623;
            return this.field4813;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4843[31] + ')');
        }
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2690(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2691(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
