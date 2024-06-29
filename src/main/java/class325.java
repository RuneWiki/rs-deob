import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class325 implements class677 {
   @OriginalMember(
      owner = "client!re",
      name = "o",
      descriptor = "I"
   )
   private int field4449 = 0;
   @OriginalMember(
      owner = "client!re",
      name = "q",
      descriptor = "I"
   )
   private int field4454 = -1;
   @OriginalMember(
      owner = "client!re",
      name = "s",
      descriptor = "I"
   )
   private int field4457;
   @OriginalMember(
      owner = "client!re",
      name = "e",
      descriptor = "Z"
   )
   private boolean field4446;
   @OriginalMember(
      owner = "client!re",
      name = "b",
      descriptor = "Llea;"
   )
   public class574 field4460;
   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4466 = new String[]{method2556(method2555("pB\u0007t")), method2556(method2555("lRET|")), method2556(method2555("e\u0019E6)")), method2556(method2555("lREU|")), method2556(method2555("lRE[|")), method2556(method2555("lREY|")), method2556(method2555("lREZ|")), method2556(method2555("lRE$=p^\u001f&|")), method2556(method2555("lRE~=pV\u0007q.{\u001f")), method2556(method2555("lREW|")), method2556(method2555("_e,Pu")), method2556(method2555("lREH|")), method2556(method2555("lRES|")), method2556(method2555("lREI|")), method2556(method2555("lREV|"))};
   @OriginalMember(
      owner = "client!re",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field4465 = false;
   @OriginalMember(
      owner = "client!re",
      name = "p",
      descriptor = "I"
   )
   public static int field4447;
   @OriginalMember(
      owner = "client!re",
      name = "r",
      descriptor = "I"
   )
   public static int field4448;
   @OriginalMember(
      owner = "client!re",
      name = "l",
      descriptor = "I"
   )
   public static int field4450;
   @OriginalMember(
      owner = "client!re",
      name = "t",
      descriptor = "I"
   )
   public static int field4451;
   @OriginalMember(
      owner = "client!re",
      name = "c",
      descriptor = "I"
   )
   public static int field4452;
   @OriginalMember(
      owner = "client!re",
      name = "n",
      descriptor = "I"
   )
   public static int field4455;
   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "I"
   )
   public static int field4456;
   @OriginalMember(
      owner = "client!re",
      name = "d",
      descriptor = "I"
   )
   public static int field4458;
   @OriginalMember(
      owner = "client!re",
      name = "m",
      descriptor = "I"
   )
   public static int field4459;
   @OriginalMember(
      owner = "client!re",
      name = "h",
      descriptor = "I"
   )
   private int field4461;
   @OriginalMember(
      owner = "client!re",
      name = "g",
      descriptor = "I"
   )
   private int field4462;
   @OriginalMember(
      owner = "client!re",
      name = "j",
      descriptor = "I"
   )
   public static int field4463;
   @OriginalMember(
      owner = "client!re",
      name = "f",
      descriptor = "I"
   )
   public static int field4464;
   @OriginalMember(
      owner = "client!re",
      name = "i",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field4453;

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "([SB)[S"
   )
   public static final short[] method2548(short[] arg0, byte arg1) {
      try {
         ++field4459;
         if (arg0 == null) {
            return null;
         } else {
            if (arg1 != -31) {
               method2548((short[])null, (byte)65);
            }

            short[] var2 = new short[arg0.length];
            class349.method2757(arg0, 0, var2, 0, arg0.length);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4466[9] + (arg0 != null ? field4466[2] : field4466[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method2549(int arg0) {
      try {
         ++field4456;
         if (~this.field4454 > -1) {
            label23: {
               if (this.field4460.field8523) {
                  OpenGL.glGenBuffersARB(1, class106.field1390, 0);
                  this.field4454 = class106.field1390[0];
                  OpenGL.glBindBufferARB(this.field4457, this.field4454);
                  if (!client.field1481) {
                     break label23;
                  }
               }

               this.field4454 = 0;
            }

            if (arg0 < 48) {
               this.field4462 = -82;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4466[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method2550(byte arg0) {
      try {
         ++field4448;
         if (arg0 <= 40) {
            return -114L;
         } else {
            return this.field4454 != 0 ? 0L : this.field4453.getAddress();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4466[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(ILjaggl/MapBuffer;Z)Ljaclib/memory/Buffer;"
   )
   public final Buffer method2551(int arg0, MapBuffer arg1, boolean arg2) {
      try {
         ++field4450;
         if (~this.field4449 == arg0) {
            this.method2549(83);
            if (this.field4454 <= 0) {
               this.field4449 = 2;
               return this.field4453;
            }

            OpenGL.glBindBufferARB(this.field4457, this.field4454);
            if (arg2) {
               OpenGL.glBufferDataARBub(this.field4457, this.field4462, (byte[])null, 0, this.field4446 ? 35040 : 35044);
               if (this.field4461 <= this.field4460.field3707.field5255) {
                  this.field4449 = 1;
                  return this.field4460.field3707;
               }
            }

            if (!arg1.method232() && arg1.method233(this.field4457, this.field4461, 35001)) {
               this.field4449 = 2;
               return arg1;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4466[1] + arg0 + ',' + (arg1 != null ? field4466[2] : field4466[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method2552(int arg0) {
      try {
         ++field4464;
         if (arg0 >= 12) {
            if (this.field4460.field8523) {
               OpenGL.glBindBufferARB(this.field4457, this.field4454);
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4466[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(ILjaclib/memory/Source;B)Z"
   )
   public final boolean method2553(int arg0, Source arg1, byte arg2) {
      try {
         ++field4451;
         int var4 = -33 % ((arg2 - -19) / 63);
         if (~this.field4462 <= ~arg0) {
            if (~this.field4454 >= -1) {
               throw new RuntimeException(field4466[10]);
            }

            OpenGL.glBindBufferARB(this.field4457, this.field4454);
            OpenGL.glBufferSubDataARBa(this.field4457, 0, this.field4461, arg1.getAddress());
            this.field4460.field3771 += -this.field4461 + arg0;
            if (client.field1481) {
               throw new RuntimeException(field4466[10]);
            }
         } else {
            this.method2549(122);
            if (this.field4454 <= 0) {
               throw new RuntimeException(field4466[10]);
            }

            OpenGL.glBindBufferARB(this.field4457, this.field4454);
            OpenGL.glBufferDataARBa(this.field4457, arg0, arg1.getAddress(), !this.field4446 ? 35044 : 35040);
            this.field4460.field3771 += arg0 - this.field4461;
            this.field4462 = arg0;
         }

         this.field4461 = arg0;
         return true;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4466[11] + arg0 + ',' + (arg1 != null ? field4466[2] : field4466[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(ZLjaggl/MapBuffer;)Z"
   )
   public final boolean method2554(boolean arg0, MapBuffer arg1) {
      try {
         ++field4447;
         boolean var3 = arg0;
         if (this.field4449 != 0) {
            if (this.field4454 > 0) {
               label34: {
                  OpenGL.glBindBufferARB(this.field4457, this.field4454);
                  if (~this.field4449 != -2) {
                     var3 = arg1.method230();
                     if (!client.field1481) {
                        break label34;
                     }
                  }

                  OpenGL.glBufferSubDataARBa(this.field4457, 0, this.field4462, this.field4460.field3707.getAddress());
               }
            }

            this.field4449 = 0;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4466[14] + arg0 + ',' + (arg1 != null ? field4466[2] : field4466[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "b",
      descriptor = "(I)V"
   )
   public void method105(int arg0) {
      try {
         if (~this.field4454 < -1) {
            this.field4460.method4302(this.field4454, (byte)-110, this.field4461);
            this.field4454 = -1;
         }

         if (arg0 > -89) {
            this.method2552(-88);
         }

         ++field4463;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4466[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "c",
      descriptor = "(I)I"
   )
   public int method917(int arg0) {
      try {
         if (arg0 < 85) {
            field4465 = true;
         }

         ++field4452;
         return this.field4461;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4466[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.method105(-90);
         ++field4455;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4466[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "a",
      descriptor = "(II)V"
   )
   public void method1192(int arg0, int arg1) {
      try {
         ++field4458;
         if (arg0 >= -51) {
            field4465 = false;
         }

         if (~this.field4462 > ~arg1) {
            label27: {
               this.method2549(104);
               if (this.field4454 > 0) {
                  OpenGL.glBindBufferARB(this.field4457, this.field4454);
                  OpenGL.glBufferDataARBub(this.field4457, arg1, (byte[])null, 0, !this.field4446 ? 35044 : 35040);
                  this.field4460.field3771 += arg1 - this.field4462;
                  if (!client.field1481) {
                     break label27;
                  }
               }

               this.field4453 = this.field4460.method2280((byte)99, arg1, false);
            }

            this.field4462 = arg1;
         }

         this.field4461 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4466[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "<init>",
      descriptor = "(Llea;IZ)V"
   )
   public class325(class574 arg0, int arg1, boolean arg2) {
      try {
         this.field4457 = arg1;
         this.field4446 = arg2;
         this.field4460 = arg0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4466[7] + (arg0 != null ? field4466[2] : field4466[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2555(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!re",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2556(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
