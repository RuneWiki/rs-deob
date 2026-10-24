package deob;

@ObfuscatedName("JFFNRVFW")
public class JFFNRVFW {

	@ObfuscatedName("JFFNRVFW.i")
	public boolean field784 = false;

	@ObfuscatedName("JFFNRVFW.j")
	public int field785 = -1;

	@ObfuscatedName("JFFNRVFW.l")
	public boolean field787 = true;

	@ObfuscatedName("JFFNRVFW.c")
	public static int field778;

	@ObfuscatedName("JFFNRVFW.f")
	public int field781;

	@ObfuscatedName("JFFNRVFW.g")
	public int field782;

	@ObfuscatedName("JFFNRVFW.h")
	public int field783;

	@ObfuscatedName("JFFNRVFW.k")
	public int field786;

	@ObfuscatedName("JFFNRVFW.e")
	public String field780;

	@ObfuscatedName("JFFNRVFW.d")
	public static JFFNRVFW[] field779;

	@ObfuscatedName("JFFNRVFW.a(ZLFXNTEMPE;)V")
	public static void method268(FXNTEMPE arg0) {
		RSWRPCHR var1 = new RSWRPCHR(arg0.method212("varbit.dat", null));
		field778 = var1.method390();
		if (field779 == null) {
			field779 = new JFFNRVFW[field778];
		}

		for (int var2 = 0; var2 < field778; var2++) {
			if (field779[var2] == null) {
				field779[var2] = new JFFNRVFW();
			}

			field779[var2].method269(var2, var1);

			if (field779[var2].field784) {
				WBROSLMK.field1209[field779[var2].field781].field1221 = true;
			}
		}

		if (var1.field1037.length != var1.field1038) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("JFFNRVFW.a(IILRSWRPCHR;)V")
	public void method269(int arg0, RSWRPCHR arg1) {
		while (true) {
			int var3 = arg1.method388();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field781 = arg1.method390();
				field782 = arg1.method388();
				field783 = arg1.method388();
			} else if (var3 == 10) {
				field780 = arg1.method395();
			} else if (var3 == 2) {
				field784 = true;
			} else if (var3 == 3) {
				field785 = arg1.method393();
			} else if (var3 == 4) {
				field786 = arg1.method393();
			} else if (var3 == 5) {
				field787 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
