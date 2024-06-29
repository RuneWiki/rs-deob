import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class124 extends class357 {
   @OriginalMember(
      owner = "client!bba",
      name = "Mi",
      descriptor = "Liw;"
   )
   private class332 field2062;
   @OriginalMember(
      owner = "client!bba",
      name = "si",
      descriptor = "Liw;"
   )
   private class332 field2066;
   @OriginalMember(
      owner = "client!bba",
      name = "ah",
      descriptor = "Liw;"
   )
   private class332 field2067;
   @OriginalMember(
      owner = "client!bba",
      name = "Sh",
      descriptor = "Liw;"
   )
   private class332 field2068;
   @OriginalMember(
      owner = "client!bba",
      name = "Ji",
      descriptor = "Liw;"
   )
   private class332 field2069;
   @OriginalMember(
      owner = "client!bba",
      name = "Bi",
      descriptor = "Liw;"
   )
   private class332 field2070;
   @OriginalMember(
      owner = "client!bba",
      name = "Fi",
      descriptor = "Liw;"
   )
   private class332 field2071;
   @OriginalMember(
      owner = "client!bba",
      name = "fi",
      descriptor = "[Lvo;"
   )
   private class46[] field2073;
   @OriginalMember(
      owner = "client!bba",
      name = "ih",
      descriptor = "Ljaggl/MapBuffer;"
   )
   public MapBuffer field2072;
   @OriginalMember(
      owner = "client!bba",
      name = "Ci",
      descriptor = "Ljaggl/MapBuffer;"
   )
   public MapBuffer field2081;
   @OriginalMember(
      owner = "client!bba",
      name = "oi",
      descriptor = "I"
   )
   private int field2093;
   @OriginalMember(
      owner = "client!bba",
      name = "hi",
      descriptor = "Ljaggl/OpenGL;"
   )
   private OpenGL field1995;
   @OriginalMember(
      owner = "client!bba",
      name = "Ug",
      descriptor = "Ljava/lang/String;"
   )
   private String field2086;
   @OriginalMember(
      owner = "client!bba",
      name = "Oh",
      descriptor = "Ljava/lang/String;"
   )
   private String field2092;
   @OriginalMember(
      owner = "client!bba",
      name = "Ph",
      descriptor = "I"
   )
   private int field2085;
   @OriginalMember(
      owner = "client!bba",
      name = "bi",
      descriptor = "Z"
   )
   public boolean field2090;
   @OriginalMember(
      owner = "client!bba",
      name = "mi",
      descriptor = "Z"
   )
   private boolean field2082;
   @OriginalMember(
      owner = "client!bba",
      name = "fh",
      descriptor = "Z"
   )
   private boolean field2087;
   @OriginalMember(
      owner = "client!bba",
      name = "hh",
      descriptor = "Z"
   )
   public boolean field2091;
   @OriginalMember(
      owner = "client!bba",
      name = "Eh",
      descriptor = "Z"
   )
   public boolean field2088;
   @OriginalMember(
      owner = "client!bba",
      name = "Vh",
      descriptor = "Z"
   )
   public boolean field2084;
   @OriginalMember(
      owner = "client!bba",
      name = "Vi",
      descriptor = "[I"
   )
   public int[] field2083;
   @OriginalMember(
      owner = "client!bba",
      name = "Og",
      descriptor = "I"
   )
   public int field2089;
   @OriginalMember(
      owner = "client!bba",
      name = "Xi",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2094 = new String[]{method1214(method1213("6!tR*|")), method1214(method1213("6!tR\u0002\u0016k")), method1214(method1213("6!tR\u0003\u0016k")), method1214(method1213("6!tR\u001d\u001dk")), method1214(method1213("6!tR\u0006\u001ck")), method1214(method1213("/m;R5")), method1214(method1213(":6y\u0010")), method1214(method1213("6!tR\u0000\u0010k")), method1214(method1213("6!tR\u001c\u001ck")), method1214(method1213("6!tR\n\u001ck")), method1214(method1213("6!tR\u000e|")), method1214(method1213("6!tR\u001b\u0010k")), method1214(method1213("6!tR\r\u001dk")), method1214(method1213("6!tR\u0005\u0013k")), method1214(method1213("6!tR\u001b\u0011k")), method1214(method1213("6!tR\u000f\u0015k")), method1214(method1213("6!tR\u001b|")), method1214(method1213("=-a\u0019$")), method1214(method1213("\u001b3p\u0012\u000f\u0018")), method1214(method1213("57|")), method1214(method1213(":5|\u0018!5")), method1214(method1213("6!tR\u001c\u0012k")), method1214(method1213("6!tR\u001b\u001dk")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001ca\u00190 6g\u0019\u00171-c#+;.w\u0015&1")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001ca\u00190 6g\u0019\u0017&&v\b):$y\u0019")), method1214(method1213("6!tRt=-|\bv|")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001cc\u0019: &m#*!%s\u0019:\u000b,w\u0016-77")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001cs\u000e)3.p\u0012<\u000b0}\u001d,11")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001cx\t$ *a\u00190 6g\u0019")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001cx\t$ *f\u001d%$/p")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001ca\u00190 6g\u0019\u0017:,{#8;4p\u000e\u0017;%J\b?;")), method1214(method1213("9*v\u000e'',s\b")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001cs\u000e)3.p\u0012<\u000b3g\u0013/&\"x")), method1214(method1213("\u0013\u000fJ9\u0010\u0000\u001ca\u00190 6g\u0019{\u0010")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001c}\u001d$2\u001cs\u0010'57J\f!,&y")), method1214(method1213("<'")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001cc\u0019: &m#8&,r\u000e)9")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001ca\u00190 6g\u0019\u001776w\u0019\u00179\"e")), method1214(method1213("&\"q\u0019':")), method1214(method1213("\u0013\u000fJ=\u001a\u0016\u001cc\u0019: &m#;<\"q\u0019:")), method1214(method1213("9&f\u001d")), method1214(method1213("61|\u001d&t3t\t$")), method1214(method1213("6!tR\u001e\u001dk")), method1214(method1213("6!tR\u0000\u0017k")), method1214(method1213("6!tR\u000b\u0017k")), method1214(method1213("6!tR\u001f\u0015k")), method1214(method1213("6!tR\u0004\u0016k")), method1214(method1213("6!tR\r\u001ek")), method1214(method1213("6!tR\u0019\u0012k")), method1214(method1213("6!tR\r\u001ck")), method1214(method1213("6!tR\u0018\u0011k")), method1214(method1213("6!tR\u000b\u001dk")), method1214(method1213("6!tR\u0004\u0012k")), method1214(method1213("6!tR\u0006\u0011k")), method1214(method1213("6!tR\u0018\u0010k")), method1214(method1213("6!tR\u000e\u001ek")), method1214(method1213("6!tR\u001e|")), method1214(method1213("6!tR\u0000\u0012k")), method1214(method1213("6!tR\u0001|")), method1214(method1213("6!tR\u0006|")), method1214(method1213("6!tR&5k")), method1214(method1213("6!tR\u0003\u0012k")), method1214(method1213("6!tR\f\u0016k")), method1214(method1213("6!tR\u001e\u0013k")), method1214(method1213("6!tR\u001c\u001dk")), method1214(method1213("6!tR\u0005\u001ck")), method1214(method1213("6!tR\u001f\u001dk")), method1214(method1213("6!tR\u0004\u0010k")), method1214(method1213("6!tR\u0018\u0016k")), method1214(method1213("6!tR\u0000\u0011k")), method1214(method1213("6!tR\u0002\u001dk")), method1214(method1213("6!tR\u0019\u0016k")), method1214(method1213("6!tR\n\u0017k")), method1214(method1213("6!tR15k")), method1214(method1213("6!tR\f\u0011k")), method1214(method1213("6!tR\t\u001ek")), method1214(method1213("6!tR\u0005\u0015k")), method1214(method1213("6!tR\u000b\u0013k")), method1214(method1213("6!tR\u0007\u0016k")), method1214(method1213("6!tR\u000e\u0015k")), method1214(method1213("6!tR\u0005\u0016k")), method1214(method1213("6!tR\u001f|")), method1214(method1213("6!tR\t\u0011k")), method1214(method1213("6!tR\u0004\u0017k")), method1214(method1213("6!tR\u000f\u001ck")), method1214(method1213("6!tR\u0002\u0012k")), method1214(method1213("6!tR\u000b\u001ek")), method1214(method1213("6!tR\n\u001ek")), method1214(method1213("6!tR\r\u0016k")), method1214(method1213("6!tR\u001b\u0013k")), method1214(method1213("6!tR\u000e\u0010k")), method1214(method1213("6!tR\u0007|")), method1214(method1213("6!tR\u0003\u001ck")), method1214(method1213("6!tR\u000e\u0013k")), method1214(method1213("6!tR\u0002\u0013k")), method1214(method1213("6!tR\u0005\u0010k")), method1214(method1213("6!tR\t\u001ck")), method1214(method1213("6!tR\f\u0017k")), method1214(method1213("6!tR\u0019\u001dk")), method1214(method1213("6!tR\u001a\u001ck")), method1214(method1213("6!tR\u0003\u001dk")), method1214(method1213("6!tR\f\u001dk")), method1214(method1213("6!tR\u000b\u0010k")), method1214(method1213("6!tR\u001d\u0010k")), method1214(method1213("6!tR\u0007\u0011k")), method1214(method1213("6!tR\u001e\u0012k")), method1214(method1213("6!tR\u0018\u0013k")), method1214(method1213("6!tR\u0006\u0012k")), method1214(method1213("6!tR\u0007\u0015k")), method1214(method1213("6!tR\u0002\u001ck")), method1214(method1213("6!tR\t\u0012k")), method1214(method1213("6!tR\n\u0012k")), method1214(method1213("6!tR\u0004\u0011k"))};
   @OriginalMember(
      owner = "client!bba",
      name = "Si",
      descriptor = "Lpg;"
   )
   public static class762 field2023 = new class762(method1214(method1213("\u0003\u0017G?")), method1214(method1213(";%s\u0015+1")), method1214(method1213("\u000b1v")), 1);
   @OriginalMember(
      owner = "client!bba",
      name = "Ig",
      descriptor = "I"
   )
   public static int field2049 = 0;
   @OriginalMember(
      owner = "client!bba",
      name = "ch",
      descriptor = "I"
   )
   public static int field1973;
   @OriginalMember(
      owner = "client!bba",
      name = "Gg",
      descriptor = "I"
   )
   public static int field1974;
   @OriginalMember(
      owner = "client!bba",
      name = "uh",
      descriptor = "I"
   )
   public static int field1975;
   @OriginalMember(
      owner = "client!bba",
      name = "xi",
      descriptor = "I"
   )
   public static int field1976;
   @OriginalMember(
      owner = "client!bba",
      name = "ji",
      descriptor = "I"
   )
   public static int field1977;
   @OriginalMember(
      owner = "client!bba",
      name = "Mh",
      descriptor = "I"
   )
   public static int field1978;
   @OriginalMember(
      owner = "client!bba",
      name = "kh",
      descriptor = "I"
   )
   public static int field1979;
   @OriginalMember(
      owner = "client!bba",
      name = "Rg",
      descriptor = "I"
   )
   public static int field1980;
   @OriginalMember(
      owner = "client!bba",
      name = "Vg",
      descriptor = "I"
   )
   public static int field1981;
   @OriginalMember(
      owner = "client!bba",
      name = "Th",
      descriptor = "I"
   )
   public static int field1982;
   @OriginalMember(
      owner = "client!bba",
      name = "Li",
      descriptor = "I"
   )
   public static int field1983;
   @OriginalMember(
      owner = "client!bba",
      name = "mh",
      descriptor = "I"
   )
   public static int field1984;
   @OriginalMember(
      owner = "client!bba",
      name = "Ii",
      descriptor = "I"
   )
   public static int field1985;
   @OriginalMember(
      owner = "client!bba",
      name = "sh",
      descriptor = "I"
   )
   public static int field1986;
   @OriginalMember(
      owner = "client!bba",
      name = "Ti",
      descriptor = "I"
   )
   public static int field1987;
   @OriginalMember(
      owner = "client!bba",
      name = "Ni",
      descriptor = "I"
   )
   public static int field1988;
   @OriginalMember(
      owner = "client!bba",
      name = "yh",
      descriptor = "I"
   )
   public static int field1989;
   @OriginalMember(
      owner = "client!bba",
      name = "Bh",
      descriptor = "I"
   )
   public static int field1990;
   @OriginalMember(
      owner = "client!bba",
      name = "li",
      descriptor = "I"
   )
   public static int field1991;
   @OriginalMember(
      owner = "client!bba",
      name = "Kg",
      descriptor = "I"
   )
   public static int field1992;
   @OriginalMember(
      owner = "client!bba",
      name = "Qi",
      descriptor = "I"
   )
   public static int field1993;
   @OriginalMember(
      owner = "client!bba",
      name = "Hg",
      descriptor = "I"
   )
   public static int field1994;
   @OriginalMember(
      owner = "client!bba",
      name = "rh",
      descriptor = "I"
   )
   public static int field1996;
   @OriginalMember(
      owner = "client!bba",
      name = "lh",
      descriptor = "I"
   )
   public static int field1997;
   @OriginalMember(
      owner = "client!bba",
      name = "ti",
      descriptor = "I"
   )
   public static int field1998;
   @OriginalMember(
      owner = "client!bba",
      name = "Pg",
      descriptor = "I"
   )
   public static int field1999;
   @OriginalMember(
      owner = "client!bba",
      name = "Zh",
      descriptor = "I"
   )
   public static int field2000;
   @OriginalMember(
      owner = "client!bba",
      name = "Gh",
      descriptor = "I"
   )
   public static int field2001;
   @OriginalMember(
      owner = "client!bba",
      name = "Ui",
      descriptor = "I"
   )
   public static int field2002;
   @OriginalMember(
      owner = "client!bba",
      name = "ki",
      descriptor = "I"
   )
   public static int field2003;
   @OriginalMember(
      owner = "client!bba",
      name = "Lh",
      descriptor = "I"
   )
   public static int field2004;
   @OriginalMember(
      owner = "client!bba",
      name = "Fh",
      descriptor = "I"
   )
   public static int field2005;
   @OriginalMember(
      owner = "client!bba",
      name = "ei",
      descriptor = "I"
   )
   public static int field2006;
   @OriginalMember(
      owner = "client!bba",
      name = "Xg",
      descriptor = "I"
   )
   public static int field2007;
   @OriginalMember(
      owner = "client!bba",
      name = "Hi",
      descriptor = "I"
   )
   public static int field2008;
   @OriginalMember(
      owner = "client!bba",
      name = "Rh",
      descriptor = "I"
   )
   public static int field2009;
   @OriginalMember(
      owner = "client!bba",
      name = "xh",
      descriptor = "I"
   )
   public static int field2010;
   @OriginalMember(
      owner = "client!bba",
      name = "Ri",
      descriptor = "I"
   )
   public static int field2011;
   @OriginalMember(
      owner = "client!bba",
      name = "gi",
      descriptor = "I"
   )
   public static int field2012;
   @OriginalMember(
      owner = "client!bba",
      name = "dh",
      descriptor = "I"
   )
   public static int field2013;
   @OriginalMember(
      owner = "client!bba",
      name = "ri",
      descriptor = "I"
   )
   public static int field2014;
   @OriginalMember(
      owner = "client!bba",
      name = "ii",
      descriptor = "I"
   )
   public static int field2015;
   @OriginalMember(
      owner = "client!bba",
      name = "Wg",
      descriptor = "I"
   )
   public static int field2016;
   @OriginalMember(
      owner = "client!bba",
      name = "Ai",
      descriptor = "I"
   )
   public static int field2017;
   @OriginalMember(
      owner = "client!bba",
      name = "Uh",
      descriptor = "I"
   )
   public static int field2018;
   @OriginalMember(
      owner = "client!bba",
      name = "Yg",
      descriptor = "I"
   )
   public static int field2019;
   @OriginalMember(
      owner = "client!bba",
      name = "ci",
      descriptor = "I"
   )
   public static int field2020;
   @OriginalMember(
      owner = "client!bba",
      name = "Nh",
      descriptor = "I"
   )
   public static int field2021;
   @OriginalMember(
      owner = "client!bba",
      name = "oh",
      descriptor = "I"
   )
   public static int field2022;
   @OriginalMember(
      owner = "client!bba",
      name = "Ch",
      descriptor = "I"
   )
   public static int field2024;
   @OriginalMember(
      owner = "client!bba",
      name = "wh",
      descriptor = "I"
   )
   public static int field2025;
   @OriginalMember(
      owner = "client!bba",
      name = "Xh",
      descriptor = "I"
   )
   public static int field2026;
   @OriginalMember(
      owner = "client!bba",
      name = "Jg",
      descriptor = "I"
   )
   public static int field2027;
   @OriginalMember(
      owner = "client!bba",
      name = "Ng",
      descriptor = "I"
   )
   public static int field2028;
   @OriginalMember(
      owner = "client!bba",
      name = "vh",
      descriptor = "I"
   )
   public static int field2029;
   @OriginalMember(
      owner = "client!bba",
      name = "Di",
      descriptor = "I"
   )
   public static int field2030;
   @OriginalMember(
      owner = "client!bba",
      name = "pi",
      descriptor = "I"
   )
   public static int field2031;
   @OriginalMember(
      owner = "client!bba",
      name = "Yh",
      descriptor = "I"
   )
   public static int field2032;
   @OriginalMember(
      owner = "client!bba",
      name = "th",
      descriptor = "I"
   )
   public static int field2033;
   @OriginalMember(
      owner = "client!bba",
      name = "Ki",
      descriptor = "I"
   )
   public static int field2034;
   @OriginalMember(
      owner = "client!bba",
      name = "Zg",
      descriptor = "I"
   )
   public static int field2035;
   @OriginalMember(
      owner = "client!bba",
      name = "Ah",
      descriptor = "I"
   )
   public static int field2036;
   @OriginalMember(
      owner = "client!bba",
      name = "Qg",
      descriptor = "I"
   )
   public static int field2037;
   @OriginalMember(
      owner = "client!bba",
      name = "vi",
      descriptor = "I"
   )
   public static int field2038;
   @OriginalMember(
      owner = "client!bba",
      name = "bh",
      descriptor = "I"
   )
   public static int field2039;
   @OriginalMember(
      owner = "client!bba",
      name = "yi",
      descriptor = "I"
   )
   public static int field2040;
   @OriginalMember(
      owner = "client!bba",
      name = "Hh",
      descriptor = "I"
   )
   public static int field2041;
   @OriginalMember(
      owner = "client!bba",
      name = "Jh",
      descriptor = "I"
   )
   public static int field2042;
   @OriginalMember(
      owner = "client!bba",
      name = "ui",
      descriptor = "I"
   )
   public static int field2043;
   @OriginalMember(
      owner = "client!bba",
      name = "Oi",
      descriptor = "I"
   )
   public static int field2044;
   @OriginalMember(
      owner = "client!bba",
      name = "Kh",
      descriptor = "I"
   )
   public static int field2045;
   @OriginalMember(
      owner = "client!bba",
      name = "zh",
      descriptor = "I"
   )
   public static int field2046;
   @OriginalMember(
      owner = "client!bba",
      name = "zi",
      descriptor = "I"
   )
   public static int field2047;
   @OriginalMember(
      owner = "client!bba",
      name = "Qh",
      descriptor = "I"
   )
   public static int field2048;
   @OriginalMember(
      owner = "client!bba",
      name = "Ih",
      descriptor = "I"
   )
   public static int field2050;
   @OriginalMember(
      owner = "client!bba",
      name = "Dh",
      descriptor = "I"
   )
   public static int field2051;
   @OriginalMember(
      owner = "client!bba",
      name = "qh",
      descriptor = "I"
   )
   public static int field2052;
   @OriginalMember(
      owner = "client!bba",
      name = "ph",
      descriptor = "I"
   )
   public static int field2053;
   @OriginalMember(
      owner = "client!bba",
      name = "ni",
      descriptor = "I"
   )
   public static int field2054;
   @OriginalMember(
      owner = "client!bba",
      name = "Ei",
      descriptor = "I"
   )
   public static int field2055;
   @OriginalMember(
      owner = "client!bba",
      name = "Wh",
      descriptor = "I"
   )
   public static int field2056;
   @OriginalMember(
      owner = "client!bba",
      name = "jh",
      descriptor = "I"
   )
   public static int field2057;
   @OriginalMember(
      owner = "client!bba",
      name = "Pi",
      descriptor = "I"
   )
   public static int field2058;
   @OriginalMember(
      owner = "client!bba",
      name = "Lg",
      descriptor = "I"
   )
   public static int field2059;
   @OriginalMember(
      owner = "client!bba",
      name = "ai",
      descriptor = "I"
   )
   public static int field2060;
   @OriginalMember(
      owner = "client!bba",
      name = "di",
      descriptor = "I"
   )
   public static int field2061;
   @OriginalMember(
      owner = "client!bba",
      name = "Wi",
      descriptor = "I"
   )
   public static int field2063;
   @OriginalMember(
      owner = "client!bba",
      name = "eh",
      descriptor = "I"
   )
   public static int field2064;
   @OriginalMember(
      owner = "client!bba",
      name = "wi",
      descriptor = "I"
   )
   public static int field2065;
   @OriginalMember(
      owner = "client!bba",
      name = "nh",
      descriptor = "I"
   )
   private int field2079;
   @OriginalMember(
      owner = "client!bba",
      name = "gh",
      descriptor = "J"
   )
   private long field2074;
   @OriginalMember(
      owner = "client!bba",
      name = "qi",
      descriptor = "Z"
   )
   private boolean field2075;
   @OriginalMember(
      owner = "client!bba",
      name = "Sg",
      descriptor = "Z"
   )
   private boolean field2076;
   @OriginalMember(
      owner = "client!bba",
      name = "Gi",
      descriptor = "Z"
   )
   private boolean field2077;
   @OriginalMember(
      owner = "client!bba",
      name = "Tg",
      descriptor = "Z"
   )
   private boolean field2078;
   @OriginalMember(
      owner = "client!bba",
      name = "Mg",
      descriptor = "Z"
   )
   private boolean field2080;

   @OriginalMember(
      owner = "client!bba",
      name = "t",
      descriptor = "()V",
      line = 3
   )
   public final void method321() {
      try {
         ++field1977;
         OpenGL.glFinish();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "bb",
      descriptor = "(I)V",
      line = 11
   )
   public final void method1150(int arg0) {
      try {
         ++field2024;
         if (arg0 > -88) {
            this.method1202(-27, (class102)null, 104);
         }

         label19: {
            OpenGL.glMatrixMode(5890);
            if (super.field5316[super.field5286] != class557.field8079) {
               OpenGL.glLoadMatrixf(super.field5297[super.field5286].method1011(class65.field1195, 123), 0);
               if (!client.field4564) {
                  break label19;
               }
            }

            OpenGL.glLoadIdentity();
         }

         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V",
      line = 33
   )
   public final void method1151(Object arg0, int arg1, Canvas arg2) {
      try {
         ++field2032;
         if (arg1 == 3584) {
            Long var4 = (Long)arg0;
            this.field1995.releaseSurface(arg2, var4);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[9] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + arg1 + ',' + (arg2 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "x",
      descriptor = "(I)V",
      line = 47
   )
   public final void method1152(int arg0) {
      try {
         label20: {
            if (!super.field5230) {
               OpenGL.glDisable(3042);
               if (!client.field4564) {
                  break label20;
               }
            }

            OpenGL.glEnable(3042);
         }

         ++field1979;
         if (arg0 != 8) {
            this.field2085 = 109;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[93] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Lsfa;)V",
      line = 64
   )
   public final void method253(class723 arg0) {
      try {
         ++field1997;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[71] + (arg0 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "n",
      descriptor = "(I)V",
      line = 73
   )
   public final void method1153(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(BII)V",
      line = 120
   )
   public final synchronized void method1154(byte arg0, int arg1, int arg2) {
      try {
         ++field2053;
         class459 var4 = new class459(arg2);
         var4.field347 = (long)arg1;
         if (arg0 != -100) {
            this.field2093 = -51;
         }

         this.field2067.method2585(var4, arg0 + 37);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[42] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "r",
      descriptor = "()Z",
      line = 134
   )
   public final boolean method267() {
      try {
         ++field2052;
         return false;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[83] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "w",
      descriptor = "(I)V",
      line = 143
   )
   public final void method1155(int arg0) {
      try {
         this.field2080 = false;
         ++field2016;
         this.method1164(true);
         int var2 = -105 / ((-67 - arg0) / 55);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[110] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Lej;III)V",
      line = 154
   )
   public final void method1156(class133 arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field2042;
         if (arg3 != 0) {
            this.method1171((byte)9);
         }

         int var6;
         byte var7;
         label50: {
            if (class331.field4734 != arg0) {
               if (class21.field339 != arg0) {
                  if (class421.field6132 != arg0) {
                     if (class368.field5464 != arg0) {
                        if (class244.field3508 != arg0) {
                           var6 = arg1;
                           var7 = 0;
                           if (!var5) {
                              break label50;
                           }
                        }

                        var7 = 5;
                        var6 = arg1 + 2;
                        if (!var5) {
                           break label50;
                        }
                     }

                     var6 = arg1 - -2;
                     var7 = 6;
                     if (!var5) {
                        break label50;
                     }
                  }

                  var6 = arg1 * 3;
                  var7 = 4;
                  if (!var5) {
                     break label50;
                  }
               }

               var7 = 3;
               var6 = arg1 - -1;
               if (!var5) {
                  break label50;
               }
            }

            var6 = arg1 * 2;
            var7 = 1;
         }

         OpenGL.glDrawArrays(var7, arg2, var6);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field2094[13] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "(IIIID)V",
      line = 210
   )
   public final void method261(int arg0, int arg1, int arg2, int arg3, double arg4) {
      try {
         ++field2059;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2094[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Lpa;Lpa;FLpa;)Lpa;",
      line = 219
   )
   public final class386 method441(class386 arg0, class386 arg1, float arg2, class386 arg3) {
      try {
         ++field1994;
         return !(arg2 < 0.5F) ? arg1 : arg0;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[44] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + (arg1 != null ? field2094[5] : field2094[6]) + ',' + arg2 + ',' + (arg3 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "n",
      descriptor = "(Z)V",
      line = 228
   )
   public final void method1157(boolean arg0) {
      try {
         label23: {
            ++field2037;
            if (super.field5253 && !super.field5290) {
               OpenGL.glEnable(2896);
               if (!client.field4564) {
                  break label23;
               }
            }

            OpenGL.glDisable(2896);
         }

         if (arg0) {
            this.field2062 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[70] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "q",
      descriptor = "()V",
      line = 246
   )
   public final void method438() {
      try {
         ++field2000;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[97] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "e",
      descriptor = "(B)V",
      line = 254
   )
   public final void method1158(byte arg0) {
      try {
         OpenGL.glDepthMask(super.field5306 && super.field5232);
         if (arg0 != -89) {
            this.field2068 = null;
         }

         ++field2004;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[54] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "C",
      descriptor = "(I)V",
      line = 266
   )
   public final void method1159(int arg0) {
      try {
         class75.field1326[1] = (float)class66.method706(65280, super.field5282) / 65280.0F;
         if (arg0 == 14) {
            ++field1999;
            class75.field1326[2] = (float)class66.method706(super.field5282, 255) / 255.0F;
            class75.field1326[0] = (float)class66.method706(16711680, super.field5282) / 1.671168E7F;
            class75.field1326[3] = (float)(super.field5282 >>> 24) / 255.0F;
            OpenGL.glTexEnvfv(8960, 8705, class75.field1326, 0);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[65] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;",
      line = 282
   )
   public final Object method1160(Canvas arg0, byte arg1) {
      try {
         ++field2022;
         long var3 = this.field1995.prepareSurface(arg0);
         if (arg1 > -43) {
            this.method438();
         }

         if (var3 == -1L) {
            throw new RuntimeException();
         } else {
            return new Long(var3);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[69] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "O",
      descriptor = "(I)V",
      line = 298
   )
   public final void method1161(int arg0) {
      try {
         ++field2048;
         this.method1164(true);
         if (arg0 != 12383) {
            this.field1995 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[107] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(III)V",
      line = 309
   )
   public final synchronized void method1162(int arg0, int arg1, int arg2) {
      try {
         ++field2018;
         if (arg2 != -5419) {
            this.method380();
         }

         class459 var4 = new class459(arg0);
         var4.field347 = (long)arg1;
         this.field2066.method2585(var4, arg2 + 5361);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[86] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "p",
      descriptor = "(Z)V",
      line = 326
   )
   public final void method1163(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         label32: {
            if (class551.field7952 != super.field5256) {
               if (class375.field5574 == super.field5256) {
                  OpenGL.glBlendFunc(1, 1);
                  if (!var2) {
                     break label32;
                  }
               }

               if (class246.field3531 != super.field5256) {
                  break label32;
               }

               OpenGL.glBlendFunc(774, 1);
               if (!var2) {
                  break label32;
               }
            }

            OpenGL.glBlendFunc(770, 771);
         }

         if (arg0) {
            this.field2092 = null;
         }

         ++field1980;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[104] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "r",
      descriptor = "(Z)V",
      line = 349
   )
   private final void method1164(boolean arg0) {
      try {
         ++field2013;
         if (!arg0) {
            this.method1191((Canvas)null, (Object)null, (byte)98);
         }

         if (this.field2076) {
            OpenGL.glPopMatrix();
         }

         if (super.field5315.method4107(-112)) {
            if (!this.field2080) {
               OpenGL.glLoadMatrixf(super.field5221.method1011(class65.field1195, 110), 0);
               this.field2080 = true;
               this.method1211(1);
               this.method1153(1);
            }

            if (!super.field5218) {
               OpenGL.glPushMatrix();
               OpenGL.glMultMatrixf(super.field5215.method1011(class65.field1195, 65), 0);
               this.field2076 = true;
            } else {
               this.field2076 = false;
            }
         } else if (super.field5218) {
            OpenGL.glLoadIdentity();
            this.field2076 = false;
         } else {
            OpenGL.glLoadMatrixf(super.field5215.method1011(class65.field1195, 114), 0);
            this.field2076 = false;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[87] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "u",
      descriptor = "(I)V",
      line = 399
   )
   public final void method1165(int arg0) {
      try {
         class75.field1326[1] = super.field5313 * super.field5239;
         class75.field1326[0] = super.field5274 * super.field5239;
         class75.field1326[2] = super.field5324 * super.field5239;
         ++field1988;
         class75.field1326[3] = 1.0F;
         OpenGL.glLightfv(16384, 4609, class75.field1326, 0);
         class75.field1326[3] = 1.0F;
         class75.field1326[0] = -super.field5240 * super.field5274;
         class75.field1326[1] = -super.field5240 * super.field5313;
         class75.field1326[2] = -super.field5240 * super.field5324;
         if (arg0 >= -29) {
            this.method1186((class209)null, (byte)-101, (class584)null);
         }

         OpenGL.glLightfv(16385, 4609, class75.field1326, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[53] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(BLuj;)V",
      line = 419
   )
   public final void method1166(byte param1, class401 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bba",
      name = "i",
      descriptor = "(B)V",
      line = 581
   )
   public final void method1167(byte arg0) {
      try {
         if (arg0 < 63) {
            field2055 = 8;
         }

         ++field1973;
         int var2 = this.field2083[super.field5286];
         if (~var2 != -1) {
            this.field2083[super.field5286] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[95] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "d",
      descriptor = "(IZ)Lue;",
      line = 602
   )
   public final class242 method1168(int arg0, boolean arg1) {
      try {
         ++field2035;
         if (!arg1) {
            this.method321();
         }

         if (~arg0 != -4) {
            if (arg0 == 4) {
               return new class614(this, super.field5205, super.field5055);
            }

            if (arg0 != 8) {
               return super.method1168(arg0, true);
            }

            if (!client.field4564) {
               return new class733(this, super.field5205, super.field5055);
            }
         }

         return new class11(this, super.field5205);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2094[101] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "(B)V",
      line = 647
   )
   public final void method1169(byte arg0) {
      try {
         OpenGL.glMatrixMode(5889);
         ++field2040;
         if (arg0 > -51) {
            this.method438();
         }

         OpenGL.glLoadMatrixf(super.field5308, 0);
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[106] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(I[Ljq;)Luj;",
      line = 660
   )
   public final class401 method1170(int arg0, class535[] arg1) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field1978;
            return new class471(arg1);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[111] + arg0 + ',' + (arg1 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Lrj;Leg;)Lsfa;",
      line = 671
   )
   public final class723 method301(class619 arg0, class117 arg1) {
      try {
         ++field2029;
         return null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[72] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + (arg1 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "f",
      descriptor = "()V",
      line = 679
   )
   public final void method268() {
      try {
         ++field2063;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[43] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "r",
      descriptor = "(B)V",
      line = 686
   )
   public final void method1171(byte arg0) {
      try {
         ++field1976;
         super.field5238 = (float)(-super.field5309 + super.field5320);
         super.field5301 = super.field5238 - (float)super.field5310;
         if ((float)super.field5288 > super.field5301) {
            super.field5301 = (float)super.field5288;
         }

         OpenGL.glFogf(2915, super.field5301);
         OpenGL.glFogf(2916, super.field5238);
         class75.field1326[2] = (float)class66.method706(super.field5319, 255) / 255.0F;
         if (arg0 != -57) {
            this.field2087 = true;
         }

         class75.field1326[1] = (float)class66.method706(65280, super.field5319) / 65280.0F;
         class75.field1326[0] = (float)class66.method706(16711680, super.field5319) / 1.671168E7F;
         OpenGL.glFogfv(2918, class75.field1326, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[89] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "K",
      descriptor = "(I)V",
      line = 708
   )
   public final void method1172(int arg0) {
      try {
         if (arg0 != 13) {
            this.field2086 = null;
         }

         ++field2064;
         OpenGL.glActiveTexture(33984 - -super.field5286);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[94] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "g",
      descriptor = "(I)V",
      line = 722
   )
   public final synchronized void method444(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field1987;
         int var3 = 0;
         int var15 = arg0 & Integer.MAX_VALUE;
         int var10000;
         if (var2 || !this.field2066.method2574(-103)) {
            do {
               class459 var4 = (class459)this.field2066.method2577(true);
               class446.field6505[var3++] = (int)var4.field347;
               super.field5217 -= var4.field6727;
               var10000 = var3;

               while(var10000 == 1000) {
                  OpenGL.glDeleteBuffersARB(var3, class446.field6505, 0);
                  var10000 = 0;
                  if (!var2) {
                     var3 = 0;
                     break;
                  }
               }
            } while(!this.field2066.method2574(-103));
         }

         class459 var5;
         class459 var6;
         class459 var7;
         boolean var8;
         class459 var9;
         class22 var10;
         class22 var11;
         class459 var12;
         byte var16;
         class124 var18;
         if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class446.field6505, 0);
            var3 = 0;
            if (var2) {
               var5 = (class459)this.field2067.method2577(true);
               class446.field6505[var3++] = (int)var5.field347;
               super.field5213 -= var5.field6727;
               var10000 = ~var3;
            } else {
               if (this.field2067.method2574(-87)) {
                  label687: {
                     if (var3 > 0) {
                        OpenGL.glDeleteTextures(var3, class446.field6505, 0);
                        var3 = 0;
                        if (var2) {
                           var6 = (class459)this.field2068.method2577(true);
                           class446.field6505[var3++] = var6.field6727;
                           var10000 = var3;
                        } else {
                           if (this.field2068.method2574(-120)) {
                              break label687;
                           }

                           var6 = (class459)this.field2068.method2577(true);
                           class446.field6505[var3++] = var6.field6727;
                           var10000 = var3;
                        }
                     } else {
                        if (this.field2068.method2574(-120)) {
                           break label687;
                        }

                        var6 = (class459)this.field2068.method2577(true);
                        class446.field6505[var3++] = var6.field6727;
                        var10000 = var3;
                     }

                     while(true) {
                        while(var10000 == 1000) {
                           OpenGL.glDeleteFramebuffersEXT(var3, class446.field6505, 0);
                           var10000 = 0;
                           if (!var2) {
                              var3 = 0;
                              break;
                           }
                        }

                        if (this.field2068.method2574(-120)) {
                           break;
                        }

                        var6 = (class459)this.field2068.method2577(true);
                        class446.field6505[var3++] = var6.field6727;
                        var10000 = var3;
                     }
                  }

                  if (~var3 < -1) {
                     OpenGL.glDeleteFramebuffersEXT(var3, class446.field6505, 0);
                     var16 = 0;
                     if (var2) {
                        var7 = (class459)this.field2069.method2577(true);
                        var3 = var16 + 1;
                        class446.field6505[var16] = (int)var7.field347;
                        super.field5214 -= var7.field6727;
                        var10000 = var3;
                     } else {
                        if (this.field2069.method2574(-94)) {
                           label745: {
                              if (var16 > 0) {
                                 OpenGL.glDeleteRenderbuffersEXT(var16, class446.field6505, 0);
                                 var8 = false;
                                 if (!var2 && this.field2062.method2574(-101)) {
                                    break label745;
                                 }
                              } else if (this.field2062.method2574(-101)) {
                                 break label745;
                              }

                              do {
                                 var9 = (class459)this.field2062.method2577(true);
                                 OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                              } while(!this.field2062.method2574(-101));
                           }

                           if (var2) {
                              var10 = this.field2070.method2577(true);
                              OpenGL.glDeleteProgramARB((int)var10.field347);
                           }

                           while(!this.field2070.method2574(-89)) {
                              var10 = this.field2070.method2577(true);
                              OpenGL.glDeleteProgramARB((int)var10.field347);
                           }

                           if (var2 || !this.field2071.method2574(-67)) {
                              do {
                                 var11 = this.field2071.method2577(true);
                                 OpenGL.glDeleteObjectARB(var11.field347);
                              } while(!this.field2071.method2574(-67));
                           }

                           if (var2) {
                              var12 = (class459)this.field2062.method2577(true);
                              OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                           }

                           while(true) {
                              if (this.field2062.method2574(-99)) {
                                 var18 = this;
                                 if (!var2) {
                                    if (this.method287() > 100663296 && ~class57.method650(92) < ~(this.field2074 + 60000L)) {
                                       System.gc();
                                       this.field2074 = class57.method650(96);
                                    }

                                    super.method444(var15);
                                    return;
                                 }
                              } else {
                                 var18 = this;
                              }

                              var12 = (class459)var18.field2062.method2577(true);
                              OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                           }
                        }

                        var7 = (class459)this.field2069.method2577(true);
                        var3 = var16 + 1;
                        class446.field6505[var16] = (int)var7.field347;
                        super.field5214 -= var7.field6727;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field2069.method2574(-94)) {
                        label831: {
                           if (var3 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class446.field6505, 0);
                              var8 = false;
                              if (!var2 && this.field2062.method2574(-101)) {
                                 break label831;
                              }
                           } else if (this.field2062.method2574(-101)) {
                              break label831;
                           }

                           do {
                              var9 = (class459)this.field2062.method2577(true);
                              OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                           } while(!this.field2062.method2574(-101));
                        }

                        if (var2) {
                           var10 = this.field2070.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        while(!this.field2070.method2574(-89)) {
                           var10 = this.field2070.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        if (var2 || !this.field2071.method2574(-67)) {
                           do {
                              var11 = this.field2071.method2577(true);
                              OpenGL.glDeleteObjectARB(var11.field347);
                           } while(!this.field2071.method2574(-67));
                        }

                        if (var2) {
                           var12 = (class459)this.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }

                        while(true) {
                           if (this.field2062.method2574(-99)) {
                              var18 = this;
                              if (!var2) {
                                 if (this.method287() > 100663296 && ~class57.method650(92) < ~(this.field2074 + 60000L)) {
                                    System.gc();
                                    this.field2074 = class57.method650(96);
                                 }

                                 super.method444(var15);
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class459)var18.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }
                     }

                     var7 = (class459)this.field2069.method2577(true);
                     class446.field6505[var3++] = (int)var7.field347;
                     super.field5214 -= var7.field6727;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteRenderbuffersEXT(var3, class446.field6505, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field2069.method2574(-94)) {
                        label930: {
                           if (var3 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class446.field6505, 0);
                              var8 = false;
                              if (!var2 && this.field2062.method2574(-101)) {
                                 break label930;
                              }
                           } else if (this.field2062.method2574(-101)) {
                              break label930;
                           }

                           do {
                              var9 = (class459)this.field2062.method2577(true);
                              OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                           } while(!this.field2062.method2574(-101));
                        }

                        if (var2) {
                           var10 = this.field2070.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        while(!this.field2070.method2574(-89)) {
                           var10 = this.field2070.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        if (var2 || !this.field2071.method2574(-67)) {
                           do {
                              var11 = this.field2071.method2577(true);
                              OpenGL.glDeleteObjectARB(var11.field347);
                           } while(!this.field2071.method2574(-67));
                        }

                        if (var2) {
                           var12 = (class459)this.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }

                        while(true) {
                           if (this.field2062.method2574(-99)) {
                              var18 = this;
                              if (!var2) {
                                 if (this.method287() > 100663296 && ~class57.method650(92) < ~(this.field2074 + 60000L)) {
                                    System.gc();
                                    this.field2074 = class57.method650(96);
                                 }

                                 super.method444(var15);
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class459)var18.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }
                     }

                     var7 = (class459)this.field2069.method2577(true);
                     class446.field6505[var3++] = (int)var7.field347;
                     super.field5214 -= var7.field6727;
                     var10000 = var3;
                  }
               }

               var5 = (class459)this.field2067.method2577(true);
               class446.field6505[var3++] = (int)var5.field347;
               super.field5213 -= var5.field6727;
               var10000 = ~var3;
            }
         } else {
            if (this.field2067.method2574(-87)) {
               label357: {
                  if (var3 > 0) {
                     OpenGL.glDeleteTextures(var3, class446.field6505, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class459)this.field2068.method2577(true);
                        class446.field6505[var3++] = var6.field6727;
                        var10000 = var3;
                     } else {
                        if (this.field2068.method2574(-120)) {
                           break label357;
                        }

                        var6 = (class459)this.field2068.method2577(true);
                        class446.field6505[var3++] = var6.field6727;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field2068.method2574(-120)) {
                        break label357;
                     }

                     var6 = (class459)this.field2068.method2577(true);
                     class446.field6505[var3++] = var6.field6727;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class446.field6505, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field2068.method2574(-120)) {
                        break;
                     }

                     var6 = (class459)this.field2068.method2577(true);
                     class446.field6505[var3++] = var6.field6727;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class446.field6505, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class459)this.field2069.method2577(true);
                     var3 = var16 + 1;
                     class446.field6505[var16] = (int)var7.field347;
                     super.field5214 -= var7.field6727;
                     var10000 = var3;
                  } else {
                     if (this.field2069.method2574(-94)) {
                        label415: {
                           if (var16 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class446.field6505, 0);
                              var8 = false;
                              if (!var2 && this.field2062.method2574(-101)) {
                                 break label415;
                              }
                           } else if (this.field2062.method2574(-101)) {
                              break label415;
                           }

                           do {
                              var9 = (class459)this.field2062.method2577(true);
                              OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                           } while(!this.field2062.method2574(-101));
                        }

                        if (var2) {
                           var10 = this.field2070.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        while(!this.field2070.method2574(-89)) {
                           var10 = this.field2070.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        if (var2 || !this.field2071.method2574(-67)) {
                           do {
                              var11 = this.field2071.method2577(true);
                              OpenGL.glDeleteObjectARB(var11.field347);
                           } while(!this.field2071.method2574(-67));
                        }

                        if (var2) {
                           var12 = (class459)this.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }

                        while(true) {
                           if (this.field2062.method2574(-99)) {
                              var18 = this;
                              if (!var2) {
                                 if (this.method287() > 100663296 && ~class57.method650(92) < ~(this.field2074 + 60000L)) {
                                    System.gc();
                                    this.field2074 = class57.method650(96);
                                 }

                                 super.method444(var15);
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class459)var18.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }
                     }

                     var7 = (class459)this.field2069.method2577(true);
                     var3 = var16 + 1;
                     class446.field6505[var16] = (int)var7.field347;
                     super.field5214 -= var7.field6727;
                     var10000 = var3;
                  }
               } else {
                  if (this.field2069.method2574(-94)) {
                     label501: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class446.field6505, 0);
                           var8 = false;
                           if (!var2 && this.field2062.method2574(-101)) {
                              break label501;
                           }
                        } else if (this.field2062.method2574(-101)) {
                           break label501;
                        }

                        do {
                           var9 = (class459)this.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                        } while(!this.field2062.method2574(-101));
                     }

                     if (var2) {
                        var10 = this.field2070.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     while(!this.field2070.method2574(-89)) {
                        var10 = this.field2070.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     if (var2 || !this.field2071.method2574(-67)) {
                        do {
                           var11 = this.field2071.method2577(true);
                           OpenGL.glDeleteObjectARB(var11.field347);
                        } while(!this.field2071.method2574(-67));
                     }

                     if (var2) {
                        var12 = (class459)this.field2062.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }

                     while(true) {
                        if (this.field2062.method2574(-99)) {
                           var18 = this;
                           if (!var2) {
                              if (this.method287() > 100663296 && ~class57.method650(92) < ~(this.field2074 + 60000L)) {
                                 System.gc();
                                 this.field2074 = class57.method650(96);
                              }

                              super.method444(var15);
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class459)var18.field2062.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }
                  }

                  var7 = (class459)this.field2069.method2577(true);
                  class446.field6505[var3++] = (int)var7.field347;
                  super.field5214 -= var7.field6727;
                  var10000 = var3;
               }

               while(true) {
                  while(var10000 == 1000) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class446.field6505, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field2069.method2574(-94)) {
                     label600: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class446.field6505, 0);
                           var8 = false;
                           if (!var2 && this.field2062.method2574(-101)) {
                              break label600;
                           }
                        } else if (this.field2062.method2574(-101)) {
                           break label600;
                        }

                        do {
                           var9 = (class459)this.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                        } while(!this.field2062.method2574(-101));
                     }

                     if (var2) {
                        var10 = this.field2070.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     while(!this.field2070.method2574(-89)) {
                        var10 = this.field2070.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     if (var2 || !this.field2071.method2574(-67)) {
                        do {
                           var11 = this.field2071.method2577(true);
                           OpenGL.glDeleteObjectARB(var11.field347);
                        } while(!this.field2071.method2574(-67));
                     }

                     if (var2) {
                        var12 = (class459)this.field2062.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }

                     while(true) {
                        if (this.field2062.method2574(-99)) {
                           var18 = this;
                           if (!var2) {
                              if (this.method287() > 100663296 && ~class57.method650(92) < ~(this.field2074 + 60000L)) {
                                 System.gc();
                                 this.field2074 = class57.method650(96);
                              }

                              super.method444(var15);
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class459)var18.field2062.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }
                  }

                  var7 = (class459)this.field2069.method2577(true);
                  class446.field6505[var3++] = (int)var7.field347;
                  super.field5214 -= var7.field6727;
                  var10000 = var3;
               }
            }

            var5 = (class459)this.field2067.method2577(true);
            class446.field6505[var3++] = (int)var5.field347;
            super.field5213 -= var5.field6727;
            var10000 = ~var3;
         }

         while(true) {
            while(var10000 == -1001) {
               OpenGL.glDeleteTextures(var3, class446.field6505, 0);
               var10000 = 0;
               if (!var2) {
                  var3 = 0;
                  break;
               }
            }

            if (this.field2067.method2574(-87)) {
               label137: {
                  if (var3 > 0) {
                     OpenGL.glDeleteTextures(var3, class446.field6505, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class459)this.field2068.method2577(true);
                        class446.field6505[var3++] = var6.field6727;
                        var10000 = var3;
                     } else {
                        if (this.field2068.method2574(-120)) {
                           break label137;
                        }

                        var6 = (class459)this.field2068.method2577(true);
                        class446.field6505[var3++] = var6.field6727;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field2068.method2574(-120)) {
                        break label137;
                     }

                     var6 = (class459)this.field2068.method2577(true);
                     class446.field6505[var3++] = var6.field6727;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class446.field6505, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field2068.method2574(-120)) {
                        break;
                     }

                     var6 = (class459)this.field2068.method2577(true);
                     class446.field6505[var3++] = var6.field6727;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class446.field6505, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class459)this.field2069.method2577(true);
                     var3 = var16 + 1;
                     class446.field6505[var16] = (int)var7.field347;
                     super.field5214 -= var7.field6727;
                     var10000 = var3;
                  } else {
                     if (this.field2069.method2574(-94)) {
                        label237: {
                           if (var16 > 0) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class446.field6505, 0);
                              var8 = false;
                              if (!var2 && this.field2062.method2574(-101)) {
                                 break label237;
                              }
                           } else if (this.field2062.method2574(-101)) {
                              break label237;
                           }

                           do {
                              var9 = (class459)this.field2062.method2577(true);
                              OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                           } while(!this.field2062.method2574(-101));
                        }

                        if (var2) {
                           var10 = this.field2070.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        while(!this.field2070.method2574(-89)) {
                           var10 = this.field2070.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        if (var2 || !this.field2071.method2574(-67)) {
                           do {
                              var11 = this.field2071.method2577(true);
                              OpenGL.glDeleteObjectARB(var11.field347);
                           } while(!this.field2071.method2574(-67));
                        }

                        if (var2) {
                           var12 = (class459)this.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }

                        while(true) {
                           if (this.field2062.method2574(-99)) {
                              var18 = this;
                              if (!var2) {
                                 if (this.method287() > 100663296 && ~class57.method650(92) < ~(this.field2074 + 60000L)) {
                                    System.gc();
                                    this.field2074 = class57.method650(96);
                                 }

                                 super.method444(var15);
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class459)var18.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }
                     }

                     var7 = (class459)this.field2069.method2577(true);
                     var3 = var16 + 1;
                     class446.field6505[var16] = (int)var7.field347;
                     super.field5214 -= var7.field6727;
                     var10000 = var3;
                  }
               } else {
                  if (this.field2069.method2574(-94)) {
                     label150: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class446.field6505, 0);
                           var8 = false;
                           if (!var2 && this.field2062.method2574(-101)) {
                              break label150;
                           }
                        } else if (this.field2062.method2574(-101)) {
                           break label150;
                        }

                        do {
                           var9 = (class459)this.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                        } while(!this.field2062.method2574(-101));
                     }

                     if (var2) {
                        var10 = this.field2070.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     while(!this.field2070.method2574(-89)) {
                        var10 = this.field2070.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     if (var2 || !this.field2071.method2574(-67)) {
                        do {
                           var11 = this.field2071.method2577(true);
                           OpenGL.glDeleteObjectARB(var11.field347);
                        } while(!this.field2071.method2574(-67));
                     }

                     if (var2) {
                        var12 = (class459)this.field2062.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }

                     while(true) {
                        if (this.field2062.method2574(-99)) {
                           var18 = this;
                           if (!var2) {
                              if (this.method287() > 100663296 && ~class57.method650(92) < ~(this.field2074 + 60000L)) {
                                 System.gc();
                                 this.field2074 = class57.method650(96);
                              }

                              super.method444(var15);
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class459)var18.field2062.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }
                  }

                  var7 = (class459)this.field2069.method2577(true);
                  class446.field6505[var3++] = (int)var7.field347;
                  super.field5214 -= var7.field6727;
                  var10000 = var3;
               }

               while(true) {
                  while(var10000 == 1000) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class446.field6505, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field2069.method2574(-94)) {
                     label99: {
                        if (var3 > 0) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class446.field6505, 0);
                           var8 = false;
                           if (!var2 && this.field2062.method2574(-101)) {
                              break label99;
                           }
                        } else if (this.field2062.method2574(-101)) {
                           break label99;
                        }

                        do {
                           var9 = (class459)this.field2062.method2577(true);
                           OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                        } while(!this.field2062.method2574(-101));
                     }

                     if (var2) {
                        var10 = this.field2070.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     while(!this.field2070.method2574(-89)) {
                        var10 = this.field2070.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     if (var2 || !this.field2071.method2574(-67)) {
                        do {
                           var11 = this.field2071.method2577(true);
                           OpenGL.glDeleteObjectARB(var11.field347);
                        } while(!this.field2071.method2574(-67));
                     }

                     if (var2) {
                        var12 = (class459)this.field2062.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }

                     while(true) {
                        if (this.field2062.method2574(-99)) {
                           var18 = this;
                           if (!var2) {
                              if (this.method287() > 100663296 && ~class57.method650(92) < ~(this.field2074 + 60000L)) {
                                 System.gc();
                                 this.field2074 = class57.method650(96);
                              }

                              super.method444(var15);
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class459)var18.field2062.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }
                  }

                  var7 = (class459)this.field2069.method2577(true);
                  class446.field6505[var3++] = (int)var7.field347;
                  super.field5214 -= var7.field6727;
                  var10000 = var3;
               }
            }

            var5 = (class459)this.field2067.method2577(true);
            class446.field6505[var3++] = (int)var5.field347;
            super.field5213 -= var5.field6727;
            var10000 = ~var3;
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field2094[90] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Lqe;I)V",
      line = 886
   )
   public final void method1173(class491 arg0, int arg1) {
      try {
         label26: {
            if (class479.field6977 != arg0) {
               int var3 = class599.method4422((byte)39, arg0);
               OpenGL.glTexGeni(8192, 9472, var3);
               OpenGL.glEnable(3168);
               OpenGL.glTexGeni(8193, 9472, var3);
               OpenGL.glEnable(3169);
               OpenGL.glTexGeni(8194, 9472, var3);
               OpenGL.glEnable(3170);
               if (!client.field4564) {
                  break label26;
               }
            }

            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
         }

         if (arg1 != 13) {
            this.method1152(-1);
         }

         ++field2043;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2094[103] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "F",
      descriptor = "(II)V",
      line = 914
   )
   public final void method326(int arg0, int arg1) {
      try {
         ++field2051;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "v",
      descriptor = "(B)I",
      line = 921
   )
   public static final int method1174(byte arg0) {
      try {
         ++field2019;
         if (~class402.field5939 == -2) {
            return class601.field8673;
         } else {
            int var1 = -8 % ((59 - arg0) / 59);
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[47] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IILrn;IILej;I)V",
      line = 934
   )
   public final void method1175(int arg0, int arg1, class280 arg2, int arg3, int arg4, class133 arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         byte var9;
         int var10;
         label56: {
            ++field2038;
            if (class331.field4734 != arg5) {
               if (class21.field339 == arg5) {
                  var9 = 3;
                  var10 = arg4 - -1;
                  if (!var8) {
                     break label56;
                  }
               }

               if (class421.field6132 != arg5) {
                  if (class368.field5464 != arg5) {
                     if (class244.field3508 == arg5) {
                        var9 = 5;
                        var10 = arg4 - -2;
                        if (!var8) {
                           break label56;
                        }
                     }

                     var9 = 0;
                     var10 = arg4;
                     if (!var8) {
                        break label56;
                     }
                  }

                  var10 = arg4 - -2;
                  var9 = 6;
                  if (!var8) {
                     break label56;
                  }
               }

               var10 = arg4 * 3;
               var9 = 4;
               if (!var8) {
                  break label56;
               }
            }

            var10 = arg4 * 2;
            var9 = 1;
         }

         class209 var11 = arg2.method2191(arg3 + -128);
         if (arg3 != 0) {
            this.method444(-97);
         }

         class592 var12 = (class592)arg2;
         var12.method3156((byte)112);
         OpenGL.glDrawElements(var9, var10, class458.method3444((byte)-108, var11), var12.method3154(true) - -((long)(var11.field3103 * arg1)));
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field2094[59] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2094[5] : field2094[6]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2094[5] : field2094[6]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "e",
      descriptor = "(II)Lrj;",
      line = 991
   )
   public final class619 method263(int arg0, int arg1) {
      try {
         ++field1982;
         return null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[78] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "c",
      descriptor = "(IB)V",
      line = 1000
   )
   public final void method1176(int arg0, byte arg1) {
      try {
         ++field2034;
         int var3 = -11 % ((6 - arg1) / 56);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2094[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(ZIZLlha;I)V",
      line = 1016
   )
   public final void method1177(boolean arg0, int arg1, boolean arg2, class649 arg3, int arg4) {
      try {
         if (arg4 <= -49) {
            OpenGL.glTexEnvi(8960, arg1 + 34176, class748.method5427(false, arg3));
            ++field2056;
            if (!arg2) {
               OpenGL.glTexEnvi(8960, 34192 - -arg1, !arg0 ? 768 : 769);
            } else {
               OpenGL.glTexEnvi(8960, arg1 + 34192, arg0 ? 771 : 770);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2094[100] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2094[5] : field2094[6]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "(II)V",
      line = 1033
   )
   public final void method393(int arg0, int arg1) throws class328 {
      try {
         this.field1995.swapBuffers();
         ++field2015;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[102] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "g",
      descriptor = "(B)V",
      line = 1046
   )
   public final void method1178(byte arg0) {
      try {
         ++field2006;
         if (arg0 == -123) {
            OpenGL.glScissor(super.field5265 - -super.field5224, -super.field5249 + super.field5167 + super.field5314, -super.field5224 + super.field5294, -super.field5280 + super.field5249);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "g",
      descriptor = "(Z)V",
      line = 1060
   )
   public final void method1179(boolean arg0) {
      try {
         label20: {
            if (!super.field5322) {
               OpenGL.glDisable(2929);
               if (!client.field4564) {
                  break label20;
               }
            }

            OpenGL.glEnable(2929);
         }

         if (!arg0) {
            this.field2070 = null;
         }

         ++field2033;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[112] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "p",
      descriptor = "()V",
      line = 1075
   )
   public final void method272() {
      try {
         ++field2021;
         super.method272();
         if (this.field1995 != null) {
            this.field1995.method4762();
            this.field1995.release();
            this.field1995 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[80] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(ZZ)V",
      line = 1090
   )
   public final void method1180(boolean arg0, boolean arg1) {
      try {
         if (!arg1) {
            label19: {
               if (arg0) {
                  OpenGL.glEnable(32925);
                  if (!client.field4564) {
                     break label19;
                  }
               }

               OpenGL.glDisable(32925);
            }

            ++field2003;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[92] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "F",
      descriptor = "(I)F",
      line = 1105
   )
   public final float method1181(int arg0) {
      try {
         if (arg0 != 0) {
            return 0.2131731F;
         } else {
            ++field2010;
            return 0.0F;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[56] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "<init>",
      descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lhw;I)V",
      line = 1116
   )
   public class124(OpenGL param1, Canvas param2, long param3, class160 param5, class141 param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bba",
      name = "I",
      descriptor = "(I)V",
      line = 1275
   )
   public final void method1182(int arg0) {
      try {
         if (arg0 != -15042) {
            this.field2084 = true;
         }

         label19: {
            if (super.field5264) {
               OpenGL.glEnable(3008);
               if (!client.field4564) {
                  break label19;
               }
            }

            OpenGL.glDisable(3008);
         }

         ++field2005;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(II)Leg;",
      line = 1291
   )
   public final class117 method358(int arg0, int arg1) {
      try {
         ++field2065;
         return null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[81] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "s",
      descriptor = "(I)V",
      line = 1300
   )
   public final void method1183(int arg0) {
      boolean var2 = client.field4564;

      try {
         int var3 = super.field5318 + -1;
         if (var2) {
            OpenGL.glActiveTexture(33984 - -var3);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
            --var3;
         }

         while(true) {
            while(~var3 <= -1) {
               OpenGL.glActiveTexture(33984 - -var3);
               OpenGL.glTexEnvi(8960, 8704, 34160);
               OpenGL.glTexEnvi(8960, 34161, 8448);
               OpenGL.glTexEnvi(8960, 34178, 34166);
               OpenGL.glTexEnvi(8960, 34162, 8448);
               OpenGL.glTexEnvi(8960, 34186, 34166);
               --var3;
            }

            ++field2047;
            OpenGL.glTexEnvi(8960, 34186, 34168);
            OpenGL.glShadeModel(7425);
            OpenGL.glClearDepth(1.0F);
            OpenGL.glDepthFunc(515);
            OpenGL.glPolygonMode(1028, 6914);
            OpenGL.glEnable(2884);
            OpenGL.glCullFace(1029);
            OpenGL.glAlphaFunc(516, 0.0F);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glColorMaterial(1028, 5634);
            OpenGL.glEnable(2903);
            if (!var2) {
               if (arg0 != -21724) {
                  return;
               }

               float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
               int var5 = 0;
               int var6;
               if (var2) {
                  var6 = 16384 + var5;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }

               while(true) {
                  short var10000;
                  int var10001;
                  if (~var5 <= -9) {
                     OpenGL.glFogf(2914, 0.95F);
                     OpenGL.glFogi(2917, 9729);
                     var10000 = 3156;
                     var10001 = 4353;
                     if (!var2) {
                        OpenGL.glHint(3156, 4353);
                        this.field1995.setSwapInterval(0);
                        super.method1183(arg0);
                        return;
                     }
                  } else {
                     var10000 = 16384;
                     var10001 = var5;
                  }

                  var6 = var10000 + var10001;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }
            }

            OpenGL.glTexEnvi(arg0, -21724, 34166);
            --var3;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2094[85] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Luda;I)Lsr;",
      line = 1357
   )
   public static final class263 method1184(class473 arg0, int arg1) {
      try {
         ++field1975;
         if (arg1 < 3) {
            field2049 = -3;
         }

         return new class263(arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3577(-2), arg0.method3564((byte)-88));
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[66] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "GA",
      descriptor = "(I)V",
      line = 1369
   )
   public final void method421(int arg0) {
      try {
         ++field2058;
         OpenGL.glClearColor((float)(16711680 & arg0) / 1.671168E7F, (float)(65280 & arg0) / 65280.0F, (float)(arg0 & 255) / 255.0F, (float)(arg0 >>> 24) / 255.0F);
         OpenGL.glClear(16384);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(ZIII[BLtv;)Lwe;",
      line = 1378
   )
   public final class425 method1185(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4, class584 arg5) {
      try {
         ++field2025;
         if (!arg0) {
            this.field2081 = null;
         }

         return new class787(this, arg5, arg1, arg3, arg2, arg4);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2094[96] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2094[5] : field2094[6]) + ',' + (arg5 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Lrfa;BLtv;)Z",
      line = 1393
   )
   public final boolean method1186(class209 arg0, byte arg1, class584 arg2) {
      try {
         ++field1998;
         if (arg1 <= 97) {
            field2049 = 104;
         }

         return true;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2094[57] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + arg1 + ',' + (arg2 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "d",
      descriptor = "(Z)V",
      line = 1404
   )
   public final void method1187(boolean arg0) {
      try {
         label20: {
            ++field2030;
            if (!super.field5347) {
               OpenGL.glDisable(3089);
               if (!client.field4564) {
                  break label20;
               }
            }

            OpenGL.glEnable(3089);
         }

         if (arg0) {
            this.field2079 = 29;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[82] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "na",
      descriptor = "(IIII)[I",
      line = 1420
   )
   public final int[] method407(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field1981;
         int[] var6 = new int[arg2 * arg3];
         int var7 = 0;
         if (var5) {
            OpenGL.glReadPixelsi(arg0, -var7 + -1 + -arg1 + super.field5167, arg2, 1, 32993, this.field2089, var6, arg2 * var7);
            ++var7;
         }

         while(true) {
            while(~arg3 < ~var7) {
               OpenGL.glReadPixelsi(arg0, -var7 + -1 + -arg1 + super.field5167, arg2, 1, 32993, this.field2089, var6, arg2 * var7);
               ++var7;
            }

            if (!var5) {
               return var6;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field2094[60] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V",
      line = 1439
   )
   public final void method381(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class328 {
      try {
         ++field2054;
         this.method393(arg2, arg3);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[91] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "p",
      descriptor = "(B)V",
      line = 1448
   )
   public final void method1188(byte arg0) {
      try {
         ++field2002;
         if (arg0 != 1) {
            this.field2083 = null;
         }

         class75.field1326[0] = super.field5274 * super.field5270;
         class75.field1326[2] = super.field5324 * super.field5270;
         class75.field1326[1] = super.field5313 * super.field5270;
         class75.field1326[3] = 1.0F;
         OpenGL.glLightModelfv(2899, class75.field1326, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[98] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "u",
      descriptor = "()Z",
      line = 1465
   )
   public final boolean method410() {
      try {
         ++field2046;
         return false;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[46] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "e",
      descriptor = "()V",
      line = 1478
   )
   public final void method375() {
      try {
         ++field2061;
         if (super.field5076 > 0 || super.field5167 > 0) {
            int var1 = super.field5224;
            int var2 = super.field5294;
            int var3 = super.field5280;
            int var4 = super.field5249;
            this.method349();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2807(-32);
            this.method2745((byte)9, false);
            this.method2802(6, false);
            this.method2778(false, -32);
            this.method2731((byte)111, false);
            this.method2806(false, (class47)null);
            this.method2757(false, (byte)20, -2, false);
            this.method2738(-116, 1);
            this.method2748(0, (byte)-21);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field5076, super.field5167, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method333(var1, var3, var2, var4);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "j",
      descriptor = "(B)V",
      line = 1520
   )
   public final void method1189(byte arg0) {
      try {
         OpenGL.glViewport(super.field5265, super.field5314, super.field5076, super.field5167);
         if (arg0 < 108) {
            this.method1172(-122);
         }

         ++field1983;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[77] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "I",
      descriptor = "()I",
      line = 1531
   )
   public final int method346() {
      try {
         ++field1984;
         return this.field2093;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[58] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Ltv;ILrfa;)Z",
      line = 1540
   )
   public final boolean method1190(class584 arg0, int arg1, class209 arg2) {
      try {
         ++field2041;
         if (arg1 >= -72) {
            method1207(-7, (class59)null);
         }

         return true;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2094[76] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + arg1 + ',' + (arg2 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V",
      line = 1553
   )
   public final void method1191(Canvas arg0, Object arg1, byte arg2) {
      try {
         if (arg2 != -16) {
            this.method1175(27, -18, (class280)null, -40, -120, (class133)null, -92);
         }

         ++field2057;
         Long var4 = (Long)arg1;
         if (!this.field1995.setSurface(var4)) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[108] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + (arg1 != null ? field2094[5] : field2094[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V",
      line = 1570
   )
   public final void method1192(Canvas arg0, Object arg1, int arg2) {
      try {
         ++field2007;
         Long var4 = (Long)arg1;
         this.field1995.surfaceResized(var4);
         if (arg2 < 125) {
            this.field2075 = true;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[4] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + (arg1 != null ? field2094[5] : field2094[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "o",
      descriptor = "(Z)V",
      line = 1583
   )
   public final void method1193(boolean arg0) {
      try {
         OpenGL.glTexEnvi(8960, 34161, class162.method1482(super.field5252[super.field5286], arg0));
         if (arg0) {
            ++field1989;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[74] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "c",
      descriptor = "()V",
      line = 1596
   )
   public final void method379() {
      try {
         ++field2026;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[88] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "c",
      descriptor = "(BZ)Lsd;",
      line = 1603
   )
   public final class102 method1194(byte arg0, boolean arg1) {
      try {
         ++field2012;
         if (arg0 < 10) {
            this.method1170(-64, (class535[])null);
         }

         return new class46(this, arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[67] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "t",
      descriptor = "(B)V",
      line = 1615
   )
   public final void method1195(byte arg0) {
      try {
         if (arg0 > -124) {
            this.field2092 = null;
         }

         ++field2017;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(FFF)V",
      line = 1625
   )
   public final void method371(float arg0, float arg1, float arg2) {
      try {
         ++field2028;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2094[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Z)V",
      line = 1633
   )
   public final void method317(boolean arg0) {
      try {
         ++field2020;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[68] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IJ)V",
      line = 1647
   )
   public final synchronized void method1196(int arg0, long arg1) {
      try {
         ++field2045;
         class22 var4 = new class22();
         var4.field347 = arg1;
         this.field2071.method2585(var4, -58);
         if (arg0 != 34192) {
            this.method263(120, 11);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[55] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IIILtv;Lrfa;)Lnfa;",
      line = 1661
   )
   public final class706 method1197(int arg0, int arg1, int arg2, class584 arg3, class209 arg4) {
      try {
         if (arg2 != 17171) {
            this.method1161(-66);
         }

         ++field1991;
         if (!this.field2087 && (!class756.method5476((byte)-63, arg0) || !class756.method5476((byte)-63, arg1))) {
            return this.field2082 ? new class769(this, arg3, arg4, arg0, arg1) : new class90(this, arg3, arg4, class71.method752(arg0, true), class71.method752(arg1, true));
         } else {
            return new class90(this, arg3, arg4, arg0, arg1);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2094[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2094[5] : field2094[6]) + ',' + (arg4 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "h",
      descriptor = "(II)V",
      line = 1687
   )
   public final synchronized void method1198(int arg0, int arg1) {
      try {
         ++field2036;
         if (arg0 == 1) {
            class22 var3 = new class22();
            var3.field347 = (long)arg1;
            this.field2070.method2585(var3, 103);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2094[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "l",
      descriptor = "(Z)V",
      line = 1702
   )
   public final void method1199(boolean arg0) {
      try {
         if (arg0) {
            this.method261(6, 7, 107, 88, 0.7417397707604507D);
         }

         ++field1996;
         if (!super.field5234) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
         } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[51] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "([FIIIBIZLtv;)Lnfa;",
      line = 1723
   )
   public final class706 method1200(float[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6, class584 arg7) {
      try {
         if (arg4 != 1) {
            this.method444(-88);
         }

         ++field1974;
         if (this.field2087 || class756.method5476((byte)-63, arg2) && class756.method5476((byte)-63, arg1)) {
            return new class90(this, arg7, arg2, arg1, arg6, arg0, arg3, arg5);
         } else if (this.field2082) {
            return new class769(this, arg7, arg2, arg1, arg0, arg3, arg5);
         } else {
            class90 var9 = new class90(this, arg7, class209.field3110, class71.method752(arg2, true), class71.method752(arg1, true));
            var9.method879(arg2, 0, arg5, arg3, 0, arg7, arg0, (byte)-105, arg1);
            return var9;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field2094[105] + (arg0 != null ? field2094[5] : field2094[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "g",
      descriptor = "()V",
      line = 1756
   )
   public static final void method1201() {
      for(int var0 = 0; var0 < class786.field11513.length; ++var0) {
         class786.field11513[var0].method2140();
      }

      class786.field11513 = null;
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(ILsd;I)V",
      line = 1767
   )
   public final void method1202(int arg0, class102 arg1, int arg2) {
      try {
         this.field2073[arg0] = (class46)arg1;
         ++field1993;
         if (arg2 != 10) {
            this.field2085 = 117;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2094[52] + arg0 + ',' + (arg1 != null ? field2094[5] : field2094[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IIIILtv;IZ[B)Lnfa;",
      line = 1778
   )
   public final class706 method1203(int arg0, int arg1, int arg2, int arg3, class584 arg4, int arg5, boolean arg6, byte[] arg7) {
      try {
         ++field2044;
         if (arg3 >= -104) {
            return null;
         } else if (!this.field2087 && (!class756.method5476((byte)-63, arg2) || !class756.method5476((byte)-63, arg5))) {
            if (this.field2082) {
               return new class769(this, arg4, arg2, arg5, arg7, arg1, arg0);
            } else {
               class90 var9 = new class90(this, arg4, class209.field3106, class71.method752(arg2, true), class71.method752(arg5, true));
               var9.method885(arg0, arg4, arg2, arg1, arg5, (byte)83, arg7, 0, 0);
               return var9;
            }
         } else {
            return new class90(this, arg4, arg2, arg5, arg6, arg7, arg1, arg0);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field2094[84] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2094[5] : field2094[6]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "cb",
      descriptor = "(I)V",
      line = 1806
   )
   public static void method1204(int arg0) {
      try {
         if (arg0 == 1) {
            field2023 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[64] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "(ZI)Lrn;",
      line = 1816
   )
   public final class280 method1205(boolean arg0, int arg1) {
      try {
         ++field2031;
         if (arg1 != 0) {
            this.field2077 = true;
         }

         return new class592(this, class209.field3107, arg0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[79] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "m",
      descriptor = "()Lvfa;",
      line = 1829
   )
   public final class698 method273() {
      boolean var1 = client.field4564;

      try {
         ++field2001;
         int var2 = -1;
         if (~this.field2086.indexOf(field2094[20]) == 0) {
            if (this.field2086.indexOf(field2094[17]) != -1) {
               var2 = 32902;
               if (!var1) {
                  return new class698(var2, field2094[18], this.field2085, this.field2092, 0L);
               }
            }

            if (this.field2086.indexOf(field2094[19]) == -1) {
               return new class698(var2, field2094[18], this.field2085, this.field2092, 0L);
            }

            var2 = 4098;
            if (!var1) {
               return new class698(var2, field2094[18], this.field2085, this.field2092, 0L);
            }
         }

         var2 = 4318;
         return new class698(var2, field2094[18], this.field2085, this.field2092, 0L);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(BLlha;ZI)V",
      line = 1850
   )
   public final void method1206(byte arg0, class649 arg1, boolean arg2, int arg3) {
      try {
         ++field2008;
         OpenGL.glTexEnvi(8960, 34184 - -arg3, class748.method5427(false, arg1));
         if (arg0 != -72) {
            this.field2088 = true;
         }

         OpenGL.glTexEnvi(8960, arg3 + 34200, !arg2 ? 770 : 771);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[50] + arg0 + ',' + (arg1 != null ? field2094[5] : field2094[6]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(ILvg;)I",
      line = 1863
   )
   public static final int method1207(int arg0, class59 arg1) {
      try {
         if (arg0 != 10759) {
            field2055 = -121;
         }

         ++field1990;
         String var2 = class115.method1090(false, arg1);
         return class511.field7461.method3345(var2, 3957, class207.field3090);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2094[75] + arg0 + ',' + (arg1 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "v",
      descriptor = "(I)V",
      line = 1880
   )
   public final void method1208(int arg0) {
      try {
         if (arg0 != 2) {
            this.field2085 = 124;
         }

         label32: {
            if (!super.field5278 || !super.field5271 || ~super.field5310 > -1) {
               OpenGL.glDisable(2912);
               if (!client.field4564) {
                  break label32;
               }
            }

            OpenGL.glEnable(2912);
         }

         ++field1985;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[61] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "ya",
      descriptor = "()V",
      line = 1896
   )
   public final void method380() {
      try {
         this.method2731((byte)118, true);
         ++field2060;
         OpenGL.glClear(256);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2094[73] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IIZ[[I)Lnd;",
      line = 1905
   )
   public final class568 method1209(int arg0, int arg1, boolean arg2, int[][] arg3) {
      try {
         ++field2027;
         if (arg1 != 1) {
            this.method407(76, 32, 53, 70);
         }

         return new class416(this, arg0, arg2, arg3);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[49] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2094[5] : field2094[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "q",
      descriptor = "(Z)V",
      line = 1917
   )
   public final void method1210(boolean arg0) {
      try {
         if (arg0) {
            this.field2069 = null;
         }

         ++field1986;
         OpenGL.glTexEnvi(8960, 34162, class162.method1482(super.field5250[super.field5286], true));
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "r",
      descriptor = "(I)V",
      line = 1929
   )
   public final void method1211(int arg0) {
      try {
         ++field2011;
         OpenGL.glLightfv(16384, 4611, super.field5260, 0);
         if (arg0 == 1) {
            OpenGL.glLightfv(16385, 4611, super.field5225, 0);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2094[63] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IIZI[III)Lnfa;",
      line = 1945
   )
   public final class706 method1212(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6) {
      try {
         ++field2009;
         if (arg1 != -13473) {
            this.field2093 = -43;
         }

         if (this.field2087 || class756.method5476((byte)-63, arg5) && class756.method5476((byte)-63, arg0)) {
            return new class90(this, arg5, arg0, arg2, arg4, arg6, arg3);
         } else if (this.field2082) {
            return new class769(this, arg5, arg0, arg4, arg6, arg3);
         } else {
            class90 var8 = new class90(this, class296.field4146, class209.field3106, class71.method752(arg5, true), class71.method752(arg0, true));
            var8.method887(0, arg4, arg3, 0, arg0, arg6, false, arg5);
            return var8;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field2094[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2094[5] : field2094[6]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IIII)V",
      line = 1975
   )
   public final void method427(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2050;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2094[62] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1213(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1214(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
