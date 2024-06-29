import jaclib.memory.Buffer;
import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public abstract class class337 {
   @OriginalMember(
      owner = "client!ws",
      name = "e",
      descriptor = "Z"
   )
   private boolean field5172;
   @OriginalMember(
      owner = "client!ws",
      name = "f",
      descriptor = "I"
   )
   private int field5163;
   @OriginalMember(
      owner = "client!ws",
      name = "l",
      descriptor = "Lc;"
   )
   public class652 field5166;
   @OriginalMember(
      owner = "client!ws",
      name = "i",
      descriptor = "I"
   )
   private int field5162;
   @OriginalMember(
      owner = "client!ws",
      name = "c",
      descriptor = "I"
   )
   public int field5169;
   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5173 = new String[]{method2753(method2752(".Doo\u00167V-`\u0005<\u001f")), method2753(method2752("c\u0017")), method2753(method2752("\"\u0019o'\u0002")), method2753(method2752("7B-e")), method2753(method2752(".DoBW")), method2753(method2752(".Do5\u00167^57W")), method2753(method2752(".DoEW")), method2753(method2752(".DoDW")), method2753(method2752(".DoGW")), method2753(method2752(".DoFW"))};
   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "J"
   )
   public static long field5170 = 0L;
   @OriginalMember(
      owner = "client!ws",
      name = "h",
      descriptor = "Lnaa;"
   )
   public static class113 field5164 = new class113(61, 2);
   @OriginalMember(
      owner = "client!ws",
      name = "k",
      descriptor = "I"
   )
   public static int field5161;
   @OriginalMember(
      owner = "client!ws",
      name = "d",
      descriptor = "I"
   )
   public static int field5165;
   @OriginalMember(
      owner = "client!ws",
      name = "b",
      descriptor = "I"
   )
   public static int field5167;
   @OriginalMember(
      owner = "client!ws",
      name = "j",
      descriptor = "I"
   )
   public static int field5168;
   @OriginalMember(
      owner = "client!ws",
      name = "g",
      descriptor = "I"
   )
   public static int field5171;

   @OriginalMember(
      owner = "client!ws",
      name = "d",
      descriptor = "(I)V",
      line = 5
   )
   public static void method2747(int arg0) {
      try {
         if (arg0 != 0) {
            field5164 = null;
         }

         field5164 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5173[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(I[BB)V",
      line = 17
   )
   public final void method2748(int arg0, byte[] arg1, byte arg2) {
      try {
         ++field5167;
         this.method2746(false);
         int var4 = 114 / ((arg2 - 80) / 45);
         if (arg0 <= this.field5162) {
            OpenGL.glBufferSubDataARBub(this.field5163, 0, arg0, arg1, 0);
         } else {
            OpenGL.glBufferDataARBub(this.field5163, arg0, arg1, 0, !this.field5172 ? 35044 : 35040);
            this.field5166.field9634 += arg0 - this.field5162;
            this.field5162 = arg0;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5173[8] + arg0 + ',' + (arg1 != null ? field5173[2] : field5173[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "finalize",
      descriptor = "()V",
      line = 42
   )
   protected final void finalize() throws Throwable {
      try {
         ++field5165;
         this.field5166.method4745(this.field5169, (byte)-126, this.field5162);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5173[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(BZ)V",
      line = 54
   )
   public static final void method2749(byte arg0, boolean arg1) {
      boolean var2 = client.field1786;

      try {
         ++field5168;
         class532.method4095(-108);
         if (class395.method3181(28566, class342.field5204)) {
            if (arg0 != 106) {
               field5164 = null;
            }

            class29[] var3 = class510.field7803;
            int var4 = 0;
            if (!var2 && ~var4 <= ~var3.length) {
               class532.method4095(-56);
            } else {
               do {
                  class29 var5 = var3[var4];
                  ++var5.field372;
                  if (~var5.field372 > -51 && !arg1) {
                     return;
                  }

                  var5.field372 = 0;
                  if (!var5.field365 && var5.field355 != null) {
                     ++class91.field1313;
                     class577 var6 = class218.method1888(class715.field10722, arg0 ^ 52, var5.field361);
                     var5.method211(var6, 119);

                     try {
                        var5.method210(12765);
                     } catch (IOException var8) {
                        var5.field365 = true;
                     }
                  }

                  ++var4;
               } while(~var4 > ~var3.length);

               class532.method4095(-56);
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field5173[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(IIB)V",
      line = 103
   )
   public static final void method2750(int arg0, int arg1, byte arg2) {
      try {
         int var3 = -57 % ((arg2 - 17) / 45);
         ++field5161;
         class566 var4 = class146.method1321((long)arg1 << 32 | (long)arg0, 19, -1428737160);
         var4.method4268(4);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5173[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "<init>",
      descriptor = "(Lc;I[BIZ)V",
      line = 120
   )
   public class337(class652 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      try {
         this.field5172 = arg4;
         this.field5163 = arg1;
         this.field5166 = arg0;
         this.field5162 = arg3;
         OpenGL.glGenBuffersARB(1, class383.field6043, 0);
         this.field5169 = class383.field6043[0];
         this.method2746(false);
         OpenGL.glBufferDataARBub(arg1, this.field5162, arg2, 0, this.field5172 ? 35040 : 35044);
         this.field5166.field9634 += this.field5162;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5173[5] + (arg0 != null ? field5173[2] : field5173[3]) + ',' + arg1 + ',' + (arg2 != null ? field5173[2] : field5173[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;",
      line = 140
   )
   public static final String[] method2751(int arg0, String[] arg1) {
      boolean var2 = client.field1786;

      try {
         ++field5171;
         String[] var3 = new String[5];
         int var4 = 54 / ((arg0 - 41) / 33);
         int var5 = 0;
         if (var2) {
            var3[var5] = var5 + field5173[1];
            if (arg1 != null && arg1[var5] != null) {
               var3[var5] = var3[var5] + arg1[var5];
            }

            ++var5;
         }

         while(true) {
            String[] var10000;
            if (var5 >= 5) {
               var10000 = var3;
               if (!var2) {
                  return var3;
               }
            } else {
               var3[var5] = var5 + field5173[1];
               var10000 = arg1;
            }

            if (var10000 != null && arg1[var5] != null) {
               var3[var5] = var3[var5] + arg1[var5];
            }

            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5173[4] + arg0 + ',' + (arg1 != null ? field5173[2] : field5173[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "<init>",
      descriptor = "(Lc;ILjaclib/memory/Buffer;IZ)V",
      line = 163
   )
   public class337(class652 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      try {
         this.field5162 = arg3;
         this.field5172 = arg4;
         this.field5166 = arg0;
         this.field5163 = arg1;
         OpenGL.glGenBuffersARB(1, class383.field6043, 0);
         this.field5169 = class383.field6043[0];
         this.method2746(false);
         OpenGL.glBufferDataARBa(arg1, this.field5162, arg2.getAddress(), this.field5172 ? 35040 : 35044);
         this.field5166.field9634 += this.field5162;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5173[5] + (arg0 != null ? field5173[2] : field5173[3]) + ',' + arg1 + ',' + (arg2 != null ? field5173[2] : field5173[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method2746(boolean arg0);

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2752(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2753(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
