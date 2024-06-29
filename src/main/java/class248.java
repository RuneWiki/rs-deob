import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class248 extends class125 {
   @OriginalMember(
      owner = "client!pfa",
      name = "p",
      descriptor = "Z"
   )
   private boolean field3129 = false;
   @OriginalMember(
      owner = "client!pfa",
      name = "i",
      descriptor = "Ldu;"
   )
   private class429 field3123;
   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "Ldu;"
   )
   private class429 field3127;
   @OriginalMember(
      owner = "client!pfa",
      name = "q",
      descriptor = "Ldu;"
   )
   private class429 field3137;
   @OriginalMember(
      owner = "client!pfa",
      name = "g",
      descriptor = "Ldu;"
   )
   private class429 field3141;
   @OriginalMember(
      owner = "client!pfa",
      name = "r",
      descriptor = "Z"
   )
   private boolean field3140;
   @OriginalMember(
      owner = "client!pfa",
      name = "o",
      descriptor = "Lkk;"
   )
   private class266 field3134;
   @OriginalMember(
      owner = "client!pfa",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3144 = new String[]{method1974(method1973("<)XdJd")), method1974(method1973("\":U&")), method1974(method1973("7a\u0017dp")), method1974(method1973("<)XdId")), method1974(method1973("<)XdNd")), method1974(method1973("<)XdGd")), method1974(method1973("<)XdEd")), method1974(method1973("<)XdOd")), method1974(method1973("mnx\u0018O:?\bd=F\u000em\u001e_\u0005\r\u0019jd\u001c Jj-lo\u0019j-lo\u0004j{)=M/ub?V9d8&V$6F\u000em\u001e_\u0005\r\u0019jd\u000f U%x>o\u0019j-lo\u0004j{)=M/ub,V&b>t3\u000bY\u0018\u001dp\b-l&m/u\u000f V8ilo\u0019j0l9\\8y)7\u0017>h4,V%\u007f(\u0014\t\u00176F\u0000l\u001e]\u0019\u001b\u0019jb\u001c Jj-lo\u0019j-lo\u0004j\u007f)<L&yb?V9d8&V$6F\u0000l\u001e]\u0019\u001b\u0019jb\u000f U%x>o\u0019j-lo\u0004j\u007f)<L&yb,V&b>t3\u0005X\u0018\u001fl\u001e-l m/u\u000f V8i|o\u0019j0l=\\9x ;\u0017>h4,V%\u007f(\u0014\t\u00176F\u0000l\u001e]\u0019\u001b\u0019jb\u0018*A\tb#=]{-lo\u0004j\u007f)<L&yb;\\2n# K.V}\u0012\u0002@B\u0019\u001bi\u001fYloV\fb+\fV%\u007f(o\u0019j-qoK/~9#Mdk#(Z%b>+\u0002@]\r\u001dx\u0007-lo_%j\u001c.K+`?o\u0019j-qoI8b+=X'#  Z+a\u0017\u007fdq\u0007\u001c\u000ek\u000b@lo\u0019=l8*K\u001aa-!\\j-lr\u0019:\u007f#(K+`b#V)l \u0014\b\u00176F\u001fx\u0018L\u0001o\u0019j}\u0001.M8d4\u0014\r\u0017-lo\u0004jvl<M+y)aT+y>&Ad}> S/n8&V$-1t3\u001aL\u001e\u000etj-l\"O\u0007l8=P2Vx\u0012\u0019j0l4\u00199y-;\\d`-;K#ub\"V.h 9P/zl2\u0002@]\r\u001dx\u0007-loM/u\u0001.M8d4\u0014\r\u0017-qoBj~8.M/#!.M8d4aM/u8:K/V|\u0012\u001976F\u001b|\u0007]lo\u0019j{%*N\u001ab?c\u0019,b+\tX)y#=\u0015ji)?M\"6F\u000bi~-loO#h;\u001fV9#4c\u0019'{\u0001.M8d4\u0014\t\u0017!l&i%~wE}\u001a9lo\u0019<d)8i%~b6\u0015j`:\u0002X>\u007f%7b{P`oP\u001ab?t3\u000e]xo\u0019j{%*N\u001ab?aCf-!9t+y>&A\u0011?\u0011c\u0019#]#<\u0002@I\u001c{\u0019j-:&\\=]#<\u0017=!l\"O\u0007l8=P2V\u007f\u0012\u0015jd\u001c Jq\u0007\u001f\u001a{j-l)V-K-,M%\u007fb7\u0015j :&\\=]#<\u00170!l)V-]-=X'~b7\u0002@@\u0019\u0003\u0019j-* ^\fl/;V8#4c\u0019,b+\tX)y#=\u00172!l\u007f\u0017z=}v\fy<~z\u0002@I\u001c{\u0019j-(*I>e`oN+y)=i&l\"*\u0015j{%*N\u001ab?t3\u0007L\bo\u0019jk#(\u007f+n8 Kdt`o\u0014.h<;Qf-* ^\u001al>.T9#6c\u0019,b+\u001fX8l!<\u0017=6F\u001cl\b-lo_%j\n.Z>b>aCf-a9P/z\u001c Jdw`o_%j\u001c.K+`?a@q\u0007\u0001\u001auj-l)V-K-,M%\u007fb5\u0015jk#(\u007f+n8 Kdw`o\td=||\u0000z;~z\u0002@@\u0005\u0001\u0019j-* ^\fl/;V8!l)V-K-,M%\u007f`o\bq\u0007\u0001\u000eaj-l)V-K-,M%\u007f`o_%j\n.Z>b>c\u0019z6F\u0002l\u0006-lo_%j\n.Z>b>aCf-* ^\fl/;V8#6c\u0019gi)?M\"6F\u0002x\u000e-loO#h;\u001fV9#46Cf-;.M/\u007f\u001c#X$hb7@0z`o_%j\n.Z>b>aC0w6c\u0019<d)8i%~b7@0zwEt\u000bUlo\u0019%Y)7z%b>+\bdu55\u0015jk#(\u007f+n8 Kdu47Af-* ^\fl/;V8#56@36F\u0002v\u001c-loV\u001eh4\fV%\u007f(~\u0017=!l~\u0002@@\u0003\u0019\u0019j-#\fV&b9=\u0015jd\u000f U%x>t3\u000e]xo\u0019jb\u001c Jdu`oI\u0007l8=P2V|\u0012\u0015j{%*N\u001ab?t3\u000e]xo\u0019jb\u001c Jdt`oI\u0007l8=P2V}\u0012\u0015j{%*N\u001ab?t3\u000e]xo\u0019jb\u001c Jdw`oI\u0007l8=P2V~\u0012\u0015j{%*N\u001ab?t3\u000e]xo\u0019jb\u001c Jdz`oI\u0007l8=P2V\u007f\u0012\u0015j{%*N\u001ab?t3\u0007B\u001ao\u0019jb\n ^\tb#=]du`oO#h;\u001fV9#6t3\u000e]xo\u0019jb\u0018*A\tb#=]z#4c\u0019>h4\u0002X>\u007f%7bzP`oP\u001eh4\fV%\u007f(t3\u000e]xo\u0019jb\u0018*A\tb#=]z#5c\u0019>h4\u0002X>\u007f%7b{P`oP\u001eh4\fV%\u007f(t3\u000e]xo\u0019jb\u0018*A\tb#=]z#6c\u0019>h4\u0002X>\u007f%7bxP`oP\u001eh4\fV%\u007f(t3\u0007B\u001ao\u0019jb\u0018*A\tb#=]z#;c\u0019{6F\nw\u000e\u0007")), method1974(method1973("mnx\u0018O:?\bd=F\u000em\u001e_\u0005\r\u0019jd\u001c Jj-lo\u0019j-lo\u0004j{)=M/ub?V9d8&V$6F\u000em\u001e_\u0005\r\u0019jd\u0002 K'l o\u0019j-lo\u0004j{)=M/ub!V8`-#\u0002@L\u0018\u001bk\u0003OloP\tb  L8-lo\u0019j-qoO/\u007f8*Adn##V86F\u000em\u001e_\u0005\r\u0019jd\u0018*A\tb#=]j-lo\u0004j{)=M/ub;\\2n# K.V|\u0012\u0002@B\u0019\u001bi\u001fYloV\u001ab?o\u0019j-lo\u0019j-qoK/~9#Md}#<P>d#!\u0002@B\u0019\u001bi\u001fYloV\tb  L8-lo\u0019j-qoK/~9#Mdn##V86F\u0000l\u001e]\u0019\u001b\u0019jb\u0018*A\tb#=]z-lo\u0004j\u007f)<L&yb;\\2n# K.V|\u0012\u0002@B\u0019\u001bi\u001fYloV\u001eh4\fV%\u007f(~\u0019j-qoK/~9#Mdy)7Z%b>+b{PwEv\u001fY\u001c\u001amj-#\tV-N# K.-lo\u0019w->*J?a8a_%j/ V8iwEi\u000b_\r\u0002\u0019j-* ^\u001al>.T9-lo\u0019w-<=V-\u007f-\"\u0017&b/.U\u0011=\u0011t3\u001aL\u001e\u000etj-l8X>h>\u001fU+c)o\u0019j0l?K%j>.Tda#,X&V}\u0012\u0002@]\r\u001dx\u0007-loI\u0007l8=P2Vx\u0012\u0019j-qoBj~8.M/#!.M8d4aI8b&*Z>d#!\u001976F\u001fx\u0018L\u0001o\u0019j`:\u0002X>\u007f%7b~Plo\u0004jvl<M+y)aT+y>&Ad`#+\\&{%*NjpwEi\u000b_\r\u0002\u0019j-8*A\u0007l8=P2Vx\u0012\u0019w-7oJ>l8*\u0017'l8=P2#8*A>x>*bzPl2\u0002@Y\t\u0002ij-loO#h;\u001fV9!l9P/z\u0002 K'l c\u0019,b+\tX)y#=\u0015ji)?M\"!l,V&b9=\u0015jc( M&6F\u000bi~-loO#h;\u001fV9#4c\u0019'{\u0001.M8d4\u0014\t\u0017!l&i%~wE}\u001a9lo\u0019<d)8i%~b6\u0015j`:\u0002X>\u007f%7b{P`oP\u001ab?t3\u000e]xo\u0019j{%*N\u001ab?aCf-!9t+y>&A\u0011?\u0011c\u0019#]#<\u0002@I\u001c{\u0019j-:&\\=]#<\u0017=!l\"O\u0007l8=P2V\u007f\u0012\u0015jd\u001c Jq\u0007\u001f\u001a{j-l)V-K-,M%\u007fb7\u0015j :&\\=]#<\u00170!l)V-]-=X'~b7\u0002@@\u0019\u0003\u0019j-* ^\fl/;V8#4c\u0019,b+\tX)y#=\u00172!l\u007f\u0017z=}v\fy<~z\u0002@I\u001c{\u0019j-(*I>e`oN+y)=i&l\"*\u0015j{%*N\u001ab?t3\u0007L\bo\u0019jk#(\u007f+n8 Kdt`o\u0014.h<;Qf-* ^\u001al>.T9#6c\u0019,b+\u001fX8l!<\u0017=6F\u001cl\b-lo_%j\n.Z>b>aCf-a9P/z\u001c Jdw`o_%j\u001c.K+`?a@q\u0007\u0001\u001auj-l)V-K-,M%\u007fb5\u0015jk#(\u007f+n8 Kdw`o\td=||\u0000z;~z\u0002@@\u0005\u0001\u0019j-* ^\fl/;V8!l)V-K-,M%\u007f`o\bq\u0007\u0001\u000eaj-l)V-K-,M%\u007f`o_%j\n.Z>b>c\u0019z6F\u0002l\u0006-lo_%j\n.Z>b>aCf-* ^\fl/;V8#6c\u0019gi)?M\"6F\u0002x\u000e-loO#h;\u001fV9#46Cf-;.M/\u007f\u001c#X$hb7@0z`o_%j\n.Z>b>aC0w6c\u0019<d)8i%~b7@0zwEt\u000bUlo\u0019%Y)7z%b>+\bdu55\u0015jk#(\u007f+n8 Kdu47Af-* ^\fl/;V8#56@36F\u0002v\u001c-loV\u001eh4\fV%\u007f(~\u0017=!l~\u0002@I\u001c|\u0019j-:&\\=C#=T+ab7\u0015j`:\u0002X>\u007f%7bzP`oP\u0004b>\"X&6F\u000biy-loO#h;\u0001V8`-#\u00173!l\"O\u0007l8=P2V}\u0012\u0015jd\u0002 K'l t3\u000e]\u007fo\u0019j{%*N\u0004b>\"X&#6c\u0019'{\u0001.M8d4\u0014\u000b\u0017!l&w%\u007f!.Uq\u0007\b\u001f\nj-l!]%y aAf-:&\\=C#=T+a`oJ>l8*\u0017&d+'M\u0011=\u0011aI%~%;P%cwE}\u001a>lo\u0019$i#;Udt`oO#h;\u0001V8`-#\u0015j~8.M/# &^\"y\u0017~dd}#<P>d#!\u0002@@\r\u0017\u0019j-\"+V>a`oW.b8#\u0015j=wEt\u0005[lo\u0019)b  L8!l<M+y)aU#j$;T%i)#\u0017+`.&\\$ywEt\u000bIlo\u0019)b  L8!l<M+y)aU#j$;bzPb+P,k9<\\f-\"+V>ab7A2u`oZ%a#:Kq\u0007\u0001\u000e}j-l,V&b9=\u0015j~8.M/# &^\"y\u0017~ddi%)_?~)c\u0019$i#;Udt56@f-/ U%x>t3\u0007X\u0000o\u0019jb\u000f U%x>c\u0019#N##V?\u007f`oZ%a#:Kq\u0007\b\u001f\rj-l i%~b7\u0015j}\u0001.M8d4\u0014\t\u0017!l9P/z\u001c Jq\u0007\b\u001f\rj-l i%~b6\u0015j}\u0001.M8d4\u0014\b\u0017!l9P/z\u001c Jq\u0007\b\u001f\rj-l i%~b5\u0015j}\u0001.M8d4\u0014\u000b\u0017!l9P/z\u001c Jq\u0007\b\u001f\rj-l i%~b8\u0015j}\u0001.M8d4\u0014\n\u0017!l9P/z\u001c Jq\u0007\u0001\u0000oj-l \u007f%j\u000f V8ib7\u0015j{%*N\u001ab?aCq\u0007\b\u001f\rj-l m/u\u000f V8i|aAf-8*A\u0007l8=P2V|\u0012\u0015jd\u0018*A\tb#=]q\u0007\b\u001f\rj-l m/u\u000f V8i|a@f-8*A\u0007l8=P2V}\u0012\u0015jd\u0018*A\tb#=]q\u0007\b\u001f\rj-l m/u\u000f V8i|aCf-8*A\u0007l8=P2V~\u0012\u0015jd\u0018*A\tb#=]q\u0007\u0001\u0000oj-l m/u\u000f V8i|aNf-}t3\u000fC\bE")), method1974(method1973("mnx\u0018O:?\bd=F\u000em\u001e_\u0005\r\u0019jd\u001c Jj-lo\u0019j-lo\u0004j{)=M/ub?V9d8&V$6F\u000em\u001e_\u0005\r\u0019jd\u000f U%x>o\u0019j-lo\u0004j{)=M/ub,V&b>t3\u000bY\u0018\u001dp\b-l&m/u\u000f V8ilo\u0019j0l9\\8y)7\u0017>h4,V%\u007f(\u0014\t\u00176F\u0000l\u001e]\u0019\u001b\u0019jb\u001c Jj-lo\u0019j-lo\u0004j\u007f)<L&yb?V9d8&V$6F\u0000l\u001e]\u0019\u001b\u0019jb\u000f U%x>o\u0019j-lo\u0004j\u007f)<L&yb,V&b>t3\u0005X\u0018\u001fl\u001e-l m/u\u000f V8i|o\u0019j0l=\\9x ;\u0017>h4,V%\u007f(\u0014\t\u00176F\u0000l\u001e]\u0019\u001b\u0019jb\u0018*A\tb#=]{-lo\u0004j\u007f)<L&yb;\\2n# K.V}\u0012\u0002@B\u0019\u001bi\u001fYloV\fb+\fV%\u007f(o\u0019j-qoK/~9#Mdk#(Z%b>+\u0002@]\r\u001dx\u0007-lo_%j\u001c.K+`?o\u0019j-qoI8b+=X'#  Z+a\u0017\u007fdq\u0007\u001c\u000ek\u000b@lo\u0019=l8*K\u001aa-!\\j-lr\u0019:\u007f#(K+`b#V)l \u0014\b\u00176F\u001fx\u0018L\u0001o\u0019jy\u0001.M8d4\u0014\r\u0017-lo\u0004jvl<M+y)aT+y>&Ady)7M?\u007f)\u0014\t\u0017-1t3\u001aL\u001e\u000etj-l?t+y>&A\u00119\u0011o\u0019j0l4\u00199y-;\\d`-;K#ub?K%g),M#b\"oDq\u0007\u001c\u000ek\u000b@lo\u0019'{\u0001.M8d4\u0014\r\u0017-lr\u00191-?;X>hb\"X>\u007f%7\u0017'b(*U<d)8\u001976F\u001b|\u0007]lo\u0019j{%*N\u001ab?c\u0019,b+\tX)y#=\u0002@I\u001c{\u0019j-:&\\=]#<\u00172!l\"O\u0007l8=P2V|\u0012\u0015jd\u001c Jq\u0007\b\u001f\rj-l9P/z\u001c Jdt`oT<@-;K#u\u0017~df-%\u001fV96F\u000bi~-loO#h;\u001fV9#6c\u0019'{\u0001.M8d4\u0014\u000b\u0017!l&i%~wE}\u001a9lo\u0019<d)8i%~b8\u0015j`:\u0002X>\u007f%7byP`oP\u001ab?t3\u0019X\u000eo\u0019jk#(\u007f+n8 Kdu`o\u0014<d)8i%~b5\u0015jk#(i+\u007f-\"JduwEt\u001fAlo\u0019,b+\tX)y#=\u00172!l)V-K-,M%\u007fb7\u0015j=b\u007f\t{4y|\bx8wEt\u000bIlo\u0019,b+\tX)y#=\u00173!l&m/u\u000f V8ib5\u0015jk#(i+\u007f-\"Jdw`o_%j\u001c.K+`?aNq\u0007\u001f\u001a{j-l)V-K-,M%\u007fb5\u0015j :&\\=]#<\u00170!l)V-]-=X'~b6\u0002@@\u0019\u0003\u0019j-* ^\fl/;V8#6c\u0019,b+\tX)y#=\u00170!l\u007f\u0017z=\u007fv\t|?yt3\u0007X\u0000o\u0019jk#(\u007f+n8 Kdu`o_%j\n.Z>b>aAf-* ^\fl/;V8#5t3\u0007D\u0002o\u0019jk#(\u007f+n8 Kf-* ^\fl/;V8!l~\u0002@@\r\u0017\u0019j-* ^\fl/;V8!l)V-K-,M%\u007f`o\tq\u0007\u0001\u001auj-l)V-K-,M%\u007fb5\u0015jk#(\u007f+n8 Kdw`oP\u001eh4\fV%\u007f(aCq\u0007\u0001\u000e}j-l9P/z\u001c Jdu55\u0015jz-;\\8] .W/#46C=!l)V-K-,M%\u007fb5C0w`oO#h;\u001fV9#46C=6F\u0002x\u0012-loV\u001eh4\fV%\u007f(~\u00172t6c\u0019,b+\tX)y#=\u00172u47\u0015jk#(\u007f+n8 Kdt56@q\u0007\u0001\u0000oj-l m/u\u000f V8i}aNf-}t3\u0007B\u001ao\u0019jb\u000f U%x>c\u0019#N##V?\u007fwE}\u001a9lo\u0019%]#<\u00172!l?t+y>&A\u0011=\u0011c\u0019<d)8i%~wE}\u001a9lo\u0019%]#<\u00173!l?t+y>&A\u0011<\u0011c\u0019<d)8i%~wE}\u001a9lo\u0019%]#<\u00170!l?t+y>&A\u0011?\u0011c\u0019<d)8i%~wE}\u001a9lo\u0019%]#<\u0017=!l?t+y>&A\u0011>\u0011c\u0019<d)8i%~wEt\u0005[lo\u0019%K#(z%b>+\u00172!l9P/z\u001c JdwwE}\u001a>lo\u0019%Y)7z%b>+\tdu`oM\u0007l8=P2V|\u0012\u0015jd\u0018*A\tb#=]q\u0007\b\u001f\nj-l m/u\u000f V8i|a@f-8\u0002X>\u007f%7b{P`oP\u001eh4\fV%\u007f(t3\u0007B\u001ao\u0019jb\u0018*A\tb#=]z#68\u0015jd\u0018*A\tb#=]q\u0007\t\u0001}@")), method1974(method1973("mnx\u0018O:?\bd=F\u000em\u001e_\u0005\r\u0019jd\u001c Jj-lo\u0019j-lo\u0004j{)=M/ub?V9d8&V$6F\u000em\u001e_\u0005\r\u0019jd\u0002 K'l o\u0019j-lo\u0004j{)=M/ub!V8`-#\u0002@L\u0018\u001bk\u0003OloP\tb  L8-lo\u0019j-qoO/\u007f8*Adn##V86F\u000em\u001e_\u0005\r\u0019jd\u0018*A\tb#=]j-lo\u0004j{)=M/ub;\\2n# K.V|\u0012\u0002@B\u0019\u001bi\u001fYloV\u001ab?o\u0019j-lo\u0019j-qoK/~9#Md}#<P>d#!\u0002@B\u0019\u001bi\u001fYloV\tb  L8-lo\u0019j-qoK/~9#Mdn##V86F\u0000l\u001e]\u0019\u001b\u0019jb\u0018*A\tb#=]z-lo\u0004j\u007f)<L&yb;\\2n# K.V|\u0012\u0002@B\u0019\u001bi\u001fYloV\u001eh4\fV%\u007f(~\u0019j-qoK/~9#Mdy)7Z%b>+b{PwEv\u001fY\u001c\u001amj-#\tV-N# K.-lo\u0019w->*J?a8a_%j/ V8iwEi\u000b_\r\u0002\u0019j-* ^\u001al>.T9-lo\u0019w-<=V-\u007f-\"\u0017&b/.U\u0011=\u0011t3\u001aL\u001e\u000etj-l8X>h>\u001fU+c)o\u0019j0l?K%j>.Tda#,X&V}\u0012\u0002@]\r\u001dx\u0007-loM\u0007l8=P2Vx\u0012\u0019j-qoBj~8.M/#!.M8d4aM/u8:K/V|\u0012\u001976F\u001fx\u0018L\u0001o\u0019j}\u0001.M8d4\u0014\r\u0017-lo\u0004jvl<M+y)aT+y>&Ad}> S/n8&V$-1t3\u001aL\u001e\u000etj-l\"O\u0007l8=P2Vx\u0012\u0019j0l4\u00199y-;\\d`-;K#ub\"V.h 9P/zl2\u0002@Y\t\u0002ij-loO#h;\u001fV9!l9P/z\u0002 K'l c\u0019,b+\tX)y#=\u0015jn##V?\u007f`oW.b8#\u0002@I\u001c{\u0019j-:&\\=]#<\u00172!l\"O\u0007l8=P2V|\u0012\u0015jd\u001c Jq\u0007\b\u001f\rj-l9P/z\u001c Jdt`oT<@-;K#u\u0017~df-%\u001fV96F\u000bi~-loO#h;\u001fV9#6c\u0019'{\u0001.M8d4\u0014\u000b\u0017!l&i%~wE}\u001a9lo\u0019<d)8i%~b8\u0015j`:\u0002X>\u007f%7byP`oP\u001ab?t3\u0019X\u000eo\u0019jk#(\u007f+n8 Kdu`o\u0014<d)8i%~b5\u0015jk#(i+\u007f-\"JduwEt\u001fAlo\u0019,b+\tX)y#=\u00172!l)V-K-,M%\u007fb7\u0015j=b\u007f\t{4y|\bx8wEt\u000bIlo\u0019,b+\tX)y#=\u00173!l&m/u\u000f V8ib5\u0015jk#(i+\u007f-\"Jdw`o_%j\u001c.K+`?aNq\u0007\u001f\u001a{j-l)V-K-,M%\u007fb5\u0015j :&\\=]#<\u00170!l)V-]-=X'~b6\u0002@@\u0019\u0003\u0019j-* ^\fl/;V8#6c\u0019,b+\tX)y#=\u00170!l\u007f\u0017z=\u007fv\t|?yt3\u0007X\u0000o\u0019jk#(\u007f+n8 Kdu`o_%j\n.Z>b>aAf-* ^\fl/;V8#5t3\u0007D\u0002o\u0019jk#(\u007f+n8 Kf-* ^\fl/;V8!l~\u0002@@\r\u0017\u0019j-* ^\fl/;V8!l)V-K-,M%\u007f`o\tq\u0007\u0001\u001auj-l)V-K-,M%\u007fb5\u0015jk#(\u007f+n8 Kdw`oP\u001eh4\fV%\u007f(aCq\u0007\u0001\u000e}j-l9P/z\u001c Jdu55\u0015jz-;\\8] .W/#46C=!l)V-K-,M%\u007fb5C0w`oO#h;\u001fV9#46C=6F\u0002x\u0012-loV\u001eh4\fV%\u007f(~\u00172t6c\u0019,b+\tX)y#=\u00172u47\u0015jk#(\u007f+n8 Kdt56@q\u0007\u0001\u0000oj-l m/u\u000f V8i}aNf-}t3\u000e]\u007fo\u0019j{%*N\u0004b>\"X&#4c\u0019'{\u0001.M8d4\u0014\t\u0017!l&w%\u007f!.Uq\u0007\b\u001f\nj-l9P/z\u0002 K'l a@f-!9t+y>&A\u0011<\u0011c\u0019#C#=T+awE}\u001a>lo\u0019<d)8w%\u007f!.Udw`oT<@-;K#u\u0017}df-%\u0001V8`-#\u0002@I\u001c|\u0019j-\"+V>ab7\u0015j{%*N\u0004b>\"X&!l<M+y)aU#j$;bzPb?V9d8&V$6F\u000biy-loW.b8#\u00173!l9P/z\u0002 K'l c\u00199y-;\\da%(Q>V}\u0012\u0017:b?&M#b\"t3\u0007L\u0014o\u0019jc( M&!l!]%y c\u0019z6F\u0002v\u001c-loZ%a#:Kf-?;X>hb#P-e8\"V.h aX'o%*W>6F\u0002x\u000e-loZ%a#:Kf-?;X>hb#P-e8\u0014\t\u0017#(&_,x?*\u0015jc( M&#47A2!l,V&b9=\u0002@@\r\u000b\u0019j-/ U%x>c\u00199y-;\\da%(Q>V}\u0012\u0017.d*)L9h`oW.b8#\u00173t56\u0015jn##V?\u007fwEt\u001fAlo\u0019%N##V?\u007f`oP\tb  L8!l,V&b9=\u0002@I\u001c{\u0019j-#\u001fV9#4c\u0019:@-;K#u\u0017\u007fdf-:&\\=]#<\u0002@I\u001c{\u0019j-#\u001fV9#5c\u0019:@-;K#u\u0017~df-:&\\=]#<\u0002@I\u001c{\u0019j-#\u001fV9#6c\u0019:@-;K#u\u0017}df-:&\\=]#<\u0002@I\u001c{\u0019j-#\u001fV9#;c\u0019:@-;K#u\u0017|df-:&\\=]#<\u0002@@\u0003\u0019\u0019j-#\tV-N# K.#4c\u0019<d)8i%~b5\u0002@I\u001c|\u0019j-#\u001b\\2N# K.=b7\u0015jy\u0001.M8d4\u0014\t\u0017!l&m/u\u000f V8iwE}\u001a>lo\u0019%Y)7z%b>+\tdt`oM\u0007l8=P2V}\u0012\u0015jd\u0018*A\tb#=]q\u0007\u0001\u0000oj-l m/u\u000f V8i|aC=!l&m/u\u000f V8iwE|\u0004IF")), method1974(method1973("<)Xd1%!P>3d")), method1974(method1973("<)XdDd")), method1974(method1973("<)XdKd")), method1974(method1973("<)XdLd")), method1974(method1973("<)XdHd"))};
   @OriginalMember(
      owner = "client!pfa",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field3133 = new int[2];
   @OriginalMember(
      owner = "client!pfa",
      name = "t",
      descriptor = "I"
   )
   public static int field3142 = 0;
   @OriginalMember(
      owner = "client!pfa",
      name = "v",
      descriptor = "I"
   )
   public static int field3124;
   @OriginalMember(
      owner = "client!pfa",
      name = "h",
      descriptor = "I"
   )
   public static int field3125;
   @OriginalMember(
      owner = "client!pfa",
      name = "j",
      descriptor = "I"
   )
   public static int field3126;
   @OriginalMember(
      owner = "client!pfa",
      name = "n",
      descriptor = "I"
   )
   public static int field3128;
   @OriginalMember(
      owner = "client!pfa",
      name = "y",
      descriptor = "I"
   )
   public static int field3130;
   @OriginalMember(
      owner = "client!pfa",
      name = "x",
      descriptor = "I"
   )
   public static int field3131;
   @OriginalMember(
      owner = "client!pfa",
      name = "w",
      descriptor = "I"
   )
   public static int field3132;
   @OriginalMember(
      owner = "client!pfa",
      name = "l",
      descriptor = "I"
   )
   public static int field3135;
   @OriginalMember(
      owner = "client!pfa",
      name = "m",
      descriptor = "I"
   )
   public static int field3136;
   @OriginalMember(
      owner = "client!pfa",
      name = "u",
      descriptor = "I"
   )
   public static int field3143;
   @OriginalMember(
      owner = "client!pfa",
      name = "k",
      descriptor = "Z"
   )
   private boolean field3138;
   @OriginalMember(
      owner = "client!pfa",
      name = "f",
      descriptor = "Z"
   )
   private boolean field3139;

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method343(boolean arg0, int arg1) {
      try {
         ++field3135;
         if (arg1 != 3) {
            this.method341(119, 92, 37);
         }

         this.field3139 = arg0;
         super.field1630.method3988(arg1 + -131, 1);
         super.field1630.method4006(this.field3134, (byte)60);
         super.field1630.method4022(7681, 34161, 34165);
         super.field1630.method3959(arg1 ^ -110, 768, 34166, 0);
         super.field1630.method3959(-109, 770, 5890, 2);
         super.field1630.method3969(0, 34168, (byte)-118, 770);
         super.field1630.method3988(-128, 0);
         this.method1972((byte)113);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3144[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method341(int arg0, int arg1, int arg2) {
      try {
         ++field3126;
         if (arg0 >= -125) {
            this.field3140 = true;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3144[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method340(int arg0) {
      try {
         if (this.field3138) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3138 = false;
         }

         ++field3130;
         super.field1630.method3988(arg0 ^ -123, 1);
         super.field1630.method4006((class549)null, (byte)-123);
         super.field1630.method4022(8448, 34161, 8448);
         super.field1630.method3959(arg0 + -108, 768, 5890, 0);
         super.field1630.method3959(-66, 770, 34166, 2);
         super.field1630.method3969(0, 5890, (byte)-115, 770);
         super.field1630.method3988(arg0 ^ -123, 0);
         if (arg0 != 5) {
            method1969(-15, (byte)-93, -115);
         }

         if (this.field3129) {
            super.field1630.method3959(-113, 768, 5890, 0);
            super.field1630.method3969(0, 5890, (byte)-116, 770);
            this.field3129 = false;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3144[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IBI)I"
   )
   public static final int method1969(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 < 71) {
            return 103;
         } else {
            ++field3128;
            int var3 = -128 + class376.method2965(1, arg0 + 91923, 4, arg2 + 45365) + (class376.method2965(1, arg0 + 37821, 2, arg2 + 10294) - 128 >> 1) + (-128 + class376.method2965(1, arg0, 1, arg2) >> 2);
            int var4 = (int)((double)var3 * 0.3D) - -35;
            if (~var4 <= -11) {
               if (var4 <= 60) {
                  return var4;
               }

               var4 = 60;
               if (!client.field1481) {
                  return var4;
               }
            }

            var4 = 10;
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3144[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1970(int arg0) {
      try {
         if (arg0 != 27929) {
            this.field3123 = null;
         }

         if (this.field3138) {
            int var2 = super.field1630.method499();
            int var3 = super.field1630.method519();
            float var4 = (float)var2 + -((float)(-var3 + var2) * 0.125F);
            float var5 = (float)var2 + -((float)(-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field1630.field7690, (float)super.field1630.field7702 / 255.0F);
            super.field1630.method3988(-128, 1);
            super.field1630.method4011(super.field1630.field7696, 2);
            super.field1630.method3988(-128, 0);
         }

         ++field3125;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3144[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method1971(boolean arg0) {
      try {
         if (!arg0) {
            method1969(10, (byte)103, 47);
         }

         field3133 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3144[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class248(class530 arg0) {
      super(arg0);

      try {
         if (super.field1630.field7688) {
            this.field3123 = class515.method3878(34336, field3144[10], 0, super.field1630);
            this.field3127 = class515.method3878(34336, field3144[11], 0, super.field1630);
            this.field3137 = class515.method3878(34336, field3144[8], 0, super.field1630);
            this.field3141 = class515.method3878(34336, field3144[9], 0, super.field1630);
            if (!(this.field3127 != null & this.field3123 != null & this.field3137 != null & this.field3141 != null)) {
               this.field3140 = false;
            } else {
               this.field3134 = new class266(arg0, 3553, 6406, 2, 1, false, new byte[]{0, -1}, 6406, false);
               this.field3134.method2121(0, false, false);
               this.field3140 = true;
            }
         } else {
            this.field3140 = false;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3144[12] + (arg0 != null ? field3144[2] : field3144[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method346(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            ++field3131;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3144[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1972(byte arg0) {
      try {
         ++field3143;
         if (arg0 > 92) {
            class184 var2;
            label35: {
               var2 = super.field1630.field7676;
               if (!this.field3139) {
                  OpenGL.glBindProgramARB(34336, ~super.field1630.field7773 != Integer.MIN_VALUE ? this.field3137.field5825 : this.field3123.field5825);
                  if (!client.field1481) {
                     break label35;
                  }
               }

               OpenGL.glBindProgramARB(34336, ~super.field1630.field7773 != Integer.MIN_VALUE ? this.field3141.field5825 : this.field3127.field5825);
            }

            var2.method1544(-1.0F, (float)super.field1630.field7773, class618.field9104, 16474, 0.0F, 0.0F);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, class618.field9104[0], class618.field9104[1], class618.field9104[2], class618.field9104[3]);
            OpenGL.glEnable(34336);
            this.field3138 = true;
            this.method1970(27929);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3144[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public final void method345(class549 arg0, int arg1, int arg2) {
      try {
         label40: {
            if (arg0 == null) {
               if (this.field3129) {
                  break label40;
               }

               super.field1630.method4006(super.field1630.field7784, (byte)-128);
               super.field1630.method4009(1, 1);
               super.field1630.method3959(arg1 + 23276, 768, 34168, 0);
               super.field1630.method3969(0, 34168, (byte)-114, 770);
               this.field3129 = true;
               if (!client.field1481) {
                  break label40;
               }
            }

            if (this.field3129) {
               super.field1630.method3959(-102, 768, 5890, 0);
               super.field1630.method3969(0, 5890, (byte)-116, 770);
               this.field3129 = false;
            }

            super.field1630.method4006(arg0, (byte)-127);
            super.field1630.method4009(arg2, 1);
         }

         if (arg1 == -23385) {
            ++field3124;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3144[3] + (arg0 != null ? field3144[2] : field3144[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method347(boolean arg0) {
      try {
         ++field3136;
         if (arg0) {
            this.method341(67, -88, -49);
         }

         return this.field3140;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3144[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1973(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1974(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
