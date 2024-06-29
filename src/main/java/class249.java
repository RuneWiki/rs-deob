import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class249 {
   @OriginalMember(
      owner = "client!jea",
      name = "f",
      descriptor = "I"
   )
   private int field3151;
   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3152 = new String[]{method1982(method1981("D\u007fy\u0016")), method1982(method1981("@otTX\u0002")), method1982(method1981("Q$;Ta")), method1982(method1981("@otT^\u0002")), method1982(method1981("@otT Cd|\u000e\"\u0002")), method1982(method1981("@otT_\u0002")), method1982(method1981("@otT]\u0002")), method1982(method1981("@otTZ\u0002")), method1982(method1981("@otTY\u0002"))};
   @OriginalMember(
      owner = "client!jea",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field3147 = new class418(100, -2);
   @OriginalMember(
      owner = "client!jea",
      name = "c",
      descriptor = "I"
   )
   public static int field3145;
   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "I"
   )
   public static int field3146;
   @OriginalMember(
      owner = "client!jea",
      name = "e",
      descriptor = "I"
   )
   public static int field3148;
   @OriginalMember(
      owner = "client!jea",
      name = "b",
      descriptor = "I"
   )
   public static int field3149;
   @OriginalMember(
      owner = "client!jea",
      name = "g",
      descriptor = "I"
   )
   public static int field3150;

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1975(int arg0) {
      try {
         field3147 = null;
         if (arg0 != 100) {
            method1978(-78, -56);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3152[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1976(int arg0) {
      try {
         ++field3148;
         if (arg0 >= -107) {
            this.method1977(-68, -34);
         }

         OpenGL.glEndList();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3152[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1977(int arg0, int arg1) {
      try {
         ++field3146;
         OpenGL.glNewList(this.field3151 + arg1, arg0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3152[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method1978(int arg0, int arg1) {
      try {
         ++field3149;
         if (arg0 == 25325) {
            if (class792.method5717((byte)-75, arg1)) {
               class435.method3361(-1, class419.field5722[arg1], true);
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3152[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(CI)V"
   )
   public final void method1979(char arg0, int arg1) {
      try {
         if (arg1 != -1) {
            this.field3151 = -123;
         }

         OpenGL.glCallList(this.field3151 + arg0);
         ++field3150;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3152[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "a",
      descriptor = "(Lcp;IIBII)V"
   )
   public static final void method1980(class271 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         if (arg3 == -8) {
            ++field3145;
            class614 var7 = null;
            class614 var8 = (class614)class40.field546.method288(0);
            if (var6 || var8 != null) {
               do {
                  if (var8.field9044 == arg5 && var8.field9040 == arg1 && ~var8.field9035 == ~arg4 && ~var8.field9050 == ~arg2) {
                     var7 = var8;
                     break;
                  }

                  var8 = (class614)class40.field546.method290(17958);
               } while(var8 != null);
            }

            while(var6) {
            }

            if (var7 == null) {
               var7 = new class614();
               var7.field9040 = arg1;
               var7.field9050 = arg2;
               var7.field9035 = arg4;
               var7.field9044 = arg5;
               class40.field546.method279(false, var7);
            }

            var7.field9038 = true;
            var7.field9047 = arg0;
            var7.field9036 = false;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field3152[1] + (arg0 != null ? field3152[2] : field3152[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "<init>",
      descriptor = "(Liu;I)V"
   )
   public class249(class530 arg0, int arg1) {
      try {
         this.field3151 = OpenGL.glGenLists(arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3152[4] + (arg0 != null ? field3152[2] : field3152[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1981(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1982(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
