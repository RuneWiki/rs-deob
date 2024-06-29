import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class271 extends OutputStream {
   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3784 = new String[]{method2097(method2096("$\u001e\u001c=}8\u0001Wb")), method2097(method2096("2\u0019A")), method2097(method2096("#\u0010\\.j#\u0010@")), method2097(method2096("9\u0010^:")), method2097(method2096("\"\u001d[,{2\u0019[)d")), method2097(method2096("<\u0006")), method2097(method2096("\u0003\u001aF+{4\u0011\u0012)`?\u001bW){8\u001a\\jb4\u0001Z%k\"")), method2097(method2096("#\u0010Q>P5\u0010P?h")), method2097(method2096("?\u0000^&")), method2097(method2096("\"\u001b^%h8\u001b\u0012")), method2097(method2096("2\u0006B8`7\u001c^/`$\u0001B?{%")), method2097(method2096("\u0013\u0019]%bq\u0011[9n3\u0019W.")), method2097(method2096("\"\fA>j<\u0018W'")), method2097(method2096("\u0002&wj{>\u001a^!f%O\u0012j")), method2097(method2096("\u001c7")), method2097(method2096("\u0002\u001d[,{|\u0016^#l:UV#|0\u0017^/k\u007f")), method2097(method2096("2\u0014Q\"j\"\u0005S)j")), method2097(method2096("&\u0018\u0001j|$\u0016Q/j5\u0010V")), method2097(method2096("\u0002\fA>j<U_/b>\u0007Kp/")), method2097(method2096("\u001c\u0010_%}(US,{4\u0007\u0012)c4\u0014\\?\u007fl")), method2097(method2096("\u0001\u0010@,`#\u0018S$l4O\u0012")), method2097(method2096("#\u0010P?f=\u0011")), method2097(method2096("\u0002\u001d[,{|\u0016^#l:Uw\u0004N\u00139w\u000e.")), method2097(method2096("#\u0010A/{<\u001c\\#b0\u0005")), method2097(method2096("\u0012On\u001ej<\u0005n\"j0\u0005\u001c.z<\u0005")), method2097(method2096("\u0015\u0007]:\u007f4\u0011\u0012)c8\u0010\\>/;\u0006\u0007ja4\u0001\u0012;z4\u0000W")), method2097(method2096("?\u001a\\:l\"H")), method2097(method2096("2\u001a^'n!U[9/\"\u001d]=a")), method2097(method2096("2\u001a_:n2\u0001")), method2097(method2096("\u0018]Ac5q")), method2097(method2096("'\u0014@:2")), method2097(method2096("2\u0019[/a%\u001fA\u007fk#\u001aB")), method2097(method2096("\u0015\u0007[<j#Ud/}\"\u001c]$5q")), method2097(method2096("\u0014\u001bF/}4\u0011\u0012>db")), method2097(method2096("#\u0010Q>P5\u0010P?hl")), method2097(method2096("%\u001e\u0000")), method2097(method2096("9\u0010S:")), method2097(method2096(">\u0006")), method2097(method2096("&\u0018\u0000")), method2097(method2096("4\u001bS(c4U]8{9\u001a\u0012'`5\u0010\u0012,f#\u0006Fj'$\u0006Wj(>\u0007F\"`qI\\t(x")), method2097(method2096("\u001b\u0014D+/%\u001a]&d8\u0001\bj")), method2097(method2096("*[\u001cdr")), method2097(method2096("q=W#h9\u0001\bj")), method2097(method2096("\u001f\u0014_/5q")), method2097(method2096("\u0019\u0010S:5q")), method2097(method2096("\u001d\u001cP8n#\f\u0012?a=\u001aS.f?\u0012\u0012,n8\u0019W..")), method2097(method2096("q\u000f\b")), method2097(method2096("\u0010\u0007Q\"5q")), method2097(method2096("%\u001e\u0003")), method2097(method2096("\"\u0010F(n")), method2097(method2096("\u00169\u0012>`>\u0019Y#{kU\u0012j")), method2097(method2096("#\u0010P?f=\u0011B8`7\u001c^/")), method2097(method2096("<\u0014J(z8\u0019V+}4\u0014\u000f")), method2097(method2096("#\u001aF+{4\u0016]$a4\u0016F'j%\u001d].|")), method2097(method2096("#\u0010\\.j#\u0010@j\"q%@#a%UU8n!\u001d[)|q\u0007W$k4\u0007W8/8\u001bT%}<\u0014F#`?")), method2097(method2096("&\u0018\u0001ji0\u001c^/k")), method2097(method2096("&\u0018\u0001")), method2097(method2096("6\u0016")), method2097(method2096("\u0017%ap/")), method2097(method2096("\u001c\u0017")), method2097(method2096("2\u0006B8`7\u001c^/`$\u0001B?{2")), method2097(method2096("3\u0007W+d2\u001a\\")), method2097(method2096("!\u0010@'/'\u0014@)|q\u0006Q8n<\u0017^/k")), method2097(method2096("\u001e\u0016Q&|8\u001a\\ja>\u0002\u0012%i7T")), method2097(method2096("9\u001cV/l>\u0019_+\u007f")), method2097(method2096("\u0014\u001bF/}4\u0011\u0012>dd")), method2097(method2096("\u0007\u0010\\.`#O\u0012")), method2097(method2096("!\u0010@,`#\u0018S$l4\u0001W9{")), method2097(method2096("0\u0000F%/&\u001a@&kq\u0006W&j2\u0001W.")), method2097(method2096(">\u0007F\"`q\u0016S'j#\u0014\u0012&`2\u001e\u0012#|q")), method2097(method2096("?\u001a\\:l\"")), method2097(method2096("#\u0000\\9l#\u001cB>/")), method2097(method2096("\u00169jj{>\u001a^!f%O\u0012j")), method2097(method2096("\u0005\u001aU-c4\u0011\u0013")), method2097(method2096("&\u0018\u0003ji0\u001c^/k")), method2097(method2096("\u0013\u0007W+d8\u001bUja4\u0002\u0012)`?\u001bW){8\u001a\\9/7\u001a@j:q\u0006W)`?\u0011A")), method2097(method2096("%\u0010J9f+\u0010")), method2097(method2096(">\u0007F\"`q")), method2097(method2096("9\u0010S:/|Ub8f?\u0001\u0012 n'\u0014\u0012'j<\u001a@3/8\u001bT%}<\u0014F#`?")), method2097(method2096("#\u0005")), method2097(method2096("'\u0014@:m8\u0001\u000f")), method2097(method2096("!\u0010@'/'\u0014@)|q\u0006S<j5")), method2097(method2096("%\u001e\u0007")), method2097(method2096("\u0001\u001aAp/")), method2097(method2096("6\u0010F=`#\u0019V")), method2097(method2096("0\u0000F%x>\u0007^.")), method2097(method2096("\u0010\u0016F#y4UA>}4\u0014_95q")), method2097(method2096("2\u0019]9j>\u0000F:z%")), method2097(method2096("\u001c\u001c\\#b0\u0005\u00128j\"\u0010F")), method2097(method2096("\u0014\u001bF/}4\u0011\u0012>da")), method2097(method2096("+\u001a]'/")), method2097(method2096("\u0005\u0010J>/2\u001a]8k\"UQ&j0\u0007W.")), method2097(method2096(">\u001b")), method2097(method2096("?\u0014F#y4\u0018W'j#\u0007]8")), method2097(method2096(" \u0014m%\u007f\u000e\u0001W9{l")), method2097(method2096("\u0017\u0014[&j5UF%/4\u001bF/}q\u0001Yy")), method2097(method2096("$\u001e\u001c\t'")), method2097(method2096(">\u0007F\"`+\u001a]'/")), method2097(method2096("\u0017%aj`?")), method2097(method2096("\u0003\u0010\\.j#UQ%}4\u0006\u0012$`&O\u0012")), method2097(method2096("6\u0010F)c8\u0010\\>y0\u0007B(f%")), method2097(method2096("7\u0005Ajk4\u0017G-/5\u001cA+m=\u0010V")), method2097(method2096("\u0007\u0010@9f>\u001b\bj")), method2097(method2096("7\u0005Ajk4\u0017G-/4\u001bS(c4\u0011")), method2097(method2096("\u0002\u0000Q)j\"\u0006T?c=\f\u0012)g0\u001bU/kq\u001a@>g>U_%k4")), method2097(method2096("\"\u0010F%z%\u0005G>/")), method2097(method2096(">\u0007F\"`+\u001a]'2")), method2097(method2096("2\u0019[:l>\u0018B%a4\u001bF9")), method2097(method2096("!\u0007],f=\u0010Q:z")), method2097(method2096("5\u001c@/l%\u0019]-f?")), method2097(method2096("\"\u0002[>l9\u0010V")), method2097(method2096("5\u001cA:c0\fT:|")), method2097(method2096("\u0017\u0014[&j5UF%/4\u001bS(c4UP&`>\u0018")), method2097(method2096("6\u0010F\"j8\u0012Z>")), method2097(method2096("\u0012\u001aG&kq\u001b]>/2\u0007W+{4U")), method2097(method2096(">\u0007F\"`%\u001c^/|8\u000fWj")), method2097(method2096("&\u001c\\")), method2097(method2096("\u001e]Ac5q")), method2097(method2096("#\u0010\\.j#\u0005@%i8\u0019W")), method2097(method2096("2\u001a_'n?\u0011Aj\"q!Z#|q\u0016]'b0\u001bV")), method2097(method2096("\u0017\u0014[&j5UF%/2\u001dS$h4U]8{9\u001a\u0012'`5\u0010")), method2097(method2096("\u0012\u0014Q\"j\"U@/|4\u0001")), method2097(method2096("9\u0010S:k$\u0018B")), method2097(method2096("!\u0016")), method2097(method2096("\u0013\u0019]%bq\u0010\\+m=\u0010V")), method2097(method2096("2\u0019[:l>\u0018B%a4\u001bF92")), method2097(method2096("\u0017%aj`7\u0013")), method2097(method2096("\"\u0016@+b3\u0019W<n#\u0016A")), method2097(method2096("2\u0019Aj\"q6^/n#UQ%a\"\u001a^/")), method2097(method2096("?\u0014F#y4]\u007f\u001a]")), method2097(method2096("2\u0006B8`7\u001c^/l=\u0010S8")), method2097(method2096("\"\u001d]=l>\u0019_+\u007f")), method2097(method2096("<\u0010_w")), method2097(method2096("\u0012\u0014\\$`%UE8f%\u0010\u0012>`q")), method2097(method2096(">\u0007F\"`2\u0014_&`2\u001e")), method2097(method2096("\"\u001aG$k\"\u0001@/n<\u0016]?a%")), method2097(method2096("<\u0016")), method2097(method2096("\u0014\u001bF/}4\u0011\u0012>d`")), method2097(method2096("5\u001cA:c0\fT:|qX\u0012\u001e`6\u0012^//\u0017%ajn?\u0011\u0012%{9\u0010@jf?\u0013]8b0\u0001[%a")), method2097(method2096(" \u0014m%\u007f\u000e\u0001W9{")), method2097(method2096("\u0003\u0010P?f=\u0011[$hq\u0018S:/y\u0002[>gq\u0005@%i8\u0019[$hx")), method2097(method2096("\u001c\u0010_%}(UP/i>\u0007Wjl=\u0010S$z!H")), method2097(method2096("\u0017\u0014[&j5UF%/#\u0010S./7\u001c^/")), method2097(method2096("\u001f\u001a\u00129z2\u001d\u0012,f=\u0010")), method2097(method2096("~\u0001_: 9\u0010S:!5\u0000_:")), method2097(method2096("\u001d\u001cP8n#\u001cW9/$\u001b^%n5\u0010V")), method2097(method2096("\"\u0014D/y0\u0007Q9")), method2097(method2096("\u0012\u001a_:c4\u0001Wd/\u0005\u001a]&d8\u0001\u0012$`&O\u0012")), method2097(method2096("6\u0010F)c8\u0010\\>y0\u0007B")), method2097(method2096("&\u0018\u0000j|$\u0016Q/j5\u0010V")), method2097(method2096("%\u0002W/a")), method2097(method2096("4\u0007@%}%\u0010A>")), method2097(method2096("2\u0019W+}%\u0010J>")), method2097(method2096("\u0015\u0010D#l4O\u0012")), method2097(method2096("\u0018]_c5q")), method2097(method2096("\u0015\u001a\\/")), method2097(method2096("\u0015\u0007]:\u007f4\u0011\u0012)c8\u0010\\>/2\u001a\\$j2\u0001[%a")), method2097(method2096(">\u0013T")), method2097(method2096("&\u0018\u0003")), method2097(method2096("\u0018\u001bD+c8\u0011\u00128j2\u0001m.j3\u0000Ujy0\u0019G/")), method2097(method2096("\u0017\u0014[&j5UF%/4\u001bF/}q\u0001Y{")), method2097(method2096("\u0017\u001a@)j5UF=j4\u001b[$hq\u0011[9n3\u0019W.!")), method2097(method2096("\"\u0002[>l9\u0002]8c5")), method2097(method2096("4\u0007@%}<\u0010A9n6\u0010")), method2097(method2096("\u0017\u0014[&j5UF%/4\u001bF/}q\u0001Yz")), method2097(method2096("2\u001a^'n!U[9/9\u001cV.j?")), method2097(method2096(">\u0007F\"`q\u0001[&jq\u0006[0jl")), method2097(method2096("7\u0005Aj")), method2097(method2096("\u0017\u0014[&j5UF%/4\u001bF/}q\u0001Yx")), method2097(method2096("&\u0018\u0003j|$\u0016Q/j5\u0010V")), method2097(method2096("&\u0018\u0000ji0\u001c^/k")), method2097(method2096("3\u0019]%b")), method2097(method2096("&GV/m$\u0012")), method2097(method2096("2\u0019[/a%\u0011@%\u007f")), method2097(method2096("\u0007\u0010@p/")), method2097(method2096("6\u0010F)n<\u0010@+\u007f>\u0006")), method2097(method2096("&O\u0012")), method2097(method2096("%\u001e\u0001")), method2097(method2096("%\u001e\u0002")), method2097(method2096("\u0018\u001bD+c8\u0011\u0012(z8\u0019V+}4\u0014\u0012<n=\u0000W")), method2097(method2096("\"\u0010@<j#\u001fA\u007fk#\u001aB")), method2097(method2096("7\u001c^//0\u0019@/n5\f\u0012/w8\u0006F9.")), method2097(method2096("\u0015\u0007]:\u007f4\u0011\u00129j#\u0003W8/;\u0006\u0007ja4\u0001\u0012;z4\u0000W")), method2097(method2096("\u0012\u0000@8j?\u0001\u0012>`>\u0019Y#{q\u0011]/|?RFj|$\u0005B%}%U_?c%\u001cB&jq\u0016]8j\"")), method2097(method2096("7\u0005A%i7")), method2097(method2096("\u007f\u0019]-")), method2097(method2096(")O")), method2097(method2096("#\u0010A/{2\u0014Q\"j")), method2097(method2096("$\u001b^%n5\u001bS>f'\u0010A")), method2097(method2096("!\u0007[${7\u0005A")), method2097(method2096("0\u0000F%|4\u0001G:")), method2097(method2096("\u0002\f\\>n)O\u0012%}%\u001d]j3?K")), method2097(method2096("\u001d\u001a]!5q")), method2097(method2096("\"\u001d]=\u007f#\u001aT#c8\u001bUw")), method2097(method2096("\u001e\u0016Q&|8\u001a\\ja>\u0002\u0012%ap")), method2097(method2096("\u0017\u0014[&j5UF%/4\u001bF/}q\u0001Y\u007f")), method2097(method2096("\u0003\u0010P?f=\u0011[$hq\u0018S:")), method2097(method2096("\u0017\u001a@)j5UF=j4\u001b[$hq0|\u000bM\u001d0vk")), method2097(method2096("7\u0005A%a")), method2097(method2096("6\u0010F)h2\u001a]8k")), method2097(method2096("\u0019\u0010[-g%O\u0012")), method2097(method2096("2\u001a_'n?\u0011A")), method2097(method2096(">\u0016Q&z5\u0010")), method2097(method2096("\u0015Fvj{>\u001a^!f%O\u0012j")), method2097(method2096("\u0014\u001bF/}4\u0011\u0012>dc")), method2097(method2096("$\u001e\u001c\b'")), method2097(method2096("$\u001e\u001c\u000b'"))};
   @OriginalMember(
      owner = "client!uk",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3779 = null;
   @OriginalMember(
      owner = "client!uk",
      name = "d",
      descriptor = "I"
   )
   public static int field3781;
   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "I"
   )
   public static int field3782;
   @OriginalMember(
      owner = "client!uk",
      name = "e",
      descriptor = "I"
   )
   public static int field3783;
   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "Ljg;"
   )
   public static class356 field3780;

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(II)Z",
      line = 4
   )
   public static final boolean method2093(int arg0, int arg1) {
      try {
         if (arg1 > -7) {
            method2093(14, 102);
         }

         ++field3783;
         return arg0 == 2 || ~arg0 == -4;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3784[206] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(I)V",
      line = 17
   )
   public static void method2094(int arg0) {
      try {
         field3780 = null;
         field3779 = null;
         if (arg0 != 1024) {
            field3780 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3784[205] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "write",
      descriptor = "(I)V",
      line = 30
   )
   public final void write(int arg0) throws IOException {
      try {
         ++field3782;
         throw new IOException();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3784[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(ZILjava/lang/String;Z)V",
      line = 40
   )
   public static final void method2095(boolean arg0, int arg1, String arg2, boolean arg3) {
      int var4 = client.field4530;

      try {
         ++field3781;

         try {
            label810: {
               if (!arg2.equalsIgnoreCase(field3784[201]) && !arg2.equalsIgnoreCase(field3784[3])) {
                  if (!arg2.equalsIgnoreCase(field3784[1])) {
                     if (arg2.equalsIgnoreCase(field3784[111])) {
                        class576.field8555 = !class576.field8555;
                        if (!class576.field8555) {
                           class335.method2539((byte)-110, field3784[126]);
                           return;
                        }

                        class335.method2539((byte)-110, field3784[98]);
                        return;
                     }

                     if (arg2.equals(field3784[2])) {
                        class110 var5 = class786.field11439.method595();
                        class335.method2539((byte)-110, field3784[66] + var5.field1347);
                        class335.method2539((byte)-110, field3784[43] + var5.field1343);
                        class335.method2539((byte)-110, field3784[102] + var5.field1342);
                        class335.method2539((byte)-110, field3784[153] + var5.field1345);
                        class335.method2539((byte)-110, field3784[32] + var5.field1344);
                        return;
                     }

                     if (arg2.equals(field3784[36])) {
                        class335.method2539((byte)-110, field3784[44] + class56.field704 + field3784[14]);
                        return;
                     }
                     break label810;
                  }

                  class793.field11555 = 0;
                  class180.field2220 = 0;
                  return;
               }

               class335.method2539((byte)-110, field3784[119]);
               class335.method2539((byte)-110, field3784[128]);
               class335.method2539((byte)-110, field3784[138]);
               class335.method2539((byte)-110, field3784[54]);
               class335.method2539((byte)-110, field3784[78]);
               return;
            }
         } catch (Exception var52) {
            class335.method2539((byte)-110, class204.field2566.method1562((byte)-78, class728.field10827));
            return;
         }

         int var6 = -53 / ((arg1 - 37) / 57);
         if (class487.field7208 != class281.field3917 || ~class445.field6773 <= -3) {
            if (arg2.equalsIgnoreCase(field3784[151])) {
               throw new RuntimeException();
            }

            if (arg2.equals(field3784[93])) {
               throw new OutOfMemoryError(field3784[129]);
            }

            try {
               label754: {
                  if (arg2.equalsIgnoreCase(field3784[189])) {
                     class335.method2539((byte)-110, field3784[58] + class280.field3898);
                     return;
                  }

                  if (arg2.equalsIgnoreCase(field3784[202])) {
                     class554.field8210 = !class554.field8210;
                     if (class554.field8210) {
                        class335.method2539((byte)-110, field3784[194]);
                        return;
                     }

                     class335.method2539((byte)-110, field3784[63]);
                     return;
                  }

                  if (arg2.equalsIgnoreCase(field3784[198])) {
                     class576.field8555 = true;
                     class335.method2539((byte)-110, field3784[103]);
                     return;
                  }

                  if (arg2.equalsIgnoreCase(field3784[184])) {
                     class576.field8555 = false;
                     class335.method2539((byte)-110, field3784[101]);
                     return;
                  }

                  if (arg2.equals(field3784[12])) {
                     try {
                        class335.method2539((byte)-110, field3784[18] + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class488.field7219.field9191 + field3784[59]);
                        return;
                     } catch (Throwable var46) {
                        return;
                     }
                  }

                  if (arg2.equalsIgnoreCase(field3784[152])) {
                     class792.field11509.method98(true);
                     class335.method2539((byte)-110, field3784[91]);
                     return;
                  }

                  if (!arg2.equalsIgnoreCase(field3784[57])) {
                     if (arg2.equalsIgnoreCase(field3784[28])) {
                        class199.method1527(34);
                        int var10 = 0;
                        if (var4 != 0) {
                           System.gc();
                           ++var10;
                        }

                        while(true) {
                           if (var10 >= 10) {
                              Runtime var11 = Runtime.getRuntime();
                              int var12 = (int)((var11.totalMemory() - var11.freeMemory()) / 1024L);
                              class335.method2539((byte)-110, field3784[141] + var12 + "k");
                              class530.method3919(0);
                              class199.method1527(12);
                              int var13 = 0;
                              if (var4 == 0) {
                                 if (var4 != 0) {
                                    System.gc();
                                    ++var13;
                                 }

                                 while(true) {
                                    while(var13 < 10) {
                                       System.gc();
                                       ++var13;
                                    }

                                    int var14 = (int)((var11.totalMemory() + -var11.freeMemory()) / 1024L);
                                    class335.method2539((byte)-110, field3784[19] + var14 + "k");
                                    if (var4 == 0) {
                                       return;
                                    }

                                    ++var13;
                                 }
                              }
                           } else {
                              System.gc();
                           }

                           ++var10;
                        }
                     }

                     if (arg2.equalsIgnoreCase(field3784[188])) {
                        class335.method2539((byte)-110, class178.method1406((byte)55) ? field3784[145] : field3784[45]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[173])) {
                        class335.method2539((byte)-110, field3784[156]);
                        if (class672.field10112 == 10) {
                           class365.method2833((byte)76);
                           return;
                        }

                        if (class672.field10112 == 11) {
                           class768.field11267 = true;
                        }

                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[53])) {
                        class351.field5344.method5034(3455);
                        class335.method2539((byte)-110, field3784[6]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[31])) {
                        class481.field7144.method1933((byte)16);
                        class335.method2539((byte)-110, field3784[25]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[180])) {
                        class481.field7144.method1926((byte)113);
                        class335.method2539((byte)-110, field3784[182]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[61])) {
                        class755.field11144.method5198((byte)22);
                        class429.field6546.method811(true);
                        class481.field7144.method1929(124);
                        class335.method2539((byte)-110, field3784[75]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[21])) {
                        class298.method2274(-72);
                        class431.method3282(false);
                        class335.method2539((byte)-110, field3784[196]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[51])) {
                        class196.field2436 = class188.method1462(true);
                        class577.field8566 = true;
                        class298.method2274(-116);
                        class431.method3282(false);
                        class335.method2539((byte)-110, field3784[140]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[158])) {
                        class734.method5339(120, -1, 1, -1, false);
                        if (class694.method5042(true) == 1) {
                           class335.method2539((byte)-110, field3784[169]);
                           return;
                        }

                        class335.method2539((byte)-110, field3784[74]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[38])) {
                        class734.method5339(110, -1, 2, -1, false);
                        if (~class694.method5042(true) == -3) {
                           class335.method2539((byte)-110, field3784[149]);
                           return;
                        }

                        class335.method2539((byte)-110, field3784[170]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[56])) {
                        class734.method5339(92, 768, 3, 1024, false);
                        if (class694.method5042(true) == 3) {
                           class335.method2539((byte)-110, field3784[17]);
                           return;
                        }

                        class335.method2539((byte)-110, field3784[55]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[178])) {
                        class428.method3261(false, -126, 0);
                        if (~class261.field3566.field9464.method4225(98) == -1) {
                           class335.method2539((byte)-110, field3784[89]);
                           class261.field3566.method4677(class261.field3566.field9465, 111, 0);
                           class471.method3510((byte)118);
                           class455.field6907 = false;
                           return;
                        }

                        class335.method2539((byte)-110, field3784[164]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[48])) {
                        class428.method3261(false, -125, 1);
                        if (class261.field3566.field9464.method4225(110) != 1) {
                           class335.method2539((byte)-110, field3784[160]);
                           return;
                        }

                        class335.method2539((byte)-110, field3784[137]);
                        class261.field3566.method4677(class261.field3566.field9465, 80, 1);
                        class471.method3510((byte)118);
                        class455.field6907 = false;
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[35])) {
                        class428.method3261(false, -126, 2);
                        if (~class261.field3566.field9464.method4225(89) == -3) {
                           class335.method2539((byte)-110, field3784[204]);
                           class261.field3566.method4677(class261.field3566.field9465, 81, 2);
                           class471.method3510((byte)118);
                           class455.field6907 = false;
                           return;
                        }

                        class335.method2539((byte)-110, field3784[168]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[177])) {
                        class428.method3261(false, -126, 3);
                        if (~class261.field3566.field9464.method4225(108) != -4) {
                           class335.method2539((byte)-110, field3784[95]);
                           return;
                        }

                        class335.method2539((byte)-110, field3784[33]);
                        class261.field3566.method4677(class261.field3566.field9465, 48, 3);
                        class471.method3510((byte)118);
                        class455.field6907 = false;
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[82])) {
                        class428.method3261(false, -122, 5);
                        if (class261.field3566.field9464.method4225(117) != 5) {
                           class335.method2539((byte)-110, field3784[195]);
                           return;
                        }

                        class335.method2539((byte)-110, field3784[65]);
                        class261.field3566.method4677(class261.field3566.field9465, 117, 5);
                        class471.method3510((byte)118);
                        class455.field6907 = false;
                        return;
                     }

                     if (arg2.startsWith(field3784[49])) {
                        if (~arg2.length() > -7) {
                           class335.method2539((byte)-110, field3784[179]);
                           return;
                        }

                        int var15 = class561.method4150((byte)27, arg2.substring(6));
                        if (var15 >= 0 && class666.method4768(class56.field704, -97) >= var15) {
                           class261.field3566.method4677(class261.field3566.field9446, 62, var15);
                           class471.method3510((byte)118);
                           class455.field6907 = false;
                           class335.method2539((byte)-110, field3784[52] + class261.field3566.field9446.method1176(101));
                           return;
                        }

                        class335.method2539((byte)-110, field3784[179]);
                        return;
                     }

                     if (arg2.startsWith(field3784[7])) {
                        if (arg2.length() < 10) {
                           class335.method2539((byte)-110, field3784[159]);
                           return;
                        }

                        class67.field829 = class561.method4150((byte)27, arg2.substring(10).trim());
                        class335.method2539((byte)-110, field3784[34] + class67.field829);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[139])) {
                        class384.field5876 = true;
                        class335.method2539((byte)-110, field3784[94] + class384.field5876);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[107])) {
                        class100.field1220 = !class100.field1220;
                        class335.method2539((byte)-110, field3784[125] + class100.field1220);
                        return;
                     }

                     if (arg2.startsWith(field3784[171])) {
                        boolean var16 = class786.field11439.method657();
                        if (!class241.method1794(27217, !var16)) {
                           class335.method2539((byte)-110, field3784[112]);
                           return;
                        }

                        if (var16) {
                           class335.method2539((byte)-110, field3784[11]);
                           return;
                        }

                        class335.method2539((byte)-110, field3784[124]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[150])) {
                        if (class631.field9178) {
                           class631.field9178 = false;
                           class335.method2539((byte)-110, field3784[161]);
                           return;
                        }

                        class631.field9178 = true;
                        class335.method2539((byte)-110, field3784[197]);
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[4])) {
                        if (class161.field2028) {
                           class335.method2539((byte)-110, field3784[15]);
                           class161.field2028 = false;
                           return;
                        }

                        class335.method2539((byte)-110, field3784[22]);
                        class161.field2028 = true;
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[199])) {
                        class335.method2539((byte)-110, field3784[186] + (class693.field10418.field9003 >> 9) + field3784[46] + (class693.field10418.field9007 >> 9));
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[113])) {
                        class335.method2539((byte)-110, field3784[200] + class377.field5711[class693.field10418.field9010].method2235(class693.field10418.field9007 >> 9, 2116912585, class693.field10418.field9003 >> 9));
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[23])) {
                        class521.field7580.method3898(-45);
                        class521.field7580.method3897((byte)123);
                        class427.field6523.method4153((byte)123);
                        class536.field7828.method3291(false);
                        class431.method3282(false);
                        class335.method2539((byte)-110, field3784[88]);
                        return;
                     }

                     if (arg2.startsWith(field3784[136])) {
                        if (!class786.field11439.method591()) {
                           class335.method2539((byte)-110, field3784[183]);
                           return;
                        }

                        int var17;
                        label576: {
                           var17 = Integer.parseInt(arg2.substring(3));
                           if (~var17 <= -2) {
                              if (~var17 >= -5) {
                                 break label576;
                              }

                              var17 = 4;
                              if (var4 == 0) {
                                 break label576;
                              }
                           }

                           var17 = 1;
                        }

                        class437.field6675 = var17;
                        class298.method2274(-51);
                        class335.method2539((byte)-110, field3784[99] + class437.field6675);
                        return;
                     }

                     if (arg2.startsWith(field3784[16])) {
                        class335.method2539((byte)-110, field3784[29] + class686.field10293.method5450(-25) + "/" + class686.field10293.method5458((byte)100));
                        class335.method2539((byte)-110, field3784[154] + class466.field6990.method5450(-69) + "/" + class466.field6990.method5458((byte)100));
                        class335.method2539((byte)-110, field3784[117] + class54.field616.field2860.method1628(-8257) + "/" + class54.field616.field2860.method1637(19617));
                        return;
                     }

                     if (arg2.equalsIgnoreCase(field3784[175])) {
                        class335.method2539((byte)-110, field3784[83] + class693.field10418.field9010 + "," + ((class731.field10844 >> 9) + class718.field10676 >> 6) + "," + ((class232.field2947 >> 9) - -class669.field10064 >> 6) + "," + ((class731.field10844 >> 9) + class718.field10676 & 63) + "," + ((class232.field2947 >> 9) + class669.field10064 & 63) + field3784[42] + (class368.method2858(class232.field2947, (byte)-11, class731.field10844, class693.field10418.field9010) - class733.field10871));
                        class335.method2539((byte)-110, field3784[192] + class693.field10418.field9010 + "," + (class718.field10676 + class29.field320 >> 6) + "," + (class310.field4418 - -class669.field10064 >> 6) + "," + (class718.field10676 + class29.field320 & 63) + "," + (class669.field10064 + class310.field4418 & 63) + field3784[42] + (class368.method2858(class310.field4418, (byte)-11, class29.field320, class693.field10418.field9010) - class42.field453));
                        return;
                     }

                     if (!arg2.equals(field3784[118]) && !arg2.equals(field3784[79])) {
                        if (arg2.startsWith(field3784[67])) {
                           int var18 = -1;
                           int var19 = 1000;
                           if (arg2.length() > 15) {
                              String[] var20 = class136.method1163(' ', arg2, 120);

                              try {
                                 if (var20.length > 1) {
                                    var19 = Integer.parseInt(var20[1]);
                                 }
                              } catch (Throwable var48) {
                              }

                              try {
                                 if (var20.length > 2) {
                                    var18 = Integer.parseInt(var20[2]);
                                 }
                              } catch (Throwable var47) {
                              }
                           }

                           if (~var18 == 0) {
                              class335.method2539((byte)-110, field3784[40] + class68.method685(-85, var19, 0));
                              class335.method2539((byte)-110, field3784[13] + class68.method685(-24, var19, 2));
                              class335.method2539((byte)-110, field3784[203] + class68.method685(-118, var19, 3));
                              class335.method2539((byte)-110, field3784[50] + class68.method685(-98, var19, 1));
                              class335.method2539((byte)-110, field3784[72] + class68.method685(-107, var19, 5));
                              return;
                           }

                           class335.method2539((byte)-110, field3784[20] + class68.method685(-106, var19, var18));
                           return;
                        }

                        if (arg2.equals(field3784[70])) {
                           class100.field1230 = !class100.field1230;
                           class335.method2539((byte)-110, field3784[26] + class100.field1230);
                           return;
                        }

                        if (arg2.equals(field3784[85])) {
                           class478.method3543(-1);
                           class335.method2539((byte)-110, field3784[68]);
                           return;
                        }

                        if (arg2.startsWith(field3784[162])) {
                           int var21 = Integer.parseInt(arg2.substring(12));
                           class148.method1221(var21, class70.method700(-110, var21).field226, 19065);
                           class335.method2539((byte)-110, field3784[110]);
                           return;
                        }

                        if (arg2.equals(field3784[84])) {
                           class335.method2539((byte)-110, field3784[176] + class351.field5344.field10414);
                           return;
                        }

                        if (arg2.startsWith(field3784[123])) {
                           class180 var22 = class486.method3603(class408.field6226, (byte)-105, class48.field583);
                           var22.field2211.method1085(0, (byte)-11);
                           int var23 = var22.field2211.field1590;
                           int var24 = arg2.indexOf(" ", 4);
                           var22.field2211.method1101(arg2.substring(3, var24), -115);
                           class428.method3263(70, var22.field2211, arg2.substring(var24));
                           var22.field2211.method1099(-var23 + var22.field2211.field1590, true);
                           class763.method5527(false, var22);
                           return;
                        }

                        if (arg2.equals(field3784[146])) {
                           class190.method1476((byte)-63);
                           class335.method2539((byte)-110, field3784[81]);
                           return;
                        }

                        if (!arg2.equals(field3784[127])) {
                           if (arg2.equals(field3784[131])) {
                              class756.field11153 = true;
                              class431.method3282(false);
                              class335.method2539((byte)-110, field3784[27]);
                              return;
                           }

                           if (arg2.equals(field3784[64])) {
                              class756.field11153 = false;
                              class431.method3282(false);
                              class335.method2539((byte)-110, field3784[165]);
                              return;
                           }

                           if (arg2.equals(field3784[187])) {
                              class607.method4426(-16770);
                              class335.method2539((byte)-110, field3784[121]);
                              return;
                           }

                           if (arg2.equals(field3784[108])) {
                              class335.method2539((byte)-110, class24.method159(1) + field3784[5]);
                              return;
                           }

                           if (arg2.startsWith(field3784[100])) {
                              int var26 = Integer.parseInt(arg2.substring(17));
                              class335.method2539((byte)-110, field3784[80] + class597.field8793.method866(var26, 15710));
                              return;
                           }

                           if (arg2.startsWith(field3784[148])) {
                              int var27 = Integer.parseInt(arg2.substring(14));
                              class335.method2539((byte)-110, field3784[30] + class597.field8793.method867(-1, var27));
                              return;
                           }

                           if (arg2.startsWith(field3784[109])) {
                              String[] var28 = class136.method1163(' ', arg2.substring(12), 127);
                              if (~var28.length <= -3) {
                                 int var29 = ~var28.length >= -3 ? 0 : Integer.parseInt(var28[2]);
                                 class323.method2443(var28[0], (byte)85, var29, var28[1]);
                                 return;
                              }
                           }

                           if (arg2.startsWith(field3784[9])) {
                              String[] var30 = class136.method1163(' ', arg2.substring(8), 110);
                              int var31 = Integer.parseInt(var30[0]);
                              int var32 = ~var30.length == -3 ? Integer.parseInt(var30[1]) : 0;
                              class36.method252(var31, 6, var32);
                              return;
                           }

                           if (arg2.startsWith(field3784[130])) {
                              class265.method2026();
                              return;
                           }

                           if (arg2.startsWith(field3784[60])) {
                              class265.method2027(100, false);
                              return;
                           }

                           if (arg2.startsWith(field3784[10])) {
                              class265.method2027(10, true);
                              return;
                           }

                           if (arg2.startsWith(field3784[76])) {
                              int var33 = Integer.parseInt(arg2.substring(8));
                              class786.field11439.method643(var33);
                              return;
                           }

                           if (arg2.equals(field3784[135])) {
                              class335.method2539((byte)-110, field3784[86] + class149.field1871.method5582());
                              return;
                           }

                           if (arg2.equals(field3784[190])) {
                              class507.method3761(115);
                              class335.method2539((byte)-110, field3784[147] + class261.field3566.field9464.method4225(125));
                              return;
                           }

                           if (arg2.equals(field3784[163])) {
                              class335.method2539((byte)-110, class158.field2008.method2387(-76));
                              return;
                           }

                           if (arg2.equals(field3784[122])) {
                              label584: {
                                 if (!class719.field10719.startsWith(field3784[116])) {
                                    class766.method5544(false, new File(field3784[144]), (byte)-123);
                                    if (var4 == 0) {
                                       break label584;
                                    }
                                 }

                                 class766.method5544(false, new File(field3784[24]), (byte)-123);
                              }

                              class335.method2539((byte)-110, field3784[155]);
                              return;
                           }

                           if (arg2.equals(field3784[37])) {
                              class335.method2539((byte)-110, field3784[43] + class719.field10719);
                              class335.method2539((byte)-110, field3784[47] + class719.field10698);
                              class335.method2539((byte)-110, field3784[174] + class719.field10696);
                              return;
                           }

                           if (arg2.startsWith(field3784[172])) {
                              int var34 = Integer.parseInt(arg2.substring(8, 9));
                              class611.field8951 = var34;
                              class298.method2274(-96);
                              class335.method2539((byte)-110, field3784[73]);
                              return;
                           }

                           if (arg2.startsWith(field3784[77])) {
                              int var35 = arg2.indexOf(32);
                              if (~var35 > -1) {
                                 class335.method2539((byte)-110, field3784[191]);
                                 return;
                              }

                              int var36 = class561.method4150((byte)27, arg2.substring(var35 + 1));
                              class261.field3566.method4677(class261.field3566.field9470, 106, var36);
                              class471.method3510((byte)118);
                              class455.field6907 = false;
                              class219.method1653((byte)23);
                              if (var36 != class261.field3566.field9470.method2372(101)) {
                                 class335.method2539((byte)-110, field3784[120]);
                                 return;
                              }

                              class335.method2539((byte)-110, field3784[104]);
                              return;
                           }

                           if (arg2.startsWith(field3784[97])) {
                              if (~class261.field3566.field9470.method2372(116) == -1) {
                                 class335.method2539((byte)-110, field3784[39]);
                                 return;
                              }

                              int var37 = class561.method4150((byte)27, arg2.substring(1 + arg2.indexOf(32)));
                              class221.field2834 = var37;
                              class335.method2539((byte)-110, field3784[106] + class221.field2834);
                              return;
                           }

                           if (arg2.startsWith(field3784[115])) {
                              int var38 = class561.method4150((byte)27, arg2.substring(arg2.indexOf(32) + 1));
                              class715.field10657 = var38;
                              class405.field6213 = var38;
                              class335.method2539((byte)-110, field3784[166] + var38);
                              class219.method1653((byte)23);
                              return;
                           }

                           if (arg2.equals(field3784[134])) {
                              class485.field7180 = !class485.field7180;
                              class335.method2539((byte)-110, field3784[69] + (!class485.field7180 ? field3784[157] : field3784[92]));
                              return;
                           }

                           if (arg2.startsWith(field3784[105])) {
                              File var39 = new File(arg2.substring(10));
                              if (var39.exists()) {
                                 var39 = new File(arg2.substring(10) + "." + class188.method1462(true) + field3784[185]);
                                 if (var39.exists()) {
                                    class335.method2539((byte)-110, field3784[181]);
                                    return;
                                 }
                              }

                              if (class186.field2336 != null) {
                                 class186.field2336.close();
                                 class186.field2336 = null;
                              }

                              try {
                                 class186.field2336 = new FileOutputStream(var39);
                                 return;
                              } catch (FileNotFoundException var49) {
                                 class335.method2539((byte)-110, field3784[114] + var39.getName());
                                 return;
                              } catch (SecurityException var50) {
                                 class335.method2539((byte)-110, field3784[133] + var39.getName());
                                 return;
                              }
                           }

                           if (arg2.equals(field3784[87])) {
                              if (class186.field2336 != null) {
                                 class186.field2336.close();
                              }

                              class186.field2336 = null;
                              return;
                           }

                           if (arg2.startsWith(field3784[71])) {
                              File var40 = new File(arg2.substring(10));
                              if (!var40.exists()) {
                                 class335.method2539((byte)-110, field3784[143]);
                                 return;
                              }

                              byte[] var41 = class663.method4755(var40, (byte)-106);
                              if (var41 == null) {
                                 class335.method2539((byte)-110, field3784[142]);
                                 return;
                              }

                              String[] var42 = class136.method1163('\n', class538.method3992(class348.method2726((byte)7, var41), "", (byte)-118, '\r'), 96);
                              class594.method4361(var42, true);
                           }

                           if (arg2.startsWith(field3784[90])) {
                              short var43 = (short)class561.method4150((byte)27, arg2.substring(5));
                              if (~var43 < -1) {
                                 class497.field7372 = var43;
                              }

                              return;
                           }

                           if (class672.field10112 == 10) {
                              ++class154.field1936;
                              class180 var44 = class486.method3603(class198.field2458, (byte)-39, class48.field583);
                              var44.field2211.method1085(arg2.length() + 3, (byte)-11);
                              var44.field2211.method1085(arg0 ? 1 : 0, (byte)-11);
                              var44.field2211.method1085(arg3 ? 1 : 0, (byte)-11);
                              var44.field2211.method1101(arg2, -65);
                              class763.method5527(false, var44);
                           }

                           if (arg2.startsWith(field3784[167]) && class487.field7208 != class281.field3917) {
                              class377.method2919(class561.method4150((byte)27, arg2.substring(4)), (byte)-16);
                              return;
                           }
                           break label754;
                        }

                        int var25 = 0;
                        if (var4 != 0) {
                           if (class491.field7260[var25]) {
                              class732.field10855[var25] = (int)(Math.random() * 99999.0D);
                              if (Math.random() > 0.5D) {
                                 class732.field10855[var25] *= -1;
                              }
                           }

                           ++var25;
                        }

                        while(true) {
                           while(~class732.field10855.length < ~var25) {
                              if (class491.field7260[var25]) {
                                 class732.field10855[var25] = (int)(Math.random() * 99999.0D);
                                 if (Math.random() > 0.5D) {
                                    class732.field10855[var25] *= -1;
                                 }
                              }

                              ++var25;
                           }

                           class190.method1476((byte)-63);
                           class335.method2539((byte)-110, field3784[62]);
                           if (var4 == 0) {
                              return;
                           }

                           ++var25;
                        }
                     }

                     class764.field11226 = !class764.field11226;
                     class786.field11439.method543(class764.field11226);
                     class41.method284(-126);
                     class335.method2539((byte)-110, field3784[193] + class764.field11226);
                     return;
                  }

                  class199.method1527(-95);
                  int var7 = 0;
                  if (var4 != 0) {
                     System.gc();
                     ++var7;
                  }

                  while(true) {
                     while(~var7 > -11) {
                        System.gc();
                        ++var7;
                     }

                     Runtime var8 = Runtime.getRuntime();
                     int var9 = (int)((var8.totalMemory() - var8.freeMemory()) / 1024L);
                     class335.method2539((byte)-110, field3784[132] + var9 + "k");
                     if (var4 == 0) {
                        return;
                     }

                     ++var7;
                  }
               }
            } catch (Exception var51) {
               class335.method2539((byte)-110, class204.field2566.method1562((byte)-121, class728.field10827));
               return;
            }
         }

         if (class672.field10112 != 10) {
            class335.method2539((byte)-110, class204.field2567.method1562((byte)-92, class728.field10827) + arg2);
         }
      } catch (RuntimeException var53) {
         throw class670.method4877(var53, field3784[96] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3784[41] : field3784[8]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2096(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2097(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
