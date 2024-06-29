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

@OriginalClass("client!kd")
public abstract class class296 extends class66 {

    @OriginalMember(owner = "client!kd", name = "Wf", descriptor = "Lef;")
    private class513 field4361 = new class513();

    @OriginalMember(owner = "client!kd", name = "ef", descriptor = "Z")
    public boolean field4540 = true;

    @OriginalMember(owner = "client!kd", name = "rf", descriptor = "Lkn;")
    public class770 field4541 = new class770();

    @OriginalMember(owner = "client!kd", name = "ue", descriptor = "Lkn;")
    public class770 field4547 = new class770();

    @OriginalMember(owner = "client!kd", name = "he", descriptor = "Lkn;")
    public class770 field4548 = new class770();

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Lkn;")
    public class770 field4549 = new class770();

    @OriginalMember(owner = "client!kd", name = "sb", descriptor = "Lkn;")
    private class770 field4550 = new class770();

    @OriginalMember(owner = "client!kd", name = "Uf", descriptor = "Lkn;")
    private class770 field4551 = new class770();

    @OriginalMember(owner = "client!kd", name = "Yb", descriptor = "I")
    private int field4552 = -1;

    @OriginalMember(owner = "client!kd", name = "bc", descriptor = "Lqea;")
    public class139 field4564 = class351.field5420;

    @OriginalMember(owner = "client!kd", name = "Gc", descriptor = "I")
    private int field4573 = -1;

    @OriginalMember(owner = "client!kd", name = "nf", descriptor = "Z")
    public boolean field4554 = true;

    @OriginalMember(owner = "client!kd", name = "Kd", descriptor = "[F")
    public float[] field4577 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!kd", name = "Gd", descriptor = "[F")
    private float[] field4582 = new float[16];

    @OriginalMember(owner = "client!kd", name = "Ab", descriptor = "I")
    public int field4567 = 0;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "F")
    public float field4555 = 1.0F;

    @OriginalMember(owner = "client!kd", name = "Bg", descriptor = "Z")
    public boolean field4580 = false;

    @OriginalMember(owner = "client!kd", name = "Rb", descriptor = "I")
    public int field4608 = -1;

    @OriginalMember(owner = "client!kd", name = "Zb", descriptor = "Z")
    private boolean field4597 = false;

    @OriginalMember(owner = "client!kd", name = "Pd", descriptor = "I")
    private int field4589 = 1;

    @OriginalMember(owner = "client!kd", name = "bf", descriptor = "I")
    public int field4610 = 3584;

    @OriginalMember(owner = "client!kd", name = "Vb", descriptor = "F")
    public float field4616 = 3584.0F;

    @OriginalMember(owner = "client!kd", name = "Xb", descriptor = "[Loda;")
    private class129[] field4604 = new class129[10];

    @OriginalMember(owner = "client!kd", name = "Xe", descriptor = "F")
    private float field4607 = 1.0F;

    @OriginalMember(owner = "client!kd", name = "Hd", descriptor = "I")
    public int field4585 = 0;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    private int field4574 = -1;

    @OriginalMember(owner = "client!kd", name = "Le", descriptor = "I")
    public int field4587 = 0;

    @OriginalMember(owner = "client!kd", name = "Be", descriptor = "Z")
    private boolean field4588 = false;

    @OriginalMember(owner = "client!kd", name = "Nb", descriptor = "I")
    private int field4613 = 16777215;

    @OriginalMember(owner = "client!kd", name = "ng", descriptor = "Z")
    public boolean field4612 = true;

    @OriginalMember(owner = "client!kd", name = "xf", descriptor = "Z")
    public boolean field4572 = true;

    @OriginalMember(owner = "client!kd", name = "wb", descriptor = "[F")
    public float[] field4598 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!kd", name = "Sf", descriptor = "I")
    public int field4606 = 3;

