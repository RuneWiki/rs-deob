import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class702 {
   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "I"
   )
   private int field10250;
   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10256 = new String[]{method5119(method5118("68\u001bL#")), method5119(method5118("68\u001bO#")), method5119(method5118("49Ya")), method5119(method5118("!b\u001b#v")), method5119(method5118("68\u001b1b4%A3#")), method5119(method5118("68\u001bN#")), method5119(method5118("68\u001bI#"))};
   @OriginalMember(
      owner = "client!lt",
      name = "c",
      descriptor = "D"
   )
   public static double field10254;
   @OriginalMember(
      owner = "client!lt",
      name = "b",
      descriptor = "I"
   )
   public static int field10251;
   @OriginalMember(
      owner = "client!lt",
      name = "f",
      descriptor = "I"
   )
   public static int field10252;
   @OriginalMember(
      owner = "client!lt",
      name = "d",
      descriptor = "I"
   )
   public static int field10253;
   @OriginalMember(
      owner = "client!lt",
      name = "e",
      descriptor = "I"
   )
   public static int field10255;

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5114(int arg0, int arg1) {
      try {
         ++field10253;
         int var2 = 122 / ((arg1 - -60) / 59);
         class536 var3 = class108.method1038((long)arg0, 32, 5);
         var3.method4013((byte)126);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10256[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5115(byte arg0) {
      try {
         if (arg0 >= -29) {
            this.field10250 = -15;
         }

         ++field10255;
         OpenGL.glEndList();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10256[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method5116(byte arg0, int arg1) {
      try {
         OpenGL.glNewList(this.field10250 + arg1, 4864);
         ++field10251;
         if (arg0 != 111) {
            this.method5116((byte)32, 6);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10256[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "<init>",
      descriptor = "(Lrk;I)V"
   )
   public class702(class35 arg0, int arg1) {
      try {
         this.field10250 = OpenGL.glGenLists(arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10256[4] + (arg0 != null ? field10256[3] : field10256[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(CI)V"
   )
   public final void method5117(char arg0, int arg1) {
      try {
         OpenGL.glCallList(this.field10250 + arg0);
         ++field10252;
         if (arg1 != 5) {
            this.field10250 = -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10256[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5118(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5119(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
