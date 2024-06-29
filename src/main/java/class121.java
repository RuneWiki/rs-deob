import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class121 extends class271 {
   @OriginalMember(
      owner = "client!nd",
      name = "w",
      descriptor = "F"
   )
   private float field1720;
   @OriginalMember(
      owner = "client!nd",
      name = "Z",
      descriptor = "F"
   )
   private float field1737;
   @OriginalMember(
      owner = "client!nd",
      name = "X",
      descriptor = "Lsn;"
   )
   private class675 field1707;
   @OriginalMember(
      owner = "client!nd",
      name = "C",
      descriptor = "I"
   )
   private int field1715;
   @OriginalMember(
      owner = "client!nd",
      name = "F",
      descriptor = "Lmu;"
   )
   public class258 field1730;
   @OriginalMember(
      owner = "client!nd",
      name = "ab",
      descriptor = "[[[I"
   )
   private int[][][] field1736;
   @OriginalMember(
      owner = "client!nd",
      name = "O",
      descriptor = "[[F"
   )
   private float[][] field1749;
   @OriginalMember(
      owner = "client!nd",
      name = "B",
      descriptor = "[[[I"
   )
   public int[][][] field1714;
   @OriginalMember(
      owner = "client!nd",
      name = "V",
      descriptor = "[[S"
   )
   public short[][] field1718;
   @OriginalMember(
      owner = "client!nd",
      name = "M",
      descriptor = "[[B"
   )
   private byte[][] field1710;
   @OriginalMember(
      owner = "client!nd",
      name = "L",
      descriptor = "I"
   )
   public int field1727;
   @OriginalMember(
      owner = "client!nd",
      name = "E",
      descriptor = "[[[Lwd;"
   )
   private class84[][][] field1733;
   @OriginalMember(
      owner = "client!nd",
      name = "N",
      descriptor = "[[F"
   )
   private float[][] field1742;
   @OriginalMember(
      owner = "client!nd",
      name = "H",
      descriptor = "[[[I"
   )
   private int[][][] field1729;
   @OriginalMember(
      owner = "client!nd",
      name = "I",
      descriptor = "[[B"
   )
   private byte[][] field1747;
   @OriginalMember(
      owner = "client!nd",
      name = "db",
      descriptor = "I"
   )
   private int field1716;
   @OriginalMember(
      owner = "client!nd",
      name = "Q",
      descriptor = "[[[I"
   )
   public int[][][] field1709;
   @OriginalMember(
      owner = "client!nd",
      name = "cb",
      descriptor = "[[F"
   )
   private float[][] field1743;
   @OriginalMember(
      owner = "client!nd",
      name = "eb",
      descriptor = "[[[I"
   )
   public int[][][] field1726;
   @OriginalMember(
      owner = "client!nd",
      name = "t",
      descriptor = "Let;"
   )
   private class389 field1741;
   @OriginalMember(
      owner = "client!nd",
      name = "gb",
      descriptor = "Lcc;"
   )
   private class585 field1739;
   @OriginalMember(
      owner = "client!nd",
      name = "hb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1752 = new String[]{method1137(method1136("\u001a1y2")), method1137(method1136("\u000fj;p\u0018")), method1137(method1136("\u001a ;)\u0004\\")), method1137(method1136("2%|2\u0000\u0010da1E\u0011*t<\t\u0011dw2\n\u001b)")), method1137(method1136("\u0007'g?\b\u0016(p(\u0004\u0006'f")), method1137(method1136("9-{7\b\u001545,\u0000\u0007!a")), method1137(method1136("\u0007,z)\u0015\u0006+s7\t\u001d*rc")), method1137(method1136("\u0006!v*:\u0010!w+\u0002I")), method1137(method1136("\u00061{-\u0006\u0006-e*E")), method1137(method1136("6(z1\bT!{?\u0007\u0018!q")), method1137(method1136("\u0006!w+\f\u0018 e,\n\u0012-y;")), method1137(method1136("7%v6\u0000\u0007dg;\u0016\u00110")), method1137(method1136("\u0006!w+\f\u0018 ")), method1137(method1136("=*c?\t\u001d 5,\u0000\u00170J:\u0000\u00161r~\u0013\u0015(`;")), method1137(method1136("\u0007!g(\u0000\u0006.fk\u0001\u0006+e")), method1137(method1136("\u0017(|;\u000b\u0000.fk\u0001\u0006+e")), method1137(method1136("\u0003)'~\u0016\u0001'v;\u0000\u0010!q")), method1137(method1136("\u00177':\u0000\u00161rd")), method1137(method1136("2\u0014F~\n\u001a")), method1137(method1136("\u0004'")), method1137(method1136("\u001b6a6\nT0|2\u0000T7|$\u0000I")), method1137(method1136(" +r9\t\u0011 4")), method1137(method1136("\u0001*y1\u0004\u0010*t*\f\u0002!f")), method1137(method1136("\u001c!t.")), method1137(method1136("\u0019!xc")), method1137(method1136("T>/")), method1137(method1136("1*a;\u0017\u0011 5*\u000eG")), method1137(method1136("\u0013!a=\t\u001d!{*\u0013\u00156e")), method1137(method1136("\u0006!f;\u0011\u0019-{7\b\u00154")), method1137(method1136("\u0010-f.\t\u0015=s.\u0016")), method1137(method1136("2%|2\u0000\u0010da1E\u0011*a;\u0017T0~k")), method1137(method1136("7%{0\n\u0000db,\f\u0000!5*\nT")), method1137(method1136("\u0018+b")), method1137(method1136(";lfw_T")), method1137(method1136("'\u0017P~\u0011\u001b+y5\f\u0000~5~")), method1137(method1136("8+z5_T")), method1137(method1136("\u001b6a6\n\u000e+z3E")), method1137(method1136("\u0017(f")), method1137(method1136("0wQ~\u0011\u001b+y5\f\u0000~5~")), method1137(method1136("\u00124f~")), method1137(method1136("\u001b6a6\n\u000e+z3X")), method1137(method1136("\u001b7")), method1137(method1136("\u0007,|8\u0011\u0017(|=\u000e")), method1137(method1136("\u0003)&~\u0003\u0015-y;\u0001")), method1137(method1136("\u00116g1\u0017\u0000!f*")), method1137(method1136("9&")), method1137(method1136("\u001c!y.")), method1137(method1136("\u0019'")), method1137(method1136("\u0003vq;\u0007\u0001#")), method1137(method1136("\u0017+y3\u0004\u0004d|-E\u0007,z)\u000b")), method1137(method1136("\u0017(f~HT\u0007y;\u0004\u0006dv1\u000b\u0007+y;")), method1137(method1136("\u00197")), method1137(method1136("\u00177e,\n\u0012-y;\n\u00010e+\u0011\u0000")), method1137(method1136("\"!{:\n\u0006~5")), method1137(method1136("\u0007+`0\u0001\u00070g;\u0004\u0019'z+\u000b\u0000")), method1137(method1136("\u0010-g;\u0006\u0000(z9\f\u001a")), method1137(method1136("\u00177e,\n\u0012-y;\u0006\u0018!t,")), method1137(method1136(";'v2\u0016\u001d+{~\u000b\u001b351\u000bU")), method1137(method1136("',|8\u0011Y'y7\u0006\u001fdq7\u0016\u0015&y;\u0001Z")), method1137(method1136("6(z1\bT |-\u0004\u0016(p:")), method1137(method1136("&+a?\u0011\u0011 5=\n\u001a*p=\u0011\u001d+{~\b\u00110}1\u0001\u0007")), method1137(method1136("\u00151a1\u0016\u00110`.")), method1137(method1136("\u0005%J1\u0015+0p-\u0011I")), method1137(method1136("2+g=\u0000\u0010da)\u0000\u0011*|0\u0002T\u0001[\u001f'8\u0001Q\u007f")), method1137(method1136("\u0007/l:\u0000\u0000%|2E")), method1137(method1136("$!g8\n\u0006)t0\u0006\u0011~5")), method1137(method1136("\u000e+z3E")), method1137(method1136("\u0016(z1\b")), method1137(method1136("\u001a+{.\u0006\u0007")), method1137(method1136("'={*\u0004\f~51\u0017\u0000,z~Y\u001az")), method1137(method1136("\u0004!g8\n\u0006)t0\u0006\u00110p-\u0011")), method1137(method1136("71g,\u0000\u001a05*\n\u001b(~7\u0011T z;\u0016\u001aca~\u0016\u00014e1\u0017\u0000dx+\t\u0000-e2\u0000T'z,\u0000\u0007")), method1137(method1136("\u0017+x3\u0004\u001a f~HT\u0010}7\u0016T'z3\b\u0015*q")), method1137(method1136("\u0017(|;\u000b\u0000 g1\u0015")), method1137(method1136("\u0013!a=\t\u001d!{*\u0013\u00156e<\f\u0000")), method1137(method1136("&!w+\f\u0018 |0\u0002T)t.")), method1137(method1136("\u0017(|.\u0006\u001b)e1\u000b\u0011*a-X")), method1137(method1136("2%|2\u0000\u0010da1E\u0011*a;\u0017T0~m")), method1137(method1136("\u0007=f*\u0000\u0019)p3")), method1137(method1136("\u0000/&")), method1137(method1136(":%x;_T")), method1137(method1136("\u00073|*\u0006\u001c!q")), method1137(method1136("\u001c-r6")), method1137(method1136("\u0007/l:\u0000\u0000%|2E\u001d75")), method1137(method1136("7+x.\t\u00110ppE +z2\u000e\u001d050\n\u0003~5")), method1137(method1136("\u001c!t.EYdE,\f\u001a054\u0004\u0002%53\u0000\u0019+g'E\u001d*s1\u0017\u0019%a7\n\u001a")), method1137(method1136("\u0002%g.\u0007\u001d0(")), method1137(method1136("2%|2\u0000\u0010da1E\u0017,t0\u0002\u0011dz,\u0011\u001c+53\n\u0010!")), method1137(method1136("\u00151a1\u0012\u001b6y:")), method1137(method1136("\u001a+{.\u0006\u0007y")), method1137(method1136("'1v=\u0000\u00077s+\t\u0018=5=\r\u0015*r;\u0001T+g*\r\u001bdx1\u0001\u0011")), method1137(method1136("\u0000/ ")), method1137(method1136("\u0003)$~\u0003\u0015-y;\u0001")), method1137(method1136("\u0003~5")), method1137(method1136("\u001b6a6\n\u0017%x2\n\u0017/")), method1137(method1136("\u0006!f;\u0011\u0017%v6\u0000")), method1137(method1136("\u0000!m-\f\u000e!")), method1137(method1136("\u0006!{:\u0000\u0006!g~HT\u0014g7\u000b\u0000dr,\u0004\u0004,|=\u0016T6p0\u0001\u00116p,E\u001d*s1\u0017\u0019%a7\n\u001a")), method1137(method1136("2%|2\u0000\u0010da1E\u0011*a;\u0017T0~o")), method1137(method1136("9\u0006")), method1137(method1136("\u0007*y1\u0002\u001d*5")), method1137(method1136("0+{;")), method1137(method1136("2\u0014FdE")), method1137(method1136("0!c7\u0006\u0011~5")), method1137(method1136("\u0006!{:\u0000\u00064g1\u0003\u001d(p")), method1137(method1136("06z.\u0015\u0011 5=\t\u001d!{*E\u0017+{0\u0000\u00170|1\u000b")), method1137(method1136("[0x.J\u001c!t.K\u00101x.")), method1137(method1136("\u001b'v2\u0010\u0010!")), method1137(method1136("=lxw_T")), method1137(method1136("=*c?\t\u001d 5<\u0010\u001d(q?\u0017\u0011%5(\u0004\u00181p")), method1137(method1136("\u001a ;\u0011M")), method1137(method1136("1*a;\u0017\u0011 5*\u000eF")), method1137(method1136("1*a;\u0017\u0011 5*\u000eD")), method1137(method1136("\u0017+x3\u0004\u001a f")), method1137(method1136("\u0017(p?\u0017\u0000!m*")), method1137(method1136("\u0006!{:\u0000\u0006!g")), method1137(method1136("3\b5*\n\u001b(~7\u0011Nd5~")), method1137(method1136("2%|2\u0000\u0010da1E\u0006!t:E\u0012-y;")), method1137(method1136("\u00124f1\u0003\u0012")), method1137(method1136("\u001c!t.\u0001\u0001)e")), method1137(method1136("\u0006!v*:\u0010!w+\u0002")), method1137(method1136("1*a;\u0017\u0011 5*\u000eE")), method1137(method1136(" !m*E\u0017+z,\u0001\u0007dv2\u0000\u00156p:")), method1137(method1136("66p?\u000e\u001d*r~\u000b\u001135=\n\u001a*p=\u0011\u001d+{-E\u0012+g~PT7p=\n\u001a f")), method1137(method1136("',|8\u0011Y'y7\u0006\u001fdP\u0010$6\bP\u001aD")), method1137(method1136("\u00166p?\u000e\u0017+{")), method1137(method1136("\u0013!a=\u0002\u0017+z,\u0001")), method1137(method1136("\"!gdE")), method1137(method1136("\u001b6a6\nT")), method1137(method1136("\u00003p;\u000b")), method1137(method1136("\u001b6a6\nT't3\u0000\u0006%52\n\u0017/57\u0016T")), method1137(method1136("<!t._T")), method1137(method1136("\u0004!g3E\u0002%g=\u0016T7t(\u0000\u0010")), method1137(method1136("\u001c-q;\u0006\u001b(x?\u0015")), method1137(method1136("5'a7\u0013\u0011df*\u0017\u0011%x-_T")), method1137(method1136("\u001b6a6\n\u0000-y;\u0016\u001d>p~")), method1137(method1136("1*a;\u0017\u0011 5*\u000eA")), method1137(method1136("\u0006+a?\u0011\u0011'z0\u000b\u0011'a3\u0000\u0000,z:\u0016")), method1137(method1136("\f~")), method1137(method1136("\u0000/%")), method1137(method1136("\u0013!a=\u0004\u0019!g?\u0015\u001b7")), method1137(method1136("\u0013!a)\n\u0006(q")), method1137(method1136("2\u0014F~\n\u0012\"")), method1137(method1136("&!w+\f\u0018 |0\u0002T)t.E\\3|*\rT4g1\u0003\u001d(|0\u0002]")), method1137(method1136("\u0017(|.\u0006\u001b)e1\u000b\u0011*a-")), method1137(method1136(";'v2\u0016\u001d+{~\u000b\u001b351\u0003\u0012e")), method1137(method1136("\u0007!a<\u0004")), method1137(method1136("\u0000/$")), method1137(method1136("\u0017%v6\u0000\u00074t=\u0000")), method1137(method1136("\u0003)&")), method1137(method1136("\u0019%m<\u0010\u001d(q?\u0017\u0011%(")), method1137(method1136("$+fdE")), method1137(method1136("\u00124f1\u000b")), method1137(method1136("9!x1\u0017\rdw;\u0003\u001b6p~\u0006\u0018!t0\u0010\u0004y")), method1137(method1136("\u00177':\u0000\u00161rdE\\")), method1137(method1136("Z(z9")), method1137(method1136("\u0017+x.\u0004\u00170")), method1137(method1136("\u0012-y;E\u0015(g;\u0004\u0010=5;\u001d\u001d7a-D")), method1137(method1136("\u0013!a6\u0000\u001d#}*")), method1137(method1136("06z.\u0015\u0011 5=\t\u001d!{*E\u001e7 ~\u000b\u001105/\u0010\u00111p")), method1137(method1136("2%|2\u0000\u0010da1E\u0011*a;\u0017T0~n")), method1137(method1136("8-w,\u0004\u0006=5+\u000b\u0018+t:\f\u001a#58\u0004\u001d(p:D")), method1137(method1136("9!x1\u0017\rdt8\u0011\u001165=\t\u0011%{+\u0015I")), method1137(method1136("\u0010-f.\t\u0015=s.\u0016Ti5\n\n\u0013#y;E2\u0014F~\u0004\u001a 51\u0011\u001c!g~\f\u001a\"z,\b\u00150|1\u000b")), method1137(method1136("06|(\u0000\u0006dC;\u0017\u0007-z0_T")), method1137(method1136("2+g=\u0000\u0010da)\u0000\u0011*|0\u0002T |-\u0004\u0016(p:K")), method1137(method1136("\u00124f~\u0001\u0011&`9E\u0011*t<\t\u0011 ")), method1137(method1136("7~I\n\u0000\u00194I6\u0000\u00154;:\u0010\u00194")), method1137(method1136("\u001b\"s")), method1137(method1136("\u0013'")), method1137(method1136("=lfw_T")), method1137(method1136("T\fp7\u0002\u001c0/~")), method1137(method1136("3\bM~\u0011\u001b+y5\f\u0000~5~")), method1137(method1136("\u00046z8\f\u0018!v.\u0010")), method1137(method1136("\u00116g1\u0017\u0019!f-\u0004\u0013!")), method1137(method1136("&!{:\u0000\u0006dv1\u0017\u0011750\n\u0003~5")), method1137(method1136("\u00073|*\u0006\u001c3z,\t\u0010")), method1137(method1136("\u0017(z-\u0000\u001b1a.\u0010\u0000")), method1137(method1136("06z.\u0015\u0011 5-\u0000\u00062p,E\u001e7 ~\u000b\u001105/\u0010\u00111p")), method1137(method1136("\u0004!g3E\u0002%g=\u0016T7v,\u0004\u0019&y;\u0001")), method1137(method1136("8-w,\u0004\u0006-p-E\u0001*y1\u0004\u0010!q")), method1137(method1136("\u001a%a7\u0013\u0011lX\u000e7")), method1137(method1136("\u0007%c;\u0013\u00156v-")), method1137(method1136("\u00177e,\n\u0012-y;\n\u00010e+\u0011\u0017")), method1137(method1136("<!|9\r\u0000~5")), method1137(method1136("\u001b*")), method1137(method1136("\u0003)$")), method1137(method1136("\u00177':\u0000\u00161r")), method1137(method1136("\u0005%J1\u0015+0p-\u0011")), method1137(method1136("\u0003-{")), method1137(method1136("\u00124f~\u0001\u0011&`9E\u0010-f?\u0007\u0018!q")), method1137(method1136("\u0002%g.X")), method1137(method1136("2%|2\u0000\u0010da1E\u0011*a;\u0017T0~l")), method1137(method1136(">%c?E\u0000+z2\u000e\u001d0/~")), method1137(method1136("56v6_T")), method1137(method1136("\u0011*t<\t\u0011dz,\u0011\u001c+53\n\u0010!58\f\u00067a~M\u00017p~B\u001b6a6\nTx{`B]")), method1137(method1136("\"!g-\f\u001b*/~")), method1137(method1136("\u0003)'~\u0003\u0015-y;\u0001")), method1137(method1136("\u0003)$~\u0016\u0001'v;\u0000\u0010!q")), method1137(method1136("\u00064")), method1137(method1136(":+5-\u0010\u0017,58\f\u0018!")), method1137(method1136("\u0000/'")), method1137(method1136("\u0007!a1\u0010\u00004`*E")), method1137(method1136("\u0003)'")), method1137(method1136("'=f*\u0000\u0019dx;\b\u001b6ldE")), method1137(method1136("\u0007,z)\u0006\u001b(x?\u0015")), method1137(method1136("\u00151a1E\u0003+g2\u0001T7p2\u0000\u00170p:")), method1137(method1136("\u00046|0\u0011\u00124f")), method1137(method1136("7+`2\u0001T*z*E\u00176p?\u0011\u0011d")), method1137(method1136("\u001a%a7\u0013\u0011)p3\u0000\u00066z,")), method1137(method1136("\u0003)&~\u0016\u0001'v;\u0000\u0010!q")), method1137(method1136("\u0017+y3\u0004\u0004d|-E\u001c-q:\u0000\u001a")), method1137(method1136("\u0010*")), method1137(method1136("\u001a ;\u0017M")), method1137(method1136("\u001a ;\u001aM")), method1137(method1136("\u001a ;\u0016M")), method1137(method1136("\u001a ;\u0012M")), method1137(method1136("\u001a ;\u000eM")), method1137(method1136("\u001a ;\u001fM")), method1137(method1136("\u001a ;5\u0004\\")), method1137(method1136("\u001a ;\u000bM")), method1137(method1136("\u001a ;b\f\u001a-a`M")), method1137(method1136("\u001a ;\u0007$\\")), method1137(method1136("\u001a ;\u0015M")), method1137(method1136("\u001a ;8\u0004\\")), method1137(method1136("\u001a ;\u001cM")), method1137(method1136("\u001a ;\u0010M")), method1137(method1136("\u001a ;\fM")), method1137(method1136("\u001a ;\u001d$\\"))};
   @OriginalMember(
      owner = "client!nd",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1731 = new String[100];
   @OriginalMember(
      owner = "client!nd",
      name = "Y",
      descriptor = "I"
   )
   public static int field1704;
   @OriginalMember(
      owner = "client!nd",
      name = "A",
      descriptor = "I"
   )
   private int field1705;
   @OriginalMember(
      owner = "client!nd",
      name = "T",
      descriptor = "I"
   )
   public static int field1706;
   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "I"
   )
   public static int field1708;
   @OriginalMember(
      owner = "client!nd",
      name = "u",
      descriptor = "I"
   )
   public static int field1711;
   @OriginalMember(
      owner = "client!nd",
      name = "o",
      descriptor = "I"
   )
   public static int field1712;
   @OriginalMember(
      owner = "client!nd",
      name = "x",
      descriptor = "I"
   )
   public static int field1713;
   @OriginalMember(
      owner = "client!nd",
      name = "W",
      descriptor = "I"
   )
   public static int field1717;
   @OriginalMember(
      owner = "client!nd",
      name = "P",
      descriptor = "I"
   )
   public static int field1719;
   @OriginalMember(
      owner = "client!nd",
      name = "p",
      descriptor = "I"
   )
   public static int field1721;
   @OriginalMember(
      owner = "client!nd",
      name = "q",
      descriptor = "I"
   )
   public static int field1722;
   @OriginalMember(
      owner = "client!nd",
      name = "U",
      descriptor = "I"
   )
   private int field1723;
   @OriginalMember(
      owner = "client!nd",
      name = "fb",
      descriptor = "I"
   )
   public static int field1724;
   @OriginalMember(
      owner = "client!nd",
      name = "bb",
      descriptor = "I"
   )
   public static int field1725;
   @OriginalMember(
      owner = "client!nd",
      name = "J",
      descriptor = "I"
   )
   public static int field1728;
   @OriginalMember(
      owner = "client!nd",
      name = "n",
      descriptor = "I"
   )
   public static int field1734;
   @OriginalMember(
      owner = "client!nd",
      name = "l",
      descriptor = "I"
   )
   public static int field1735;
   @OriginalMember(
      owner = "client!nd",
      name = "m",
      descriptor = "I"
   )
   public static int field1738;
   @OriginalMember(
      owner = "client!nd",
      name = "G",
      descriptor = "I"
   )
   private int field1740;
   @OriginalMember(
      owner = "client!nd",
      name = "r",
      descriptor = "I"
   )
   private int field1745;
   @OriginalMember(
      owner = "client!nd",
      name = "R",
      descriptor = "Lvi;"
   )
   public class371 field1748;
   @OriginalMember(
      owner = "client!nd",
      name = "s",
      descriptor = "Lgfa;"
   )
   private class631 field1744;
   @OriginalMember(
      owner = "client!nd",
      name = "y",
      descriptor = "Lgfa;"
   )
   private class631 field1746;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!nd",
      name = "K",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1751;
   @OriginalMember(
      owner = "client!nd",
      name = "D",
      descriptor = "[Lwd;"
   )
   private class84[] field1750;
   @OriginalMember(
      owner = "client!nd",
      name = "v",
      descriptor = "[[[I"
   )
   private int[][][] field1732;

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public final boolean method1117(class273 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field1734;
         if (this.field1739 != null && arg0 != null) {
            int var7 = arg1 - (this.field1730.field4218 * arg2 >> 8) >> this.field1730.field4166;
            int var8 = -(this.field1730.field4145 * arg2 >> 8) + arg3 >> this.field1730.field4166;
            return this.field1739.method4372(arg0, var8, var7, (byte)124);
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1752[213] + (arg0 != null ? field1752[1] : field1752[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public final void method1118(int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean[][] param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public final void method1119(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      try {
         ++field1717;
         this.method1122(arg1, 0, arg2, arg0, arg4, arg5, -1, arg3);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1752[218] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1752[1] : field1752[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(ZLjava/lang/String;BZ)V"
   )
   public static final void method1120(boolean arg0, String arg1, byte arg2, boolean arg3) {
      boolean var4 = client.field1786;

      try {
         ++field1722;

         try {
            if (arg1.equalsIgnoreCase(field1752[113]) || arg1.equalsIgnoreCase(field1752[46])) {
               class120.method1111((byte)93, field1752[72]);
               class120.method1111((byte)93, field1752[50]);
               class120.method1111((byte)93, field1752[163]);
               class120.method1111((byte)93, field1752[97]);
               class120.method1111((byte)93, field1752[85]);
               return;
            }

            if (arg1.equalsIgnoreCase(field1752[37])) {
               class276.field4408 = 0;
               class701.field10451 = 0;
               return;
            }

            if (arg2 < 120) {
               field1731 = null;
            }

            if (arg1.equalsIgnoreCase(field1752[29])) {
               class636.field9187 = !class636.field9187;
               if (!class636.field9187) {
                  class120.method1111((byte)93, field1752[142]);
                  return;
               }

               class120.method1111((byte)93, field1752[18]);
               return;
            }

            if (arg1.equals(field1752[115])) {
               class266 var5 = class351.field5356.method653();
               class120.method1111((byte)93, field1752[53] + var5.field4347);
               class120.method1111((byte)93, field1752[80] + var5.field4345);
               class120.method1111((byte)93, field1752[196] + var5.field4341);
               class120.method1111((byte)93, field1752[103] + var5.field4343);
               class120.method1111((byte)93, field1752[164] + var5.field4346);
               return;
            }

            if (arg1.equals(field1752[23])) {
               class120.method1111((byte)93, field1752[131] + class480.field7293 + field1752[99]);
               return;
            }
         } catch (Exception var56) {
            class120.method1111((byte)93, class499.field7590.method3875(class493.field7455, 101));
            return;
         }

         if (class657.field9823 != class129.field1852 || class487.field7404 >= 2) {
            if (arg1.equalsIgnoreCase(field1752[44])) {
               throw new RuntimeException();
            }

            if (arg1.equals(field1752[209])) {
               throw new OutOfMemoryError(field1752[181]);
            }

            try {
               label809: {
                  if (arg1.equalsIgnoreCase(field1752[207])) {
                     class120.method1111((byte)93, field1752[102] + class14.field178);
                     return;
                  }

                  if (arg1.equalsIgnoreCase(field1752[107])) {
                     class439.field6716 = !class439.field6716;
                     if (!class439.field6716) {
                        class120.method1111((byte)93, field1752[145]);
                        return;
                     }

                     class120.method1111((byte)93, field1752[57]);
                     return;
                  }

                  if (arg1.equalsIgnoreCase(field1752[152])) {
                     class636.field9187 = true;
                     class120.method1111((byte)93, field1752[166]);
                     return;
                  }

                  if (arg1.equalsIgnoreCase(field1752[118])) {
                     class636.field9187 = false;
                     class120.method1111((byte)93, field1752[190]);
                     return;
                  }

                  if (arg1.equals(field1752[78])) {
                     try {
                        class120.method1111((byte)93, field1752[204] + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class610.field8885.field9141 + field1752[45]);
                        return;
                     } catch (Throwable var50) {
                        return;
                     }
                  }

                  if (arg1.equalsIgnoreCase(field1752[114])) {
                     class346.field5304.method1814((byte)125);
                     class120.method1111((byte)93, field1752[122]);
                     return;
                  }

                  if (!arg1.equalsIgnoreCase(field1752[169])) {
                     if (arg1.equalsIgnoreCase(field1752[156])) {
                        class176.method1613(0);
                        int var9 = 0;
                        if (var4) {
                           System.gc();
                           ++var9;
                        }

                        while(true) {
                           if (~var9 <= -11) {
                              Runtime var10 = Runtime.getRuntime();
                              int var11 = (int)((var10.totalMemory() - var10.freeMemory()) / 1024L);
                              class120.method1111((byte)93, field1752[153] + var11 + "k");
                              class37.method268((byte)28);
                              class176.method1613(0);
                              int var12 = 0;
                              if (!var4) {
                                 if (var4) {
                                    System.gc();
                                    ++var12;
                                 }

                                 while(true) {
                                    while(~var12 > -11) {
                                       System.gc();
                                       ++var12;
                                    }

                                    int var13 = (int)((var10.totalMemory() - var10.freeMemory()) / 1024L);
                                    class120.method1111((byte)93, field1752[162] + var13 + "k");
                                    if (!var4) {
                                       return;
                                    }

                                    ++var12;
                                 }
                              }
                           } else {
                              System.gc();
                           }

                           ++var9;
                        }
                     }

                     if (arg1.equalsIgnoreCase(field1752[22])) {
                        class120.method1111((byte)93, !class82.method796(-128) ? field1752[161] : field1752[180]);
                        return;
                     }

                     if (arg1.equalsIgnoreCase(field1752[73])) {
                        class120.method1111((byte)93, field1752[105]);
                        if (class342.field5204 == 11) {
                           class766.method5599((byte)-45);
                           return;
                        }

                        if (~class342.field5204 == -13) {
                           class510.field7801.field365 = true;
                        }

                        return;
                     }

                     if (arg1.equalsIgnoreCase(field1752[137])) {
                        class154.field2296.method4136(43594);
                        class120.method1111((byte)93, field1752[60]);
                        return;
                     }

                     if (arg1.equalsIgnoreCase(field1752[15])) {
                        class522.field7958.method1851((byte)-128);
                        class120.method1111((byte)93, field1752[159]);
                        return;
                     }

                     if (arg1.equalsIgnoreCase(field1752[14])) {
                        class522.field7958.method1846(false);
                        class120.method1111((byte)93, field1752[178]);
                        return;
                     }

                     if (!arg1.equalsIgnoreCase(field1752[125])) {
                        if (arg1.equalsIgnoreCase(field1752[12])) {
                           class686.method5059(3);
                           class140.method1284((byte)65);
                           class120.method1111((byte)93, field1752[75]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[10])) {
                           class588.field8677 = class162.method1442(14080);
                           class252.field3809 = true;
                           class686.method5059(3);
                           class140.method1284((byte)-52);
                           class120.method1111((byte)93, field1752[143]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[186])) {
                           class41.method294(-84, 1, -1, -1, false);
                           if (class187.method1682((byte)-30) != 1) {
                              class120.method1111((byte)93, field1752[92]);
                              return;
                           }

                           class120.method1111((byte)93, field1752[198]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[203])) {
                           class41.method294(-111, 2, -1, -1, false);
                           if (class187.method1682((byte)-30) != 2) {
                              class120.method1111((byte)93, field1752[197]);
                              return;
                           }

                           class120.method1111((byte)93, field1752[16]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[149])) {
                           class41.method294(-70, 3, 768, 1024, false);
                           if (~class187.method1682((byte)-30) == -4) {
                              class120.method1111((byte)93, field1752[210]);
                              return;
                           }

                           class120.method1111((byte)93, field1752[43]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[139])) {
                           class473.method3678(2744, 0, false);
                           if (class687.field10213.field507.method3440(480102311) == 0) {
                              class120.method1111((byte)93, field1752[112]);
                              class687.field10213.method299(-17, 0, class687.field10213.field494);
                              class388.method3135(0);
                              class11.field135 = false;
                              return;
                           }

                           class120.method1111((byte)93, field1752[160]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[147])) {
                           class473.method3678(2744, 1, false);
                           if (~class687.field10213.field507.method3440(480102311) != -2) {
                              class120.method1111((byte)93, field1752[98]);
                              return;
                           }

                           class120.method1111((byte)93, field1752[121]);
                           class687.field10213.method299(-17, 1, class687.field10213.field494);
                           class388.method3135(0);
                           class11.field135 = false;
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[201])) {
                           class473.method3678(2744, 2, false);
                           if (class687.field10213.field507.method3440(480102311) == 2) {
                              class120.method1111((byte)93, field1752[111]);
                              class687.field10213.method299(-17, 2, class687.field10213.field494);
                              class388.method3135(0);
                              class11.field135 = false;
                              return;
                           }

                           class120.method1111((byte)93, field1752[192]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[79])) {
                           class473.method3678(2744, 3, false);
                           if (class687.field10213.field507.method3440(480102311) == 3) {
                              class120.method1111((byte)93, field1752[26]);
                              class687.field10213.method299(-17, 3, class687.field10213.field494);
                              class388.method3135(0);
                              class11.field135 = false;
                              return;
                           }

                           class120.method1111((byte)93, field1752[77]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[91])) {
                           class473.method3678(2744, 5, false);
                           if (class687.field10213.field507.method3440(480102311) != 5) {
                              class120.method1111((byte)93, field1752[30]);
                              return;
                           }

                           class120.method1111((byte)93, field1752[136]);
                           class687.field10213.method299(-17, 5, class687.field10213.field494);
                           class388.method3135(0);
                           class11.field135 = false;
                           return;
                        }

                        if (arg1.startsWith(field1752[146])) {
                           if (arg1.length() < 6) {
                              class120.method1111((byte)93, field1752[109]);
                              return;
                           }

                           int var17 = class243.method2076(false, arg1.substring(6));
                           if (var17 >= 0 && class657.method4842(class480.field7293, 0) >= var17) {
                              class687.field10213.method299(-17, var17, class687.field10213.field527);
                              class388.method3135(0);
                              class11.field135 = false;
                              class120.method1111((byte)93, field1752[150] + class687.field10213.field527.method4483(480102311));
                              return;
                           }

                           class120.method1111((byte)93, field1752[109]);
                           return;
                        }

                        if (arg1.startsWith(field1752[120])) {
                           if (arg1.length() < 10) {
                              class120.method1111((byte)93, field1752[13]);
                              return;
                           }

                           class556.field8300 = class243.method2076(false, arg1.substring(10).trim());
                           class120.method1111((byte)93, field1752[7] + class556.field8300);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[188])) {
                           class351.field5351 = true;
                           class120.method1111((byte)93, field1752[62] + class351.field5351);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[144])) {
                           class294.field4657 = !class294.field4657;
                           class120.method1111((byte)93, field1752[76] + class294.field4657);
                           return;
                        }

                        if (arg1.startsWith(field1752[67])) {
                           boolean var18 = class351.field5356.method617();
                           if (!class206.method1797(!var18, (byte)112)) {
                              class120.method1111((byte)93, field1752[3]);
                              return;
                           }

                           if (var18) {
                              class120.method1111((byte)93, field1752[59]);
                              return;
                           }

                           class120.method1111((byte)93, field1752[9]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[129])) {
                           if (!class475.field7224) {
                              class475.field7224 = true;
                              class120.method1111((byte)93, field1752[63]);
                              return;
                           }

                           class475.field7224 = false;
                           class120.method1111((byte)93, field1752[165]);
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[42])) {
                           if (class127.field1823) {
                              class120.method1111((byte)93, field1752[58]);
                              class127.field1823 = false;
                              return;
                           }

                           class120.method1111((byte)93, field1752[124]);
                           class127.field1823 = true;
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[126])) {
                           class120.method1111((byte)93, field1752[138] + (class476.field7251.field1505 >> 9) + field1752[25] + (class476.field7251.field1494 >> 9));
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[158])) {
                           class120.method1111((byte)93, field1752[184] + class385.field6076[class476.field7251.field1506].method2313(-120, class476.field7251.field1505 >> 9, class476.field7251.field1494 >> 9));
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[28])) {
                           class316.field4879.method5005((byte)-63);
                           class316.field4879.method5027(-39);
                           class230.field3520.method4014(1);
                           class508.field7776.method135(-112);
                           class140.method1284((byte)-91);
                           class120.method1111((byte)93, field1752[5]);
                           return;
                        }

                        if (arg1.startsWith(field1752[47])) {
                           if (!class351.field5356.method587()) {
                              class120.method1111((byte)93, field1752[71]);
                              return;
                           }

                           int var19;
                           label613: {
                              var19 = Integer.parseInt(arg1.substring(3));
                              if (~var19 <= -2) {
                                 if (~var19 >= -5) {
                                    break label613;
                                 }

                                 var19 = 4;
                                 if (!var4) {
                                    break label613;
                                 }
                              }

                              var19 = 1;
                           }

                           class387.field6085 = var19;
                           class686.method5059(3);
                           class120.method1111((byte)93, field1752[175] + class387.field6085);
                           return;
                        }

                        if (arg1.startsWith(field1752[148])) {
                           class120.method1111((byte)93, field1752[170] + class603.field8813.method2547(1) + "/" + class603.field8813.method2546((byte)122));
                           class120.method1111((byte)93, field1752[108] + class630.field9118.method2547(1) + "/" + class630.field9118.method2546((byte)117));
                           class120.method1111((byte)93, field1752[33] + class247.field3763.field3666.method1734(19395) + "/" + class247.field3763.field3666.method1742(-116));
                           return;
                        }

                        if (arg1.equalsIgnoreCase(field1752[140])) {
                           class120.method1111((byte)93, field1752[151] + class476.field7251.field1506 + "," + ((class401.field6288 >> 9) + class120.field1694 >> 6) + "," + ((class691.field10259 >> 9) + class119.field1606 >> 6) + "," + ((class401.field6288 >> 9) - -class120.field1694 & 63) + "," + ((class691.field10259 >> 9) + class119.field1606 & 63) + field1752[171] + (class477.method3711(class476.field7251.field1506, class401.field6288, (byte)0, class691.field10259) + -class653.field9780));
                           class120.method1111((byte)93, field1752[35] + class476.field7251.field1506 + "," + (class459.field7004 + class120.field1694 >> 6) + "," + (class119.field1606 + class103.field1437 >> 6) + "," + (63 & class459.field7004 - -class120.field1694) + "," + (class119.field1606 + class103.field1437 & 63) + field1752[171] + (class477.method3711(class476.field7251.field1506, class459.field7004, (byte)0, class103.field1437) + -class400.field6271));
                           return;
                        }

                        if (!arg1.equals(field1752[104]) && !arg1.equals(field1752[199])) {
                           if (arg1.startsWith(field1752[70])) {
                              int var20 = -1;
                              int var21 = 1000;
                              if (arg1.length() > 15) {
                                 String[] var22 = class9.method53(arg1, ' ', (byte)-103);

                                 try {
                                    if (var22.length > 1) {
                                       var21 = Integer.parseInt(var22[1]);
                                    }
                                 } catch (Throwable var52) {
                                 }

                                 try {
                                    if (~var22.length < -3) {
                                       var20 = Integer.parseInt(var22[2]);
                                    }
                                 } catch (Throwable var51) {
                                 }
                              }

                              if (~var20 != 0) {
                                 class120.method1111((byte)93, field1752[65] + class693.method5099(var20, var21, -1867552852));
                                 return;
                              }

                              class120.method1111((byte)93, field1752[193] + class693.method5099(0, var21, -1867552852));
                              class120.method1111((byte)93, field1752[34] + class693.method5099(2, var21, -1867552852));
                              class120.method1111((byte)93, field1752[38] + class693.method5099(3, var21, -1867552852));
                              class120.method1111((byte)93, field1752[116] + class693.method5099(1, var21, -1867552852));
                              class120.method1111((byte)93, field1752[172] + class693.method5099(5, var21, -1867552852));
                              return;
                           }

                           if (arg1.equals(field1752[68])) {
                              class99.field1389 = !class99.field1389;
                              class120.method1111((byte)93, field1752[89] + class99.field1389);
                              return;
                           }

                           if (arg1.equals(field1752[88])) {
                              class544.method4152(75);
                              class120.method1111((byte)93, field1752[206]);
                              return;
                           }

                           if (arg1.startsWith(field1752[176])) {
                              int var23 = Integer.parseInt(arg1.substring(12));
                              class48.method340(class452.method3546(var23, false).field6661, var23, 0);
                              class120.method1111((byte)93, field1752[81]);
                              return;
                           }

                           if (arg1.equals(field1752[141])) {
                              class120.method1111((byte)93, field1752[93] + class154.field2296.field8150);
                              return;
                           }

                           if (arg1.startsWith(field1752[19])) {
                              class29 var24 = class578.method4332((byte)-32);
                              class577 var25 = class218.method1888(class360.field5562, 103, var24.field361);
                              var25.field8531.method2864(-26110, 0);
                              int var26 = var25.field8531.field5436;
                              int var27 = arg1.indexOf(" ", 4);
                              var25.field8531.method2862(arg1.substring(3, var27), true);
                              client.method1164(arg1.substring(var27), (byte)-128, var25.field8531);
                              var25.field8531.method2846(15160, -var26 + var25.field8531.field5436);
                              var24.method211(var25, 116);
                              return;
                           }

                           if (arg1.equals(field1752[182])) {
                              class536.method4116(-111);
                              class120.method1111((byte)93, field1752[132]);
                              return;
                           }

                           if (!arg1.equals(field1752[4])) {
                              if (arg1.equals(field1752[205])) {
                                 class734.field10944 = true;
                                 class140.method1284((byte)101);
                                 class120.method1111((byte)93, field1752[49]);
                                 return;
                              }

                              if (arg1.equals(field1752[133])) {
                                 class734.field10944 = false;
                                 class140.method1284((byte)86);
                                 class120.method1111((byte)93, field1752[211]);
                                 return;
                              }

                              if (arg1.equals(field1752[95])) {
                                 class600.method4442(-27112);
                                 class120.method1111((byte)93, field1752[11]);
                                 return;
                              }

                              if (arg1.equals(field1752[173])) {
                                 class120.method1111((byte)93, class247.method2103(false) + field1752[51]);
                                 return;
                              }

                              if (arg1.startsWith(field1752[74])) {
                                 int var29 = Integer.parseInt(arg1.substring(17));
                                 class120.method1111((byte)93, field1752[86] + class45.field599.method252(var29, true));
                                 return;
                              }

                              if (arg1.startsWith(field1752[27])) {
                                 int var30 = Integer.parseInt(arg1.substring(14));
                                 class120.method1111((byte)93, field1752[191] + class45.field599.method253(var30, (byte)-118));
                                 return;
                              }

                              if (arg1.startsWith(field1752[55])) {
                                 String[] var31 = class9.method53(arg1.substring(12), ' ', (byte)-103);
                                 if (~var31.length <= -3) {
                                    int var32 = var31.length <= 2 ? 0 : Integer.parseInt(var31[2]);
                                    class16.method124((byte)-35, var31[0], var31[1], var32);
                                    return;
                                 }
                              }

                              if (arg1.startsWith(field1752[100])) {
                                 String[] var33 = class9.method53(arg1.substring(8), ' ', (byte)-103);
                                 int var34 = Integer.parseInt(var33[0]);
                                 int var35 = var33.length == 2 ? Integer.parseInt(var33[1]) : 0;
                                 class524.method4045(6, var35, var34);
                                 return;
                              }

                              if (arg1.startsWith(field1752[56])) {
                                 class469.method3646();
                                 return;
                              }

                              if (arg1.startsWith(field1752[183])) {
                                 class469.method3642(100, false);
                                 return;
                              }

                              if (arg1.startsWith(field1752[52])) {
                                 class469.method3642(10, true);
                                 return;
                              }

                              if (arg1.startsWith(field1752[96])) {
                                 int var36 = Integer.parseInt(arg1.substring(8));
                                 class351.field5356.method694(var36);
                                 return;
                              }

                              if (arg1.equals(field1752[54])) {
                                 class120.method1111((byte)93, field1752[134] + class426.field6579.method4700());
                                 return;
                              }

                              if (arg1.equals(field1752[61])) {
                                 class395.method3184((byte)69);
                                 class120.method1111((byte)93, field1752[84] + class687.field10213.field507.method3440(480102311));
                                 return;
                              }

                              if (arg1.equals(field1752[174])) {
                                 class120.method1111((byte)93, class798.field11616.method1151(-17));
                                 return;
                              }

                              if (arg1.equals(field1752[119])) {
                                 label621: {
                                    if (class289.field4558.startsWith(field1752[189])) {
                                       class789.method5715(false, 105, new File(field1752[167]));
                                       if (!var4) {
                                          break label621;
                                       }
                                    }

                                    class789.method5715(false, 122, new File(field1752[106]));
                                 }

                                 class120.method1111((byte)93, field1752[101]);
                                 return;
                              }

                              if (arg1.equals(field1752[41])) {
                                 class120.method1111((byte)93, field1752[80] + class289.field4558);
                                 class120.method1111((byte)93, field1752[194] + class289.field4550);
                                 class120.method1111((byte)93, field1752[127] + class289.field4543);
                                 return;
                              }

                              if (arg1.startsWith(field1752[48])) {
                                 int var37 = Integer.parseInt(arg1.substring(8, 9));
                                 class400.field6283 = var37;
                                 class686.method5059(3);
                                 class120.method1111((byte)93, field1752[21]);
                                 return;
                              }

                              if (arg1.startsWith(field1752[128])) {
                                 int var38 = arg1.indexOf(32);
                                 if (~var38 > -1) {
                                    class120.method1111((byte)93, field1752[69]);
                                    return;
                                 }

                                 int var39 = class243.method2076(false, arg1.substring(var38 + 1));
                                 class687.field10213.method299(-17, var39, class687.field10213.field512);
                                 class388.method3135(0);
                                 class11.field135 = false;
                                 class510.method3966(-121);
                                 if (~var39 != ~class687.field10213.field512.method5524(480102311)) {
                                    class120.method1111((byte)93, field1752[87]);
                                    return;
                                 }

                                 class120.method1111((byte)93, field1752[90]);
                                 return;
                              }

                              if (arg1.startsWith(field1752[36])) {
                                 if (~class687.field10213.field512.method5524(480102311) == -1) {
                                    class120.method1111((byte)93, field1752[195]);
                                    return;
                                 }

                                 int var40 = class243.method2076(false, arg1.substring(arg1.indexOf(32) - -1));
                                 class591.field8708 = var40;
                                 class120.method1111((byte)93, field1752[40] + class591.field8708);
                                 return;
                              }

                              if (arg1.startsWith(field1752[135])) {
                                 int var41 = class243.method2076(false, arg1.substring(arg1.indexOf(32) - -1));
                                 class346.field5307 = var41;
                                 class314.field4860 = var41;
                                 class120.method1111((byte)93, field1752[20] + var41);
                                 class510.method3966(-78);
                                 return;
                              }

                              if (arg1.equals(field1752[94])) {
                                 class747.field11077 = !class747.field11077;
                                 class120.method1111((byte)93, field1752[130] + (!class747.field11077 ? field1752[168] : field1752[185]));
                                 return;
                              }

                              if (arg1.startsWith(field1752[64])) {
                                 int var42 = class243.method2076(false, arg1.substring(arg1.indexOf(32) - -1));
                                 class687.field10213.method299(-17, var42, class687.field10213.field515);
                                 class120.method1111((byte)93, field1752[83] + (class687.field10213.field515.method5379(480102311) == 0 ? field1752[32] : field1752[82]));
                                 return;
                              }

                              if (arg1.startsWith(field1752[202])) {
                                 File var43 = new File(arg1.substring(10));
                                 if (var43.exists()) {
                                    var43 = new File(arg1.substring(10) + "." + class162.method1442(14080) + field1752[155]);
                                    if (var43.exists()) {
                                       class120.method1111((byte)93, field1752[157]);
                                       return;
                                    }
                                 }

                                 if (class511.field7816 != null) {
                                    class511.field7816.close();
                                    class511.field7816 = null;
                                 }

                                 try {
                                    class511.field7816 = new FileOutputStream(var43);
                                    return;
                                 } catch (FileNotFoundException var53) {
                                    class120.method1111((byte)93, field1752[208] + var43.getName());
                                    return;
                                 } catch (SecurityException var54) {
                                    class120.method1111((byte)93, field1752[31] + var43.getName());
                                    return;
                                 }
                              }

                              if (arg1.equals(field1752[177])) {
                                 if (class511.field7816 != null) {
                                    class511.field7816.close();
                                 }

                                 class511.field7816 = null;
                                 return;
                              }

                              if (arg1.startsWith(field1752[8])) {
                                 File var44 = new File(arg1.substring(10));
                                 if (!var44.exists()) {
                                    class120.method1111((byte)93, field1752[200]);
                                    return;
                                 }

                                 byte[] var45 = class397.method3204(var44, (byte)99);
                                 if (var45 == null) {
                                    class120.method1111((byte)93, field1752[117]);
                                    return;
                                 }

                                 String[] var46 = class9.method53(class115.method1070("", class736.method5413(16, var45), (byte)18, '\r'), '\n', (byte)-103);
                                 class569.method4279(5, var46);
                              }

                              if (arg1.startsWith(field1752[66])) {
                                 short var47 = (short)class243.method2076(false, arg1.substring(5));
                                 if (var47 > 0) {
                                    class512.field7822 = var47;
                                 }

                                 return;
                              }

                              if (arg1.startsWith(field1752[187])) {
                                 if (~arg1.length() < -10 && ~arg1.charAt(8) == -33) {
                                    class469.field7148 = arg1.substring(9);
                                    class469.field7149 = true;
                                    class120.method1111((byte)93, field1752[154] + class469.field7148 + ")");
                                    return;
                                 }

                                 class469.field7148 = null;
                                 class469.field7149 = !class469.field7149;
                                 class120.method1111((byte)93, field1752[17] + class469.field7149);
                                 return;
                              }

                              if (class342.field5204 == 11) {
                                 ++class223.field3382;
                                 class577 var48 = class218.method1888(class256.field3870, 113, class510.field7801.field361);
                                 var48.field8531.method2864(-26110, arg1.length() - -3);
                                 var48.field8531.method2864(-26110, arg0 ? 1 : 0);
                                 var48.field8531.method2864(-26110, arg3 ? 1 : 0);
                                 var48.field8531.method2862(arg1, true);
                                 class510.field7801.method211(var48, 117);
                              }

                              if (arg1.startsWith(field1752[39]) && class657.field9823 != class129.field1852) {
                                 class675.method4976(class243.method2076(false, arg1.substring(4)), (byte)124);
                                 return;
                              }
                              break label809;
                           }

                           int var28 = 0;
                           if (var4) {
                              if (class486.field7390[var28]) {
                                 class84.field1222[var28] = (int)(Math.random() * 99999.0D);
                                 if (Math.random() > 0.5D) {
                                    class84.field1222[var28] *= -1;
                                 }
                              }

                              ++var28;
                           }

                           while(true) {
                              while(class84.field1222.length > var28) {
                                 if (class486.field7390[var28]) {
                                    class84.field1222[var28] = (int)(Math.random() * 99999.0D);
                                    if (Math.random() > 0.5D) {
                                       class84.field1222[var28] *= -1;
                                    }
                                 }

                                 ++var28;
                              }

                              class536.method4116(-75);
                              class120.method1111((byte)93, field1752[179]);
                              if (!var4) {
                                 return;
                              }

                              ++var28;
                           }
                        }

                        class162.field2422 = !class162.field2422;
                        class351.field5356.method632(class162.field2422);
                        class455.method3560((byte)73);
                        class120.method1111((byte)93, field1752[6] + class162.field2422);
                        return;
                     }

                     class498.field7578.method2429((byte)93);
                     class29[] var14 = class510.field7803;
                     int var15 = 0;
                     class29 var16;
                     if (var4) {
                        var16 = var14[var15];
                        if (var16.field355 != null) {
                           var16.field355.method1581(-1238);
                        }

                        ++var15;
                     }

                     while(~var15 > ~var14.length) {
                        var16 = var14[var15];
                        if (var16.field355 != null) {
                           var16.field355.method1581(-1238);
                        }

                        ++var15;
                     }

                     class522.field7958.method1855(-15434);
                     class120.method1111((byte)93, field1752[123]);
                     return;
                  }

                  class176.method1613(0);
                  int var6 = 0;
                  if (var4) {
                     System.gc();
                     ++var6;
                  }

                  while(true) {
                     while(~var6 > -11) {
                        System.gc();
                        ++var6;
                     }

                     Runtime var7 = Runtime.getRuntime();
                     int var8 = (int)((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                     class120.method1111((byte)93, field1752[24] + var8 + "k");
                     if (!var4) {
                        return;
                     }

                     ++var6;
                  }
               }
            } catch (Exception var55) {
               class120.method1111((byte)93, class499.field7590.method3875(class493.field7455, 112));
               return;
            }
         }

         if (class342.field5204 != 11) {
            class120.method1111((byte)93, class499.field7591.method3875(class493.field7455, 98) + arg1);
         }
      } catch (RuntimeException var57) {
         throw class482.method3757(var57, field1752[110] + arg0 + ',' + (arg1 != null ? field1752[1] : field1752[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1121(int arg0, int arg1) {
      try {
         ++field1724;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1752[225] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(IIIIZII[[Z)V"
   )
   private final void method1122(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean[][] arg7) {
      boolean var9 = client.field1786;

      try {
         if (arg1 != 0) {
            this.field1736 = null;
         }

         ++field1704;
         if (this.field1750 != null) {
            int var10 = arg2 + 1 + arg2;
            int var11 = var10 * var10;
            if (~var11 < ~class569.field8421.length) {
               class569.field8421 = new int[var11];
            }

            int var12 = -arg2 + arg3;
            int var13 = var12;
            if (var12 < 0) {
               var12 = 0;
            }

            int var14 = arg0 - arg2;
            int var15 = var14;
            if (~var14 > -1) {
               var14 = 0;
            }

            int var16 = arg2 + arg3;
            if (~(super.field4383 - 1) > ~var16) {
               var16 = super.field4383 + -1;
            }

            int var17 = arg0 + arg2;
            class364.field5625 = 0;
            if (super.field4379 - 1 < var17) {
               var17 = super.field4379 + -1;
            }

            int var18 = var12;
            if (var9 || var16 >= var12) {
               do {
                  boolean[] var19 = arg7[-var13 + var18];
                  int var20 = var14;
                  if (var9) {
                     if (var19[var14 - var15]) {
                        class569.field8421[class364.field5625++] = super.field4383 * var14 - -var18;
                     }

                     var20 = var14 + 1;
                  }

                  while(true) {
                     while(var17 >= var20) {
                        if (var19[var20 - var15]) {
                           class569.field8421[class364.field5625++] = super.field4383 * var20 - -var18;
                        }

                        ++var20;
                     }

                     if (!var9) {
                        ++var18;
                        break;
                     }

                     ++var20;
                  }
               } while(var16 >= var18);
            }

            label97: {
               if (arg6 != -1) {
                  this.field1730.method2178((float)arg6, 8);
                  this.field1730.method2251((byte)80);
                  if (!var9) {
                     break label97;
                  }
               }

               this.field1730.method2189((byte)-122);
            }

            this.field1730.method2205(true);
            this.field1730.method2234((this.field1727 & 7) != 0, arg1 + 14);
            this.field1730.method2191(0, -1, false, false);
            this.field1730.method1507(this.field1744, 0, (byte)15);
            int var21 = 0;
            if (var9) {
               this.field1750[var21].method820(858993459, class569.field8421, class364.field5625);
               ++var21;
            }

            while(true) {
               class121 var10000;
               if (var21 >= this.field1750.length) {
                  class504 var22 = this.field1730.method2225(1);
                  var22.method1542(0, -1, 0);
                  this.field1730.method2222(50);
                  var10000 = this;
                  if (!var9) {
                     if (!this.field1707.method4978(15590)) {
                        int var23 = this.field1730.field4219;
                        int var24 = this.field1730.field4169;
                        this.field1730.method627(0, var24, this.field1730.field4143);
                        this.field1730.method2234(false, 14);
                        this.field1730.method2219(false, -100);
                        this.field1730.method2244(128, (byte)117);
                        this.field1730.method2191(0, -2, false, false);
                        this.field1730.method2193(this.field1730.field4153, (byte)-19);
                        this.field1730.method2212((byte)119, class716.field10733, class453.field6943);
                        this.field1730.method2185((byte)-118, 0, class700.field10441);
                        this.field1730.method2221(0, (byte)51, class53.field655);
                        class294 var25 = this.field1707.method4972((byte)-84);
                        class85 var26;
                        if (var9) {
                           var26 = (class85)var25;
                           var26.method829(arg7, arg3, arg2, arg0, -97);
                           var25 = this.field1707.method4975((byte)125);
                        }

                        while(true) {
                           if (var25 == null) {
                              this.field1730.method2185((byte)-92, 0, class751.field11122);
                              this.field1730.method2221(0, (byte)51, class751.field11122);
                              this.field1730.method2193((class428)null, (byte)-19);
                              this.field1730.method627(var23, var24, this.field1730.field4143);
                              break;
                           }

                           var26 = (class85)var25;
                           var26.method829(arg7, arg3, arg2, arg0, -97);
                           var25 = this.field1707.method4975((byte)125);
                        }
                     }

                     if (this.field1739 != null) {
                        this.field1730.method1507(this.field1744, 0, (byte)15);
                        this.field1730.method1507(this.field1746, 1, (byte)15);
                        this.field1730.method1502(this.field1748, 124);
                        this.field1739.method4375(arg2, arg3, arg4, arg0, arg7, -4223);
                        return;
                     }
                     break;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field1750[var21].method820(858993459, class569.field8421, class364.field5625);
               ++var21;
            }
         }

      } catch (RuntimeException var28) {
         throw class482.method3757(var28, field1752[226] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field1752[1] : field1752[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method1123(class273 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field1708;
         if (this.field1739 != null && arg0 != null) {
            int var7 = -(this.field1730.field4218 * arg2 >> 8) + arg1 >> this.field1730.field4166;
            int var8 = arg3 - (this.field1730.field4145 * arg2 >> 8) >> this.field1730.field4166;
            this.field1739.method4377(var8, var7, (byte)-47, arg0);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1752[2] + (arg0 != null ? field1752[1] : field1752[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1124(int arg0) {
      try {
         field1731 = null;
         if (arg0 != -1) {
            method1124(19);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1752[217] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "YA",
      descriptor = "()V"
   )
   public final void method1125() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nd",
      name = "ka",
      descriptor = "(III)V"
   )
   public final void method1126(int arg0, int arg1, int arg2) {
      try {
         ++field1713;
         if (arg2 > (255 & this.field1747[arg0][arg1])) {
            this.field1747[arg0][arg1] = (byte)arg2;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1752[219] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method1127(int param1, int param2, int[] param3, int[] param4, int[] param5, int[] param6, int[] param7, int[] param8, int[] param9, int[] param10, int param11, int param12, int param13, boolean param14) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nd",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public final class273 method1128(int arg0, int arg1, class273 arg2) {
      try {
         ++field1738;
         if ((1 & this.field1710[arg0][arg1]) == 0) {
            return null;
         } else {
            int var4;
            class516 var6;
            label38: {
               var4 = super.field4377 >> this.field1730.field4166;
               class516 var5 = (class516)arg2;
               if (var5 == null || !var5.method3992(var4, (byte)98, var4)) {
                  var6 = new class516(this.field1730, var4, var4);
                  if (!client.field1786) {
                     break label38;
                  }
               }

               var6 = var5;
               var5.method3990((byte)103);
            }

            var6.method3993(0, 0, var4, 0, var4);
            this.method1134(arg0, arg1, true, var6);
            return var6;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1752[224] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1752[1] : field1752[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(Llja;[I)V"
   )
   public final void method1129(class404 arg0, int[] arg1) {
      try {
         this.field1707.method4980(new class85(this.field1730, this, arg0, arg1), 0);
         ++field1711;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1752[215] + (arg0 != null ? field1752[1] : field1752[0]) + ',' + (arg1 != null ? field1752[1] : field1752[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public final void method1130(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      try {
         ++field1721;
         this.method1122(arg1, 0, arg2, arg0, arg4, arg6, arg5, arg3);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field1752[223] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1752[1] : field1752[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method1131(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      boolean var18 = client.field1786;

      try {
         ++field1735;
         int var19 = arg9.length;
         int[] var20 = new int[var19 * 3];
         int[] var21 = new int[var19 * 3];
         int[] var22 = new int[var19 * 3];
         int[] var23 = new int[var19 * 3];
         int[] var24 = new int[var19 * 3];
         int[] var25 = new int[var19 * 3];
         int[] var26 = arg3 != null ? new int[var19 * 3] : null;
         int[] var27 = arg5 != null ? new int[var19 * 3] : null;
         int var28 = 0;
         int var29 = 0;
         if (!var18 && var19 <= var29) {
            this.method1127(arg0, arg1, var20, var26, var21, var27, var22, var23, var24, var25, arg13, arg14, arg15, arg16);
         } else {
            do {
               int var30 = arg6[var29];
               int var31 = arg7[var29];
               int var32 = arg8[var29];
               var20[var28] = arg2[var30];
               var21[var28] = arg4[var30];
               var22[var28] = arg9[var29];
               var24[var28] = arg11[var29];
               var25[var28] = arg12[var29];
               var23[var28] = arg10 == null ? arg9[var29] : arg10[var29];
               if (arg3 != null) {
                  var26[var28] = arg3[var30];
               }

               if (arg5 != null) {
                  var27[var28] = arg5[var30];
               }

               ++var28;
               var20[var28] = arg2[var31];
               var21[var28] = arg4[var31];
               var22[var28] = arg9[var29];
               var24[var28] = arg11[var29];
               var25[var28] = arg12[var29];
               var23[var28] = arg10 == null ? arg9[var29] : arg10[var29];
               if (arg3 != null) {
                  var26[var28] = arg3[var31];
               }

               if (arg5 != null) {
                  var27[var28] = arg5[var31];
               }

               ++var28;
               var20[var28] = arg2[var32];
               var21[var28] = arg4[var32];
               var22[var28] = arg9[var29];
               var24[var28] = arg11[var29];
               var25[var28] = arg12[var29];
               var23[var28] = arg10 != null ? arg10[var29] : arg9[var29];
               if (arg3 != null) {
                  var26[var28] = arg3[var32];
               }

               if (arg5 != null) {
                  var27[var28] = arg5[var32];
               }

               ++var28;
               ++var29;
            } while(var19 > var29);

            this.method1127(arg0, arg1, var20, var26, var21, var27, var22, var23, var24, var25, arg13, arg14, arg15, arg16);
         }
      } catch (RuntimeException var34) {
         throw class482.method3757(var34, field1752[214] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1752[1] : field1752[0]) + ',' + (arg3 != null ? field1752[1] : field1752[0]) + ',' + (arg4 != null ? field1752[1] : field1752[0]) + ',' + (arg5 != null ? field1752[1] : field1752[0]) + ',' + (arg6 != null ? field1752[1] : field1752[0]) + ',' + (arg7 != null ? field1752[1] : field1752[0]) + ',' + (arg8 != null ? field1752[1] : field1752[0]) + ',' + (arg9 != null ? field1752[1] : field1752[0]) + ',' + (arg10 != null ? field1752[1] : field1752[0]) + ',' + (arg11 != null ? field1752[1] : field1752[0]) + ',' + (arg12 != null ? field1752[1] : field1752[0]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "()V"
   )
   public static final void method1132() {
      for(int var0 = 0; var0 < class213.field3240; ++var0) {
         if (!class701.field10454[var0]) {
            class330 var1 = class88.field1276[var0];
            class404 var2 = var1.field5003;
            int var3 = var1.field5008;
            int var4 = var2.method3249((byte)110) - class42.field564;
            int var5 = (var4 * 2 >> class394.field6180) + 1;
            int var6 = 0;
            int[] var7 = new int[var5 * var5];
            int var8 = var2.method3246((byte)-127) - var4 >> class394.field6180;
            int var9 = var2.method3247((byte)-110) - var4 >> class394.field6180;
            int var10 = var2.method3247((byte)-121) + var4 >> class394.field6180;
            if (var9 < 0) {
               var6 -= var9;
               var9 = 0;
            }

            if (var10 >= class365.field5634) {
               var10 = class365.field5634 - 1;
            }

            for(int var11 = var9; var11 <= var10; ++var11) {
               short var12 = var1.field4997[var6];
               int var13 = var12 >>> 8;
               int var14 = var5 * var6 + var13;
               int var15 = (var12 >>> 8) + var8;
               int var16 = (var12 & 255) + var15 - 1;
               if (var15 < 0) {
                  var14 -= var15;
                  var15 = 0;
               }

               if (var16 >= class247.field3734) {
                  var16 = class247.field3734 - 1;
               }

               for(int var17 = var15; var17 <= var16; ++var17) {
                  byte var18 = 1;
                  class78 var19 = class288.method2404(var3, var17, var11, field1751 != null ? field1751 : (field1751 = method1135(field1752[212])));
                  if (var19 != null && var19.field1046 != 0) {
                     if (var19.field1046 == 1) {
                        boolean var20 = var17 - 1 >= var15;
                        boolean var21 = var17 + 1 <= var16;
                        if (!var20 && var11 + 1 <= var10) {
                           short var22 = var1.field4997[var6 + 1];
                           int var23 = (var22 >>> 8) + var8;
                           int var24 = (var22 & 255) + var23;
                           var20 = var17 > var23 && var17 < var24;
                        }

                        if (!var21 && var11 - 1 >= var9) {
                           short var25 = var1.field4997[var6 - 1];
                           int var26 = (var25 >>> 8) + var8;
                           int var27 = (var25 & 255) + var26;
                           var21 = var17 > var26 && var17 < var27;
                        }

                        if (var20 && !var21) {
                           var18 = 4;
                        } else if (var21 && !var20) {
                           var18 = 2;
                        }
                     } else {
                        boolean var28 = var17 - 1 >= var15;
                        boolean var29 = var17 + 1 <= var16;
                        if (!var28 && var11 - 1 >= var9) {
                           short var30 = var1.field4997[var6 - 1];
                           int var31 = (var30 >>> 8) + var8;
                           int var32 = (var30 & 255) + var31;
                           var28 = var17 > var31 && var17 < var32;
                        }

                        if (!var29 && var11 + 1 <= var10) {
                           short var33 = var1.field4997[var6 + 1];
                           int var34 = (var33 >>> 8) + var8;
                           int var35 = (var33 & 255) + var34;
                           var29 = var17 > var34 && var17 < var35;
                        }

                        if (var28 && !var29) {
                           var18 = 3;
                        } else if (var29 && !var28) {
                           var18 = 5;
                        }
                     }
                  }

                  var7[var14++] = var18;
               }

               ++var6;
            }

            class701.field10454[var0] = true;
            class385.field6076[var3].method1129(var2, var7);
         }
      }

   }

   @OriginalMember(
      owner = "client!nd",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method1133(class273 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field1728;
         if (this.field1739 != null && arg0 != null) {
            int var7 = -(this.field1730.field4218 * arg2 >> 8) + arg1 >> this.field1730.field4166;
            int var8 = arg3 - (this.field1730.field4145 * arg2 >> 8) >> this.field1730.field4166;
            this.field1739.method4371(arg0, (byte)82, var8, var7);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1752[228] + (arg0 != null ? field1752[1] : field1752[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "<init>",
      descriptor = "(Lmu;IIII[[I[[II)V"
   )
   public class121(class258 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      boolean var9 = client.field1786;
      super(arg3, arg4, arg7, arg5);
      this.field1720 = -3.4028235E38F;
      this.field1737 = Float.MAX_VALUE;
      this.field1707 = new class675();

      try {
         this.field1715 = super.field4375 + -2;
         this.field1730 = arg0;
         this.field1736 = new int[arg3][arg4][];
         this.field1749 = new float[super.field4383 + 1][super.field4379 + 1];
         this.field1714 = new int[arg3][arg4][];
         this.field1718 = new short[arg3 * arg4][];
         this.field1710 = new byte[arg3][arg4];
         this.field1727 = arg2;
         this.field1733 = new class84[arg3][arg4][];
         this.field1742 = new float[super.field4383 - -1][super.field4379 + 1];
         this.field1729 = new int[arg3][arg4][];
         this.field1747 = new byte[arg3 - -1][arg4 - -1];
         this.field1716 = 1 << this.field1715;
         this.field1709 = new int[arg3][arg4][];
         this.field1743 = new float[super.field4383 + 1][super.field4379 + 1];
         this.field1726 = new int[arg3][arg4][];
         int var10 = 0;
         int var10000;
         if (var9) {
            var10000 = 0;
         } else if (~var10 < ~super.field4379) {
            --this.field1737;
            ++this.field1720;
            this.field1741 = new class389(128);
            var10000 = ~(16 & this.field1727);
            if (!var9) {
               if (var10000 != -1) {
                  this.field1739 = new class585(this.field1730, this);
                  return;
               }

               return;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            int var11 = var10000;
            if (var9 || ~super.field4383 <= ~var11) {
               do {
                  int var12 = super.field4373[var11][var10];
                  if ((float)var12 < this.field1737) {
                     this.field1737 = (float)var12;
                  }

                  if ((float)var12 > this.field1720) {
                     this.field1720 = (float)var12;
                  }

                  if (~var11 < -1 && var10 > 0 && ~super.field4383 < ~var11 && ~super.field4379 < ~var10) {
                     int var13 = arg6[var11 + 1][var10] + -arg6[var11 + -1][var10];
                     int var14 = arg6[var11][var10 - -1] + -arg6[var11][var10 - 1];
                     float var15 = (float)(1.0D / Math.sqrt((double)(var13 * var13 + arg7 * 4 * arg7 + var14 * var14)));
                     this.field1749[var11][var10] = (float)var13 * var15;
                     this.field1742[var11][var10] = (float)(-arg7 * 2) * var15;
                     this.field1743[var11][var10] = (float)var14 * var15;
                  }

                  ++var11;
               } while(~super.field4383 <= ~var11);
            }

            ++var10;
            if (~var10 < ~super.field4379) {
               --this.field1737;
               ++this.field1720;
               this.field1741 = new class389(128);
               var10000 = ~(16 & this.field1727);
               if (!var9) {
                  if (var10000 != -1) {
                     this.field1739 = new class585(this.field1730, this);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = 0;
            }
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field1752[221] + (arg0 != null ? field1752[1] : field1752[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1752[1] : field1752[0]) + ',' + (arg6 != null ? field1752[1] : field1752[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(IIZLii;)V"
   )
   private final void method1134(int arg0, int arg1, boolean arg2, class516 arg3) {
      boolean var5 = client.field1786;

      try {
         ++field1706;
         if (!arg2) {
            this.field1747 = null;
         }

         int[] var6 = this.field1726[arg0][arg1];
         int[] var7 = this.field1709[arg0][arg1];
         int var8 = var6.length;
         if (~var8 < ~class336.field5157.length) {
            class147.field2220 = new int[var8];
            class336.field5157 = new int[var8];
         }

         int var9 = 0;
         if (var5) {
            class336.field5157[var9] = var6[var9] >> this.field1730.field4166;
            class147.field2220[var9] = var7[var9] >> this.field1730.field4166;
            ++var9;
         }

         while(true) {
            while(var8 > var9) {
               class336.field5157[var9] = var6[var9] >> this.field1730.field4166;
               class147.field2220[var9] = var7[var9] >> this.field1730.field4166;
               ++var9;
            }

            int var10 = 0;
            if (!var5) {
               if (!var5 && var10 >= var8) {
                  return;
               } else {
                  do {
                     int var11 = class336.field5157[var10];
                     int var12 = class147.field2220[var10++];
                     int var13 = class336.field5157[var10];
                     int var14 = class147.field2220[var10++];
                     int var15 = class336.field5157[var10];
                     int var16 = class147.field2220[var10++];

                     while(~((-var13 + var11) * (-var16 + var14) - (var15 - var13) * (-var12 + var14)) < -1) {
                        if (!var5) {
                           arg3.method3991(-1811582416, var11, var14, var16, var13, var12, var15);
                           break;
                        }
                     }
                  } while(var10 < var8);

                  return;
               }
            }

            ++var9;
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field1752[227] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1752[1] : field1752[0]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!nd",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1135(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1136(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1137(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
