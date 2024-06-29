import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class596 extends class251 {
   @OriginalMember(
      owner = "client!fe",
      name = "A",
      descriptor = "I"
   )
   public int field8783;
   @OriginalMember(
      owner = "client!fe",
      name = "P",
      descriptor = "I"
   )
   public int field8779;
   @OriginalMember(
      owner = "client!fe",
      name = "O",
      descriptor = "Z"
   )
   public boolean field8782;
   @OriginalMember(
      owner = "client!fe",
      name = "Q",
      descriptor = "F"
   )
   public float field8777;
   @OriginalMember(
      owner = "client!fe",
      name = "N",
      descriptor = "F"
   )
   public float field8778;
   @OriginalMember(
      owner = "client!fe",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8784 = new String[]{method4370(method4369("=\u000f;_")), method4370(method4369("5\u001fy\u000fA=\u0013#\r\u0000")), method4370(method4369("(Ty\u001dU")), method4370(method4369("5\u001fyg\u0000"))};
   @OriginalMember(
      owner = "client!fe",
      name = "C",
      descriptor = "[I"
   )
   public static int[] field8781 = new int[1];
   @OriginalMember(
      owner = "client!fe",
      name = "R",
      descriptor = "I"
   )
   public static int field8780;

   @OriginalMember(
      owner = "client!fe",
      name = "e",
      descriptor = "(B)V",
      line = 3
   )
   public static void method4368(byte arg0) {
      try {
         field8781 = null;
         if (arg0 <= 4) {
            method4368((byte)91);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8784[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lck;IIIIZ[BI)V",
      line = 13
   )
   public class596(class667 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         this.field8783 = arg4;
         this.field8779 = arg3;
         if (~super.field10376 != -34038) {
            this.field8782 = true;
            this.field8778 = this.field8777 = 1.0F;
         } else {
            this.field8782 = false;
            this.field8777 = (float)arg4;
            this.field8778 = (float)arg3;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8784[1] + (arg0 != null ? field8784[2] : field8784[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8784[2] : field8784[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lck;IIII[I)V",
      line = 34
   )
   public class596(class667 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      super(arg0, 3553, 6408, arg3, arg4);

      try {
         this.field8783 = arg2;
         this.field8779 = arg1;
         this.method1898(true, 0, arg2, 0, 0, 0, arg5, 3314, arg1);
         this.field8777 = (float)arg2 / (float)arg4;
         this.field8782 = false;
         this.field8778 = (float)arg1 / (float)arg3;
         this.method1893(true, false, false);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8784[1] + (arg0 != null ? field8784[2] : field8784[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8784[2] : field8784[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lck;IIII)V",
      line = 48
   )
   public class596(class667 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         label23: {
            this.field8779 = arg3;
            if (~super.field10376 != -34038) {
               this.field8778 = this.field8777 = 1.0F;
               this.field8782 = true;
               if (client.field4530 == 0) {
                  break label23;
               }
            }

            this.field8778 = (float)arg3;
            this.field8782 = false;
            this.field8777 = (float)arg4;
         }

         this.field8783 = arg4;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8784[1] + (arg0 != null ? field8784[2] : field8784[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lck;IIIII[BI)V",
      line = 71
   )
   public class596(class667 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field8779 = arg2;
         this.field8783 = arg3;
         this.method1895(true, 0, arg7, arg6, 0, arg2, 0, 10329, 0, arg3);
         this.field8777 = (float)arg3 / (float)arg5;
         this.field8782 = false;
         this.field8778 = (float)arg2 / (float)arg4;
         this.method1893(true, false, false);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8784[1] + (arg0 != null ? field8784[2] : field8784[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8784[2] : field8784[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lck;IIIZ[III)V",
      line = 85
   )
   public class596(class667 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
      super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         this.field8783 = arg3;
         this.field8779 = arg2;
         if (super.field10376 != 34037) {
            this.field8778 = this.field8777 = 1.0F;
            this.field8782 = true;
         } else {
            this.field8777 = (float)arg3;
            this.field8782 = false;
            this.field8778 = (float)arg2;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8784[1] + (arg0 != null ? field8784[2] : field8784[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8784[2] : field8784[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lck;IIIII)V",
      line = 109
   )
   public class596(class667 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field8782 = false;
         this.field8779 = arg2;
         this.field8777 = (float)arg3 / (float)arg5;
         this.field8783 = arg3;
         this.field8778 = (float)arg2 / (float)arg4;
         this.method1893(true, false, false);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8784[1] + (arg0 != null ? field8784[2] : field8784[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lck;IIIIIZ)V",
      line = 122
   )
   public class596(class667 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);

      try {
         label23: {
            this.field8783 = arg5;
            if (super.field10376 != 34037) {
               this.field8782 = true;
               this.field8778 = this.field8777 = 1.0F;
               if (client.field4530 == 0) {
                  break label23;
               }
            }

            this.field8778 = (float)arg4;
            this.field8782 = false;
            this.field8777 = (float)arg5;
         }

         this.field8779 = arg4;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field8784[1] + (arg0 != null ? field8784[2] : field8784[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lck;IIIIIIZ)V",
      line = 148
   )
   public class596(class667 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);

      try {
         this.field8782 = false;
         this.field8778 = (float)arg3 / (float)arg5;
         this.field8783 = arg4;
         this.field8779 = arg3;
         this.field8777 = (float)arg4 / (float)arg6;
         this.method1893(true, false, false);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8784[1] + (arg0 != null ? field8784[2] : field8784[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
