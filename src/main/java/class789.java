import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class789 {
   @OriginalMember(
      owner = "client!ow",
      name = "d",
      descriptor = "J"
   )
   public long field11548;
   @OriginalMember(
      owner = "client!ow",
      name = "g",
      descriptor = "Lc;"
   )
   private class652 field11552;
   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11555 = new String[]{method5720(method5719("I{~\tntsoYOslp\u000b\u0010")), method5720(method5719("oks\u0015")), method5720(method5719("k\u007fi\u0018\u0004m\u007fq\u001e\u0004Rjm\u0010Df")), method5720(method5719("ekr\tbd\u007fo")), method5720(method5719("ni18\u0002")), method5720(method5719("z01WW")), method5720(method5719("bqrWYtp1\u0014Ko\u007fx\u001cGdpkWbnjL\tEuZv\u0018Moql\rCbSG;O`p")), method5720(method5719("ni1:\u0002")), method5720(method5719("ni1\u001fCo\u007fs\u0010Pd6")), method5720(method5719("ni1ECowkG\u0002")), method5720(method5719("ni1;\u0002"))};
   @OriginalMember(
      owner = "client!ow",
      name = "e",
      descriptor = "I"
   )
   public static int field11550 = 0;
   @OriginalMember(
      owner = "client!ow",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field11551 = new String[100];
   @OriginalMember(
      owner = "client!ow",
      name = "c",
      descriptor = "I"
   )
   public static int field11547;
   @OriginalMember(
      owner = "client!ow",
      name = "f",
      descriptor = "I"
   )
   public static int field11549;
   @OriginalMember(
      owner = "client!ow",
      name = "h",
      descriptor = "I"
   )
   public static int field11553;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11554;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method5718(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(ZILjava/io/File;)V",
      line = 4
   )
   public static final void method5715(boolean arg0, int arg1, File arg2) {
      try {
         if (class680.field10145 == null) {
            class518.method3998(-203);
         }

         ++field11547;

         try {
            Class var3 = Class.forName(field11555[6]);
            Method var4 = var3.getDeclaredMethod(field11555[3], field11554 != null ? field11554 : (field11554 = method5718(field11555[2])), Boolean.TYPE);
            var4.invoke(class680.field10145, arg2.getAbsolutePath(), new Boolean(arg0));
         } catch (Exception var7) {
            System.out.println(field11555[0]);
            var7.printStackTrace();
         }

         if (arg1 < 103) {
            field11550 = -43;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field11555[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11555[5] : field11555[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(B)I",
      line = 29
   )
   public static final int method5716(byte arg0) {
      try {
         ++field11549;
         if (arg0 < 3) {
            method5715(false, -6, (File)null);
         }

         return class539.field8133;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11555[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(I)V",
      line = 40
   )
   public static void method5717(int arg0) {
      try {
         field11551 = null;
         if (arg0 < 34) {
            field11551 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11555[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "<init>",
      descriptor = "(Lc;J[Lim;)V",
      line = 60
   )
   public class789(class652 arg0, long arg1, class86[] arg2) {
      try {
         this.field11548 = arg1;
         this.field11552 = arg0;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11555[9] + (arg0 != null ? field11555[5] : field11555[1]) + ',' + arg1 + ',' + (arg2 != null ? field11555[5] : field11555[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "finalize",
      descriptor = "()V",
      line = 72
   )
   protected final void finalize() throws Throwable {
      try {
         this.field11552.method4764((byte)107, this.field11548);
         ++field11553;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11555[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5719(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5720(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