    @OriginalMember(owner = "client!kd", name = "xd", descriptor = "I")
    public int field4590 = -1;

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "[F")
    private float[] field4614 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!kd", name = "wf", descriptor = "I")
    public int field4624 = 0;

    @OriginalMember(owner = "client!kd", name = "pg", descriptor = "[F")
    private float[] field4623 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!kd", name = "eg", descriptor = "I")
    public int field4596 = 0;

    @OriginalMember(owner = "client!kd", name = "Ac", descriptor = "I")
    public int field4570 = 512;

    @OriginalMember(owner = "client!kd", name = "hc", descriptor = "I")
    private int field4583 = 0;

    @OriginalMember(owner = "client!kd", name = "Zf", descriptor = "F")
    public float field4611 = -1.0F;

    @OriginalMember(owner = "client!kd", name = "Jc", descriptor = "F")
    public float field4559 = -1.0F;

    @OriginalMember(owner = "client!kd", name = "dc", descriptor = "I")
    private int field4562 = 0;

    @OriginalMember(owner = "client!kd", name = "Hc", descriptor = "[F")
    private float[] field4620 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!kd", name = "dd", descriptor = "Z")
    private boolean field4599 = false;

    @OriginalMember(owner = "client!kd", name = "of", descriptor = "I")
    public int field4594 = 0;

    @OriginalMember(owner = "client!kd", name = "yf", descriptor = "I")
    public int field4578 = 0;

    @OriginalMember(owner = "client!kd", name = "Sc", descriptor = "I")
    public int field4639 = 8;

    @OriginalMember(owner = "client!kd", name = "mc", descriptor = "[F")
    public float[] field4619 = this.field4614;

    @OriginalMember(owner = "client!kd", name = "Nf", descriptor = "Z")
    public boolean field4621 = false;

    @OriginalMember(owner = "client!kd", name = "Gb", descriptor = "Z")
    private boolean field4641 = false;

    @OriginalMember(owner = "client!kd", name = "nc", descriptor = "I")
    public int field4630 = 0;

    @OriginalMember(owner = "client!kd", name = "yd", descriptor = "[F")
    private float[] field4634 = new float[16];

    @OriginalMember(owner = "client!kd", name = "yg", descriptor = "[F")
    private float[] field4637 = new float[16];

    @OriginalMember(owner = "client!kd", name = "He", descriptor = "I")
    public int field4602 = 128;

    @OriginalMember(owner = "client!kd", name = "qd", descriptor = "I")
    public int field4636 = 50;

    @OriginalMember(owner = "client!kd", name = "af", descriptor = "Z")
    public boolean field4628 = false;

    @OriginalMember(owner = "client!kd", name = "Kb", descriptor = "I")
    private int field4568 = 0;

    @OriginalMember(owner = "client!kd", name = "lg", descriptor = "Z")
    public boolean field4571 = true;

    @OriginalMember(owner = "client!kd", name = "ff", descriptor = "F")
    public float field4633 = 1.0F;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "F")
    public float field4569 = 3584.0F;

    @OriginalMember(owner = "client!kd", name = "vf", descriptor = "F")
    public float field4627 = 1.0F;

    @OriginalMember(owner = "client!kd", name = "Lb", descriptor = "I")
    public int field4647 = 0;

    @OriginalMember(owner = "client!kd", name = "Ee", descriptor = "I")
    public int field4561 = 0;

    @OriginalMember(owner = "client!kd", name = "Xc", descriptor = "Luu;")
    public class301 field4646 = class634.field9242;

    @OriginalMember(owner = "client!kd", name = "yb", descriptor = "F")
    public float field4601 = 1.0F;

    @OriginalMember(owner = "client!kd", name = "Yc", descriptor = "Z")
    public boolean field4650 = true;

    @OriginalMember(owner = "client!kd", name = "Ub", descriptor = "I")
    private int field4625 = 0;

    @OriginalMember(owner = "client!kd", name = "zd", descriptor = "I")
    public int field4645 = 512;

    @OriginalMember(owner = "client!kd", name = "Ve", descriptor = "Z")
    private boolean field4648 = false;

    @OriginalMember(owner = "client!kd", name = "pd", descriptor = "Z")
    private boolean field4626 = false;

    @OriginalMember(owner = "client!kd", name = "Bf", descriptor = "Z")
    public boolean field4651 = false;

    @OriginalMember(owner = "client!kd", name = "lf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4591 = new Stream();

    @OriginalMember(owner = "client!kd", name = "Qd", descriptor = "Lkn;")
    private class770 field4664 = new class770();

    @OriginalMember(owner = "client!kd", name = "jg", descriptor = "Lla;")
    public class476 field4399;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Ljava/awt/Canvas;")
    public Canvas field4386;

    @OriginalMember(owner = "client!kd", name = "Ag", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4489;

    @OriginalMember(owner = "client!kd", name = "ig", descriptor = "Ljava/lang/Object;")
    public Object field4474;

    @OriginalMember(owner = "client!kd", name = "kd", descriptor = "Ljava/lang/Object;")
    private Object field4486;

    @OriginalMember(owner = "client!kd", name = "Mc", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!kd", name = "Jf", descriptor = "I")
    private int field4452;

    @OriginalMember(owner = "client!kd", name = "td", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!kd", name = "qc", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!kd", name = "Bb", descriptor = "I")
    private int field4437;

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!kd", name = "le", descriptor = "Lia;")
    private class615 field4652;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field4501;

    @OriginalMember(owner = "client!kd", name = "Jg", descriptor = "[Ljava/lang/String;")
    private static final String[] field4677 = new String[] { method2501(method2500("\u001496I")), method2501(method2500("\u0011(tf5R")), method2501(method2500("\u0001bt\u000b\f")), method2501(method2500("\u0011(tg5R")), method2501(method2500("\u0011(trY")), method2501(method2500("\u0011(tg9R")), method2501(method2500("\u0011(tf2R")), method2501(method2500("\u0011(tm2R")), method2501(method2500("\u0011(tpY")), method2501(method2500("\u0011(tmY")), method2501(method2500("\u0011(tq3R")), method2501(method2500("\u0011(tf4R")), method2501(method2500("\u0011(td6R")), method2501(method2500("\u0011(tbY")), method2501(method2500("\u0011(tg4R")), method2501(method2500("\u0011(t|Y")), method2501(method2500("\u0011(tg2R")), method2501(method2500("\u0011(tb2R")), method2501(method2500("\u0011(tCY")), method2501(method2500("\u0011(tW\u0010R")), method2501(method2500("\u0011(ti5R")), method2501(method2500("\u0011(tg0R")), method2501(method2500("\u0011(tp9R")), method2501(method2500("\u0011(tc3R")), method2501(method2500("\u0011(to3R")), method2501(method2500("\u0011(tq5R")), method2501(method2500("\u0011(t`2R")), method2501(method2500("\u0011(tt5R")), method2501(method2500("\u0011(tc9R")), method2501(method2500("\u0011(tm6R")), method2501(method2500("\u0011(tdY")), method2501(method2500("\u0011(tt7R")), method2501(method2500("\u0011(tn0R")), method2501(method2500("\u0011(ti9R")), method2501(method2500("\u0011(t\u007f0R")), method2501(method2500("\u0011(tr7R")), method2501(method2500("\u0011(th3R")), method2501(method2500("\u0011(tiY")), method2501(method2500("\u0011(tb8R")), method2501(method2500("\u0011(th4R")), method2501(method2500("\u0011(tb4R")), method2501(method2500("\u0011(tv0R")), method2501(method2500("\u0011(tw5R")), method2501(method2500("\u0011(t`3R")), method2501(method2500("\u0011(td3R")), method2501(method2500("\u0011(tLY")), method2501(method2500("\u0011(tj6R")), method2501(method2500("\u0011(tu7R")), method2501(method2500("\u0011(tp0R")), method2501(method2500("\u0011(tv3R")), method2501(method2500("\u0011(th5R")), method2501(method2500("\u0011(tr6R")), method2501(method2500("\u0011(tc7R")), method2501(method2500("\u0011(tn5R")), method2501(method2500("\u0011(ta0R")), method2501(method2500("\u0011(t`5R")), method2501(method2500("\u0011(tp6R")), method2501(method2500("\u0011(to9R")), method2501(method2500("\u0011(toY")), method2501(method2500("\u0011(ts7R")), method2501(method2500("\u0011(tj7R")), method2501(method2500("\u0011(tk0R")), method2501(method2500("\u0011(tu3R")), method2501(method2500("\u0011(ti3R")), method2501(method2500("\u0011(ti0R")), method2501(method2500("\u0011(tr5R")), method2501(method2500("\u0011(t\u0019\u0018\u0014%.\u001bY")), method2501(method2500("\u0011(ts4R")), method2501(method2500("\u0011(th7R")), method2501(method2500("\u0011(tl0R")), method2501(method2500("\u0011(tn4R")), method2501(method2500("\u0011(t`4R")), method2501(method2500("\u0011(to0R")), method2501(method2500("\u0011(tt9R")), method2501(method2500("\u0011(thY")), method2501(method2500("\u0011(tw4R")), method2501(method2500("\u0011(tf7R")), method2501(method2500("\u0011(tt6R")), method2501(method2500("\u0011(tp2R")), method2501(method2500("\u0011(tf9R")), method2501(method2500("\u0011(tt3R")), method2501(method2500("\u0011(tr4R")), method2501(method2500("\u0011(tD\u0010R")), method2501(method2500("\u0011(tk4R")), method2501(method2500("\u0011(td9R")), method2501(method2500("\u0011(tqY")), method2501(method2500("\u0011(td8R")), method2501(method2500("\u0011(ts5R")), method2501(method2500("\u0011(tc8R")), method2501(method2500("\u0011(t_\u0010R")), method2501(method2500("\u0011(tnY")), method2501(method2500("\u0011(tq9R")), method2501(method2500("\u0011(to7R")), method2501(method2500("\u0011(tw9R")), method2501(method2500("\u0011(tk3R")), method2501(method2500("\u0011(tfY")), method2501(method2500("\u0011(tb9R")), method2501(method2500("\u0010-,D_\u001b;.\u000b2\u001b\",D\u0002")), method2501(method2500("\t).l\u0016\u0014#(@#\u001f<;L\u001f\u000e")), method2501(method2500("\u0011(tq0R")), method2501(method2500("\u0011(tr2R")), method2501(method2500("\u0011(t}0R")), method2501(method2500("\u0011(tgY")), method2501(method2500("\u0011(tt0R")), method2501(method2500("\u0011(tn6R")), method2501(method2500("\u0011(th9R")), method2501(method2500("\u0011(tk7R")), method2501(method2500("\u0011(tq4R")), method2501(method2500("\u0011(ta2R")), method2501(method2500("\u0011(tb7R")), method2501(method2500("\u0011(tU\u0010R")), method2501(method2500("\u0011(t}Y")), method2501(method2500("\u0011(t`Y")), method2501(method2500("\u0011(tc5R")), method2501(method2500("\u0011(td4R")), method2501(method2500("\u0011(ta7R")), method2501(method2500("\u0011(tq6R")), method2501(method2500("\u0011(tp4R")), method2501(method2500("\u0011(tw7R")), method2501(method2500("\u0011(taY")), method2501(method2500("\u0011(tm5R")), method2501(method2500("\u0011(th6R")), method2501(method2500("\u0011(tj2R")), method2501(method2500("\u0011(tr3R")), method2501(method2500("\u0011(tu5R")), method2501(method2500("\u0011(tv9R")), method2501(method2500("\u0011(ti4R")), method2501(method2500("\u0011(tv5R")), method2501(method2500("\u0011(th2R")), method2501(method2500("\u0011(tI\u0010R")), method2501(method2500("\u0011(ts9R")), method2501(method2500("\u0011(ta4R")), method2501(method2500("\u0011(to6R")), method2501(method2500("\u0011(tg3R")), method2501(method2500("\u0011(t`0R")), method2501(method2500("\u0011(tc6R")), method2501(method2500("\u0011(td5R")), method2501(method2500("\u0011(tr9R")), method2501(method2500("\u0011(tn7R")), method2501(method2500("\u0011(tj4R")), method2501(method2500("\u0011(tl3R")), method2501(method2500("\u0011(tm0R")), method2501(method2500("\u0011(tWY")), method2501(method2500("\u0011(ts0R")), method2501(method2500("\u0011(tk5R")), method2501(method2500("\u0011(tv6R")), method2501(method2500("\u0011(ta8R")), method2501(method2500("\u0011(tuY")), method2501(method2500("\u0011(td7R")), method2501(method2500("\u0011(tA\u0010R")), method2501(method2500("\u0011(tvY")), method2501(method2500("\u0011(tv2R")), method2501(method2500("\u0011(t]\u0010R")), method2501(method2500("\u0011(to5R")), method2501(method2500("\u0011(tu4R")), method2501(method2500("\u0011(tj5R")), method2501(method2500("\u0011(tv4R")), method2501(method2500("\u0011(tn3R")), method2501(method2500("\u0011(tk9R")), method2501(method2500("\u0011(tl5R")), method2501(method2500("\u0011(ti7R")), method2501(method2500("\u0011(ttY")), method2501(method2500("\u0011(ta5R")), method2501(method2500("\u0011(tt2R")), method2501(method2500("\u0011(tf6R")), method2501(method2500("\u0011(tl4R")), method2501(method2500("\u0011(t`8R")), method2501(method2500("\u0011(tp7R")), method2501(method2500("\u0011(tf3R")), method2501(method2500("\u0011(tj3R")), method2501(method2500("\u0011(tl8R")), method2501(method2500("\u0011(ti2R")), method2501(method2500("\u0011(to8R")), method2501(method2500("\u0011(tp3R")), method2501(method2500("\u0011(tk2R")), method2501(method2500("\u0011(td2R")), method2501(method2500("\u0011(tm4R")) };

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "Z")
    public static boolean field4464 = false;

    @OriginalMember(owner = "client!kd", name = "Bc", descriptor = "I")
    public static int field4505 = 0;

    @OriginalMember(owner = "client!kd", name = "tf", descriptor = "Lum;")
    public static class550 field4535 = new class550("", 19);

    @OriginalMember(owner = "client!kd", name = "nd", descriptor = "F")
    private float field4558;

    @OriginalMember(owner = "client!kd", name = "tb", descriptor = "F")
    public float field4566;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "F")
    public float field4600;

    @OriginalMember(owner = "client!kd", name = "vc", descriptor = "F")
    public float field4605;

    @OriginalMember(owner = "client!kd", name = "zf", descriptor = "F")
    public float field4618;

    @OriginalMember(owner = "client!kd", name = "Ne", descriptor = "F")
    private float field4629;

    @OriginalMember(owner = "client!kd", name = "Dc", descriptor = "F")
    public float field4635;

    @OriginalMember(owner = "client!kd", name = "Kf", descriptor = "F")
    public float field4644;

    @OriginalMember(owner = "client!kd", name = "Wc", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!kd", name = "Nd", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!kd", name = "xc", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!kd", name = "Te", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!kd", name = "Ff", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!kd", name = "Eg", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!kd", name = "Hf", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!kd", name = "Ib", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!kd", name = "Jb", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!kd", name = "vd", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!kd", name = "qe", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!kd", name = "oe", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!kd", name = "Pc", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!kd", name = "zb", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!kd", name = "Xd", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!kd", name = "ld", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!kd", name = "xg", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!kd", name = "Hg", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!kd", name = "uf", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!kd", name = "jc", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!kd", name = "Jd", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!kd", name = "sf", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!kd", name = "kf", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!kd", name = "Fe", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!kd", name = "zc", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!kd", name = "Ke", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!kd", name = "Dg", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!kd", name = "te", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!kd", name = "Pb", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!kd", name = "Ye", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!kd", name = "dg", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!kd", name = "Ie", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!kd", name = "jf", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!kd", name = "Dd", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!kd", name = "ee", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!kd", name = "cc", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!kd", name = "wc", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!kd", name = "Cg", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!kd", name = "bg", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!kd", name = "Tb", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!kd", name = "Yd", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!kd", name = "Sd", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!kd", name = "ne", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!kd", name = "qg", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!kd", name = "Cc", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!kd", name = "ce", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!kd", name = "Pf", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!kd", name = "Tc", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!kd", name = "fd", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!kd", name = "jd", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!kd", name = "Yf", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!kd", name = "Vf", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!kd", name = "Qc", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!kd", name = "Ef", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!kd", name = "Sb", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!kd", name = "lc", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!kd", name = "pf", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!kd", name = "je", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!kd", name = "Qb", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!kd", name = "hf", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!kd", name = "gc", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!kd", name = "ye", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!kd", name = "ec", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!kd", name = "ug", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!kd", name = "tc", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!kd", name = "Xf", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!kd", name = "Oc", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!kd", name = "hg", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!kd", name = "Od", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!kd", name = "Wd", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!kd", name = "Ec", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!kd", name = "fg", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!kd", name = "xe", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!kd", name = "Gg", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!kd", name = "pe", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!kd", name = "Oe", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!kd", name = "Ze", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!kd", name = "ae", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!kd", name = "mg", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!kd", name = "id", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!kd", name = "gd", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!kd", name = "Vc", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!kd", name = "Wb", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!kd", name = "Tf", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!kd", name = "Lc", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!kd", name = "mf", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!kd", name = "kg", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!kd", name = "ge", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!kd", name = "rc", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!kd", name = "Ad", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!kd", name = "Mb", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!kd", name = "gg", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!kd", name = "Md", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!kd", name = "bd", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!kd", name = "yc", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!kd", name = "Nc", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!kd", name = "We", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!kd", name = "kc", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!kd", name = "md", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!kd", name = "ic", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!kd", name = "re", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!kd", name = "Cf", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!kd", name = "tg", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!kd", name = "Ob", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!kd", name = "Ud", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!kd", name = "Ue", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!kd", name = "Ge", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!kd", name = "Fd", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!kd", name = "cg", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!kd", name = "Ce", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!kd", name = "sg", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!kd", name = "ze", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!kd", name = "Pe", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!kd", name = "Hb", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!kd", name = "Gf", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!kd", name = "Ig", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!kd", name = "Vd", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!kd", name = "qf", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!kd", name = "Je", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!kd", name = "uc", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!kd", name = "Me", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!kd", name = "Af", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!kd", name = "Id", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!kd", name = "ud", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!kd", name = "hd", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!kd", name = "If", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!kd", name = "fe", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!kd", name = "ve", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!kd", name = "vg", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!kd", name = "ad", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!kd", name = "Rd", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!kd", name = "Uc", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!kd", name = "Zd", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!kd", name = "Of", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!kd", name = "Ae", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!kd", name = "Lf", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!kd", name = "Fc", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!kd", name = "Ed", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!kd", name = "Eb", descriptor = "I")
    private int field4565;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!kd", name = "ag", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!kd", name = "Ic", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!kd", name = "Df", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!kd", name = "Fg", descriptor = "I")
    private int field4609;

    @OriginalMember(owner = "client!kd", name = "wg", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!kd", name = "cd", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!kd", name = "rg", descriptor = "I")
    public int field4649;

    @OriginalMember(owner = "client!kd", name = "sc", descriptor = "I")
    private int field4676;

    @OriginalMember(owner = "client!kd", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!kd", name = "ac", descriptor = "Loda;")
    private class129 field4617;

    @OriginalMember(owner = "client!kd", name = "Re", descriptor = "Lho;")
    public class159 field4654;

    @OriginalMember(owner = "client!kd", name = "be", descriptor = "Lho;")
    public class159 field4657;

    @OriginalMember(owner = "client!kd", name = "ed", descriptor = "Lho;")
    public class159 field4658;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lho;")
    public class159 field4659;

    @OriginalMember(owner = "client!kd", name = "Se", descriptor = "Lho;")
    public class159 field4660;

    @OriginalMember(owner = "client!kd", name = "rd", descriptor = "Lho;")
    public class159 field4661;

    @OriginalMember(owner = "client!kd", name = "rb", descriptor = "Lho;")
    public class159 field4662;

    @OriginalMember(owner = "client!kd", name = "df", descriptor = "Lho;")
    public class159 field4667;

    @OriginalMember(owner = "client!kd", name = "ie", descriptor = "Lho;")
    public class159 field4668;

    @OriginalMember(owner = "client!kd", name = "De", descriptor = "Lho;")
    public class159 field4669;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lcda;")
    public class182 field4402;

    @OriginalMember(owner = "client!kd", name = "Td", descriptor = "Lje;")
    private class421 field4656;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Los;")
    private class466 field4643;

    @OriginalMember(owner = "client!kd", name = "og", descriptor = "Lrca;")
    public class479 field4553;

    @OriginalMember(owner = "client!kd", name = "Qe", descriptor = "Lsfa;")
    private class723 field4663;

    @OriginalMember(owner = "client!kd", name = "we", descriptor = "Lsfa;")
    private class723 field4670;

    @OriginalMember(owner = "client!kd", name = "se", descriptor = "Lsfa;")
    private class723 field4672;

    @OriginalMember(owner = "client!kd", name = "Rc", descriptor = "Lsea;")
    private class724 field4557;

    @OriginalMember(owner = "client!kd", name = "ke", descriptor = "Lgn;")
    private class728 field4653;

    @OriginalMember(owner = "client!kd", name = "gf", descriptor = "Lgn;")
    public class728 field4655;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Lgn;")
    public class728 field4665;

    @OriginalMember(owner = "client!kd", name = "fc", descriptor = "Lgn;")
    public class728 field4666;

    @OriginalMember(owner = "client!kd", name = "Db", descriptor = "Lgn;")
    public class728 field4671;

    @OriginalMember(owner = "client!kd", name = "wd", descriptor = "Lgn;")
    private class728 field4673;

    @OriginalMember(owner = "client!kd", name = "Kc", descriptor = "Lgn;")
    private class728 field4674;

    @OriginalMember(owner = "client!kd", name = "Zc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4439;

    @OriginalMember(owner = "client!kd", name = "Mf", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field4374;

    @OriginalMember(owner = "client!kd", name = "de", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4421;

    @OriginalMember(owner = "client!kd", name = "Ld", descriptor = "Z")
    public boolean field4563;

    @OriginalMember(owner = "client!kd", name = "pc", descriptor = "Z")
    public boolean field4592;

    @OriginalMember(owner = "client!kd", name = "sd", descriptor = "Z")
    public boolean field4632;

    @OriginalMember(owner = "client!kd", name = "Cd", descriptor = "Z")
    public boolean field4638;

    @OriginalMember(owner = "client!kd", name = "cf", descriptor = "Z")
    public boolean field4640;

    @OriginalMember(owner = "client!kd", name = "Bd", descriptor = "Z")
    public boolean field4675;

    @OriginalMember(owner = "client!kd", name = "Rf", descriptor = "[Lup;")
    public class290[] field4642;

    @OriginalMember(owner = "client!kd", name = "od", descriptor = "[Luf;")
    public class471[] field4560;

    @OriginalMember(owner = "client!kd", name = "oc", descriptor = "[Lrca;")
    private class479[] field4576;

    @OriginalMember(owner = "client!kd", name = "Fb", descriptor = "[Lbda;")
    public class531[] field4556;

    @OriginalMember(owner = "client!kd", name = "zg", descriptor = "[Lbda;")
    public class531[] field4622;

    @OriginalMember(owner = "client!kd", name = "Qf", descriptor = "[Lkn;")
    public class770[] field4575;

    @OriginalMember(owner = "client!kd", name = "me", descriptor = "[[[Z")
    public static boolean[][][] field4542;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "(ILaa;II)V", line = 3)
    public final void method567(int arg0, class512 arg1, int arg2, int arg3) {
        try {
            ++field4450;
            class478 var5 = (class478) arg1;
            class191 var6 = var5.field6958;
            this.method2487(-68);
            this.method2467(12, var6);
            this.method2457(1, (byte) -23);
            this.method2417(-66, class206.field3175, class206.field3175);
            this.method2498(0, class114.field1352, (byte) -118);
            this.method2462(arg0, -1);
            this.field4541.method5558((float) this.field4416, 0, 0.0F, (float) this.field4492);
            this.method2418(17654);
            this.field4575[0].method5558(var6.method748(-19847, (float) this.field4416), 0, 1.0F, var6.method740((byte) -71, (float) this.field4492));
            this.field4575[0].method5570(var6.method748(-19847, (float) (-arg3)), 0.0F, var6.method740((byte) -42, (float) (-arg2)), 74);
            this.field4642[0] = class398.field5941;
            this.method2493(true);
            this.method2441(2);
            this.method2489(0);
            this.method2498(0, class48.field546, (byte) 126);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4677[30] + arg0 + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "(I)V", line = 30)
    private final void method2416(int arg0) {
        try {
            this.field4644 = (float) (-this.field4594 + this.field4561);
            this.field4618 = (float) (-this.field4594 + this.field4578);
            ++field4459;
            this.field4566 = (float) (-this.field4585 + this.field4630);
            this.field4635 = (float) (this.field4624 - this.field4585);
            if (arg0 != 0) {
                this.method2439(true, -68);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[148] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILbda;Lbda;)V", line = 46)
    public final void method2417(int arg0, class531 arg1, class531 arg2) {
        try {
            ++field4538;
            if (arg0 >= -57) {
                method2478(104, 99, 74, -107, -6, (byte[][][]) null, 16, 77, 99, -2, (class66) null, 103, 79);
            }
            boolean var4 = false;
            if (this.field4622[this.field4587] != arg2) {
                this.field4622[this.field4587] = arg2;
                this.method862((byte) -69);
                var4 = true;
            }
            if (this.field4556[this.field4587] != arg1) {
                this.field4556[this.field4587] = arg1;
                this.method883(-32171);
                var4 = true;
            }
            if (var4) {
                this.field4565 &= -30;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[44] + arg0 + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ',' + (arg2 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "()Lqq;", line = 78)
    public final class501 method517() {
        try {
            ++field4430;
            return new class770();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[120] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)V", line = 87)
    public final void method535(int arg0) {
        try {
            ++field4507;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[55] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "()I", line = 94)
    public final int method578() {
        try {
            ++field4434;
            return this.field4586 + -2;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[4] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "(I)V", line = 104)
    public final void method2418(int arg0) {
        try {
            if (arg0 == 17654) {
                ++field4377;
                this.field4540 = false;
                this.method2444(10910);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[164] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "()I", line = 116)
    public final int method468() {
        try {
            ++field4352;
            return this.field4676;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[74] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "()I", line = 127)
    public final int method494() {
        try {
            ++field4465;
            return this.field4546 + this.field4543 + this.field4545;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[112] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)V", line = 135)
    public final void method2419(boolean arg0, boolean arg1) {
        try {
            if (!this.field4571 != !arg1) {
                this.field4571 = arg1;
                this.method901(true);
            }
            if (arg0) {
                this.field4589 = -17;
            }
            ++field4389;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[126] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lza;)V", line = 156)
    public final void method515(class434 arg0) {
        try {
            this.field4439 = ((class747) arg0).field10863;
            ++field4458;
            this.field4374 = this.field4439.method5097(32768, false);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[109] + (arg0 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "(IIIIIII)I", line = 168)
    public final int method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field4432;
            int var8 = 0;
            float var9 = (float) arg2 * this.field4547.field11170 + (float) arg0 * this.field4547.field11168 + (float) arg1 * this.field4547.field11193 + this.field4547.field11153;
            float var10 = (float) arg5 * this.field4547.field11170 + (float) arg3 * this.field4547.field11168 + (float) arg4 * this.field4547.field11193 + this.field4547.field11153;
            if ((float) this.field4636 > var9 && (float) this.field4636 > var10) {
                var8 |= 16;
            } else if (var9 > (float) this.field4610 && (float) this.field4610 < var10) {
                var8 |= 32;
            }
            int var11 = (int) (((float) arg2 * this.field4547.field11184 + (float) arg0 * this.field4547.field11176 + (float) arg1 * this.field4547.field11182 + this.field4547.field11147) * (float) this.field4570 / (float) arg6);
            int var12 = (int) (((float) arg5 * this.field4547.field11184 + (float) arg3 * this.field4547.field11176 + (float) arg4 * this.field4547.field11182 + this.field4547.field11147) * (float) this.field4570 / (float) arg6);
            if (this.field4635 > (float) var11 && (float) var12 < this.field4635) {
                var8 |= 1;
            } else if (this.field4566 < (float) var11 && (float) var12 > this.field4566) {
                var8 |= 2;
            }
            int var13 = (int) (((float) arg2 * this.field4547.field11145 + (float) arg0 * this.field4547.field11187 + (float) arg1 * this.field4547.field11179 + this.field4547.field11192) * (float) this.field4645 / (float) arg6);
            int var14 = (int) (((float) arg5 * this.field4547.field11145 + (float) arg3 * this.field4547.field11187 + (float) arg4 * this.field4547.field11179 + this.field4547.field11192) * (float) this.field4645 / (float) arg6);
            if (this.field4618 > (float) var13 && (float) var14 < this.field4618) {
                var8 |= 4;
            } else if (this.field4644 < (float) var13 && this.field4644 < (float) var14) {
                var8 |= 8;
            }
            return var8;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field4677[142] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "()Z", line = 213)
    public final boolean method469() {
        try {
            ++field4429;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[53] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(B)V", line = 224)
    private final void method2420(byte arg0) {
        try {
            if (arg0 <= 49) {
                this.field4559 = 1.26183F;
            }
            ++field4412;
            this.field4670 = this.method850(true, 0);
            this.field4670.method166(123, 12, 24);
            this.field4653 = this.method873(new class240[] { new class240(class778.field11295) }, (byte) 101);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[40] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljw;I)V", line = 240)
    public final void method500(class580 arg0, int arg1) {
        try {
            ++field4537;
            this.field4643.method3543(arg1, arg0, this, -122);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[105] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;", line = 250)
    public final NativeHeapBuffer method2421(boolean arg0, int arg1, int arg2) {
        try {
            ++field4498;
            if (arg2 <= 73) {
                this.method2445(-121, false);
            }
            return this.field4439.method5097(arg1, arg0);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[153] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "aa", descriptor = "(IIIIII)V", line = 261)
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.method2434(124);
            ++field4413;
            this.method2462(arg4, -1);
            this.method2498(0, class114.field1352, (byte) -100);
            this.method2443(0, class114.field1352, false);
            this.method2457(arg5, (byte) -56);
            this.field4541.method5558((float) arg3, 0, 1.0F, (float) arg2);
            this.field4541.method2375(arg0, arg1, 0);
            this.method2418(17654);
            this.method869(false, (byte) -113);
            this.method2441(2);
            this.method869(true, (byte) -100);
            this.method2443(0, class48.field546, false);
            this.method2498(0, class48.field546, (byte) -108);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4677[82] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "XA", descriptor = "()I", line = 281)
    public final int method558() {
        try {
            ++field4468;
            return this.field4610;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[101] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "(IIIIII[BII)V", line = 292)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            ++field4383;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field4677[161] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4677[2] : field4677[0]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "(III)V", line = 301)
    public final void method584(int arg0, int arg1, int arg2) {
        try {
            if (this.field4590 != arg0 || ~this.field4608 != ~arg1 || this.field4567 != arg2) {
                this.field4590 = arg0;
                this.field4567 = arg2;
                this.field4608 = arg1;
                this.method2432(0);
                this.method901(true);
            }
            ++field4494;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[37] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "(IIIII)V", line = 319)
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method532(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
            ++field4370;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4677[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "(I)V", line = 327)
    public static final void method2422(int arg0) {
        try {
            ++field4375;
            class528.field7670 = new class417(class309.field4851.method2616(false, class167.field2300), "", class311.field4926, (short) arg0, -1, 0L, 0, 0, true, false, 0L, true);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[119] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lju;IIII)Lka;", line = 336)
    public final class497 method552(class137 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field4473;
            return new class159(this, arg0, arg1, arg3, arg4, arg2);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4677[1] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V", line = 344)
    public final void method2423(boolean arg0, int arg1) {
        try {
            ++field4504;
            if (arg1 != 13660) {
                this.field4416 = -74;
            }
            if (!arg0 == this.field4572) {
                this.field4572 = arg0;
                this.method852(arg1 + -13772);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[158] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "()Z", line = 362)
    public final boolean method542() {
        try {
            ++field4397;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[22] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIII)V", line = 370)
    public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field4444;
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12;
            if (var10 == 0.0F && var11 == 0.0F) {
                var12 = 1.0F;
            } else {
                float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
                var12 = var10 * var13;
                var11 *= var13;
            }
            this.method2434(5);
            this.method2462(arg4, -1);
            this.method2498(0, class114.field1352, (byte) 53);
            this.method2443(0, class114.field1352, false);
            this.method2457(arg5, (byte) -67);
            this.method2495(4);
            int var26 = arg8 % (arg6 + arg7);
            this.method869(false, (byte) -72);
            float var14 = (float) arg6 * var12;
            float var15 = (float) arg6 * var11;
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = var14;
            float var19 = var15;
            if (arg6 >= var26) {
                var18 = (float) (-var26 + arg6) * var12;
                var19 = (float) (-var26 + arg6) * var11;
            } else {
                var17 = (float) (arg6 + arg7 + -var26) * var11;
                var16 = (float) (-var26 + arg7 + arg6) * var12;
            }
            float var20 = (float) arg0 + var16;
            float var21 = (float) arg1 + var17;
            float var22 = (float) arg7 * var12;
            float var23 = (float) arg7 * var11;
            while (true) {
                if (arg2 <= arg0) {
                    if (var20 < (float) arg2) {
                        break;
                    }
                    if ((float) arg2 > var18 + var20) {
                        var18 = (float) arg2 + -var20;
                    }
                } else {
                    if ((float) arg2 < var20) {
                        break;
                    }
                    if (var18 + var20 > (float) arg2) {
                        var18 = (float) arg2 - var20;
                    }
                }
                if (arg1 < arg3) {
                    if (var21 > (float) arg3) {
                        break;
                    }
                    if (var19 + var21 > (float) arg3) {
                        var19 = (float) arg3 - var21;
                    }
                } else {
                    if (var21 < (float) arg3) {
                        break;
                    }
                    if (var19 + var21 < (float) arg3) {
                        var19 = (float) arg3 - var21;
                    }
                }
                if (!this.method2483(0.0F, 125, 0.0F, var18 + var20, var19 + var21, var20, var21)) {
                    return;
                }
                this.method2454(false);
                var21 += var19 + var23;
                var20 += var18 + var22;
                var18 = var14;
                var19 = var15;
            }
            this.method869(true, (byte) -61);
            this.method2443(0, class48.field546, false);
            this.method2498(0, class48.field546, (byte) 113);
        } catch (RuntimeException var25) {
            throw class759.method5498(var25, field4677[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "(B)V", line = 491)
    private final void method2424(byte arg0) {
        try {
            int var2 = -56 / ((arg0 - 35) / 37);
            if (class463.field6741 != this.field4564) {
                class139 var3 = this.field4564;
                this.field4564 = class463.field6741;
                if (!var3.method1195((byte) -63)) {
                    this.method2425(true);
                }
                this.method2485((byte) -93);
                this.field4619 = this.field4637;
                this.method2429(1);
                this.field4565 &= -8;
            }
            ++field4363;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[140] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[Luf;)V", line = 517)
    public final void method573(int arg0, class471[] arg1) {
        try {
            ++field4418;
            for (int var3 = 0; arg0 > var3; ++var3) {
                this.field4560[var3] = arg1[var3];
            }
            this.field4631 = arg0;
            if (this.field4564.method1195((byte) 95)) {
                this.method860((byte) -128);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[58] + arg0 + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "(I)V", line = 537)
    public final void method506(int arg0) {
        try {
            ++field4500;
            this.field4606 = 0;
            while (arg0 > 1) {
                arg0 >>= 1;
                ++this.field4606;
            }
            this.field4639 = 1 << this.field4606;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[111] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 553)
    public final void method557(Canvas arg0) {
        try {
            ++field4528;
            if (this.field4386 == arg0) {
                throw new RuntimeException();
            } else if (this.field4421.containsKey(arg0)) {
                this.method884(this.field4421.get(arg0), 4980, arg0);
                this.field4421.remove(arg0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[38] + (arg0 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "(III[I)V", line = 579)
    public final void method524(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field4520;
            float var5 = this.field4547.method5571((float) arg1, (float) arg2, (float) arg0, 16383);
            int var6;
            int var7;
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
                var6 = this.field4594;
                var7 = this.field4585;
            } else {
                var7 = (int) ((float) this.field4570 * this.field4547.method5560((float) arg1, (float) arg0, (float) arg2, (byte) 45) / var5);
                var6 = (int) ((float) this.field4645 * this.field4547.method5578(5, (float) arg0, (float) arg2, (float) arg1) / var5);
            }
            arg3[1] = (int) ((float) var6 + -this.field4618);
            arg3[2] = (int) var5;
            arg3[0] = (int) ((float) var7 - this.field4635);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field4677[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII)V", line = 605)
    public final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4525;
            float var7 = this.method885((byte) -117);
            this.method2434(126);
            this.method2462(arg4, -1);
            this.method2498(0, class114.field1352, (byte) 53);
            this.method2443(0, class114.field1352, false);
            this.method2457(arg5, (byte) -88);
            this.field4541.method5558((float) (arg3 + -1), 0, 1.0F, (float) (arg2 + -1));
            this.field4541.method5570((float) arg1 - var7, 0.0F, (float) arg0 + -var7, 106);
            this.method2418(17654);
            this.method869(false, (byte) -86);
            this.method2440(1, 4, class750.field10911);
            this.method869(true, (byte) -57);
            this.method2443(0, class48.field546, false);
            this.method2498(0, class48.field546, (byte) -83);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field4677[166] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "([I)V", line = 627)
    public final void method543(int[] arg0) {
        try {
            arg0[2] = this.field4630;
            arg0[3] = this.field4561;
            ++field4372;
            arg0[1] = this.field4578;
            arg0[0] = this.field4624;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[90] + (arg0 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "()Z", line = 639)
    public final boolean method503() {
        try {
            ++field4394;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[81] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIIII)V", line = 647)
    public final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4442;
            float var7 = (float) arg2 - (float) arg0;
            float var8 = (float) arg3 - (float) arg1;
            float var9;
            if (var7 == 0.0F && var8 == 0.0F) {
                var9 = 1.0F;
            } else {
                float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
                var8 *= var10;
                var9 = var7 * var10;
            }
            if (this.method2483(0.0F, 127, 0.0F, (float) arg2 + var9, (float) arg3 + var8, (float) arg0, (float) arg1)) {
                this.method2434(119);
                this.method2462(arg4, -1);
                this.method2498(0, class114.field1352, (byte) -98);
                this.method2443(0, class114.field1352, false);
                this.method2457(arg5, (byte) -60);
                this.method2495(4);
                this.method869(false, (byte) -59);
                this.method2454(false);
                this.method869(true, (byte) -79);
                this.method2443(0, class48.field546, false);
                this.method2498(0, class48.field546, (byte) 49);
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field4677[122] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "(Z)V", line = 684)
    private final void method2425(boolean arg0) {
        try {
            ++field4519;
            this.field4588 = false;
            if (this.field4617 != null) {
                this.field4617.method791((byte) -127);
            }
            this.method876((byte) 121);
            if (!arg0) {
                this.field4642 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[76] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V", line = 704)
    public final void method581(int arg0) {
        try {
            ++field4449;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[65] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "(I)V", line = 713)
    public final void method2426(int arg0) {
        try {
            this.field4556 = new class531[this.field4593];
            this.field4575 = new class770[this.field4593];
            ++field4427;
            this.field4622 = new class531[this.field4593];
            this.field4642 = new class290[this.field4593];
            this.field4576 = new class479[this.field4593];
            for (int var2 = 0; ~var2 > ~this.field4593; ++var2) {
                this.field4556[var2] = class684.field9909;
                this.field4622[var2] = class684.field9909;
                this.field4642[var2] = class341.field5303;
                this.field4575[var2] = new class770();
            }
            this.field4560 = new class471[this.field4586 + -2];
            this.field4553 = this.method866(1, class215.field3276, 1, class157.field1952, 0);
            this.method515(new class747(262144));
            this.field4655 = this.method873(new class240[] { new class240(new class778[] { class778.field11295, class778.field11304 }) }, (byte) 120);
            this.field4665 = this.method873(new class240[] { new class240(new class778[] { class778.field11295, class778.field11302 }) }, (byte) 83);
            if (arg0 != 29449) {
                this.method536(-50);
            }
            this.field4666 = this.method873(new class240[] { new class240(class778.field11295), new class240(class778.field11302), new class240(class778.field11304), new class240(class778.field11300) }, (byte) 51);
            this.field4671 = this.method873(new class240[] { new class240(class778.field11295), new class240(class778.field11302), new class240(class778.field11304) }, (byte) 57);
            this.field4660 = new class159(this, 0, 0, false, false);
            this.field4669 = new class159(this, 0, 0, true, true);
            this.field4659 = new class159(this, 0, 0, false, false);
            this.field4658 = new class159(this, 0, 0, true, true);
            this.field4662 = new class159(this, 0, 0, false, false);
            this.field4668 = new class159(this, 0, 0, true, true);
            this.field4657 = new class159(this, 0, 0, false, false);
            this.field4654 = new class159(this, 0, 0, true, true);
            this.field4667 = new class159(this, 0, 0, false, false);
            this.field4661 = new class159(this, 0, 0, true, true);
            this.field4643 = new class466(this);
            this.field4656 = this.method899(13, true);
            this.method2494((byte) -95);
            this.field4402 = new class182(this);
            this.field4604[1] = this.method841(class219.method1916(arg0, -29450), 1);
            this.field4604[2] = this.method841(-1, 2);
            this.field4604[4] = this.method841(-1, 4);
            this.field4604[5] = this.method841(-1, 5);
            this.field4604[6] = this.method841(-1, 6);
            this.field4604[7] = this.method841(-1, 7);
            this.field4604[3] = this.method841(-1, 3);
            this.field4604[8] = this.method841(class219.method1916(arg0, -29450), 8);
            this.field4604[9] = this.method841(-1, 9);
            if (!this.field4604[2].method790(false)) {
                this.field4604[2] = this.method841(-1, 0);
            }
            if (!this.field4604[4].method790(false)) {
                this.field4604[4] = this.field4604[2];
            }
            if (!this.field4604[8].method790(false)) {
                this.field4604[8] = this.field4604[4];
            }
            if (!this.field4604[9].method790(false)) {
                this.field4604[9] = this.field4604[8];
            }
            this.method853(true);
            this.method553();
            this.method575();
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[84] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "(I)I", line = 793)
    public final int method2427(int arg0) {
        try {
            ++field4355;
            return arg0 != 8 ? -45 : this.field4609;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[150] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()Z", line = 806)
    public final boolean method502() {
        try {
            ++field4482;
            return this.field4604[3].method790(false);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[93] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "JA", descriptor = "(IIIIII)I", line = 816)
    public final int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4460;
            int var7 = 0;
            float var8 = (float) arg2 * this.field4547.field11170 + (float) arg0 * this.field4547.field11168 + (float) arg1 * this.field4547.field11193 + this.field4547.field11153;
            if (var8 < 1.0F) {
                var8 = 1.0F;
            }
            float var9 = (float) arg5 * this.field4547.field11170 + (float) arg3 * this.field4547.field11168 + (float) arg4 * this.field4547.field11193 + this.field4547.field11153;
            if (var9 < 1.0F) {
                var9 = 1.0F;
            }
            if (var8 < (float) this.field4636 && (float) this.field4636 > var9) {
                var7 |= 16;
            } else if ((float) this.field4610 < var8 && (float) this.field4610 < var9) {
                var7 |= 32;
            }
            int var10 = (int) (((float) arg2 * this.field4547.field11184 + (float) arg0 * this.field4547.field11176 + (float) arg1 * this.field4547.field11182 + this.field4547.field11147) * (float) this.field4570 / var8);
            int var11 = (int) (((float) arg5 * this.field4547.field11184 + (float) arg3 * this.field4547.field11176 + (float) arg4 * this.field4547.field11182 + this.field4547.field11147) * (float) this.field4570 / var9);
            if (this.field4635 > (float) var10 && this.field4635 > (float) var11) {
                var7 |= 1;
            } else if ((float) var10 > this.field4566 && (float) var11 > this.field4566) {
                var7 |= 2;
            }
            int var12 = (int) (((float) arg2 * this.field4547.field11145 + (float) arg0 * this.field4547.field11187 + (float) arg1 * this.field4547.field11179 + this.field4547.field11192) * (float) this.field4645 / var8);
            int var13 = (int) (((float) arg5 * this.field4547.field11145 + (float) arg3 * this.field4547.field11187 + (float) arg4 * this.field4547.field11179 + this.field4547.field11192) * (float) this.field4645 / var9);
            if (this.field4618 > (float) var12 && this.field4618 > (float) var13) {
                var7 |= 4;
            } else if (this.field4644 < (float) var12 && this.field4644 < (float) var13) {
                var7 |= 8;
            }
            return var7;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field4677[72] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "(B)I", line = 870)
    public final int method2428(byte arg0) {
        try {
            ++field4353;
            if (arg0 != 110) {
                this.method568(114, -128, 91, -69, false);
            }
            return this.field4562;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[62] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "(I)V", line = 881)
    private final void method2429(int arg0) {
        try {
            if (arg0 != 1) {
                this.method487((class481) null, false);
            }
            this.method902(arg0 ^ 27476);
            ++field4454;
            if (this.field4617 != null) {
                this.field4617.method785(-4);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[99] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIIIZ)V", line = 899)
    private final void method2430(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            if (arg3 != 8218) {
                this.field4614 = null;
            }
            ++field4483;
            boolean var9 = arg5 & this.method502();
            if (!var9 && (arg2 == 4 || arg2 == 8 || ~arg2 == -10)) {
                arg2 = 2;
                arg0 = arg2 != 4 ? 1 : 1 & arg4;
                arg4 = 0;
            }
            if (arg2 != 0 && arg1) {
                arg2 |= Integer.MIN_VALUE;
            }
            if (~this.field4568 == ~arg2) {
                if (~this.field4568 != -1) {
                    this.field4604[this.field4568 & Integer.MAX_VALUE].method784(arg1, (byte) -34);
                    if (this.field4583 != arg4 || this.field4625 != arg0) {
                        this.field4604[this.field4568 & Integer.MAX_VALUE].method786(arg0, arg4, (byte) -81);
                        this.field4625 = arg0;
                        this.field4583 = arg4;
                    }
                    return;
                }
            } else {
                if (~this.field4568 != -1) {
                    this.field4604[this.field4568 & Integer.MAX_VALUE].method783(1);
                }
                if (arg2 != 0) {
                    this.field4617 = this.field4604[arg2 & Integer.MAX_VALUE];
                    this.field4617.method781(arg1, 1);
                    this.field4617.method784(arg1, (byte) -34);
                    this.field4617.method786(arg0, arg4, (byte) 87);
                } else {
                    this.field4617 = null;
                }
                this.field4625 = arg0;
                this.field4568 = arg2;
                this.field4583 = arg4;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4677[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(B)Lkn;", line = 956)
    public final class770 method2431(byte arg0) {
        try {
            ++field4409;
            int var2 = -42 / ((-37 - arg0) / 38);
            return this.field4575[this.field4587];
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[71] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 968)
    public void method470() {
        try {
            if (!this.field4626) {
                for (class206 var1 = this.field4361.method3863((byte) 64); var1 != null; var1 = this.field4361.method3862(-353)) {
                    ((class747) var1).method5439(28177);
                }
                Enumeration var2 = this.field4421.keys();
                while (var2.hasMoreElements()) {
                    Canvas var3 = (Canvas) var2.nextElement();
                    this.method884(this.field4421.get(var3), 4980, var3);
                }
                class223.method1937(true, -9743, false);
                this.field4501.release();
                this.field4626 = true;
            }
            ++field4435;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[14] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lol;)V", line = 1003)
    public final void method555(class299 arg0) {
        try {
            ++field4398;
            this.field4557 = (class724) arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[132] + (arg0 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "(I)V", line = 1015)
    private final void method2432(int arg0) {
        try {
            if (arg0 != 0) {
                this.method2497((byte) -115);
            }
            ++field4433;
            if (this.field4617 != null) {
                this.field4617.method787(1);
            }
            this.method870(-1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[176] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(II)V", line = 1030)
    public final void method2433(int arg0, int arg1) {
        try {
            if (arg1 != 1) {
                if (~arg1 == -1) {
                    this.method2417(-71, class684.field9909, class684.field9909);
                } else if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.method2417(-60, class684.field9909, class362.field5530);
                    } else if (~arg1 == -5) {
                        this.method2417(-127, class532.field7803, class532.field7803);
                    }
                } else {
                    this.method2417(-128, class206.field3175, class134.field1562);
                }
            } else {
                this.method2417(-78, class206.field3175, class206.field3175);
            }
            ++field4514;
            if (arg0 != -16075) {
                this.field4599 = false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[160] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "(I)V", line = 1068)
    private final void method2434(int arg0) {
        try {
            int var2 = 16 % ((66 - arg0) / 34);
            if (this.field4565 != 1) {
                this.method2463((byte) -121);
                this.method2445(8, false);
                this.method2472((byte) 24, false);
                this.method2449(false, true);
                this.method2473((byte) -124, false);
                this.method2477(0, false, -2, false);
                this.method2433(-16075, 1);
                this.method2467(12, this.field4553);
                this.field4565 = 1;
            }
            ++field4463;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "HA", descriptor = "(IIII[I)V", line = 1098)
    public final void method491(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        try {
            ++field4367;
            float var6 = this.field4547.method5571((float) arg1, (float) arg2, (float) arg0, 16383);
            if (!((float) this.field4636 > var6) && !(var6 > (float) this.field4610)) {
                int var7 = (int) ((float) this.field4570 * this.field4547.method5560((float) arg1, (float) arg0, (float) arg2, (byte) 45) / (float) arg3);
                int var8 = (int) ((float) this.field4645 * this.field4547.method5578(5, (float) arg0, (float) arg2, (float) arg1) / (float) arg3);
                arg4[1] = (int) ((float) var8 - this.field4618);
                arg4[2] = (int) var6;
                arg4[0] = (int) ((float) var7 - this.field4635);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field4677[141] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "(B)I", line = 1121)
    public final int method2435(byte arg0) {
        try {
            ++field4510;
            int var2 = -113 / ((-71 - arg0) / 50);
            return this.field4587;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "()Lqq;", line = 1133)
    public final class501 method577() {
        try {
            ++field4479;
            return this.field4547;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[168] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(B)V", line = 1141)
    private final void method2436(byte arg0) {
        try {
            if (arg0 <= 83) {
                this.field4567 = -39;
            }
            ++field4419;
            this.field4648 = false;
            this.method2471(15942);
            if (class316.field4996 == this.field4564) {
                this.method2429(1);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[102] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "(I)V", line = 1157)
    private final void method2437(int arg0) {
        try {
            this.field4637[10] = this.field4558;
            ++field4484;
            this.field4637[14] = this.field4629;
            this.field4569 = (this.field4637[arg0] - (float) this.field4610) / this.field4637[10];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V", line = 1172)
    public final void method2438(byte arg0) {
        try {
            if (arg0 != 25) {
                this.method855((class157) null, (class505) null, -59);
            }
            if (class351.field5420 != this.field4564) {
                class139 var2 = this.field4564;
                this.field4564 = class351.field5420;
                if (var2.method1195((byte) -89)) {
                    this.method2425(true);
                }
                this.field4619 = this.field4614;
                this.field4565 &= -32;
            }
            ++field4488;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[172] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(ZI)Lje;", line = 1196)
    public final class421 method2439(boolean arg0, int arg1) {
        try {
            if (!arg0) {
                this.field4676 = -103;
            }
            ++field4477;
            if (~(arg1 * 2) < ~this.field4656.method25(-12502)) {
                this.field4656.method24(arg1, -10749);
            }
            return this.field4656;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[61] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILdea;)V", line = 1210)
    private final void method2440(int arg0, int arg1, class259 arg2) {
        try {
            this.method856(0, this.field4663, true);
            if (arg0 == 1) {
                ++field4539;
                this.method868(false, this.field4673);
                this.method892((byte) -124, arg2, 0, arg1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[33] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(II)V", line = 1223)
    public final void method490(int arg0, int arg1) {
        try {
            if (this.field4636 != arg0 || this.field4610 != arg1) {
                this.field4610 = arg1;
                this.field4636 = arg0;
                this.method2464(-126);
                this.method2436((byte) 113);
                this.method2432(0);
            }
            ++field4408;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "(I)V", line = 1244)
    public final void method2441(int arg0) {
        try {
            ++field4527;
            this.method2440(1, arg0, class242.field3692);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[31] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "()Z", line = 1254)
    public final boolean method588() {
        try {
            ++field4517;
            return false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[123] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIIIZ)Lfs;", line = 1267)
    public final class581 method560(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            ++field4523;
            return new class429(this, arg3, arg4, arg0, arg1, arg2);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4677[135] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIILaa;II)V", line = 1281)
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
        try {
            ++field4366;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field4677[165] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4677[2] : field4677[0]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "(I)V", line = 1288)
    private final void method2442(int arg0) {
        try {
            this.field4663 = this.method850(false, 0);
            ++field4532;
            this.field4663.method166(120, 28, 140);
            for (int var2 = 0; var2 < 4; ++var2) {
                Buffer var3 = this.field4663.method170(false, true);
                if (var3 != null) {
                    Stream var4 = this.method2476(var3, (byte) -3);
                    if (Stream.method5102()) {
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(1.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(1.0F);
                        var4.method5112(0.0F);
                        var4.method5112(1.0F);
                        var4.method5112(1.0F);
                        var4.method5112(1.0F);
                        var4.method5112(0.0F);
                        var4.method5112(1.0F);
                        var4.method5112(1.0F);
                        var4.method5112(1.0F);
                        var4.method5112(1.0F);
                        var4.method5112(1.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(1.0F);
                        var4.method5112(0.0F);
                        var4.method5112(1.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                        var4.method5112(0.0F);
                    } else {
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(1.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(1.0F);
                        var4.method5105(0.0F);
                        var4.method5105(1.0F);
                        var4.method5105(1.0F);
                        var4.method5105(1.0F);
                        var4.method5105(0.0F);
                        var4.method5105(1.0F);
                        var4.method5105(1.0F);
                        var4.method5105(1.0F);
                        var4.method5105(1.0F);
                        var4.method5105(1.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(1.0F);
                        var4.method5105(0.0F);
                        var4.method5105(1.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                        var4.method5105(0.0F);
                    }
                    var4.method5103();
                    if (this.field4663.method167(-20743)) {
                        break;
                    }
                }
            }
            if (arg0 <= 95) {
                this.field4589 = -23;
            }
            this.field4673 = this.method873(new class240[] { new class240(new class778[] { class778.field11295, class778.field11304, class778.field11304 }) }, (byte) 77);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[67] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILrt;Z)V", line = 1402)
    public final void method2443(int arg0, class239 arg1, boolean arg2) {
        try {
            ++field4356;
            this.method844(arg1, arg0, 0, arg2);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[51] + arg0 + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "ra", descriptor = "(IIII)V", line = 1410)
    public final void method538(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field4609 = arg0;
            this.field4552 = arg2;
            this.field4638 = true;
            this.field4562 = arg3;
            this.field4574 = arg1;
            ++field4493;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1422)
    public final void method508(Canvas arg0) {
        try {
            ++field4410;
            this.field4486 = null;
            this.field4489 = null;
            if (arg0 != null && this.field4386 != arg0) {
                if (this.field4421.containsKey(arg0)) {
                    this.field4486 = this.field4421.get(arg0);
                    this.field4489 = arg0;
                }
            } else {
                this.field4486 = this.field4474;
                this.field4489 = this.field4386;
            }
            if (this.field4489 != null && this.field4486 != null) {
                this.method894(this.field4489, this.field4486, 0);
                this.method2492((byte) 126);
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[137] + (arg0 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 1453)
    public final class294 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        try {
            ++field4406;
            return new class597(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field4677[68] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4677[2] : field4677[0]) + ',' + (arg3 != null ? field4677[2] : field4677[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZ)Lfs;", line = 1464)
    public final class581 method534(int arg0, int arg1, boolean arg2) {
        try {
            ++field4360;
            return new class429(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[63] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "(I)V", line = 1473)
    private final void method2444(int arg0) {
        try {
            if (arg0 != 10910) {
                this.method2437(-19);
            }
            ++field4447;
            if (class178.field2478 == this.field4564) {
                float var2 = this.method885((byte) -99);
                this.field4541.method5570(var2, 0.0F, var2, arg0 ^ 10959);
            }
            this.field4588 = false;
            this.method893(false);
            if (this.field4617 != null) {
                this.field4617.method782(1);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[156] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "DA", descriptor = "(IIII)V", line = 1498)
    public final void method479(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4378;
            this.field4594 = arg1;
            this.field4645 = arg3;
            this.field4570 = arg2;
            this.field4585 = arg0;
            this.method2436((byte) 88);
            this.method2464(-60);
            this.method2438((byte) 25);
            this.method2416(0);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[54] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lla;II)V", line = 1513)
    public class296(Canvas arg0, Object arg1, class160 arg2, class476 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            try {
                this.field4399 = arg3;
                this.field4489 = this.field4386 = arg0;
                this.field4486 = this.field4474 = arg1;
                this.field4584 = arg4;
                Dimension var7 = arg0.getSize();
                this.field4416 = this.field4452 = var7.height;
                this.field4595 = arg5;
                this.field4492 = this.field4437 = var7.width;
                class624.method4635(false, -17200, true);
                if (super.field679 != null) {
                    this.field4652 = new class615(this, super.field679);
                    this.field4501 = new NativeInterface(super.field679.method1367(-81), this.field4595);
                    for (int var8 = 0; ~super.field679.method1367(-59) < ~var8; ++var8) {
                        class439 var9 = super.field679.method1366((byte) -97, var8);
                        if (var9 != null) {
                            this.field4501.initTextureMetrics(var8, var9.field6476, var9.field6480);
                        }
                    }
                } else {
                    this.field4501 = new NativeInterface(0, this.field4595);
                    this.field4652 = null;
                }
            } catch (Throwable var12) {
                var12.printStackTrace();
                this.method579((byte) -96);
                throw new RuntimeException("");
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4677[66] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ',' + (arg2 != null ? field4677[2] : field4677[0]) + ',' + (arg3 != null ? field4677[2] : field4677[0]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V", line = 1566)
    public final void method2445(int arg0, boolean arg1) {
        try {
            if (!this.field4563 == arg1) {
                this.field4563 = arg1;
                this.method901(true);
                this.field4565 &= -32;
            }
            ++field4511;
            if (arg0 != 8) {
                this.field4437 = 61;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[60] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "()[I", line = 1585)
    public final int[] method548() {
        try {
            ++field4512;
            return new int[] { this.field4585, this.field4594, this.field4570, this.field4645 };
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[15] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIF)Luf;", line = 1593)
    public final class471 method521(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        try {
            ++field4395;
            return new class487(arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4677[49] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BB)V", line = 1601)
    public final void method2446(byte arg0, byte arg1) {
        try {
            if (arg1 != -65) {
                this.method2474(109, (class290) null);
            }
            ++field4390;
            this.method2462(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0, -1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[92] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIZI)Lwp;", line = 1613)
    public final class191 method2447(int[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        try {
            ++field4403;
            return arg4 != 26236 ? null : this.method890(arg3, 0, 0, arg1, arg0, 81, arg2);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4677[87] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZLeu;I[BI)Lwp;", line = 1628)
    public final class191 method2448(boolean arg0, boolean arg1, class505 arg2, int arg3, byte[] arg4, int arg5) {
        try {
            if (!arg1) {
                return null;
            } else {
                ++field4396;
                return this.method847(arg0, arg3, 0, -1, 0, arg2, arg4, arg5);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4677[17] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4677[2] : field4677[0]) + ',' + arg3 + ',' + (arg4 != null ? field4677[2] : field4677[0]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZZ)V", line = 1639)
    public final void method2449(boolean arg0, boolean arg1) {
        try {
            ++field4381;
            if (arg1) {
                if (this.field4580 == !arg0) {
                    this.field4580 = arg0;
                    this.method906(false);
                    this.field4565 &= -32;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[57] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "(B)V", line = 1657)
    public void method860(byte arg0) {
        try {
            if (arg0 == -128) {
                this.field4615 = this.field4631;
                ++field4530;
                this.field4631 = 0;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[155] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "xa", descriptor = "(F)V", line = 1673)
    public final void method526(float arg0) {
        try {
            if (this.field4601 != arg0) {
                this.field4601 = arg0;
                this.field4501.setAmbient(arg0);
                this.method891((byte) 105);
                this.method905(98);
            }
            ++field4451;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[152] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IZ)V", line = 1689)
    public final void method2450(int arg0, boolean arg1) {
        try {
            if (arg0 != 1) {
                this.method2440(-1, -127, (class259) null);
            }
            if (arg1 == !this.field4621) {
                this.field4621 = arg1;
                this.method895((byte) 84);
            }
            ++field4424;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[175] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "(B)I", line = 1706)
    public final int method2451(byte arg0) {
        try {
            if (arg0 != -62) {
                this.field4548 = null;
            }
            ++field4499;
            return this.field4574;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[125] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 1718)
    public void method498(int arg0) {
        try {
            if (this.field4652 != null) {
                this.field4652.method4550(2);
            }
            ++field4379;
            this.field4603 = arg0 & Integer.MAX_VALUE;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[171] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljw;)V", line = 1731)
    public final void method590(class580 arg0) {
        try {
            ++field4457;
            this.field4643.method3543(-1, arg0, this, -109);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[21] + (arg0 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 1740)
    public final void method551(Canvas arg0, int arg1, int arg2) {
        try {
            ++field4470;
            Object var4 = null;
            if (arg0 != null && this.field4386 != arg0) {
                if (this.field4421.containsKey(arg0)) {
                    var4 = this.field4421.get(arg0);
                }
            } else {
                var4 = this.field4486;
            }
            if (var4 == null) {
                throw new RuntimeException();
            } else {
                this.method881(16, arg0, var4);
                if (this.field4489 == arg0) {
                    this.method2492((byte) 104);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[83] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "(Z)I", line = 1766)
    public final int method2452(boolean arg0) {
        try {
            ++field4400;
            if (!arg0) {
                this.field4637 = null;
            }
            return this.field4552;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[124] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(II)V", line = 1777)
    public final void method2453(int arg0, int arg1) {
        try {
            if (~this.field4587 != ~arg0) {
                this.field4587 = arg0;
                this.method865((byte) 30);
            }
            ++field4443;
            if (arg1 != 13) {
                this.method538(46, -82, -79, 46);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[73] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "(Z)V", line = 1795)
    private final void method2454(boolean arg0) {
        try {
            ++field4515;
            if (arg0) {
                this.field4634 = null;
            }
            this.method856(0, this.field4670, true);
            this.method868(arg0, this.field4653);
            this.method892((byte) 64, class313.field4962, 0, 1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[118] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIIIII)Lol;", line = 1808)
    public final class299 method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field4516;
            return new class548(this, arg0, arg1, arg2, arg3, arg4, arg5);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4677[88] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 1818)
    public final void method589(Canvas arg0, int arg1, int arg2) {
        try {
            ++field4476;
            if (this.field4386 == arg0) {
                throw new RuntimeException();
            } else if (!this.field4421.containsKey(arg0)) {
                if (!arg0.isShowing()) {
                    throw new RuntimeException();
                } else {
                    try {
                        Class var4 = Class.forName(field4677[97]);
                        Method var5 = var4.getMethod(field4677[98], Boolean.TYPE);
                        var5.invoke(arg0, Boolean.TRUE);
                    } catch (Exception var8) {
                    }
                    Object var6 = this.method875(-1, arg0);
                    if (var6 == null) {
                        throw new RuntimeException();
                    } else {
                        this.field4421.put(arg0, var6);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field4677[96] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "(IIIII)V", line = 1854)
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field4475;
            this.method532(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4677[147] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V", line = 1862)
    public final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field4456;
            float var8 = (float) (-arg0) + (float) arg2;
            float var9 = (float) (-arg1) + (float) arg3;
            float var10 = 0.0F;
            float var11 = 1.0F;
            if (var8 != 0.0F || var9 != 0.0F) {
                var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
                var10 = (float) Math.atan2((double) var9, (double) var8);
            }
            this.method2434(122);
            this.method2462(arg4, -1);
            this.method2498(0, class114.field1352, (byte) 127);
            this.method2443(0, class114.field1352, false);
            this.method2457(arg6, (byte) -75);
            this.field4541.method5558((float) arg5, 0, 1.0F, var11);
            this.field4541.method2375(0, -arg5 / 2, 0);
            this.field4541.method2386((int) ((double) var10 * 2607.5945876176133D) & 16383);
            this.field4541.method2375(arg0, arg1, 0);
            this.method2418(17654);
            this.method869(false, (byte) -66);
            this.method2441(2);
            this.method869(true, (byte) -124);
            this.method2443(0, class48.field546, false);
            this.method2498(0, class48.field546, (byte) 42);
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4677[69] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "(B)V", line = 1900)
    public static final void method2455(byte arg0) {
        try {
            class492.field7065 = -1;
            ++field4469;
            class582.field8619 = 0;
            class153.field1893 = -1;
            if (arg0 > -31) {
                field4464 = false;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[94] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "(B)V", line = 1913)
    private final void method2456(byte arg0) {
        try {
            this.method891((byte) 105);
            ++field4417;
            this.method888(arg0 + 17);
            if (arg0 == -12) {
                this.method895((byte) 84);
                this.method860((byte) -128);
                this.method845((byte) 126);
                this.method905(69);
                this.method852(-110);
                this.method906(false);
                this.method887((byte) 61);
                this.method901(true);
                this.method870(-1);
                this.method857(true);
                this.method898((byte) -92);
                this.method851(true);
                for (int var2 = this.field4593 - 1; ~var2 <= -1; --var2) {
                    this.method2453(var2, 13);
                    this.method862((byte) -83);
                    this.method883(-32171);
                    this.method2489(0);
                }
                this.method858(-93);
                this.method903((byte) -105);
                this.method902(27477);
                this.method893(false);
                this.method876((byte) 121);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[143] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V", line = 1958)
    public final void method2457(int arg0, byte arg1) {
        try {
            if (~this.field4589 != ~arg0) {
                boolean var3;
                boolean var4;
                class301 var5;
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 128) {
                            var3 = false;
                            var4 = false;
                            var5 = class198.field3094;
                        } else {
                            var3 = true;
                            var5 = class203.field3152;
                            var4 = true;
                        }
                    } else {
                        var4 = true;
                        var3 = false;
                        var5 = class57.field614;
                    }
                } else {
                    var4 = true;
                    var5 = class634.field9242;
                    var3 = true;
                }
                if (!this.field4554 == var3) {
                    this.field4554 = var3;
                    this.method851(true);
                }
                if (this.field4612 != var4) {
                    this.field4612 = var4;
                    this.method857(true);
                }
                if (this.field4646 != var5) {
                    this.field4646 = var5;
                    this.method898((byte) -90);
                }
                this.field4565 &= -29;
                this.field4589 = arg0;
            }
            ++field4529;
            if (arg1 > -18) {
                this.method558();
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4677[116] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "(B)V", line = 2027)
    public final void method2458(byte arg0) {
        try {
            if (~this.field4565 != -17) {
                this.method2481(true);
                this.method2445(8, true);
                this.method2449(true, true);
                this.method2473((byte) -121, true);
                this.method2457(1, (byte) -114);
                this.field4565 = 16;
            }
            if (arg0 != 20) {
                this.method890(false, -25, -117, 65, (int[]) null, -6, -93);
            }
            ++field4508;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 2048)
    public final void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            ++field4506;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field4677[86] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Llq;[Liga;Z)Lda;", line = 2055)
    public final class67 method563(class578 arg0, class481[] arg1, boolean arg2) {
        try {
            ++field4461;
            return new class636(this, arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[36] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lkn;Z)V", line = 2066)
    public final void method2459(class770 arg0, boolean arg1) {
        try {
            ++field4364;
            this.field4541.method2377(arg0);
            this.field4540 = arg1;
            this.method2444(10910);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[146] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "(I)V", line = 2076)
    private final void method2460(int arg0) {
        try {
            ++field4373;
            this.field4641 = false;
            if (class178.field2478 == this.field4564) {
                this.method2490(true);
                this.method2429(arg0 ^ 1);
            }
            if (arg0 != 0) {
                this.field4620 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(Z)V", line = 2098)
    public final void method2461(boolean arg0) {
        try {
            if (!arg0) {
                this.method535(1);
            }
            if (~this.field4565 != -5) {
                this.method2463((byte) -111);
                this.method2445(8, false);
                this.method2472((byte) 24, false);
                this.method2449(false, true);
                this.method2473((byte) -98, false);
                this.method2477(0, false, -2, false);
                this.method2457(1, (byte) -121);
                this.method2433(-16075, 0);
                this.field4565 = 4;
            }
            ++field4522;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Liga;Z)Lfs;", line = 2121)
    public final class581 method487(class481 arg0, boolean arg1) {
        try {
            ++field4503;
            class581 var11;
            if (~arg0.field6970 != -1 && arg0.field6977 != 0) {
                int[] var3 = new int[arg0.field6977 * arg0.field6970];
                int var4 = 0;
                int var5 = 0;
                if (arg0.field6973 != null) {
                    for (int var6 = 0; arg0.field6977 > var6; ++var6) {
                        for (int var7 = 0; ~arg0.field6970 < ~var7; ++var7) {
                            var3[var5++] = class544.method4107(arg0.field6969[class291.method2359(255, arg0.field6975[var4])], arg0.field6973[var4] << 24);
                            ++var4;
                        }
                    }
                } else {
                    for (int var8 = 0; ~var8 > ~arg0.field6977; ++var8) {
                        for (int var9 = 0; ~arg0.field6970 < ~var9; ++var9) {
                            int var10 = arg0.field6969[arg0.field6975[var4++] & 255];
                            var3[var5++] = ~var10 == -1 ? 0 : class544.method4107(var10, -16777216);
                        }
                    }
                }
                var11 = this.method520(0, arg0.field6970, var3, (byte) 41, arg0.field6970, arg0.field6977);
            } else {
                var11 = this.method520(0, 1, new int[1], (byte) 41, 1, 1);
            }
            var11.method990(arg0.field6971, arg0.field6976, arg0.field6974, arg0.field6972);
            return var11;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4677[151] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(II)V", line = 2189)
    public final void method2462(int arg0, int arg1) {
        try {
            if (this.field4581 != arg0) {
                this.field4581 = arg0;
                this.method858(-81);
            }
            ++field4524;
            if (arg1 != -1) {
                this.method2435((byte) 70);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[169] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "(B)V", line = 2211)
    private final void method2463(byte arg0) {
        try {
            if (arg0 <= -106) {
                if (class178.field2478 != this.field4564) {
                    class139 var2 = this.field4564;
                    this.field4564 = class178.field2478;
                    if (var2.method1195((byte) -126)) {
                        this.method2425(true);
                    }
                    this.method2490(true);
                    this.field4619 = this.field4582;
                    this.method2429(1);
                    this.field4565 &= -25;
                }
                ++field4425;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[162] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "(I)V", line = 2237)
    private final void method2464(int arg0) {
        try {
            ++field4438;
            this.field4597 = false;
            this.method2485((byte) -123);
            if (class463.field6741 == this.field4564) {
                this.method2429(1);
            }
            if (arg0 >= -6) {
                this.method519(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[91] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(Z)Lrr;", line = 2254)
    public final class380 method2465(boolean arg0) {
        try {
            if (!arg0) {
                this.field4585 = 25;
            }
            ++field4391;
            return this.field4557 == null ? null : this.field4557.method4135(-1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[29] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "(B)Lkn;", line = 2265)
    public final class770 method2466(byte arg0) {
        try {
            ++field4382;
            int var2 = 13 % (arg0 / 53);
            return this.field4550;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[136] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILrca;)V", line = 2275)
    public final void method2467(int arg0, class479 arg1) {
        try {
            ++field4455;
            if (this.field4576[this.field4587] != arg1) {
                this.field4576[this.field4587] = arg1;
                if (arg1 == null) {
                    this.method878(arg0 + -32278);
                } else {
                    arg1.method2774(15416);
                }
                this.field4565 &= -2;
            }
            if (arg0 != 12) {
                this.method517();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[144] + arg0 + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)Lkn;", line = 2302)
    public final class770 method2468(byte arg0) {
        try {
            ++field4502;
            if (arg0 >= -76) {
                this.field4643 = null;
            }
            return this.field4541;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[52] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 2314)
    public final void method481(int arg0) {
        try {
            ++field4357;
            if (~arg0 <= -129 && ~arg0 >= -1025) {
                if (this.field4652 != null) {
                    this.field4652.method4552(0);
                }
                this.field4602 = arg0;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[56] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "()Z", line = 2329)
    public final boolean method561() {
        try {
            ++field4420;
            return false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[47] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FB)V", line = 2338)
    public final void method2469(float arg0, byte arg1) {
        try {
            if (arg1 < 34) {
                this.method2464(72);
            }
            ++field4428;
            if (this.field4607 != arg0) {
                this.field4607 = arg0;
                this.method2436((byte) 108);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[41] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "(B)V", line = 2355)
    public final void method2470(byte arg0) {
        try {
            ++field4393;
            this.method2438((byte) 25);
            if (arg0 <= -87) {
                this.method2429(1);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[42] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "()I", line = 2369)
    public final int method583() {
        try {
            ++field4481;
            return this.field4636;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[45] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(II)I", line = 2380)
    public final int method509(int arg0, int arg1) {
        try {
            ++field4385;
            return arg1 ^ arg1 & arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[131] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "(I)V", line = 2389)
    private final void method2471(int arg0) {
        try {
            if (arg0 != 15942) {
                this.field4639 = 113;
            }
            ++field4446;
            if (!this.field4648) {
                float[] var2 = this.field4634;
                float var3 = (float) this.field4636;
                float var4 = (float) this.field4610;
                float var5 = (float) (-this.field4594) * this.field4607 / (float) this.field4645;
                float var6 = (float) (-this.field4585) * this.field4607 / (float) this.field4570;
                float var7 = (float) (this.field4492 - this.field4585) * this.field4607 / (float) this.field4570;
                float var8 = (float) (-this.field4594 + this.field4416) * this.field4607 / (float) this.field4645;
                if (var6 != var7 && var5 != var8) {
                    var2[4] = 0.0F;
                    var2[3] = 0.0F;
                    var2[7] = 0.0F;
                    var2[14] = var3 / (var3 - var4);
                    var2[10] = 1.0F / (var3 - var4);
                    var2[11] = 0.0F;
                    var2[8] = 0.0F;
                    var2[12] = (var6 + var7) / (-var7 + var6);
                    var2[1] = 0.0F;
                    var2[2] = 0.0F;
                    var2[0] = 2.0F / (var7 - var6);
                    var2[9] = 0.0F;
                    var2[15] = 1.0F;
                    var2[6] = 0.0F;
                    var2[5] = 2.0F / (-var5 + var8);
                    var2[13] = (var5 + var8) / (-var5 + var8);
                } else {
                    var2[0] = 1.0F;
                    var2[10] = 1.0F;
                    var2[15] = 1.0F;
                    var2[5] = 1.0F;
                    var2[9] = 0.0F;
                    var2[13] = 0.0F;
                    var2[1] = 0.0F;
                    var2[14] = 0.0F;
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[11] = 0.0F;
                    var2[12] = 0.0F;
                    var2[6] = 0.0F;
                    var2[2] = 0.0F;
                    var2[7] = 0.0F;
                    var2[8] = 0.0F;
                }
                this.method2482(1);
                this.field4648 = true;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field4677[107] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(BZ)V", line = 2460)
    public final void method2472(byte arg0, boolean arg1) {
        try {
            if (!this.field4628 == arg1) {
                this.field4628 = arg1;
                this.method895((byte) 84);
                this.field4565 &= -8;
            }
            if (arg0 != 24) {
                this.method472();
            }
            ++field4491;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[28] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([I)V", line = 2478)
    public final void method539(int[] arg0) {
        try {
            arg0[1] = this.field4416;
            arg0[0] = this.field4492;
            ++field4384;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[77] + (arg0 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V", line = 2488)
    public final void method2473(byte arg0, boolean arg1) {
        try {
            if (arg0 >= -93) {
                this.method2462(-12, -13);
            }
            if (!this.field4651 == arg1) {
                this.field4651 = arg1;
                this.method887((byte) 61);
                this.field4565 &= -32;
            }
            ++field4448;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[170] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILup;)V", line = 2509)
    public final void method2474(int arg0, class290 arg1) {
        try {
            ++field4354;
            this.field4642[this.field4587] = arg1;
            this.method2493(true);
            if (arg0 != 2) {
                this.field4645 = 16;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[163] + arg0 + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([FI)[F", line = 2524)
    public final float[] method2475(float[] arg0, int arg1) {
        try {
            arg0[0] = this.field4619[0];
            ++field4359;
            arg0[8] = this.field4619[2];
            arg0[4] = this.field4619[1];
            arg0[12] = this.field4619[3];
            arg0[5] = this.field4619[5];
            arg0[2] = this.field4619[8];
            if (arg1 >= -114) {
                return null;
            } else {
                arg0[9] = this.field4619[6];
                arg0[13] = this.field4619[7];
                arg0[1] = this.field4619[4];
                arg0[7] = this.field4619[13];
                arg0[14] = this.field4619[11];
                arg0[6] = this.field4619[9];
                arg0[10] = this.field4619[10];
                arg0[3] = this.field4619[12];
                arg0[11] = this.field4619[14];
                arg0[15] = this.field4619[15];
                return arg0;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[79] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(Z)V", line = 2554)
    public void method853(boolean arg0) {
        try {
            ++field4388;
            this.method2456((byte) -12);
            if (!arg0) {
                this.field4568 = -94;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[106] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;", line = 2571)
    public final Stream method2476(Buffer arg0, byte arg1) {
        try {
            if (arg1 != -3) {
                this.method867(60, 117, (byte[]) null, -96, 61, (class505) null);
            }
            ++field4521;
            this.field4591.method5111(arg0);
            return this.field4591;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[43] + (arg0 != null ? field4677[2] : field4677[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIZ)V", line = 2583)
    public final void method2477(int arg0, boolean arg1, int arg2, boolean arg3) {
        try {
            if (this.field4573 != arg2 || this.field4638 == !this.field4599) {
                class191 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = !this.field4638 ? 0 : 3;
                if (~arg2 > -1) {
                    this.method2489(0);
                } else {
                    var5 = this.field4652.method4549((byte) -35, arg2);
                    class439 var10 = super.field679.method1366((byte) -71, arg2);
                    if (~var10.field6475 == -1 && ~var10.field6466 == -1) {
                        this.method2489(0);
                    } else {
                        int var11 = !var10.field6481 ? 128 : 64;
                        int var12 = var11 * 50;
                        class770 var13 = this.method2479(~arg0);
                        var13.method5576((float) (this.field4603 % var12 * var10.field6475) / (float) var12, 81, (float) (this.field4603 % var12 * var10.field6466) / (float) var12, 0.0F);
                        this.method2474(2, class398.field5941);
                    }
                    var6 = var10.field6464;
                    if (!this.field4638) {
                        var7 = var10.field6461;
                        var8 = var10.field6462;
                        var9 = var10.field6467;
                    }
                }
                this.method2430(var8, arg3, var9, 8218, var7, arg1);
                if (this.field4617 == null) {
                    this.method2467(12, var5);
                    this.method2433(-16075, var6);
                } else {
                    this.field4617.method788(var6, -88, var5);
                }
                this.field4573 = arg2;
                this.field4599 = this.field4638;
            }
            if (arg0 != 0) {
                this.field4668 = null;
            }
            ++field4404;
            this.field4565 &= -8;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field4677[104] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "la", descriptor = "()V", line = 2653)
    public final void method553() {
        try {
            this.field4630 = this.field4492;
            this.field4578 = 0;
            ++field4423;
            this.field4624 = 0;
            this.field4561 = this.field4416;
            if (this.field4675) {
                this.field4675 = false;
                this.method882(false);
            }
            this.method2416(0);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[129] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "pa", descriptor = "()V", line = 2673)
    public final void method523() {
        try {
            ++field4544;
            this.field4638 = false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[110] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)I", line = 2683)
    public final int method499(int arg0, int arg1) {
        try {
            ++field4480;
            return arg0 | arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[25] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "()Z", line = 2691)
    public final boolean method559() {
        try {
            ++field4358;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[167] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII[[[BIIIILha;II)V", line = 2701)
    public static final void method2478(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int arg6, int arg7, int arg8, int arg9, class66 arg10, int arg11, int arg12) {
        try {
            ++field4496;
            if (arg8 != arg9 && ~arg7 != -1) {
                if (arg9 == 9) {
                    arg2 = arg2 - -1 & 3;
                    arg9 = 1;
                }
                if (~arg9 == -11) {
                    arg9 = 1;
                    arg2 = arg2 + 3 & 3;
                }
                if (arg9 == 11) {
                    arg9 = 8;
                    arg2 = 3 & arg2 + 3;
                }
                arg10.method585(arg4, arg6, arg0, arg3, arg12, arg11, arg5[arg9 + -1][arg2], arg7, arg1);
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field4677[108] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4677[2] : field4677[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field4677[2] : field4677[0]) + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V", line = 2733)
    public final void method510(int arg0) {
        try {
            ++field4407;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[80] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "(I)Lkn;", line = 2742)
    public final class770 method2479(int arg0) {
        try {
            ++field4415;
            return arg0 != -1 ? null : this.field4575[this.field4587];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[27] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "(I)V", line = 2757)
    public static void method2480(int arg0) {
        try {
            int var1 = -125 % ((arg0 - -45) / 45);
            field4535 = null;
            field4542 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[64] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "()Z", line = 2774)
    public final boolean method514() {
        try {
            ++field4411;
            return this.field4632;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[174] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "()Z", line = 2785)
    public final boolean method562() {
        try {
            ++field4368;
            return false;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[159] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "za", descriptor = "(IIIII)V", line = 2795)
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field4405;
            this.method2434(120);
            this.method2462(arg3, -1);
            this.method2498(0, class114.field1352, (byte) 83);
            this.method2443(0, class114.field1352, false);
            this.method2457(arg4, (byte) -70);
            this.field4541.method5558((float) arg2, 0, 1.0F, (float) arg2);
            this.field4541.method2375(arg0, arg1, 0);
            this.method2418(17654);
            this.method869(false, (byte) -109);
            this.method856(0, this.field4672, true);
            this.method868(false, this.field4674);
            this.method892((byte) 123, class242.field3692, 0, 256);
            this.method869(true, (byte) -55);
            this.method2443(0, class48.field546, false);
            this.method2498(0, class48.field546, (byte) 89);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4677[89] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(Z)V", line = 2817)
    private final void method2481(boolean arg0) {
        try {
            ++field4472;
            if (class316.field4996 != this.field4564) {
                class139 var2 = this.field4564;
                this.field4564 = class316.field4996;
                if (!var2.method1195((byte) -92)) {
                    this.method2425(arg0);
                }
                this.method2471(15942);
                this.field4619 = this.field4634;
                this.method2429(1);
                this.field4565 &= -8;
            }
            if (!arg0) {
                this.method2485((byte) 120);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[154] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "(I)V", line = 2841)
    private final void method2482(int arg0) {
        try {
            ++field4513;
            this.field4616 = (float) this.field4610;
            if (arg0 != 1) {
                this.field4630 = -56;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[130] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V", line = 2859)
    public final void method519(boolean arg0) {
        try {
            ++field4531;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[128] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(FIFFFFF)Z", line = 2866)
    private final boolean method2483(float arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        try {
            ++field4518;
            Buffer var8 = this.field4670.method170(false, true);
            if (var8 == null) {
                return false;
            } else {
                Stream var9 = this.method2476(var8, (byte) -3);
                if (Stream.method5102()) {
                    var9.method5112(arg5);
                    var9.method5112(arg6);
                    var9.method5112(arg2);
                    var9.method5112(arg3);
                    var9.method5112(arg4);
                    var9.method5112(arg0);
                } else {
                    var9.method5105(arg5);
                    var9.method5105(arg6);
                    var9.method5105(arg2);
                    var9.method5105(arg3);
                    var9.method5105(arg4);
                    var9.method5105(arg0);
                }
                if (arg1 <= 122) {
                    this.method560((int[]) null, -102, 52, -97, -37, true);
                }
                var9.method5103();
                return this.field4670.method167(-20743);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field4677[133] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "(IIII)V", line = 2906)
    public final void method522(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4490;
            boolean var5 = false;
            if (arg0 > this.field4624) {
                var5 = true;
                this.field4624 = arg0;
            }
            if (~arg2 > ~this.field4630) {
                this.field4630 = arg2;
                var5 = true;
            }
            if (~this.field4578 > ~arg1) {
                var5 = true;
                this.field4578 = arg1;
            }
            if (~arg3 > ~this.field4561) {
                var5 = true;
                this.field4561 = arg3;
            }
            if (var5) {
                if (!this.field4675) {
                    this.field4675 = true;
                    this.method882(false);
                }
                this.method849((byte) -39);
                this.method2416(0);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4677[85] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 2954)
    public final void method536(int arg0) {
        try {
            ++field4362;
            if (~arg0 != -2) {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[103] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)Lza;", line = 2967)
    public final class434 method475(int arg0) {
        try {
            ++field4369;
            class747 var2 = new class747(arg0);
            this.field4361.method3868(113, var2);
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[113] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "KA", descriptor = "(IIII)V", line = 2980)
    public final void method489(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4401;
            if (~arg0 >= -1 && this.field4492 - 1 <= arg2 && arg1 <= 0 && ~arg3 <= ~(this.field4416 + -1)) {
                this.method553();
            } else {
                this.field4630 = ~arg2 < ~this.field4492 ? 0 : arg2;
                this.field4624 = ~arg0 > -1 ? 0 : arg0;
                this.field4561 = this.field4492 >= arg3 ? arg3 : 0;
                this.field4578 = ~arg1 <= -1 ? arg1 : 0;
                if (!this.field4675) {
                    this.field4675 = true;
                    this.method882(false);
                }
                this.method849((byte) -39);
                this.method2416(0);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[32] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "ZA", descriptor = "(IFFFFF)V", line = 3007)
    public final void method516(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        try {
            ++field4509;
            boolean var7 = this.field4613 != arg0;
            if (var7 || this.field4611 != arg1 || this.field4559 != arg2) {
                this.field4559 = arg2;
                this.field4611 = arg1;
                this.field4613 = arg0;
                if (var7) {
                    this.field4633 = (float) (255 & this.field4613) / 255.0F;
                    this.field4555 = (float) (16711680 & this.field4613) / 1.671168E7F;
                    this.field4627 = (float) (this.field4613 & 65280) / 65280.0F;
                    this.method891((byte) 105);
                }
                this.field4501.setSunColour(this.field4555, this.field4627, this.field4633, arg1, arg2);
                this.method888(-113);
            }
            if (this.field4623[0] != arg3 || this.field4623[1] != arg4 || this.field4623[2] != arg5) {
                this.field4623[0] = arg3;
                this.field4623[2] = arg5;
                this.field4623[1] = arg4;
                this.field4620[0] = -arg3;
                this.field4620[1] = -arg4;
                this.field4620[2] = -arg5;
                float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
                this.field4577[0] = arg3 * var8;
                this.field4577[2] = arg5 * var8;
                this.field4577[1] = arg4 * var8;
                this.field4598[1] = -this.field4577[1];
                this.field4598[2] = -this.field4577[2];
                this.field4598[0] = -this.field4577[0];
                this.field4501.setSunDirection(this.field4577[0], this.field4577[1], this.field4577[2]);
                this.method845((byte) -33);
                this.field4649 = (int) (arg3 * 256.0F / arg4);
                this.field4579 = (int) (arg5 * 256.0F / arg4);
            }
            this.method905(60);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field4677[34] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "(I)[F", line = 3056)
    public final float[] method2484(int arg0) {
        try {
            ++field4485;
            return arg0 != 0 ? null : this.field4614;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[138] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "()V", line = 3067)
    public final void method574() {
        try {
            if (this.field4652 != null) {
                this.field4652.method4552(0);
            }
            ++field4365;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[75] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V", line = 3079)
    private final void method2485(byte arg0) {
        try {
            if (arg0 >= -90) {
                this.field4486 = null;
            }
            ++field4387;
            if (!this.field4597) {
                float[] var2 = this.field4637;
                float var3 = (float) (-this.field4585 * this.field4636) / (float) this.field4570;
                float var4 = (float) ((-this.field4585 + this.field4492) * this.field4636) / (float) this.field4570;
                float var5 = (float) (this.field4636 * this.field4594) / (float) this.field4645;
                float var6 = (float) ((-this.field4416 + this.field4594) * this.field4636) / (float) this.field4645;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field4636 * 2.0F;
                    var2[11] = -1.0F;
                    var2[7] = 0.0F;
                    var2[3] = 0.0F;
                    var2[12] = 0.0F;
                    var2[2] = 0.0F;
                    var2[4] = 0.0F;
                    var2[0] = var7 / (var4 - var3);
                    var2[10] = this.field4558 = (float) this.field4610 / (float) (-this.field4610 + this.field4636);
                    var2[8] = (var3 + var4) / (-var3 + var4);
                    var2[14] = this.field4629 = (float) (this.field4636 * this.field4610) / (float) (-this.field4610 + this.field4636);
                    var2[13] = 0.0F;
                    var2[6] = 0.0F;
                    var2[15] = 0.0F;
                    var2[5] = var7 / (var5 - var6);
                    var2[1] = 0.0F;
                    var2[9] = (var5 + var6) / (-var6 + var5);
                } else {
                    var2[5] = 1.0F;
                    var2[12] = 0.0F;
                    var2[6] = 0.0F;
                    var2[1] = 0.0F;
                    var2[0] = 1.0F;
                    var2[3] = 0.0F;
                    var2[11] = 0.0F;
                    var2[15] = 1.0F;
                    var2[7] = 0.0F;
                    var2[9] = 0.0F;
                    var2[8] = 0.0F;
                    var2[4] = 0.0F;
                    var2[13] = 0.0F;
                    var2[14] = 0.0F;
                    var2[10] = 1.0F;
                    var2[2] = 0.0F;
                }
                this.method2437(14);
                this.field4597 = true;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field4677[115] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "(I)V", line = 3147)
    public final void method2486(int arg0) {
        try {
            if (~this.field4565 != -9) {
                this.method2424((byte) -51);
                this.method2445(8, true);
                this.method2449(true, true);
                this.method2473((byte) -95, true);
                this.method2457(1, (byte) -66);
                this.field4565 = 8;
            }
            ++field4462;
            if (arg0 != -8573) {
                this.field4604 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "()Z", line = 3169)
    public final boolean method472() {
        try {
            ++field4376;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[13] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "(I)V", line = 3178)
    public final void method2487(int arg0) {
        try {
            if (~this.field4565 != -3) {
                this.method2463((byte) -127);
                this.method2445(8, false);
                this.method2472((byte) 24, false);
                this.method2449(false, true);
                this.method2473((byte) -95, false);
                this.method2477(0, false, -2, false);
                this.field4565 = 2;
            }
            if (arg0 >= -67) {
                this.field4601 = 1.2728593F;
            }
            ++field4426;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[I[I)Laa;", line = 3204)
    public final class512 method496(int arg0, int arg1, int[] arg2, int[] arg3) {
        try {
            ++field4453;
            return class206.method1825(arg3, arg1, arg2, arg0, 1, this);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[59] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4677[2] : field4677[0]) + ',' + (arg3 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "(I)V", line = 3214)
    private final void method2488(int arg0) {
        try {
            ++field4487;
            this.field4672 = this.method850(false, 0);
            this.field4672.method166(arg0 ^ 123, 12, 3096);
            for (int var2 = arg0; var2 < 4; ++var2) {
                Buffer var3 = this.field4672.method170(false, true);
                if (var3 != null) {
                    Stream var4 = this.method2476(var3, (byte) -3);
                    var4.method5112(0.0F);
                    var4.method5112(0.0F);
                    var4.method5112(0.0F);
                    for (int var5 = 0; var5 <= 256; ++var5) {
                        double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                        float var8 = (float) Math.cos(var6);
                        float var9 = (float) Math.sin(var6);
                        if (Stream.method5102()) {
                            var4.method5112(var9);
                            var4.method5112(var8);
                            var4.method5112(0.0F);
                        } else {
                            var4.method5105(var9);
                            var4.method5105(var8);
                            var4.method5105(0.0F);
                        }
                    }
                    var4.method5103();
                    if (this.field4672.method167(-20743)) {
                        break;
                    }
                }
            }
            this.field4674 = this.method873(new class240[] { new class240(class778.field11295) }, (byte) 127);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field4677[50] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "()Lqq;", line = 3289)
    public final class501 method511() {
        try {
            ++field4533;
            return this.field4664;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[139] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "(I)V", line = 3307)
    public final void method2489(int arg0) {
        try {
            if (this.field4642[this.field4587] != class341.field5303) {
                this.field4642[this.field4587] = class341.field5303;
                this.field4575[this.field4587].method2383();
                this.method2493(true);
            }
            if (arg0 != 0) {
                this.field4610 = -90;
            }
            ++field4371;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "EA", descriptor = "(IIII)V", line = 3330)
    public final void method480(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field4471;
            if (!this.field4638) {
                throw new RuntimeException("");
            } else {
                this.field4574 = arg1;
                this.field4562 = arg3;
                this.field4609 = arg0;
                this.field4552 = arg2;
                if (this.field4599) {
                    this.field4604[3].method1124((byte) -44);
                    this.field4604[3].method787(1);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[134] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V", line = 3350)
    private final void method2490(boolean arg0) {
        try {
            if (!arg0) {
                this.method844((class239) null, -82, -11, true);
            }
            if (!this.field4641) {
                float[] var2 = this.field4582;
                if (this.field4492 != 0 && ~this.field4416 != -1) {
                    var2[5] = -2.0F / (float) this.field4416;
                    var2[4] = 0.0F;
                    var2[15] = 1.0F;
                    var2[9] = 0.0F;
                    var2[6] = 0.0F;
                    var2[0] = 2.0F / (float) this.field4492;
                    var2[1] = 0.0F;
                    var2[13] = 1.0F;
                    var2[12] = -1.0F;
                    var2[14] = 0.5F;
                    var2[7] = 0.0F;
                    var2[2] = 0.0F;
                    var2[10] = 0.5F;
                    var2[8] = 0.0F;
                    var2[3] = 0.0F;
                    var2[11] = 0.0F;
                } else {
                    var2[8] = 0.0F;
                    var2[6] = 0.0F;
                    var2[0] = 1.0F;
                    var2[1] = 0.0F;
                    var2[12] = 0.0F;
                    var2[3] = 0.0F;
                    var2[11] = 0.0F;
                    var2[7] = 0.0F;
                    var2[14] = 0.0F;
                    var2[2] = 0.0F;
                    var2[5] = 1.0F;
                    var2[4] = 0.0F;
                    var2[13] = 0.0F;
                    var2[15] = 1.0F;
                    var2[10] = 1.0F;
                    var2[9] = 0.0F;
                }
                this.field4641 = true;
            }
            ++field4441;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[173] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3409)
    public final void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            ++field4380;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field4677[114] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4677[2] : field4677[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "da", descriptor = "(III[I)V", line = 3417)
    public final void method471(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            ++field4526;
            float var5 = this.field4547.method5571((float) arg1, (float) arg2, (float) arg0, 16383);
            int var6;
            int var7;
            if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
                var6 = this.field4594;
                var7 = this.field4585;
            } else {
                var7 = (int) ((float) this.field4570 * this.field4547.method5560((float) arg1, (float) arg0, (float) arg2, (byte) 45) / var5);
                var6 = (int) ((float) this.field4645 * this.field4547.method5578(5, (float) arg0, (float) arg2, (float) arg1) / var5);
            }
            arg3[0] = (int) ((float) var7 + -this.field4635);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var6 + -this.field4618);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field4677[149] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[FZLeu;II)Lwp;", line = 3442)
    public final class191 method2491(int arg0, float[] arg1, boolean arg2, class505 arg3, int arg4, int arg5) {
        try {
            ++field4495;
            return arg4 <= 31 ? null : this.method842(arg2, 92, 0, arg1, arg3, arg5, arg0, 0);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4677[3] + arg0 + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ',' + arg2 + ',' + (arg3 != null ? field4677[2] : field4677[0]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "(B)V", line = 3460)
    private final void method2492(byte arg0) {
        try {
            ++field4466;
            if (this.field4489 == null) {
                this.field4437 = this.field4452 = 1;
            } else {
                Dimension var2 = this.field4489.getSize();
                this.field4452 = var2.height;
                this.field4437 = var2.width;
            }
            this.field4416 = this.field4452;
            this.field4492 = this.field4437;
            this.method2460(0);
            this.method2464(-78);
            this.method2436((byte) 93);
            this.method903((byte) 114);
            this.method2416(0);
            if (arg0 <= 74) {
                this.field4492 = 4;
            }
            this.method2438((byte) 25);
            this.method553();
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "()Z", line = 3496)
    public final boolean method576() {
        try {
            ++field4422;
            return true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4677[48] + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lqq;)V", line = 3505)
    public final void method495(class501 arg0) {
        try {
            ++field4414;
            this.field4547 = (class770) arg0;
            this.field4549.method2377(this.field4547);
            this.field4549.method5574(2);
            this.field4550.method5562(this.field4549, 1901);
            this.field4548.method5562(this.field4547, 1901);
            if (this.field4564.method1195((byte) -99)) {
                this.method2425(true);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[145] + (arg0 != null ? field4677[2] : field4677[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(Z)V", line = 3521)
    private final void method2493(boolean arg0) {
        try {
            this.method872((byte) -117);
            ++field4534;
            if (this.field4617 != null) {
                this.field4617.method789((byte) 113);
            }
            if (!arg0) {
                field4505 = -93;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[121] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIZ)Lfs;", line = 3535)
    public final class581 method568(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            ++field4497;
            class429 var6 = new class429(this, arg2, arg3, arg4);
            var6.method987(0, 0, arg2, arg3, arg0, arg1);
            return var6;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4677[70] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "(B)V", line = 3548)
    public final void method2494(byte arg0) {
        try {
            ++field4478;
            Hashtable var2 = new Hashtable();
            if (this.field4421 != null && !this.field4421.isEmpty()) {
                Enumeration var3 = this.field4421.keys();
                while (var3.hasMoreElements()) {
                    Canvas var4 = (Canvas) var3.nextElement();
                    var2.put(var4, this.method875(-1, var4));
                }
            }
            this.field4421 = var2;
            if (arg0 < -64) {
                this.method2442(118);
                this.method2420((byte) 70);
                this.method2488(0);
                this.field4643.method3547(786336, this);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[157] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "(Z)V", line = 3581)
    public final void method488(boolean arg0) {
        try {
            this.field4650 = arg0;
            ++field4436;
            this.method887((byte) 61);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[95] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "(I)V", line = 3591)
    public final void method2495(int arg0) {
        try {
            this.field4541.method2383();
            if (arg0 == 4) {
                ++field4536;
                this.field4540 = true;
                this.method2444(10910);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[46] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "(I)V", line = 3608)
    public final void method2496(int arg0) {
        try {
            ++field4392;
            if (arg0 <= 20) {
                this.field4650 = false;
            }
            Enumeration var2 = this.field4421.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method884(this.field4421.get(var3), 4980, var3);
            }
            this.field4663.method20(true);
            this.field4670.method20(true);
            this.field4672.method20(true);
            this.field4669.method1355(-16383);
            this.field4658.method1355(-16383);
            this.field4668.method1355(-16383);
            this.field4654.method1355(-16383);
            this.field4661.method1355(-16383);
            this.field4643.method3539((byte) 41);
            this.field4656.method20(true);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[117] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(II)Loda;", line = 3639)
    public class129 method841(int arg0, int arg1) {
        try {
            ++field4431;
            if (arg0 != -1) {
                this.method503();
            }
            if (arg1 != 6) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        return ~arg1 == -8 ? new class780(this) : new class300(this);
                    } else {
                        return new class765(this, this.field4402);
                    }
                } else {
                    return new class625(this);
                }
            } else {
                return new class526(this);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4677[100] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "(B)Lkn;", line = 3690)
    public final class770 method2497(byte arg0) {
        try {
            ++field4445;
            int var2 = -15 / ((39 - arg0) / 60);
            if (!this.field4588) {
                this.field4551.method5563(this.field4549, this.field4541);
                this.field4588 = true;
            }
            return this.field4551;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4677[127] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILrt;B)V", line = 3707)
    public final void method2498(int arg0, class239 arg1, byte arg2) {
        try {
            int var4 = 38 % ((arg2 - -18) / 55);
            ++field4440;
            this.method889(false, arg0, false, 105, arg1);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4677[35] + arg0 + ',' + (arg1 != null ? field4677[2] : field4677[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "(I)Lkn;", line = 3717)
    public final class770 method2499(int arg0) {
        try {
            if (arg0 < 79) {
                this.field4642 = null;
            }
            ++field4467;
            return this.field4549;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4677[78] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(Z)V")
    public abstract void method851(boolean arg0);

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "(B)V")
    public abstract void method862(byte arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZB)V")
    public abstract void method869(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Leu;BLpj;)Z")
    public abstract boolean method861(class505 arg0, byte arg1, class157 arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLgn;)V")
    public abstract void method868(boolean arg0, class728 arg1);

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
    public abstract void method891(byte arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method881(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIII[III)Lwp;")
    public abstract class191 method890(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(Z)V")
    public abstract void method893(boolean arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIZILrt;)V")
    public abstract void method889(boolean arg0, int arg1, boolean arg2, int arg3, class239 arg4);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lrt;IIZ)V")
    public abstract void method844(class239 arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
    public abstract void method894(Canvas arg0, Object arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method875(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "(Z)V")
    public abstract void method906(boolean arg0);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)Lje;")
    public abstract class421 method899(int arg0, boolean arg1);

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
    public abstract void method872(byte arg0);

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "(B)V")
    public abstract void method876(byte arg0);

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "(B)V")
    public abstract void method849(byte arg0);

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "(I)V")
    public abstract void method878(int arg0);

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "(I)V")
    public abstract void method905(int arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljh;I)V")
    public abstract void method897(class169 arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "(Z)V")
    public abstract void method901(boolean arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZIIIILeu;[BI)Lwp;")
    public abstract class191 method847(boolean arg0, int arg1, int arg2, int arg3, int arg4, class505 arg5, byte[] arg6, int arg7);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)Lsfa;")
    public abstract class723 method850(boolean arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "(I)V")
    public abstract void method870(int arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([[IIZI)Lrr;")
    public abstract class380 method904(int[][] arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "(Z)V")
    public abstract void method857(boolean arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILsfa;Z)V")
    public abstract void method856(int arg0, class723 arg1, boolean arg2);

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public abstract void method902(int arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILje;IILdea;IB)V")
    public abstract void method877(int arg0, class421 arg1, int arg2, int arg3, class259 arg4, int arg5, byte arg6);

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)V")
    public abstract void method898(byte arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Laia;B)Lgn;")
    public abstract class728 method873(class240[] arg0, byte arg1);

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "(I)V")
    public abstract void method858(int arg0);

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(Z)V")
    public abstract void method882(boolean arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method884(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILeu;ILpj;I)Lwp;")
    public abstract class191 method866(int arg0, class505 arg1, int arg2, class157 arg3, int arg4);

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(II)V")
    public abstract void method843(int arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "(B)V")
    public abstract void method895(byte arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lpj;Leu;I)Z")
    public abstract boolean method855(class157 arg0, class505 arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "(I)V")
    public abstract void method883(int arg0);

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "(B)V")
    public abstract void method845(byte arg0);

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)V")
    public abstract void method903(byte arg0);

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "(I)V")
    public abstract void method852(int arg0);

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "(B)V")
    public abstract void method887(byte arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZII[FLeu;III)Lwp;")
    public abstract class191 method842(boolean arg0, int arg1, int arg2, float[] arg3, class505 arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLdea;II)V")
    public abstract void method892(byte arg0, class259 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "(I)V")
    public abstract void method888(int arg0);

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "(B)F")
    public abstract float method885(byte arg0);

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "(B)V")
    public abstract void method865(byte arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[BIILeu;)Loea;")
    public abstract class623 method867(int arg0, int arg1, byte[] arg2, int arg3, int arg4, class505 arg5);

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2500(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 113);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2501(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
